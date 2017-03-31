package com.uniubi.flexible.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleROTest1AssertWeekend22 extends
		AttendanceLogicFlexibleROTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-r1_1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

	@Override
	public void Testx_x_2() {
	}

}
