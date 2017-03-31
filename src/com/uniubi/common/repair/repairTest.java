package com.uniubi.common.repair;

import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;





public class repairTest extends RepairBaseTestCase{
	
	public repairTest(String name){
		super(name);
		C1_1=new Date((long)(Math.random()*(A1_1.getTime()-B_2.getTime())+B_2.getTime()));
		D1_1=new Date((long)(Math.random()*(A1_2.getTime()-B1_1.getTime())+B1_1.getTime()));
		
		C1_2=D1_1;
		D1_2=new Date((long)(Math.random()*(A2_1.getTime()-B1_2.getTime())+B1_2.getTime()));
		
	
	}
	
	
//	public static void main(String[] args){
//		junit.textui.TestRunner.run(suite());//字符界面
//	}
//	
//	
//	public static TestSuite suite(){
//		TestSuite suite = new TestSuite();
//		suite.addTest(new attendanceTest("Test1_1"));
//	    System.out.print(suite);
//		return suite;
//	}
	
	@Test
	public void test1_1() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//补签2次
		Test_execute1();
		
		
		
	}
	@Test
	public void test1_2() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("11:00:00",1);
		r1_2=null;
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//一次补签
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_3() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=null;
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//一次补签
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_4() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("11:00:00",1);
		r1_2=null;
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//一次补签
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_5() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//2次补签
		Test_execute1();
		
		
		
	}
	
	
	
	@Test
	public void test1_6() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("11:00:00",2);
		r1_3=repairTime("13:00:00",3);
		r1_4=repairTime("17:00:00",4);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=4;// //4次补签
		Test_execute2();
		
		
		
	}

	
	@Test
	public void test1_7() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=null;
		t1_3=null;
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("11:00:00",1);
		r1_2=repairTime("13:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2; //2次补签
		Test_execute2();
		
	}
	
	@Test
	public void test1_8() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("13:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2; //2次补签
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_9() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("13:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("11:00:00",1);
		r1_2=repairTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2; //2次补签
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_10() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("11:00:00",2);
		r1_3=repairTime("13:00:00",3);
		r1_4=repairTime("17:00:00",4);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=4; //2次补签
		Test_execute2();
		
		
		
	}
	
	

	
	
	
	@Test
	public void test1_11() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("11:00:00",2);
		r1_3=repairTime("13:00:00",3);
		r1_4=repairTime("17:00:00",4);
		r1_5=repairTime("20:00:00",5);
		r1_6=repairTime("02:00:00",6);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=6; //6次补签
		Test_execute3();
		
		
		
	}

	
	@Test
	public void test1_12() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=null;
		t1_3=null;
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=Attendancetime("2:00:00",6);
		r1_1=repairTime("11:00:00",1);
		r1_2=repairTime("13:00:00",2);
		r1_3=repairTime("20:00:00",3);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;// 3次补签
		Test_execute3();
		
		
	}
	
	@Test
	public void test1_13() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("13:00:00",2);
		r1_3=repairTime("20:00:00",3);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3; //3次补签
		Test_execute3();
		
		
		
	}
	
	@Test
	public void test1_14() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("13:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:00:00",5);
		t1_6=Attendancetime("01:59:00",6);
		r1_1=repairTime("11:59:00",1);
		r1_2=repairTime("18:29:00",2);
		r1_3=repairTime("05:29:00",7);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3; //3次补签
		Test_execute3();		
		
		
	}
	
	@Test
	public void test1_15() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("01:59:00",6);
		r1_1=repairTime("09:00:00",1);
		r1_2=repairTime("11:00:00",2);
		r1_3=repairTime("12:00:00",3);
		r1_4=repairTime("18:29:00",4);
		r1_5=repairTime("18:30:00",5);
		r1_6=repairTime("02:00:00",6);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=6; //6次补签
		Test_execute3();
		
		
		
	}

	
	
	//不跨时段  --一班
	public void Testx_x_1() throws Exception{
		
		attendanceCreate(1);//先生成记录,一天一班}
	
		if(No==1){		
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			
			
		repairCreate(1);//一次补签
		
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		}
		if(No==2){
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录

			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);			
			
			
			
		}
		if(No==3){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
		}
		if(No==4){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			repairCreate(4);//三次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
		}		
		if(No==6){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			repairCreate(4);//四次补签
			repairCreate(5);//五次补签
			repairCreate(6);//六次补签
			

			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
		}	
	}

	
	//不跨时段  --2班
	public void Testx_x_2() throws Exception{
		
		attendanceCreate(1);//先生成记录,一天一班}
		attendanceCreate(2);//先生成记录,一天一班}
	
		if(No==1){		
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
		
			repairCreate(1);//一次补签
		
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录

		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
		}
		if(No==2){
			
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
	
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			
			
		}
		if(No==3){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
		}
		if(No==4){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			repairCreate(4);//三次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
		}		
		if(No==6){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			repairCreate(4);//四次补签
			repairCreate(5);//五次补签
			repairCreate(6);//六次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
		}	
	}
	
	
	//不跨时段  --3班
	public void Testx_x_3() throws Exception{
		
		attendanceCreate(1);//先生成记录,一天三班}
		attendanceCreate(2);//先生成记录,一天三班}
		attendanceCreate(3);//先生成记录,一天三班}
	
		
		
		if(No==1){
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
			
			
		repairCreate(1);//一次补签
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
		employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
				

		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
		
		RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
		}
		if(No==2){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
			
			
			
		}
		if(No==3){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
			
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
			
		}
		if(No==4){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			repairCreate(4);//三次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
		}		
		if(No==6){
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
			
			repairCreate(1);//一次补签
			repairCreate(2);//两次补签
			repairCreate(3);//三次补签
			repairCreate(4);//四次补签
			repairCreate(5);//五次补签
			repairCreate(6);//六次补签
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);	
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			
			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		}	
	}
	
		
		//先请假生成
		//不跨时段  --一班
