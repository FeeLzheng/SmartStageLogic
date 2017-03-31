package com.uniubi.entity;

import java.util.Date;

public class Procedure {
	/**
	 * define procedure state : 1-approving;2-approved;3-denied;4-cancled
	 */
	public static final byte STATE_ING = 1;
	public static final byte STATE_OK = 2;
	public static final byte STATE_NO = 3;
	public static final byte STATE_CANCEL = 4;
	
	/**
	 * define procedure type : 1-sick leave;2-issue leave;3-maternity leave;4-annual leave;5-repair;6-out work;7-other;8-other leave
	 */
	public static final byte SICK_LEAVE_TYPE = 1;
	public static final byte ISSUE_LEAVE_TYPE = 2;
	public static final byte MATERNITY_LEAVE_TYPE = 3;
	public static final byte ANNUAL_LEAVE_TYPE = 4;
	public static final byte OTHER_LEAVE_TYPE = 8;
	public static final byte REPAIR_TYPE = 5;
	public static final byte OUTWORK_TYPE = 6;
	public static final byte OTHER_TYPE = 7;
	public static final byte OVERTIME_TYPE = 9;
	/**
	 * if the procedure is root procedure : 1-yes
	 */
	public static final byte IS_ROOT = 1;
	public static final byte NOT_ONLY_ROOT = 2;
	
	/**
	 * define the intro length limit : less than 100 words
	 */
	public static final int INTRO_LENGTH_LIMIT = 100;
	
	/**
	 * id,auto_increment
	 */
	private int id;
	/**
	 * user id
	 */
	private int userId;
	/**
	 * procedure creator (employee id)
	 */
	private int employeeId;
	/**
	 * procedure approver (id)
	 */
	private int approverId;
	/**
	 * procedure title
	 */
	private String title;
	/**
	 * procedure type
	 */
	private byte type;
	/**
	 * root procedure (id)
	 */
	private int rootId;
	/**
	 * parent procedure (id)
	 */
	private int parentId;
	/**
	 * sub procedure (id)
	 */
	private int subId;
	/**
	 * procedure state
	 */
	private byte state;
	/**
	 * procedure create time
	 */
	private Date createTime;
	/**
	 * procedure deal time
	 */
	private Date dealTime;
	/**
	 * procedure intro
	 */
	private String intro;
	/**
	 * procedure approve message
	 */
	private String message;
	/**
	 * start time for leave and out work procedure
	 */
	private Date startTime;
	/**
	 * end time for leave and out work procedure
	 */
	private Date endTime;
	/**
	 * repair time for repair procedure
	 */
	private Date repairTime;
	/**
	 * next approver id (sub procedure)
	 */
	private int nextApproverId;
	
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
	public byte getType() {
		return type;
	}
	public void setType(byte type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRootId() {
		return rootId;
	}
	public void setRootId(int rootId) {
		this.rootId = rootId;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public int getEmployeeid() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getApproverId() {
		return approverId;
	}
	public void setApproverId(int approverId) {
		this.approverId = approverId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public byte getState() {
		return state;
	}
	public void setState(byte state) {
		this.state = state;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getRepairTime() {
		return repairTime;
	}
	public void setRepairTime(Date repairTime) {
		this.repairTime = repairTime;
	}
	public int getNextApproverId() {
		return nextApproverId;
	}
	public void setNextApproverId(int nextApproverId) {
		this.nextApproverId = nextApproverId;
	}
	
	public boolean isAlone() {
		return (this.rootId <= 0 && this.subId <= 0);
	}
	public boolean isRoot() {
		return this.rootId <= 0;
	}
	
	public boolean instanceofLeaveProcedure() {
		return (type >= SICK_LEAVE_TYPE && type <= ANNUAL_LEAVE_TYPE) || type == OTHER_LEAVE_TYPE;
	}
	
	public void approveResetState() {
		if(state < STATE_OK){
			state = STATE_OK;
		}else if(state > STATE_CANCEL){
			state = STATE_CANCEL;
		}
	}
	
	public boolean notCancelled() {
		return state != Procedure.STATE_CANCEL;
	}
	public boolean hasnotNextApprover() {
		return nextApproverId <= 0;
	}
	public boolean nextApproverSameAsCurrentApprover(int newNextApproverId) {
		return newNextApproverId == approverId;
	}
	public boolean nextApproverSameAsCrerator(int newNextApproverId) {
		return newNextApproverId == employeeId;
	}
	public boolean alreadyApproved() {
		return state != STATE_ING || subId > 0;
	}
	public boolean approverValidate(int approverIdParam) {
		return approverIdParam == approverId;
	}
	public boolean repairProcedurePassed() {
		return type == REPAIR_TYPE && state == STATE_OK;
	}
	public boolean annualLeaveProcedurePassed() {
		return type == ANNUAL_LEAVE_TYPE && state == STATE_OK;
	}
	public Procedure createSubProcedure() {
		Procedure sub = new Procedure();
		sub.type = type;
		sub.employeeId = employeeId;
		sub.parentId = id;
		sub.userId = userId;
		sub.rootId = rootId > 0 ? rootId : id;
		return sub;
	}
	public boolean instanceofOutworkProcedure() {
		return type == OUTWORK_TYPE;
	}
	public boolean instanceofAnnualLeaveProcedure() {
		return type == ANNUAL_LEAVE_TYPE;
	}
	
	
	public boolean alreadyCanceled() {
		return state == STATE_CANCEL;
	}
	
	public boolean instanceofOvertimeProcedure() {
		return type == OVERTIME_TYPE;
	}
	
}
