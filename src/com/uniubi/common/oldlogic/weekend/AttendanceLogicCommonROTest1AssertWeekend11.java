package com.uniubi.common.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicCommonROTest1AssertWeekend11 extends
		AttendanceLogicCommonROTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
		System.out.println(convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assert(true);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

	@Override
	public void Testx_x_2() {
		System.out.println(convertMsToMinutes((r2_1.getTime()-t1.getTime())));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((r2_1.getTime()-t1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

}
