package com.uniubi.common.outwork.weekend;

import static org.junit.Assert.assertEquals;


public class CommonOutworktest12 extends OutworkBase{
	
	
	public void test1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getWorkShow(),1);
		assertEquals(employeeday1.getWorkDur(),0);
		assertEquals(employeeday1.getAllLeaveDur(),0);
		assertEquals(employeeday1.getOutWork(),2);
		assertEquals(employeeday1.getTpye(),1);
		
				
	}
	
	public void test2(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),0);
		assertEquals(employeeday2.getOutWork(),2);
		assertEquals(employeeday2.getTpye(),2);
		
		
		
		
		
	}
	
	 
	
	
}