package com.uniubi.common.procedure;

import static org.junit.Assert.assertEquals;


public class CommonProceduretest1103 extends ProcedureBase{
	
	

	
	
	public void test1(){
		
		assertEquals(employeeday1_0.getUserid(),userId);
		assertEquals(employeeday1_0.getEmployeeid(),employeeId);
		assertEquals(employeeday1_0.getDelay(),1);
		assertEquals(employeeday1_0.getDelayDur(),0);
		assertEquals(employeeday1_0.getLeaveEarly(),1);
		assertEquals(employeeday1_0.getLeaveDur(),0);
		assertEquals(employeeday1_0.getWorkShow(),1);
		assertEquals(employeeday1_0.getWorkDur(),0);
		assertEquals(employeeday1_0.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()+B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday1_0.getNoShow(),1);
		assertEquals(employeeday1_0.getOutWork(),1);
		assertEquals(employeeday1_0.getTpye(),1);
		
		
		assertEquals(employeeday1.getUserid(),userId);
		assertEquals(employeeday1.getEmployeeid(),employeeId);
		assertEquals(employeeday1.getDelay(),1);
		assertEquals(employeeday1.getDelayDur(),0);
		assertEquals(employeeday1.getLeaveEarly(),1);
		assertEquals(employeeday1.getLeaveDur(),0);
		assertEquals(employeeday1.getWorkShow(),1);
		assertEquals(employeeday1.getWorkDur(),0);
		assertEquals(employeeday1.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()+B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday1.getNoShow(),1);
		assertEquals(employeeday1.getOutWork(),1);
		assertEquals(employeeday1.getTpye(),1);
		
		
//		assertEquals(employeeday1_2.getUserid(),userId);
//		assertEquals(employeeday1_2.getEmployeeid(),employeeId);
//		assertEquals(employeeday1_2.getDelay(),1);
//		assertEquals(employeeday1_2.getDelayDur(),0);
//		assertEquals(employeeday1_2.getLeaveEarly(),1);
//		assertEquals(employeeday1_2.getLeaveDur(),0);
//		assertEquals(employeeday1_2.getWorkShow(),1);
//		assertEquals(employeeday1_2.getWorkDur(),0);
//		assertEquals(employeeday1_2.getAllLeaveDur(),0);
//		assertEquals(employeeday1_2.getNoShow(),1);
//		assertEquals(employeeday1_2.getOutWork(),1);
//		assertEquals(employeeday1_2.getTpye(),1);
//		
//		assertEquals(employeeday1_3.getUserid(),userId);
//		assertEquals(employeeday1_3.getEmployeeid(),employeeId);
//		assertEquals(employeeday1_3.getDelay(),1);
//		assertEquals(employeeday1_3.getDelayDur(),0);
//		assertEquals(employeeday1_3.getLeaveEarly(),1);
//		assertEquals(employeeday1_3.getLeaveDur(),0);
//		assertEquals(employeeday1_3.getWorkShow(),1);
//		assertEquals(employeeday1_3.getWorkDur(),0);
//		assertEquals(employeeday1_3.getAllLeaveDur(),0);
//		assertEquals(employeeday1_3.getNoShow(),1);
//		assertEquals(employeeday1_3.getOutWork(),1);
//		assertEquals(employeeday1_3.getTpye(),1);
//		
		assertEquals(employeeday1_4.getUserid(),userId);
		assertEquals(employeeday1_4.getEmployeeid(),employeeId);
		assertEquals(employeeday1_4.getDelay(),1);
		assertEquals(employeeday1_4.getDelayDur(),0);
		assertEquals(employeeday1_4.getLeaveEarly(),1);
		assertEquals(employeeday1_4.getLeaveDur(),0);
		assertEquals(employeeday1_4.getWorkShow(),1);
		assertEquals(employeeday1_4.getWorkDur(),0);
		assertEquals(employeeday1_4.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()+B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday1_4.getNoShow(),1);
		assertEquals(employeeday1_4.getOutWork(),1);
		assertEquals(employeeday1_4.getTpye(),1);
				
	}
	
	public void test2(){
		
		assertEquals(employeeday2_0.getUserid(),userId);
		assertEquals(employeeday2_0.getEmployeeid(),employeeId);
		assertEquals(employeeday2_0.getDelay(),1);
		assertEquals(employeeday2_0.getDelayDur(),0);
		assertEquals(employeeday2_0.getLeaveEarly(),1);
		assertEquals(employeeday2_0.getLeaveDur(),0);
		assertEquals(employeeday2_0.getWorkShow(),1);
		assertEquals(employeeday2_0.getWorkDur(),0);
		assertEquals(employeeday2_0.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2_0.getNoShow(),1);
		assertEquals(employeeday2_0.getOutWork(),1);
		assertEquals(employeeday2_0.getTpye(),2);
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),120);
		assertEquals(employeeday2.getNoShow(),1);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		
