package org.pension.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.pension.mybatis.config.DBService;
import org.pension.vo.qbbsVO;

public class bbsDAOImpl implements bbsDAO {
  private static bbsDAOImpl instance = null;
  
  public static bbsDAOImpl getInstance() {
    if (instance == null)
      instance = new bbsDAOImpl(); 
    return instance;
  }
  
  private static SqlSession sqlsession = null;
  
  private static synchronized SqlSession getSqlSession() {
    if (sqlsession == null)
      sqlsession = DBService.getFactory().openSession(true);
    return sqlsession;
  }
  
  public int InsertQBBS(qbbsVO qvo) {
    return getSqlSession().insert("insert_qbbs", qvo);
  }
  
  public List<qbbsVO> viewAll() {
    return getSqlSession().selectList("viewAll");
  }
  
  public qbbsVO view(int q_idx) {
    return getSqlSession().selectOne("view", q_idx);
  }

@Override
public int sec_check(int q_idx, int pw) {
	Map<String, Integer> map = new HashMap<>();
    map.put("q_idx", q_idx);
    map.put("pw", pw);	
	return getSqlSession().selectOne("sec_check",map);
}

	
}
