package com.uniubi.test;

import java.util.Date;

public class EmployeeDay{
	
	
	private int id;
	private int userid;
	private int employeeid;
	private int delay;
	private int delayDur;
	private int leaveEarly;
	private int leaveEarlyDur;
	private int leaveOff;
	private Date leaveStart;
	private Date leaveEnd;
	private int issueLeave;
	private Date issueLeaveStart;
	private Date issueLeaveEnd;
	private int issueLeaveDur;
	private int sickLeave;
	private Date sickLeaveStart;
	private Date sickLeaveEnd;
	private int sickLeaveDur;
	private int maternityLeave;
	private Date maternityLeaveStart;
	private Date maternityLeaveEnd;
	private int maternityLeaveDur;
	private int annualLeave;
	private Date annualLeaveStart;
	private Date annualLeaveEnd;
	private int annualLeaveDur;
	private int otherLeave;
	private Date otherLeaveStart;
	private Date otherLeaveEnd;
	private int otherLeaveDur;
	private int overTime;
	private Date overTimeStart;
	private Date overTimeEnd;
	private int overTimeDur;
	private int workShow;
	private int workDur;
	private int noShow;
	private int outWork;
	private Date Day;
	private Date firstTime;
	private Date lastTime;
	private int type;
	
	private int leaveDur;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getDelayDur() {
		return delayDur;
	}

	public void setDelayDur(int delayDur) {
		this.delayDur = delayDur;
	}

	public int getLeaveEarly() {
		return leaveEarly;
	}

	public void setLeaveEarly(int leaveEarly) {
		this.leaveEarly = leaveEarly;
	}

	public int getLeaveDur() {
		return leaveEarlyDur;
	}

	public void setLeaveDur(int leaveEarlyDur) {
		this.leaveEarlyDur = leaveEarlyDur;
	}

	public int getLeaveOff() {
		return leaveOff;
	}

	public void setLeaveOff(int leaveOff) {
		this.leaveOff = leaveOff;
	}

	public Date getLeaveStart() {
		return leaveStart;
	}

	public void setLeaveStart(Date leaveStart) {
		this.leaveStart = leaveStart;
	}

	public Date getLeaveEnd() {
		return leaveEnd;
	}

	public void setLeaveEnd(Date leaveEnd) {
		this.leaveEnd = leaveEnd;
	}

	public int getIssueLeave() {
		return issueLeave;
	}

	public void setIssueLeave(int issueLeave) {
		this.issueLeave = issueLeave;
	}

	public Date getIssueLeaveStart() {
		return issueLeaveStart;
	}

	public void setIssueLeaveStart(Date issueLeaveStart) {
		this.issueLeaveStart = issueLeaveStart;
	}

	public Date getIssueLeaveEnd() {
		return issueLeaveEnd;
	}

	public void setIssueLeaveEnd(Date issueLeaveEnd) {
		this.issueLeaveEnd = issueLeaveEnd;
	}

	public int getIssueLeaveDur() {
		return issueLeaveDur;
	}

	public void setIssueLeaveDur(int issueLeaveDur) {
		this.issueLeaveDur = issueLeaveDur;
	}

