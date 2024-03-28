package org.pension.service;

import java.util.List;
import org.pension.vo.qbbsVO;

public interface bbsService {
	public int InsertQBBS(qbbsVO qvo);
  
	public List<qbbsVO> viewAll();
  
	public qbbsVO view(int q_idx);
	
	public int sec_check(int q_idx, int pw);
}
