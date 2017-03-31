package com.uniubi.common.procedure.weekend;

import static org.junit.Assert.assertEquals;


public class CommonProceduretest1102 extends ProcedureBase{
	
	

	
	
	public void test1(){
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-e1_1.getTime()+B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday2.getNoShow(),2);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		assertEquals(employeeday2_2.getUserid(),userId);
		assertEquals(employeeday2_2.getEmployeeid(),employeeId);
		assertEquals(employeeday2_2.getDelay(),1);
		assertEquals(employeeday2_2.getDelayDur(),0);
		assertEquals(employeeday2_2.getLeaveEarly(),1);
		assertEquals(employeeday2_2.getLeaveDur(),0);
		assertEquals(employeeday2_2.getWorkShow(),1);
		assertEquals(employeeday2_2.getWorkDur(),0);
		assertEquals(employeeday2_2.getAllLeaveDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()+B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2_2.getNoShow(),1);
		assertEquals(employeeday2_2.getOutWork(),1);
		assertEquals(employeeday2_2.getTpye(),2);
		
		
		assertEquals(employeeday2_3.getUserid(),userId);
		assertEquals(employeeday2_3.getEmployeeid(),employeeId);
		assertEquals(employeeday2_3.getDelay(),1);
		assertEquals(employeeday2_3.getDelayDur(),0);
		assertEquals(employeeday2_3.getLeaveEarly(),1);
		assertEquals(employeeday2_3.getLeaveDur(),0);
		assertEquals(employeeday2_3.getWorkShow(),1);
		assertEquals(employeeday2_3.getWorkDur(),0);
		assertEquals(employeeday2_3.getAllLeaveDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()+B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2_3.getNoShow(),1);
		assertEquals(employeeday2_3.getOutWork(),1);
		assertEquals(employeeday2_3.getTpye(),2);
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-e1_1.getTime()+f1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday2.getNoShow(),2);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
				
	}
	
	public void test2(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-e1_1.getTime()));
		assertEquals(employeeday2.getNoShow(),2);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		assertEquals(employeeday2_2.getUserid(),userId);
		assertEquals(employeeday2_2.getEmployeeid(),employeeId);
		assertEquals(employeeday2_2.getDelay(),1);
		assertEquals(employeeday2_2.getDelayDur(),0);
		assertEquals(employeeday2_2.getLeaveEarly(),1);
		assertEquals(employeeday2_2.getLeaveDur(),0);
		assertEquals(employeeday2_2.getWorkShow(),1);
		assertEquals(employeeday2_2.getWorkDur(),0);
		assertEquals(employeeday2_2.getAllLeaveDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday2_2.getNoShow(),1);
		assertEquals(employeeday2_2.getOutWork(),1);
		assertEquals(employeeday2_2.getTpye(),2);
		
		
		assertEquals(employeeday2_3.getUserid(),userId);
		assertEquals(employeeday2_3.getEmployeeid(),employeeId);
		assertEquals(employeeday2_3.getDelay(),1);
		assertEquals(employeeday2_3.getDelayDur(),0);
		assertEquals(employeeday2_3.getLeaveEarly(),1);
		assertEquals(employeeday2_3.getLeaveDur(),0);
		assertEquals(employeeday2_3.getWorkShow(),1);
		assertEquals(employeeday2_3.getWorkDur(),0);
		assertEquals(employeeday2_3.getAllLeaveDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday2_3.getNoShow(),1);
		assertEquals(employeeday2_3.getOutWork(),1);
		assertEquals(employeeday2_3.getTpye(),2);
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-e1_1.getTime()));
		assertEquals(employeeday2.getNoShow(),2);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		
	}
	
	public void test3(){
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),convserToMinutes(B1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday2.getNoShow(),2);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		assertEquals(employeeday2_2.getUserid(),userId);
		assertEquals(employeeday2_2.getEmployeeid(),employeeId);
		assertEquals(employeeday2_2.getDelay(),1);
		assertEquals(employeeday2_2.getDelayDur(),0);
		assertEquals(employeeday2_2.getLeaveEarly(),1);
		assertEquals(employeeday2_2.getLeaveDur(),0);
		assertEquals(employeeday2_2.getWorkShow(),1);
		assertEquals(employeeday2_2.getWorkDur(),0);
		assertEquals(employeeday2_2.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2_2.getNoShow(),1);
		assertEquals(employeeday2_2.getOutWork(),1);
		assertEquals(employeeday2_2.getTpye(),2);
		
		
		assertEquals(employeeday2_3.getUserid(),userId);
		assertEquals(employeeday2_3.getEmployeeid(),employeeId);
		assertEquals(employeeday2_3.getDelay(),1);
		assertEquals(employeeday2_3.getDelayDur(),0);
		assertEquals(employeeday2_3.getLeaveEarly(),1);
		assertEquals(employeeday2_3.getLeaveDur(),0);
		assertEquals(employeeday2_3.getWorkShow(),1);
		assertEquals(employeeday2_3.getWorkDur(),0);
		assertEquals(employeeday2_3.getAllLeaveDur(),convserToMinutes(B1_1.getTime()-A1_1.getTime()));
		assertEquals(employeeday2_3.getNoShow(),1);
		assertEquals(employeeday2_3.getOutWork(),1);
		assertEquals(employeeday2_3.getTpye(),2);
		
		assertEquals(employeeday2.getUserid(),userId);
		assertEquals(employeeday2.getEmployeeid(),employeeId);
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getWorkShow(),1);
		assertEquals(employeeday2.getWorkDur(),0);
		assertEquals(employeeday2.getAllLeaveDur(),convserToMinutes(f1_2.getTime()-A1_2.getTime()));
		assertEquals(employeeday2.getNoShow(),2);
		assertEquals(employeeday2.getOutWork(),1);
		assertEquals(employeeday2.getTpye(),2);
		
		
		
		
		
		
	}
	

	
	 
	
	
}