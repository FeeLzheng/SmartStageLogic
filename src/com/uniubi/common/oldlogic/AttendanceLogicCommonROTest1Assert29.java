package com.uniubi.common.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicCommonROTest1Assert29 extends
		AttendanceLogicCommonROTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((tn.getTime()-t1.getTime())));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes((e1.getTime()-A1.getTime())));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes((B1.getTime()-f1.getTime())));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
		
	}

	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes((B1.getTime()-A1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes((f1.getTime()-e1.getTime())));
		assertEquals(employeeDay.getOutWork(),2);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		
	}
	
}
