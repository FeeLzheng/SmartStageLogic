package com.uniubi.common.oldlogic.weekend;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest1AssertWeekend21 extends AttendanceLogicCommonTest1AssertBaseWeekend {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
		assertEquals(employeeDay.getEmployeeid(),100000004);
	}

	@Override
	public void Testx_x_2() {
		System.out.println(employeeDay.getDelayDur());
		System.out.println(convertMsToMinutes((t1.getTime()-f1.getTime() + e1.getTime()-f2.getTime() + e2.getTime() - A1.getTime())));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
		assertEquals(employeeDay.getEmployeeid(),100000004);
	}


}
