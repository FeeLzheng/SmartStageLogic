package com.uniubi.common.oldlogic;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest1Assert14 extends AttendanceLogicCommonTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-t1.getTime())-(f1.getTime()-e1.getTime())));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes((B1.getTime()-tn.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

	@Override
	public void Testx_x_2() {
	}


}
