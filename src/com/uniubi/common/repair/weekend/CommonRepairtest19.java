package com.uniubi.common.repair.weekend;

import static org.junit.Assert.assertEquals;


public class CommonRepairtest19 extends RepairBase{
	
	
	public void test1_1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(t1_2.getTime()-t1_1.getTime()+t1_4.getTime()-t1_3.getTime()));
		assertEquals(employeeday1.getAllLeaveDur(),0);
		assertEquals(employeeday1.getOutWork(),1);
		assertEquals(employeeday1.getTpye(),1);
		
				
	}
	
	public void test2_1(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getWorkShow(),2);
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(t1_2.getTime()-t1_1.getTime()));
		assertEquals(employeeday2.getAllLeaveDur(),0);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		
				
	}
	
	public void test3_1(){
		assertEquals(employeeday3.getUserid(),userId);
		assertEquals(employeeday3.getEmployeeid(),employeeId);
		assertEquals(employeeday3.getWorkShow(),2);
		assertEquals(employeeday3.getWorkDur(),convserToMinutes(t1_4.getTime()-t1_3.getTime()));
		assertEquals(employeeday3.getAllLeaveDur(),0);
		assertEquals(employeeday3.getOutWork(),1);
		assertEquals(employeeday3.getTpye(),3);
		
		
				
	}
	
	
	public void test1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(r1_1.getTime()-t1_1.getTime()+r1_2.getTime()-t1_3.getTime()));
		assertEquals(employeeday1.getAllLeaveDur(),0);
		assertEquals(employeeday1.getOutWork(),1);
		assertEquals(employeeday1.getTpye(),1);
				
	}
	
	public void test2(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getWorkShow(),2);
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(r1_1.getTime()-t1_1.getTime()));
		assertEquals(employeeday2.getAllLeaveDur(),0);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		
				
	}
	
	public void test3(){
		assertEquals(employeeday3.getUserid(),userId);
		assertEquals(employeeday3.getEmployeeid(),employeeId);
		assertEquals(employeeday3.getWorkShow(),2);
		assertEquals(employeeday3.getWorkDur(),convserToMinutes(r1_2.getTime()-t1_3.getTime()));
		assertEquals(employeeday3.getAllLeaveDur(),0);
		assertEquals(employeeday3.getOutWork(),1);
		assertEquals(employeeday3.getTpye(),3);
	
		
				
	}
	
	 
	
	
}