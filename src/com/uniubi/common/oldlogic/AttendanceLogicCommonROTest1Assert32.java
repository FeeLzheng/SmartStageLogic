package com.uniubi.common.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicCommonROTest1Assert32 extends
		AttendanceLogicCommonROTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((B1.getTime()-A1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),2);
	}

	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),2);
	}
	
}
