package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest1Assert16 extends
		AttendanceLogicFlexibleTest1AssertBase {

	@Override
	public void Testx_x_1() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(tn.getTime()-t1.getTime()-(f1.getTime()-e1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t1.getTime()+t-tn.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}
	
	@Override
	public void Testx_x_2() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(tn.getTime()-t1.getTime()-(f1.getTime()-e1.getTime())));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t1.getTime()+t-tn.getTime()+e2.getTime()-f2.getTime()));
		assertEquals(employeeDay.getNoShow(),1);
		assertEquals(employeeDay.getWorkShow(),2);
		assertEquals(employeeDay.getOutWork(),1);
	}

}
