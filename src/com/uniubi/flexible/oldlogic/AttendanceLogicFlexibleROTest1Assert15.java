package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleROTest1Assert15 extends
		AttendanceLogicFlexibleROTest1AssertBase {

	@Override
	public void Testx_x_1() {
		System.out.println(convertMsToMinutes(t));
		System.out.println(employeeDay.getWorkDur());
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getOutWork(),2);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);

	}

	@Override
	public void Testx_x_2() {
		
	}

}
