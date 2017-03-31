package com.uniubi.common;

import static org.junit.Assert.assertEquals;


public class CommonAttendancetest131 extends AttendanceBase{
	
	
	public void test1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getDelay(),1);
		assertEquals(employeeday1.getDelayDur(),0);
		assertEquals(employeeday1.getLeaveEarly(),2);
		assertEquals(employeeday1.getLeaveDur(),convserToMinutes(B1_1.getTime()-t1_2.getTime()));
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(t1_2.getTime()-t1_1.getTime()));
		assertEquals(employeeday1.getNoShow(),1);
		assertEquals(employeeday1.getOutWork(),1);
		assertEquals(employeeday1.getTpye(),1);
		
				
	}
	
	public void test2(){
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),2);
		assertEquals(employeeday2.getLeaveDur(),convserToMinutes(B1_1.getTime()-t1_2.getTime()));
		assertEquals(employeeday2.getWorkShow(),2);
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(t1_2.getTime()-t1_1.getTime()));
		assertEquals(employeeday2.getNoShow(),1);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
				
	}
	
	 
	
	
}