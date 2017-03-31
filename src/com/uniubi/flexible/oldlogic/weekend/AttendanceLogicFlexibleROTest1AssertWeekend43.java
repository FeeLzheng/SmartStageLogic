package com.uniubi.flexible.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleROTest1AssertWeekend43 extends
		AttendanceLogicFlexibleROTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
//		assertEquals(employeeDay.getWorkDur(),null);
//		assertEquals(employeeDay.getDelayDur(),null);
//		assertEquals(employeeDay.getLeaveDur(),null);
//		assertEquals(employeeDay.getNoShow(),null);
//		assertEquals(employeeDay.getWorkShow(),null);
//		assertEquals(employeeDay.getOutWork(),null);
	}

	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),1);
		assertEquals(employeeDay.getOutWork(),2);
	}

}
