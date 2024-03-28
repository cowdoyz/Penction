package org.pension.service;

import java.util.List;
import org.pension.dao.bbsDAO;
import org.pension.dao.bbsDAOImpl;
import org.pension.vo.qbbsVO;

public class bbsServiceImpl implements bbsService {
  bbsDAO bbsdao = (bbsDAO)bbsDAOImpl.getInstance();
  
  public int InsertQBBS(qbbsVO qvo) {
    return this.bbsdao.InsertQBBS(qvo);
  }
  
  public List<qbbsVO> viewAll() {
    return this.bbsdao.viewAll();
  }
  
  public qbbsVO view(int q_idx) {
    return this.bbsdao.view(q_idx);
  }

@Override
public int sec_check(int q_idx, int pw) {
	return bbsdao.sec_check(q_idx, pw);
}
}
