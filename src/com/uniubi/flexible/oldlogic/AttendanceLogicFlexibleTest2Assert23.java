package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2Assert23 extends
		AttendanceLogicFlexibleTest2AssertBase {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t+e1.getTime()-t1_n.getTime()));
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),convertMsToMinutes(t+A2.getTime()-t2_n.getTime()));
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),convertMsToMinutes(e1.getTime()-A1.getTime()));
		assertEquals(employeeDay.getLeaveDur(),convertMsToMinutes(t+e1.getTime()-t1_n.getTime()));
		
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()-(f2.getTime()-e2.getTime())));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
	}
	
	@Override
	public void Testx_x_4_simple_leave(){
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()+f2.getTime()-e2.getTime()));
	}

}
