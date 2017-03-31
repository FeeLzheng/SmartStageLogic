package com.uniubi.common.outwork.weekend;

import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;





public class outworkTest extends OutworkBaseTestCase{
	
	public outworkTest(String name){
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
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_2() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_3() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;// 
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_4() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("03:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_5() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("02:00:00",5);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute3();
		
		
		
	}
	
	@Test
	public void test1_6() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("03:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("02:00:00",5);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute3();
		
		
		
	}
	
	@Test
	public void test1_7() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=Attendancetime("17:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("02:00:00",5);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute3();
		
		
		
	}
	
	@Test
	public void test1_8() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute4();//先请假在打卡
		
		
		
	}
	
	@Test
	public void test1_9() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute4();
		
		
		
	}
	
	@Test
	public void test1_10() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute5();
		
		
		
	}
	
	@Test
	public void test1_11() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("03:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute5();
		
		
		
	}
	
	@Test
	public void test1_12() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("02:00:00",5);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute6();
		
		
		
	}
	
	@Test
	public void test1_13() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("03:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("02:00:00",5);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute6();
		
		
		
	}
	
	@Test
	public void test1_14() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=Attendancetime("17:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=null;
		o1_1=outworkTime("09:00:00",1);
		o1_2=outworkTime("02:00:00",5);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute6();
		
		
		
	}
	
	
	

	

	
	//不跨时段  --一班
	public void Testx_x_1(){
		
		attendanceCreate2(1);//先生成记录,一天一班}
	
		if(No==1){		
		outworkCreate(1);//一次请假
		
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		if(employeeDay1!=null){
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		}
		}
		
	}

	public void Testx_x_2(){
		
		attendanceCreate2(1);//先生成记录,一天一班}
		attendanceCreate2(2);//先生成记录,一天一班}
	
		if(No==1){		
		outworkCreate(1);//一次请假
		
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
		
		if(employeeDay1!=null){
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
		}
		}
		
	}

	
	public void Testx_x_3(){
		
		attendanceCreate2(1);//先生成记录,一天一班}
		attendanceCreate2(2);//先生成记录,一天一班}
		attendanceCreate2(3);//先生成记录,一天一班}
	
		if(No==1){		
		outworkCreate(1);//一次请假
		
		if(employeeDay1!=null){	
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
		employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
		
		OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
		}
		}
		
	}
		
		//先请假生成
		//不跨时段  --一班
		public void Testx_x_4(){
			
	
		
			if(No==1){		
				outworkCreate(1);//一次请假
			
				if(employeeDay1!=null){		
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
				}
				attendanceCreate2(1);//先生成记录,一天一班}
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			
			}
			}
								
		}
		
		public void Testx_x_5(){
			
			
			
			if(No==1){		
				outworkCreate(1);//一次请假
				if(employeeDay1!=null){
					
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
				}
				attendanceCreate2(1);//先生成记录,一天一班}
			attendanceCreate2(2);//先生成记录,一天一班}
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			}
			
			}					
		}

		
		public void Testx_x_6(){
			
			
			
			if(No==1){		
				outworkCreate(1);//一次请假
			
				if(employeeDay1!=null){		
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
				}
				attendanceCreate2(1);//先生成记录,一天一班}
				attendanceCreate2(2);//先生成记录,一天一班}
				attendanceCreate2(3);//先生成记录,一天一班}
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			OutworkBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,o1_1,o1_2,o1_3,o1_4,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
			}
			}
			
		}
		
		
		
}