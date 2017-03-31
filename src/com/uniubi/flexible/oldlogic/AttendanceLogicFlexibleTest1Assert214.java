package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest1Assert214 extends
		AttendanceLogicFlexibleTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t-f1.getTime()+e1.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}
	
	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()+e2.getTime()-f2.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t-f1.getTime()+e2.getTime()-f2.getTime()+e1.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

}
