package org.pension.dao;

import java.util.List;

import org.pension.dto.adminInfoDTO;
import org.pension.dto.resvationDTO;
import org.pension.vo.reservationVO;

public interface resDAO 
{
	public List<resvationDTO> moveRES(String today);
	
	public int res_pay_update(reservationVO rvo);
	
	public List<adminInfoDTO> adminRes_View();
	
	public List<resvationDTO> res_View(String id);
	// 예약취소요청 전송 
	public int cansel_res(int res_num);
	// 관리자 예약 승인
	public int enter_res(int res_num);
	// 관리자 예약 취소 
	public int res_cancel(int res_num);
}
