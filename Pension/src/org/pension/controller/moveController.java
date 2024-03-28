package org.pension.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.pension.dto.resvationDTO;
import org.pension.service.resService;
import org.pension.service.resServiceImpl;
@WebServlet("/moveContoller")
public class moveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        String cmd = request.getParameter("cmd");
        System.out.println("move: " + cmd);
        List<resvationDTO> rlist;
        resService rservice = new resServiceImpl();
        HttpSession session = request.getSession();
        if (cmd == null)
            cmd = "moveMain";
        String path = "";
        boolean isFoward = true;
        switch (cmd) {
            case "moveSignUp":
                path = "signUp.jsp";
                break;
            case "moveMain":
                path = "main.jsp";
                break;
            case "moveInsertBBS":
                path = "qbbsInsert.jsp";
                break;
            case "moveRES" :
            	String today = request.getParameter("today");
            	System.out.println(today);
            	rlist = rservice.moveRES(today);
            	request.setAttribute("list", rlist);
            	path = "reservation.jsp";
            	break;
            case "moveLogin" : 
            	path = "login.jsp";
            	break;
            case "logOut" :
            	session.invalidate();
            	path = "main.jsp";
            	break;
            case "res_view":
            	String loginid = (String)session.getAttribute("user");
            	System.out.println("로긴id"+loginid);
            	rlist = rservice.res_View(loginid);
            	request.setAttribute("list", rlist);
            	path = "myres_view.jsp";
            	break;
            case "move_Al_Login" :
            	path = "/login/adminCheck.jsp";
            	break;
            case "view_seq" :
            	String q_idx = request.getParameter("q_idx");
            	path = "/bbs/seq_check.jsp";
            	request.setAttribute("q_idx", q_idx);
            	break;
                
        }
        
        if (isFoward) {
            request.getRequestDispatcher(path).forward((ServletRequest) request, (ServletResponse) response);
        } else {
            response.sendRedirect(path);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}