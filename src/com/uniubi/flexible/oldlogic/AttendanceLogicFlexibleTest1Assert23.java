package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest1Assert23 extends
		AttendanceLogicFlexibleTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(tn.getTime()-t1.getTime()+e1.getTime()-f1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}
	
	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(tn.getTime()-t1.getTime()+e1.getTime()-f1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(t1.getTime()-f2.getTime()+e2.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

}
