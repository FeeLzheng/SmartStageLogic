package com.uniubi.common.oldlogic.weekend;

import static org.junit.Assert.*;


public class AttendanceLogicCommonTest2AssertWeekend32 extends AttendanceLogicCommonTest2AssertBaseWeekend {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),0);
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);
		assertEquals(employeeNextDay.getUserid(),52);
	}

	@Override
	public void Textx_x_last() {
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		assertEquals(employeeDay.getAllLeaveDur(),0);
		
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),0);
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);
		assertEquals(employeeNextDay.getUserid(),52);
	}

}
