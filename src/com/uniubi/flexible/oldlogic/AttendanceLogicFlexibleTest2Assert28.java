package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2Assert28 extends
		AttendanceLogicFlexibleTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),convertMsToMinutes(t2_1.getTime()-f1.getTime()));
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t-(f1.getTime()-A2.getTime())));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),convertMsToMinutes(t2_1.getTime()-f1.getTime()));
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t-(f1.getTime()-A2.getTime())));
	}
	
	@Override
	public void Testx_x_3_simple_leave(){
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(A1.getTime()+t-e2.getTime()));
	}

}
