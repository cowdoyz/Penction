package org.pension.service;

import java.util.List;

import org.pension.dao.resDAO;
import org.pension.dao.resDAOImpl;
import org.pension.dto.adminInfoDTO;
import org.pension.dto.resvationDTO;
import org.pension.vo.reservationVO;

public class resServiceImpl implements resService
{
	resDAO rdao = resDAOImpl.getInstance();
	@Override
	public List<resvationDTO> moveRES(String today) {
		return rdao.moveRES(today);
	}
	@Override
	public int res_pay_update(reservationVO rvo) {
		return rdao.res_pay_update(rvo);
	}
	@Override
	public List<adminInfoDTO> adminRes_View() {
		return rdao.adminRes_View();
	}
	@Override
	public List<resvationDTO> res_View(String id) {
		return rdao.res_View(id);
	}
	@Override
	public int cansel_res(int res_num) {
		return rdao.cansel_res(res_num);
	}
	@Override
	public int enter_res(int res_num) {
		return rdao.enter_res(res_num);
	}
	@Override
	public int res_cancel(int res_num) {
		return rdao.res_cancel(res_num);
	}
	
	
}
