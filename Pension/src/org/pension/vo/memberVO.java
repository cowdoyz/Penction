package org.pension.vo;

public class memberVO {
  private String id;
  
  private String pw;
  
  private String name;
  
  private String phone;
  
  private String email;
  
  public memberVO() {}
  
  public memberVO(String id, String pw, String name, String phone, String email) {
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.phone = phone;
    this.email = email;
  }
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String id) {
    this.id = id;
  }
  
  public String getPw() {
    return this.pw;
  }
  
  public void setPw(String pw) {
    this.pw = pw;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getPhone() {
    return this.phone;
  }
  
  public void setPhone(String phone) {
    this.phone = phone;
  }
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(String email) {
    this.email = email;
  }
}
