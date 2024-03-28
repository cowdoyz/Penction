package org.pension.service;

import java.util.List;

import org.pension.dto.resvationDTO;
import org.pension.vo.memberVO;

public interface signService 
{
  int sinup(memberVO mvo);
  
  public memberVO login(String id);
  
}
