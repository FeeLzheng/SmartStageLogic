package com.uniubi.common.oldlogic.weekend;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2AssertWeekend11 extends AttendanceLogicCommonTest2AssertBaseWeekend {

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		System.out.println(convertMsToMinutes(B1.getTime()-e1.getTime()+f2.getTime()-e2.getTime()));
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
	}

	@Override
	public void Testx_x_1_all() {
		System.out.println(convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		System.out.println(convertMsToMinutes(B1.getTime()-e1.getTime()+f2.getTime()-e2.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
	//	assertEquals(employeeDay.getEmployeeid(),100000004);
	}

	@Override
	public void Testx_x_2_all() {
		System.out.println(employeeNextDay.getWorkDur());
		System.out.println(convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		//employeeNextDay 因为流程不会更新，所以跨天表不会有记录
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		System.out.println(convertMsToMinutes(f1.getTime()-A2.getTime()));
	    assertEquals(employeeNextDay.getAllLeaveDur(),0);
     	assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
	}


}
