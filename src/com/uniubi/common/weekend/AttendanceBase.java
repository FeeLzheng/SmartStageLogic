package com.uniubi.common.weekend;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import com.uniubi.test.EmployeeDay;



public class AttendanceBase{
	
	 static Date A1_1 = null;
	 static Date A1_2 = null;
	 static Date A1_3 = null;
	 static Date A1_4 = null;
	 
	 static Date B1_1 = null;
	 static Date B1_2 = null;
	 static Date B1_3 = null;
	 static Date B1_4 = null;
	 
	 
	 static Date t1_1=null;
	 static Date t1_2=null;
	 static Date t1_3=null;
	 static Date t1_4=null;
	 static Date t1_5=null;
	 static Date t1_6=null;
	 
	 
	 static EmployeeDay employeeday1;
	 static EmployeeDay employeeday2;
	 static EmployeeDay employeeday3;
	 static EmployeeDay employeeday4;
	 
	 static AttendanceBase instance;
	 
	 static int userId=52;
	 static int employeeId=100000004;
	 
	 
	


	public static AttendanceBase getInstance(Date A1_1,Date A1_2,Date A1_3,Date B1_1,Date B1_2,Date B1_3,Date t1_1,Date t1_2,Date t1_3,Date t1_4,Date t1_5,Date t1_6, 
			EmployeeDay employeeday1,EmployeeDay employeeday2,EmployeeDay employeeday3,EmployeeDay employeeday4,String caseNo){
			try {
				Class<AttendanceBase> clazz = (Class<AttendanceBase>) Class.forName("com.uniubi.common.weekend.CommonAttendancetest"+caseNo);
				instance = clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			instance.t1_1=t1_1;
			instance.t1_2=t1_2;
			instance.t1_3=t1_3;
			instance.t1_4=t1_4;
			instance.t1_5=t1_5;
			instance.t1_6=t1_6;
			instance.A1_1=A1_1;
			instance.A1_2=A1_2;
			instance.A1_3=A1_3;
			
			instance.B1_1=B1_1;
			instance.B1_2=B1_2;
			instance.B1_3=B1_3;
			
			instance.employeeday1=employeeday1;
			instance.employeeday2=employeeday2;
			instance.employeeday3=employeeday3;
			instance.employeeday4=employeeday4;
			
			

			return instance;
		}
	
	
	public int convserToMinutes(long ms){
		return (int)ms/1000/60;
				
	}
	
	public void test1(){
//		System.out.println("对比分表中的数据");	
		assertEquals(employeeday1.getdaytype(),2);

		
	}
	public void test2(){
//		System.out.println("对比分表1中的数据");
		assertEquals(employeeday2.getdaytype(),2);
	}
	public void test3(){
//		System.out.println("对比分表2中的数据");		
		assertEquals(employeeday3.getdaytype(),2);
	}
	public void test4(){
//		System.out.println("对比分表3中的数据");	
		assertEquals(employeeday4.getdaytype(),2);
	}
	
	
	public void test1_employeeweekend(){
		
		assertEquals(employeeday1.getDelay(),1);
		assertEquals(employeeday1.getDelayDur(),0);
		assertEquals(employeeday1.getLeaveEarly(),1);
		assertEquals(employeeday1.getLeaveDur(),0);
		assertEquals(employeeday1.getNoShow(),1);
		assertEquals(employeeday1.getdaytype(),2);
		
		
	}
	
	public void test2_employeeweekend(){
		
		assertEquals(employeeday2.getDelay(),1);
		assertEquals(employeeday2.getDelayDur(),0);
		assertEquals(employeeday2.getLeaveEarly(),1);
		assertEquals(employeeday2.getLeaveDur(),0);
		assertEquals(employeeday2.getNoShow(),1);
		assertEquals(employeeday2.getdaytype(),2);
		
		
	}
	
	public void test3_employeeweekend(){
		
		assertEquals(employeeday3.getDelay(),1);
		assertEquals(employeeday3.getDelayDur(),0);
		assertEquals(employeeday3.getLeaveEarly(),1);
		assertEquals(employeeday3.getLeaveDur(),0);
		assertEquals(employeeday3.getNoShow(),1);
		assertEquals(employeeday3.getdaytype(),2);
		
		
	}
	
	public void test4_employeeweekend(){
		
		assertEquals(employeeday4.getDelay(),1);
		assertEquals(employeeday4.getDelayDur(),0);
		assertEquals(employeeday4.getLeaveEarly(),1);
		assertEquals(employeeday4.getLeaveDur(),0);
		assertEquals(employeeday4.getNoShow(),1);
		assertEquals(employeeday4.getdaytype(),2);
		
		
	}
	
	
	public void test(int No){
		if(No==1){
			System.out.println("对比总表的数据");
			test1();
			System.out.println("今天是休息日");
			assertEquals(employeeday1.getdaytype(),2);
			test1_employeeweekend();
				} 
		if(No==2){
			System.out.println("对比分表1中的数据");	
			test2();
			System.out.println("今天是休息日");
			assertEquals(employeeday1.getdaytype(),2);
			test2_employeeweekend();
		}
		if(No==3){
			System.out.println("对比分表2中的数据");	
			test3();
			System.out.println("今天是休息日");
			assertEquals(employeeday1.getdaytype(),2);
			test3_employeeweekend();
		}
		if(No==4){
			System.out.println("对比分表3中的数据");	
			test4();
			System.out.println("今天是休息日");
			assertEquals(employeeday1.getdaytype(),2);
			test4_employeeweekend();
		}
		
		
	}
	
	
	
	
	
	
}