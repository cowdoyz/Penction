package org.pension.controller;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.pension.dto.adminInfoDTO;
import org.pension.dto.resvationDTO;
import org.pension.service.resService;
import org.pension.service.resServiceImpl;
import org.pension.vo.reservationVO;

@WebServlet("/resSynchronous")
public class resSynchronous extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public resSynchronous() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=UTF-8");
	    String cmd = request.getParameter("cmd");	
	    System.out.println("resSync"+cmd);
	    List<adminInfoDTO> list = null;
		String path = "";
		int res_num = 0;
		boolean isFoward = true;
		resService rservice = new resServiceImpl();
		switch(cmd)
		{
		case "resPaymove" :
			
			String resDate = request.getParameter("resDate");
			String totalPrice = request.getParameter("totalPrice");
			String[] checkNum = request.getParameterValues("checkRES");
			List<resvationDTO> roomDataList = new ArrayList<resvationDTO>();
	        for (String roomNumber : checkNum) {
	        	String roomName = "";
	        	if(roomNumber.equals("1"))roomName = "개나리";
	        	else if(roomNumber.equals("2"))roomName = "진달래";
	        	else if(roomNumber.equals("3"))roomName = "무궁화";
	        	else roomName = "민들레";
	            String park = request.getParameter("park_" + roomNumber);
	            String person = request.getParameter("person_" + roomNumber);
	            resvationDTO dto = new resvationDTO();
	            dto.setReservation_State(roomNumber);
	            dto.setRoom_name(roomName);
	            dto.setRoom_maxperson(Integer.parseInt(person));
	            dto.setReservation_days(Integer.parseInt(park));
	            roomDataList.add(dto);
	        }
	       
	        request.setAttribute("resDate", resDate);
	        request.setAttribute("totalPrice", totalPrice);
	        request.setAttribute("roomDataList", roomDataList);
	        path = "resPay.jsp";
			break;
		case "resPay" :
			String id = request.getParameter("ID");
			String res_request = request.getParameter("request");
			String res_dateString = request.getParameter("RES_DATE");
			int payPrice = Integer.parseInt(request.getParameter("totalPrice"));
			String[] room_number = request.getParameterValues("ROOMNUMBER");
			String[] res_day = request.getParameterValues("RES_DAY");
			String[] res_person = request.getParameterValues("RES_PER");
			
			LocalDate localDate = LocalDate.parse(res_dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
			LocalDate plusDays = null;
			Date res_date = null;
			
			try 
			{
				reservationVO rvo = new reservationVO();
				rvo.setRid(id);
				rvo.setReservation_request(res_request);
				rvo.setReservation_pay(payPrice);
				int pay_result = 0;
				for(int i=0;i<room_number.length; i++)
				{
					if(Integer.parseInt(room_number[i]) == 1)
					{	
						rvo.setRoom_number(Integer.parseInt(room_number[i]));
						rvo.setReservation_person(Integer.parseInt(res_person[i]));
						rvo.setReservation_days(Integer.parseInt(res_day[i]));
						for(int j=0; j < Integer.parseInt(res_day[i]); j++)
						{
							plusDays = localDate.plusDays(j);
							res_date = Date.valueOf(plusDays);
							rvo.setReservation_date(res_date);
							pay_result = rservice.res_pay_update(rvo);
						}
						
					}
					if(Integer.parseInt(room_number[i]) == 2)
					{	
						rvo.setRoom_number(Integer.parseInt(room_number[i]));
						rvo.setReservation_person(Integer.parseInt(res_person[i]));
						rvo.setReservation_days(Integer.parseInt(res_day[i]));
						for(int j=0; j < Integer.parseInt(res_day[i]); j++)
						{
							plusDays = localDate.plusDays(j);
							res_date = Date.valueOf(plusDays);
							rvo.setReservation_date(res_date);
							pay_result = rservice.res_pay_update(rvo);
						}
						
					}
					if(Integer.parseInt(room_number[i]) == 3)
					{	
						rvo.setRoom_number(Integer.parseInt(room_number[i]));
						rvo.setReservation_person(Integer.parseInt(res_person[i]));
						rvo.setReservation_days(Integer.parseInt(res_day[i]));
						for(int j=0; j < Integer.parseInt(res_day[i]); j++)
						{
							plusDays = localDate.plusDays(j);
							res_date = Date.valueOf(plusDays);
							rvo.setReservation_date(res_date);
							pay_result = rservice.res_pay_update(rvo);
						}
						
					}
					if(Integer.parseInt(room_number[i]) == 4)
					{	
						rvo.setRoom_number(Integer.parseInt(room_number[i]));
						rvo.setReservation_person(Integer.parseInt(res_person[i]));
						rvo.setReservation_days(Integer.parseInt(res_day[i]));
						for(int j=0; j < Integer.parseInt(res_day[i]); j++)
						{
							plusDays = localDate.plusDays(j);
							res_date = Date.valueOf(plusDays);
							rvo.setReservation_date(res_date);
							pay_result = rservice.res_pay_update(rvo);
						}
						
					}
				}
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			path ="moveContoller?cmd=res_view";
			isFoward = false;
			break;
		case "cancel_req":
			res_num = Integer.parseInt(request.getParameter("resNum"));
			System.out.println(res_num);
			rservice.cansel_res(res_num);
			path ="moveContoller?cmd=res_view";
			isFoward = false;
			break;
		case "enter_res":
			res_num = Integer.parseInt(request.getParameter("resNum"));
			System.out.println(res_num);
			rservice.enter_res(res_num);
			path ="admin/adminPage.jsp";
			list = rservice.adminRes_View();
			int sp1 = 1;
			request.setAttribute("re", sp1);
			request.setAttribute("list", list);
			break;
		case "res_cancel":
			res_num = Integer.parseInt(request.getParameter("resNum"));
			System.out.println(res_num);
			rservice.res_cancel(res_num);
			path ="admin/adminPage.jsp";
			list = rservice.adminRes_View();
			int sp2 = 1;
			request.setAttribute("re", sp2); // 이런처리를 하면안됬는데 귀찮아서 미룬다
			request.setAttribute("list", list);
			break;
			
			
			
		}
		if (isFoward) {
            request.getRequestDispatcher(path).forward((ServletRequest) request, (ServletResponse) response);
        } else {
            response.sendRedirect(path);
        }
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
