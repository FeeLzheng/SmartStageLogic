package com.uniubi.common.oldlogic;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2Assert27 extends AttendanceLogicCommonTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),convertMsToMinutes(t2_1.getTime()-f1.getTime()));
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(B2.getTime()-t2_n.getTime()));
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));
		
		assertEquals(employeeNextDay.getDelayDur(),convertMsToMinutes(e2.getTime()-f1.getTime()+t2_1.getTime()-f2.getTime()));
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(B2.getTime()-t2_n.getTime()));
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));
		assertEquals(1,1);
	}

}
