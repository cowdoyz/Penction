package org.pension.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Inet4Address;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.pension.service.bbsServiceImpl;
import org.pension.vo.qbbsVO;

@WebServlet("/bbsContoller")
public class bbsController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String qid, qpw, qtitle, qcontent;
        int qsec, result, q_idx;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=UTF-8");
        String cmd = request.getParameter("cmd");
        System.out.println(cmd);
        qbbsVO qvo = null;
        List < qbbsVO > list = null;
        bbsServiceImpl bbsServiceImpl = new bbsServiceImpl();
        String path = "";
        boolean isFoward = true;
        ObjectMapper objectMapper = null;
        String jsonString = null;
        PrintWriter out = response.getWriter();
        JSONObject obj = new JSONObject();
        String str1;
        switch (cmd) {
            case "moveQBBS":
                list = bbsServiceImpl.viewAll();
                request.setAttribute("List", list);
                path = "questionbbs.jsp";
                obj.put("result", Integer.valueOf(1));
                break;
            case "view":
                q_idx = Integer.parseInt(request.getParameter("q_idx"));
                System.out.println(q_idx);
                qvo = bbsServiceImpl.view(q_idx);
                request.setAttribute("qvo", qvo);
                path = "viewQBBS.jsp";
                System.out.println(qvo.getId());
                System.out.println(qvo.getPw());
                System.out.println(qvo.getContent());
                System.out.println(qvo.getIp());
                System.out.println(qvo.getReg_date());
                break;
            case "Insert_QBBS":
                qid = request.getParameter("BBS_ID");
                qpw = request.getParameter("BBS_PW");
                qtitle = request.getParameter("BBS_TITLE");
                qcontent = request.getParameter("BBS_CONTENT");
                qsec = 0;
                if (request.getParameter("BBS_SEC") == null) {
                    qsec = 0;
                } else {
                    qsec = Integer.parseInt(request.getParameter("BBS_SEC"));
                }
                qvo = new qbbsVO();
                qvo.setId(qid);
                qvo.setPw(qpw);
                qvo.setTitle(qtitle);
                qvo.setContent(qcontent);
                qvo.setSec(qsec);
                qvo.setIp(Inet4Address.getLocalHost().getHostAddress());
                result = bbsServiceImpl.InsertQBBS(qvo);
                System.out.println(result);
                isFoward = false;
                path = "bbsContoller?cmd=moveQBBS";
                break;
            case "seq_check" :
            	
            	try 
            	{
            		q_idx = (request.getParameter("q_idx") != null) ? Integer.parseInt(request.getParameter("q_idx")) : 0;
                	int pw = Integer.parseInt(request.getParameter("BBS_PW"));
            		int checkReuslt = bbsServiceImpl.sec_check(q_idx, pw);
                	if(checkReuslt == 1)
                	{
                		isFoward = false;
                		path = "bbsContoller?cmd=view&q_idx="+q_idx;
                	}else
                	{
    	        		isFoward = false;
    	        		path = "bbsContoller?cmd=moveQBBS";
                	}
				} 
            	catch (Exception e)
            	{
            		e.printStackTrace();
				}
            	
            
            	
            	
            	break;
        }
        out.print(obj);
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