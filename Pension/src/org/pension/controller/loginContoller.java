package org.pension.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.pension.dto.adminInfoDTO;
import org.pension.service.resService;
import org.pension.service.resServiceImpl;
import org.pension.service.signServiceImpl;
import org.pension.vo.memberVO;

@WebServlet("/loginContoller")
public class loginContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public loginContoller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String id, pw;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        String cmd =request.getParameter("cmd");
        System.out.println("loginCmd :"+cmd);
        String path = "";
        List<adminInfoDTO> list = null;
        memberVO mvo = null;
        HttpSession session = request.getSession();
        resService resService = new resServiceImpl();
        signServiceImpl signServiceImpl = new signServiceImpl();
		switch(cmd) 
		{
		 case "login" :
         	id = request.getParameter("ID");
         	pw = request.getParameter("PWD");
         	System.out.println(id);
         	System.out.println(pw);
         	try {
         	mvo = new memberVO();	
         	mvo = signServiceImpl.login(id);
         	path = "loginResult.jsp";
//         	int loginresult = 0;
//	         	if(id.equals(mvo.getId()))
//	         	{
//	         		if(pw.equals(mvo.getPw()))
//	         		{
//	         			session.setAttribute("user", id);
//	         			loginresult = 1;
//	         		}
//	         		else
//	         		{
//	         			//비번 틀릴떄
//	         			loginresult = 2;
//	         		}
//	         	}
//	         	else
//	         	{
//	         		//계정이 틀렸을때
//	         		loginresult = 3;
//	         	}
//	         	request.setAttribute("re", loginresult);
	         	request.getRequestDispatcher(path).forward(request, response);
         	}
         	catch (Exception e) {
         		int loginresult = 3;
				e.printStackTrace();
				request.setAttribute("re", loginresult);
	         	request.getRequestDispatcher(path).forward(request, response);
			}
         	break;
		 case "Al_Login" :
			 id = request.getParameter("ID");
			 pw = request.getParameter("PWD");
			 System.out.println(id);
			 try {
				 	list = resService.adminRes_View();
		         	mvo = new memberVO();
		         	mvo = signServiceImpl.login(id);
		         	path = "admin/adminPage.jsp";
		         	int loginresult = 0;
		         	if(mvo.getId().equals("admin"))
		         	{	
			         	if(id.equals(mvo.getId()))
			         	{
			         		if(pw.equals(mvo.getPw()))
			         		{
			         			loginresult = 1;
			         		}
			         		else
			         		{
			         			//비번 틀릴떄
			         			loginresult = 2;
			         		}
			         	}
		         	}
		         	else loginresult = 3;
			         	request.setAttribute("re", loginresult);
			         	request.setAttribute("list", list);
			         	request.getRequestDispatcher(path).forward(request, response);
		         	}
		         	catch (Exception e) {
		         		int loginresult = 3;
						e.printStackTrace();
						request.setAttribute("re", loginresult);
			         	request.getRequestDispatcher(path).forward(request, response);
					}
			 break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
