package com.uniubi.flexible.oldlogic.weekend;

import static org.junit.Assert.assertEquals;

public class AttendanceLogicFlexibleTest2AssertWeekend112 extends
		AttendanceLogicFlexibleTest2AssertBaseWeekend {

	@Override
	public void Testx_x_1_all() {
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		assertEquals(employeeDay.getLeaveDur(),0);
		
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);		
	
	}

	@Override
	public void Testx_x_2_all() {
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getUserid(),52);
	}

	@Override
	public void Textx_x_last() {
		//System.out.println(convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getWorkDur(),convertMsToMinutes(t1_n.getTime()-t1_1.getTime()));
		assertEquals(employeeDay.getDelayDur(),0);
		//System.out.println(convertMsToMinutes(e1.getTime()-A1.getTime()-(f2.getTime()-e2.getTime())-(t1_n.getTime()-t1_1.getTime())));
	    //System.out.println(employeeDay.getLeaveDur());
		assertEquals(employeeDay.getLeaveDur(),0);
		
		assertEquals(employeeNextDay.getWorkDur(),convertMsToMinutes(t2_n.getTime()-t2_1.getTime()));
		assertEquals(employeeNextDay.getDelayDur(),0);
		assertEquals(employeeNextDay.getLeaveDur(),0);
		
		assertEquals(employeeDay.getEmployeeid(),100000004);
		assertEquals(employeeDay.getUserid(),52);		
		assertEquals(employeeNextDay.getEmployeeid(),100000004);
		assertEquals(employeeNextDay.getUserid(),52);
	}
	
	
	@Override
	public void Testx_x_3_simple_leave(){

		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(B1.getTime()-e1.getTime()+f2.getTime()-e2.getTime()));
	}
	
}
