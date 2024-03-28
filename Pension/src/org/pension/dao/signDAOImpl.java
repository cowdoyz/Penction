package org.pension.dao;

import org.apache.ibatis.session.SqlSession;
import org.pension.mybatis.config.DBService;
import org.pension.vo.memberVO;

public class signDAOImpl implements signDAO {
  private static signDAOImpl instance = null;
  
  public static signDAOImpl getInstance() {
    if (instance == null)
      instance = new signDAOImpl(); 
    return instance;
  }
  
  private static SqlSession sqlsession = null;
  
  private static synchronized SqlSession getSqlSession() {
    if (sqlsession == null)
      sqlsession = DBService.getFactory().openSession(true); 
    return sqlsession;
  }
  
  public int sinup(memberVO mvo) {
    return getSqlSession().insert("isert_member", mvo);
  }

	@Override
	public memberVO login(String id) 
	{
		return getSqlSession().selectOne("login", id);
	}


}
