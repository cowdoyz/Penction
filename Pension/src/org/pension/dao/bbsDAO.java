package org.pension.dao;

import java.util.List;

import org.pension.vo.qbbsVO;

public interface bbsDAO 
{
	public int InsertQBBS(qbbsVO qvo);
	
	public List<qbbsVO> viewAll();
	
	public qbbsVO view(int q_idx);
	// 게시판 비밀번호체크
	public int sec_check(int q_idx, int pw);
}