//		public void Testx_x_4() throws Exception{
//			
//	
//		
//			if(No==1){		
//				repairCreate(1);//一次请假
//			
//					
//			employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//			employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
//			
//			attendanceCreate(1);//先生成记录,一天一班}
//			
//			employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//			employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
//			
//			}
//			if(No==2){
//				repairCreate(1);//一次请假
//				repairCreate(2);//两次请假
//				
//				employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//				employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);			
//				
//				attendanceCreate(1);//先生成记录,一天一班}
//				
//				employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//				employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
//				
//				
//			}
//			if(No==3){
//				repairCreate(1);//一次请假
//				repairCreate(2);//两次请假	
//				repairCreate(3);//三次请假	
//				
//				employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//				employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
//				
//				attendanceCreate(1);//先生成记录,一天一班}
//				employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//				employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
//				
//				RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
//				
//				
//			}
//								
//		if(No==4){
//			repairCreate(1);//一次请假
//			repairCreate(2);//两次请假	
//			repairCreate(3);//三次请假	
//			repairCreate(4);//四次请假	
//			
//			employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//			employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
//			
//			attendanceCreate(1);//先生成记录,一天一班}
//			employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//			employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
//			
//			
//		}
//		if(No==6){
//			repairCreate(1);//一次请假
//			repairCreate(2);//两次请假	
//			repairCreate(3);//三次请假	
//			repairCreate(4);//四次请假	
//			repairCreate(5);//三次请假	
//			repairCreate(6);//四次请假	
//			
//			employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//			employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
//			
//			attendanceCreate(1);//先生成记录,一天一班}
//			employeeDay1=dao.getEmpolyeeDay(userId, employeeId, day, 1);//总记录
//			employeeDay2=dao.getEmpolyeeDay(userId, employeeId, day, 2);//分记录
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
//			
//			RepairBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
//			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,r1_1,r1_2,r1_3,r1_4,r1_5,r1_6,employeeDay1,
//			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
//			
//			
//		}
//
//		}
//		
//		
	
		
}