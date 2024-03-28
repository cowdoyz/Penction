package org.pension.vo;

import java.sql.Date;

public class qbbsVO {
  private String id;
  
  private String title;
  
  private String content;
  
  private String pw;
  
  private String ip;
  
  private int q_idx;
  
  private int sec;
  
  private Date reg_date;
  
  public qbbsVO() {}
  
  public qbbsVO(String id, String title, String content, String pw, String ip, int q_idx, int sec, Date reg_date) {
    this.id = id;
    this.title = title;
    this.content = content;
    this.pw = pw;
    this.ip = ip;
    this.q_idx = q_idx;
    this.sec = sec;
    this.reg_date = reg_date;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public String getContent() {
    return this.content;
  }
  
  public void setContent(String content) {
    this.content = content;
  }
  
  public String getPw() {
    return this.pw;
  }
  
  public void setPw(String pw) {
    this.pw = pw;
  }
  
  public String getIp() {
    return this.ip;
  }
  
  public void setIp(String ip) {
    this.ip = ip;
  }
  
  public int getQ_idx() {
    return this.q_idx;
  }
  
  public void setQ_idx(int q_idx) {
    this.q_idx = q_idx;
  }
  
  public int getSec() {
    return this.sec;
  }
  
  public void setSec(int sec) {
    this.sec = sec;
  }
  
  public Date getReg_date() {
    return this.reg_date;
  }
  
  public void setReg_date(Date reg_date) {
    this.reg_date = reg_date;
  }
}
