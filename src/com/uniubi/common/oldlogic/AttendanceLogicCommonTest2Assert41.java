package com.uniubi.common.oldlogic;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2Assert41 extends AttendanceLogicCommonTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));
		assertEquals(employeeDay.getNoShow(),2);
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
		assertEquals(employeeNextDay.getNoShow(),2);
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));
		assertEquals(employeeDay.getNoShow(),2);
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));//Failed TODO
		assertEquals(employeeNextDay.getNoShow(),2);
		assertEquals(1,1);
	}

}
