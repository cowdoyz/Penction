package org.pension.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.pension.service.signServiceImpl;
import org.pension.vo.memberVO;

@WebServlet("/SignContoller")
public class SignContoller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id, pw, name, phone, email;
        
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        String cmd = request.getParameter("cmd");
        memberVO mvo = null;
        signServiceImpl signServiceImpl = new signServiceImpl();
        
        ObjectMapper objectMapper = null;			// json과 java 객체들을 변환할 때 사용
		String jsonString = null;					// json으로 직렬화 된 데이터를 담는 용도
		PrintWriter out = response.getWriter();		// 응답 객체
		JSONObject obj = new JSONObject();
		
		
		StringBuilder sb = new StringBuilder();
		BufferedReader reader = request.getReader();
		String line;
		
		// 1. json 데이터를 StringBuilder 에 저장
		while ((line = reader.readLine()) != null) {
		    sb.append(line);
		}
		// 데이터는 sb에 담겨진 상태이기 때문에 검증은 sb.toString()으로 문자열 출력하면 된다.		

		// 2. json 데이터 자바 객체로 저장
		try {
			obj = (JSONObject)new JSONParser().parse(sb.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		if(cmd == null) {
			cmd = (String)obj.get("cmd");
			System.out.println("postcmd = " + cmd);
		}
        switch (cmd) {
            case "signUp.do":
                id = (String) obj.get("ID");
                pw = (String) obj.get("PW");
                name = (String) obj.get("NAME");
                phone = (String) obj.get("PHONE");
                email = (String) obj.get("EMAIL");
                mvo = new memberVO();
                mvo.setId(id);
                mvo.setPw(pw);
                mvo.setName(name);
                mvo.setPhone(phone);
                mvo.setEmail(email);
                try {
                    int result = signServiceImpl.sinup(mvo);
                    System.out.println(result);
                    obj.put("signupResult", Integer.valueOf(result));
                } catch (Exception e) {
                    obj.put("signupResult", Integer.valueOf(0));
                }
                break;
        }
        out.print(obj);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}