//		assertEquals(employeeday2_2.getUserid(),userId);
//		assertEquals(employeeday2_2.getEmployeeid(),employeeId);
//		assertEquals(employeeday2_2.getDelay(),1);
//		assertEquals(employeeday2_2.getDelayDur(),0);
//		assertEquals(employeeday2_2.getLeaveEarly(),1);
//		assertEquals(employeeday2_2.getLeaveDur(),0);
//		assertEquals(employeeday2_2.getWorkShow(),1);
//		assertEquals(employeeday2_2.getWorkDur(),0);
//		assertEquals(employeeday2_2.getAllLeaveDur(),0);
//		assertEquals(employeeday2_2.getNoShow(),1);
//		assertEquals(employeeday2_2.getOutWork(),1);
//		assertEquals(employeeday2_2.getTpye(),2);
//	
//		assertEquals(employeeday2_3.getUserid(),userId);
//		assertEquals(employeeday2_3.getEmployeeid(),employeeId);
//		assertEquals(employeeday2_3.getDelay(),1);
//		assertEquals(employeeday2_3.getDelayDur(),0);
//		assertEquals(employeeday2_3.getLeaveEarly(),1);
//		assertEquals(employeeday2_3.getLeaveDur(),0);
//		assertEquals(employeeday2_3.getWorkShow(),1);
//		assertEquals(employeeday2_3.getWorkDur(),0);
//		assertEquals(employeeday2_3.getAllLeaveDur(),0);
//		assertEquals(employeeday2_3.getNoShow(),1);
//		assertEquals(employeeday2_3.getOutWork(),1);
//		assertEquals(employeeday2_3.getTpye(),2);
		
		assertEquals(employeeday2_4.getUserid(),userId);
		assertEquals(employeeday2_4.getEmployeeid(),employeeId);
		assertEquals(employeeday2_4.getDelay(),1);
		assertEquals(employeeday2_4.getDelayDur(),0);
		assertEquals(employeeday2_4.getLeaveEarly(),1);
		assertEquals(employeeday2_4.getLeaveDur(),0);
		assertEquals(employeeday2_4.getWorkShow(),1);
		assertEquals(employeeday2_4.getWorkDur(),0);
		assertEquals(employeeday2_4.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2_4.getNoShow(),1);
		assertEquals(employeeday2_4.getOutWork(),1);
		assertEquals(employeeday2_4.getTpye(),2);
		
		
	}
	
	public void test3(){
		assertEquals(employeeday3_0.getUserid(),userId);
		assertEquals(employeeday3_0.getEmployeeid(),employeeId);
		assertEquals(employeeday3_0.getDelay(),1);
		assertEquals(employeeday3_0.getDelayDur(),0);
		assertEquals(employeeday3_0.getLeaveEarly(),1);
		assertEquals(employeeday3_0.getLeaveDur(),0);
		assertEquals(employeeday3_0.getWorkShow(),1);
		assertEquals(employeeday3_0.getWorkDur(),0);
		assertEquals(employeeday3_0.getAllLeaveDur(),240);
		assertEquals(employeeday3_0.getNoShow(),1);
		assertEquals(employeeday3_0.getOutWork(),1);
		assertEquals(employeeday3_0.getTpye(),3);
		
		assertEquals(employeeday3.getUserid(),userId);
		assertEquals(employeeday3.getEmployeeid(),employeeId);
		assertEquals(employeeday3.getDelay(),1);
		assertEquals(employeeday3.getDelayDur(),0);
		assertEquals(employeeday3.getLeaveEarly(),1);
		assertEquals(employeeday3.getLeaveDur(),0);
		assertEquals(employeeday3.getWorkShow(),1);
		assertEquals(employeeday3.getWorkDur(),0);
		assertEquals(employeeday3.getAllLeaveDur(),240);
		assertEquals(employeeday3.getNoShow(),1);
		assertEquals(employeeday3.getOutWork(),1);
		assertEquals(employeeday3.getTpye(),3);
		
		
//		assertEquals(employeeday3_2.getUserid(),userId);
//		assertEquals(employeeday3_2.getEmployeeid(),employeeId);
//		assertEquals(employeeday3_2.getDelay(),1);
//		assertEquals(employeeday3_2.getDelayDur(),0);
//		assertEquals(employeeday3_2.getLeaveEarly(),1);
//		assertEquals(employeeday3_2.getLeaveDur(),0);
//		assertEquals(employeeday3_2.getWorkShow(),1);
//		assertEquals(employeeday3_2.getWorkDur(),0);
//		assertEquals(employeeday3_2.getAllLeaveDur(),0);
//		assertEquals(employeeday3_2.getNoShow(),1);
//		assertEquals(employeeday3_2.getOutWork(),1);
//		assertEquals(employeeday3_2.getTpye(),3);
//
//		assertEquals(employeeday3_3.getUserid(),userId);
//		assertEquals(employeeday3_3.getEmployeeid(),employeeId);
//		assertEquals(employeeday3_3.getDelay(),1);
//		assertEquals(employeeday3_3.getDelayDur(),0);
//		assertEquals(employeeday3_3.getLeaveEarly(),1);
//		assertEquals(employeeday3_3.getLeaveDur(),0);
//		assertEquals(employeeday3_3.getWorkShow(),1);
//		assertEquals(employeeday3_3.getWorkDur(),0);
//		assertEquals(employeeday3_3.getAllLeaveDur(),0);
//		assertEquals(employeeday3_3.getNoShow(),1);
//		assertEquals(employeeday3_3.getOutWork(),1);
//		assertEquals(employeeday3_3.getTpye(),3);
//		
		assertEquals(employeeday3_4.getUserid(),userId);
		assertEquals(employeeday3_4.getEmployeeid(),employeeId);
		assertEquals(employeeday3_4.getDelay(),1);
		assertEquals(employeeday3_4.getDelayDur(),0);
		assertEquals(employeeday3_4.getLeaveEarly(),1);
		assertEquals(employeeday3_4.getLeaveDur(),0);
		assertEquals(employeeday3_4.getWorkShow(),1);
		assertEquals(employeeday3_4.getWorkDur(),0);
		assertEquals(employeeday3_4.getAllLeaveDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday3_4.getNoShow(),1);
		assertEquals(employeeday3_4.getOutWork(),1);
		assertEquals(employeeday3_4.getTpye(),3);
		
		
		
		
		
		
	}
	

	
	 
	
	
}