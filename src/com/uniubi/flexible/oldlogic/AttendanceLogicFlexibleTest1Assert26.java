package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest1Assert26 extends
		AttendanceLogicFlexibleTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(tn.getTime()-t1.getTime()+e1.getTime()-f1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t-tn.getTime()+t1.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}
	
	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(tn.getTime()-t1.getTime()+e2.getTime()-f2.getTime()+e1.getTime()-f1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t+t1.getTime()-tn.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

}
