package com.uniubi.common.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicCommonROTest1AssertWeekend28 extends
		AttendanceLogicCommonROTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getOutWork(),2);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),1);

	}

	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getOutWork(),2);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),1);
		assertEquals(employeeDay.getUserid(),52);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		
	}

}
