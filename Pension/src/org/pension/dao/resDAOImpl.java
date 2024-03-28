package org.pension.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.pension.dto.adminInfoDTO;
import org.pension.dto.resvationDTO;
import org.pension.mybatis.config.DBService;
import org.pension.vo.reservationVO;

public class resDAOImpl implements resDAO
{
	  private static resDAOImpl instance = null;
	  
	  public static resDAOImpl getInstance() {
	    if (instance == null)
	      instance = new resDAOImpl(); 
	    return instance;
	  }
	  
	  private static SqlSession sqlsession = null;
	  
	  private static synchronized SqlSession getSqlSession() {
	    if (sqlsession == null)
	      sqlsession = DBService.getFactory().openSession(true); 
	    return sqlsession;
	  }
	
	
	@Override
	public List<resvationDTO> moveRES(String today) 
	{
		return getSqlSession().selectList("moveRES", today);
	}


	@Override
	public int res_pay_update(reservationVO rvo) {
	        return getSqlSession().update("res_pay_update", rvo);
	}


	@Override
	public List<adminInfoDTO> adminRes_View() {
		return getSqlSession().selectList("admin_view");
	}


	@Override
	public List<resvationDTO> res_View(String id) {
		return getSqlSession().selectList("resView",id);
	}


	@Override
	public int cansel_res(int res_num)
	{
		return getSqlSession().update("cancel_req", res_num);
	}


	@Override
	public int enter_res(int res_num) {
		return getSqlSession().update("enter_res",res_num);
	}


	@Override
	public int res_cancel(int res_num) {
		return getSqlSession().update("res_cancel",res_num);
	}








	

}