	public int getSickLeave() {
		return sickLeave;
	}

	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}

	public Date getSickLeaveStart() {
		return sickLeaveStart;
	}

	public void setSickLeaveStart(Date sickLeaveStart) {
		this.sickLeaveStart = sickLeaveStart;
	}

	public Date getSickLeaveEnd() {
		return sickLeaveEnd;
	}

	public void setSickLeaveEnd(Date sickLeaveEnd) {
		this.sickLeaveEnd = sickLeaveEnd;
	}

	public int getSickLeaveDur() {
		return sickLeaveDur;
	}

	public void setSickLeaveDur(int sickLeaveDur) {
		this.sickLeaveDur = sickLeaveDur;
	}

	public int getMaternityLeave() {
		return maternityLeave;
	}

	public void setMaternityLeave(int maternityLeave) {
		this.maternityLeave = maternityLeave;
	}

	public Date getMaternityLeaveStart() {
		return maternityLeaveStart;
	}

	public void setMaternityLeaveStart(Date maternityLeaveStart) {
		this.maternityLeaveStart = maternityLeaveStart;
	}

	public Date getMaternityLeaveEnd() {
		return maternityLeaveEnd;
	}

	public void setMaternityLeaveEnd(Date maternityLeaveEnd) {
		this.maternityLeaveEnd = maternityLeaveEnd;
	}

	public int getMaternityLeaveDur() {
		return maternityLeaveDur;
	}

	public void setMaternityLeaveDur(int maternityLeaveDur) {
		this.maternityLeaveDur = maternityLeaveDur;
	}

	public int getAnnualLeave() {
		return annualLeave;
	}

	public void setAnnualLeave(int annualLeave) {
		this.annualLeave = annualLeave;
	}

	public Date getAnnualLeaveStart() {
		return annualLeaveStart;
	}

	public void setAnnualLeaveStart(Date annualLeaveStart) {
		this.annualLeaveStart = annualLeaveStart;
	}

	public Date getAnnualLeaveEnd() {
		return annualLeaveEnd;
	}

	public void setAnnualLeaveEnd(Date annualLeaveEnd) {
		this.annualLeaveEnd = annualLeaveEnd;
	}

	public int getAnnualLeaveDur() {
		return annualLeaveDur;
	}

	public void setAnnualLeaveDur(int annualLeaveDur) {
		this.annualLeaveDur = annualLeaveDur;
	}

	public int getOtherLeave() {
		return otherLeave;
	}

	public void setOtherLeave(int otherLeave) {
		this.otherLeave = otherLeave;
	}

	public Date getOtherLeaveStart() {
		return otherLeaveStart;
	}

	public void setOtherLeaveStart(Date otherLeaveStart) {
		this.otherLeaveStart = otherLeaveStart;
	}

	public Date getOtherLeaveEnd() {
		return otherLeaveEnd;
	}

	public void setOtherLeaveEnd(Date otherLeaveEnd) {
		this.otherLeaveEnd = otherLeaveEnd;
	}

	public int getOtherLeaveDur() {
		return otherLeaveDur;
	}

	public void setOtherLeaveDur(int otherLeaveDur) {
		this.otherLeaveDur = otherLeaveDur;
	}

	public int getOverTime() {
		return overTime;
	}

	public void setOverTime(int overTime) {
		this.overTime = overTime;
	}

	public Date getOverTimeStart() {
		return overTimeStart;
	}

	public void setOverTimeStart(Date overTimeStart) {
		this.overTimeStart = overTimeStart;
	}

	public Date getOverTimeEnd() {
		return overTimeEnd;
	}

	public void setOverTimeEnd(Date overTimeEnd) {
		this.overTimeEnd = overTimeEnd;
	}

	public int getOverTimeDur() {
		return overTimeDur;
	}

	public void setOverTimeDur(int overTimeDur) {
		this.overTimeDur = overTimeDur;
	}

	public int getWorkShow() {
		return workShow;
	}

	public void setWorkShow(int workShow) {
		this.workShow = workShow;
	}

	public int getWorkDur() {
		return workDur;
	}

	public void setWorkDur(int workDur) {
		this.workDur = workDur;
	}

	public int getNoShow() {
		return noShow;
	}

	public void setNoShow(int noShow) {
		this.noShow = noShow;
	}

	public int getOutWork() {
		return outWork;
	}

	public void setOutWork(int outWork) {
		this.outWork = outWork;
	}

	public Date getDay() {
		return Day;
	}

	public void setDay(Date day) {
		Day = day;
	}

	public Date getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(Date firstTime) {
		this.firstTime = firstTime;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public int getAllLeaveDur() {
		return issueLeaveDur+sickLeaveDur+maternityLeaveDur+otherLeaveDur+annualLeaveDur;
	}

	public void setAllLeaveDur(int leaveDur) {
		this.leaveDur = leaveDur;
	}
	
	public int getTpye(){
		return type;
		
		
	}
	
	public void setType(int type){
		this.type=type;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}