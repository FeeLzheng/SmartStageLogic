package com.uniubi.common.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicCommonROTest1Assert11 extends
		AttendanceLogicCommonROTest1AssertBase {

	@Override
	public void Testx_x_1() {
		System.out.println(convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		System.out.println(convertMsToMinutes((B1.getTime()-f1.getTime() + e1.getTime()-tn.getTime())));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime() - e1.getTime()));
		assert(true);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

	@Override
	public void Testx_x_2() {
		System.out.println(convertMsToMinutes((r2_1.getTime()-t1.getTime())));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((r2_1.getTime()-t1.getTime()-(f1.getTime()-e1.getTime()))));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime() - e1.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}
	
}
