package com.uniubi.entity;

import java.util.Date;


public class Attendance {
	

	/**
	 * id，auto_increment
	 */
	private int id;
	/**
	 * user id
	 */
	private int userId;
	/**
	 * employee id
	 */
	private int employeeId;
	/**
	 * device id
	 */
	private int deviceId;
	/**
	 * attendance time
	 */
	private Date showTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getEmployeeid() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	public Date getWorkShowTime() {
		return showTime;
	}
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	
	
}
