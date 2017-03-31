package com.uniubi.flexible.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2AssertWeekend32 extends
		AttendanceLogicFlexibleTest2AssertBaseWeekend {

	@Override
	public void Testx_x_1_all() {
		
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);
	}

	@Override
	public void Testx_x_2_all() {
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getUserid(),52);
	}

	@Override
	public void Textx_x_last() {
		
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		
	
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getUserid(),52);
	}
	
	@Override
	public void Testx_x_3_simple_leave(){
		assertEquals(employeeDay.getAllLeaveDur(),0);
	}
	
	@Override
	public void Testx_x_4_simple_leave(){
		assertEquals(employeeNextDay.getAllLeaveDur(),0);
	}

}
