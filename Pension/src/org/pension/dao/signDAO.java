package org.pension.dao;

import org.pension.vo.memberVO;

public interface signDAO 
{
	  public int sinup(memberVO mvo);
	  
	  public memberVO login(String id);
}
