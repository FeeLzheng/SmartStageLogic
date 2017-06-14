package com.uniubi.common.oldlogic;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2Assert12 extends AttendanceLogicCommonTest2AssertBase {

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),0);
		System.out.println(convertMsToMinutes(e1.getTime()-t1_n.getTime()));
		System.out.println(convertMsToMinutes((employeeDay.getLeaveDur())));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-t1_n.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()+f2.getTime()-e2.getTime()));
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(B2.getTime()-t2_n.getTime()));
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-t1_n.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()));
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()-(f1.getTime()-A2.getTime())));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(B2.getTime()-t2_n.getTime()));
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}


}
