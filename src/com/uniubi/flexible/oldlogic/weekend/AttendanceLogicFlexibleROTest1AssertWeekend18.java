package com.uniubi.flexible.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleROTest1AssertWeekend18 extends
		AttendanceLogicFlexibleROTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),1);
		assertEquals(employeeDay.getOutWork(),2);
	}

	@Override
	public void Testx_x_2() {
	}

}
