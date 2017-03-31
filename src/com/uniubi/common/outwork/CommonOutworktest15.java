package com.uniubi.common.outwork;

import static org.junit.Assert.assertEquals;


public class CommonOutworktest15 extends OutworkBase{
	
	
	public void test1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getDelay(),1);
		assertEquals(employeeday1.getDelayDur(),0);
		assertEquals(employeeday1.getLeaveEarly(),1);
		assertEquals(employeeday1.getLeaveDur(),0);
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()+B1_2.getTime()-A1_2.getTime()+B1_3.getTime()-A1_3.getTime()));
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
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2.getAllLeaveDur(),0);
		assertEquals(employeeday2.getNoShow(),1);
		assertEquals(employeeday2.getOutWork(),2);
		assertEquals(employeeday2.getTpye(),2);
		
		
		
		
		
	}
	public void test3(){
		assertEquals(employeeday3.getUserid(),userId);
		assertEquals(employeeday3.getEmployeeid(),employeeId);
		assertEquals(employeeday3.getDelay(),1);
		assertEquals(employeeday3.getDelayDur(),0);
		assertEquals(employeeday3.getLeaveEarly(),1);
		assertEquals(employeeday3.getLeaveDur(),0);
		assertEquals(employeeday3.getWorkShow(),2);
		assertEquals(employeeday3.getWorkDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday3.getAllLeaveDur(),0);
		assertEquals(employeeday3.getNoShow(),1);
		assertEquals(employeeday3.getOutWork(),2);
		assertEquals(employeeday3.getTpye(),3);
		
		
		
		
		
	}
	public void test4(){
		assertEquals(employeeday4.getUserid(),userId);
		assertEquals(employeeday4.getEmployeeid(),employeeId);
		assertEquals(employeeday4.getDelay(),1);
		assertEquals(employeeday4.getDelayDur(),0);
		assertEquals(employeeday4.getLeaveEarly(),1);
		assertEquals(employeeday4.getLeaveDur(),0);
		assertEquals(employeeday4.getWorkShow(),2);
		assertEquals(employeeday4.getWorkDur(),convserToMinutes(B1_3.getTime()-A1_3.getTime()));
		assertEquals(employeeday4.getAllLeaveDur(),0);
		assertEquals(employeeday4.getOutWork(),2);
		assertEquals(employeeday4.getTpye(),4);
		
		
		
		
		
	}
	
	 
	
	
}