package com.uniubi.common.weekend;

import static org.junit.Assert.assertEquals;


public class CommonAttendancetest1159 extends AttendanceBase{
	
	

	public void test1(){
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getWorkShow(),2);
		assertEquals(employeeday1.getWorkDur(),convserToMinutes(t1_2.getTime()-t1_1.getTime()+t1_6.getTime()-t1_5.getTime()));
		assertEquals(employeeday1.getOutWork(),1);
		assertEquals(employeeday1.getTpye(),1);
		
				
	}
	
	public void test2(){
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getWorkShow(),2);
		assertEquals(employeeday2.getWorkDur(),convserToMinutes(t1_2.getTime()-t1_1.getTime()));
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
				
	}
	
	public void test3(){
		
		assertEquals(employeeday3.getUserid(),userId);
		assertEquals(employeeday3.getEmployeeid(),employeeId);
		assertEquals(employeeday3.getWorkShow(),1);
		assertEquals(employeeday3.getWorkDur(),0);
		assertEquals(employeeday3.getOutWork(),1);
		assertEquals(employeeday3.getTpye(),3);
		
				
	}
	
	public void test4(){
		
		assertEquals(employeeday4.getUserid(),userId);
		assertEquals(employeeday4.getEmployeeid(),employeeId);
		assertEquals(employeeday4.getWorkShow(),2);
		assertEquals(employeeday4.getWorkDur(),convserToMinutes(t1_6.getTime()-t1_5.getTime()));
		assertEquals(employeeday4.getOutWork(),1);
		assertEquals(employeeday4.getTpye(),4);
		
				
	}
	 
	
	
}