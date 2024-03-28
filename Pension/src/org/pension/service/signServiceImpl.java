package org.pension.service;

import org.pension.dao.signDAO;
import org.pension.dao.signDAOImpl;
import org.pension.vo.memberVO;

public class signServiceImpl implements signService
{
	signDAO sdao = signDAOImpl.getInstance();
	@Override
	public int sinup(memberVO mvo) {
		return sdao.sinup(mvo);
	}
	@Override
	public memberVO login(String id) {
		return sdao.login(id);
	}
}
