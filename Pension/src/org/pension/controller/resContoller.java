package org.pension.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.pension.dto.resvationDTO;
import org.pension.service.resService;
import org.pension.service.resServiceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;

@WebServlet("/resContoller")
public class resContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public resContoller() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=UTF-8");
	    String cmd = request.getParameter("cmd");
	    System.out.println("res: " + cmd);
	    
	    List<resvationDTO> rlist;
        resService rservice = new resServiceImpl();
	    
	    ObjectMapper objectMapper = null;
        String jsonString = null;
        PrintWriter out = response.getWriter();
        JSONObject obj = new JSONObject();
        
        switch(cmd)
        {
			case "resDay":
				String day = request.getParameter("day");
				System.out.println(day);
				rlist = rservice.moveRES(day);
				objectMapper = new ObjectMapper();
				jsonString = objectMapper.writeValueAsString(rlist);
            	obj.put("result", jsonString);
				break;

		}
        
        
        out.print(obj);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
