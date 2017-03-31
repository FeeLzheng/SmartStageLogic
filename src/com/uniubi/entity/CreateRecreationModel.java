package com.uniubi.entity;

import java.util.Date;

public class CreateRecreationModel {
  private int EmployeeId;
  private int userId;
  private Date start;
  private Date end;
  
  
  public int getEmployeeId() {
    return EmployeeId;
  }
  public void setEmployeeId(int employeeId) {
    EmployeeId = employeeId;
  }
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }
  
  
}