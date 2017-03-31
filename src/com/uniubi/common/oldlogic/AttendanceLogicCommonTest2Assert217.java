package com.uniubi.common.oldlogic;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2Assert217 extends AttendanceLogicCommonTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1_1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(B2.getTime()-f1.getTime()));
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1_1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));//Failed TODO
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(e2.getTime()-f1.getTime()+B2.getTime()-f2.getTime()));//Failed TODO
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));//Failed TODO
		assertEquals(1,1);
	}

}
