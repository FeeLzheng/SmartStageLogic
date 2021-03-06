package com.uniubi.common.outwork;

import static org.junit.Assert.assertEquals;


public class CommonOutworktest19 extends OutworkBase{
	
	
	
	
	public void test1_1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getDelay(),1);
		assertEquals(employeeday1.getDelayDur(),0);
		assertEquals(employeeday1.getLeaveEarly(),1);
		assertEquals(employeeday1.getLeaveDur(),0);
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(o1_2.getTime()-o1_1.getTime()));
		assertEquals(employeeday1.getAllLeaveDur(),0);
		assertEquals(employeeday1.getNoShow(),1);
		assertEquals(employeeday1.getOutWork(),2);
		assertEquals(employeeday1.getTpye(),1);
		
				
	}
	
	public void test2_1(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),2);
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(o1_2.getTime()-o1_1.getTime()));
		assertEquals(employeeday2.getAllLeaveDur(),0);
		assertEquals(employeeday2.getNoShow(),1);
		assertEquals(employeeday2.getOutWork(),2);
		assertEquals(employeeday2.getTpye(),2);
		
		
		
		
		
	}
	
	public void test1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getDelay(),1);
		assertEquals(employeeday1.getDelayDur(),0);
		assertEquals(employeeday1.getLeaveEarly(),1);
		assertEquals(employeeday1.getLeaveDur(),0);
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(o1_2.getTime()-o1_1.getTime()));
		assertEquals(employeeday1.getAllLeaveDur(),0);
		assertEquals(employeeday1.getNoShow(),1);
		assertEquals(employeeday1.getOutWork(),2);
		assertEquals(employeeday1.getTpye(),1);
		
				
	}
	
	public void test2(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),2);
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(o1_2.getTime()-o1_1.getTime()));
		assertEquals(employeeday2.getAllLeaveDur(),0);
		assertEquals(employeeday2.getNoShow(),1);
		assertEquals(employeeday2.getOutWork(),2);
		assertEquals(employeeday2.getTpye(),2);
		
		
		
		
		
	}
	
	 
	
	
}