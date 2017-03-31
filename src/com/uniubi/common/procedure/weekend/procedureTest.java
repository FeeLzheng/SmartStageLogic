package com.uniubi.common.procedure.weekend;

import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;








public class procedureTest extends ProcedureBaseTestCase{
	
	public procedureTest(String name){
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
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:01:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_2() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:01:00",1);
		f1_1=procedureTime("09:05:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
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
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:05:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	
	@Test
	public void test1_4() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_5() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_6() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:58:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	
	@Test
	public void test1_7() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:58:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_8() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:06:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_9() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:58:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_10() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:59:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_11() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	
	@Test
	public void test1_12() throws Exception{
		
		
		t1_1=null;
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_13() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:06:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_14() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:01:00",1);
		f1_1=procedureTime("09:06:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_15() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:02:00",1);
		f1_1=procedureTime("09:05:00",2);
		e1_2=procedureTime("09:01:00",3);
		f1_2=procedureTime("09:02:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_16() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:01:00",1);
		f1_1=procedureTime("09:04:00",2);
		e1_2=procedureTime("09:00:00",3);
		f1_2=procedureTime("09:01:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_17() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:03:00",1);
		f1_1=procedureTime("09:05:00",2);
		e1_2=procedureTime("09:01:00",3);
		f1_2=procedureTime("09:02:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	
	@Test
	public void test1_18() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:03:00",1);
		f1_1=procedureTime("10:59:00",2);
		e1_2=procedureTime("10:00:00",3);
		f1_2=procedureTime("10:02:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_19() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("10:59:00",2);
		e1_2=procedureTime("10:59:00",3);
		f1_2=procedureTime("11:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_20() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:58:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("11:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_21() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("10:58:00",2);
		e1_2=procedureTime("09:01:00",3);
		f1_2=procedureTime("09:02:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_22() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:06:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("11:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	@Test
	public void test1_23() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:58:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=procedureTime("09:00:00",3);
		f1_2=procedureTime("09:05:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_24() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:06:00",2);
		e1_2=procedureTime("09:06:00",3);
		f1_2=procedureTime("11:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_25() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("09:06:00",2);
		e1_2=procedureTime("09:06:00",3);
		f1_2=procedureTime("10:59:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	
	@Test
	public void test1_26() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:01:00",1);
		f1_1=procedureTime("09:05:00",2);
		e1_2=procedureTime("09:06:00",3);
		f1_2=procedureTime("10:59:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_27() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=procedureTime("09:03:00",3);
		f1_2=procedureTime("09:04:00",4);
		e1_3=procedureTime("09:01:00",5);
		f1_3=procedureTime("09:02:00",8);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_28() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("11:00:00",2);
		e1_2=procedureTime("09:03:00",3);
		f1_2=procedureTime("09:04:00",4);
		e1_3=procedureTime("09:02:00",5);
		f1_3=procedureTime("09:03:00",8);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;
		Test_execute1();
		
		
		
	}
	
	@Test
	public void test1_29() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute2();//2ci daka 
		
		
		
	}
	
	@Test
	public void test1_30() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_31() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute2();//
		
		
		
	}
	
	
	@Test
	public void test1_32() throws Exception{
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=Attendancetime("13:00:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("17:00:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_33() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//1次假
		Test_execute2();//
		
		
		
	}
	
	@Test
	public void test1_34() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("13:04:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute2();
		
		
		
	}
	
	
	@Test
	public void test1_35() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute2();
		
		
		
	}
	
	@Test
	public void test1_36() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("13:04:00",2);
		e1_2=procedureTime("13:04:00",3);
		f1_2=procedureTime("13:06:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute2();//2班
		
		
		
	}
	
	@Test
	public void test1_37() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("10:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute2();//2班
		
		
		
	}
	
	@Test
	public void test1_38() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:05:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=procedureTime("10:00:00",3);
		f1_2=procedureTime("10:05:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute2();//2班
		
		
		
	}
	
	@Test
	public void test1_39() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("15:00:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("13:03:00",2);
		e1_2=procedureTime("13:01:00",3);
		f1_2=procedureTime("13:05:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute2();//2班
		
		
		
	}
	
	@Test
	public void test1_40() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("01:55:00",6);
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("13:04:00",2);
		e1_2=procedureTime("13:04:00",3);
		f1_2=procedureTime("02:00:00",9);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请3次假
		Test_execute3();//3班
		
		
		
	}
	
	
	@Test
	public void test1_41() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=null;
		t1_3=Attendancetime("13:05:00",3);
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("13:04:00",2);
		e1_2=procedureTime("13:04:00",3);
		f1_2=procedureTime("17:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute2();//2班
		
		
		
	}
	
	@Test
	public void test1_43() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("13:00:00",2);
		e1_2=procedureTime("13:01:00",3);
		f1_2=procedureTime("13:03:00",4);
		e1_3=procedureTime("13:03:00",5);
		f1_3=procedureTime("13:04:00",8);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请2次假
		Test_execute2();//3班\\
		
		
		
	}
	
	@Test
	public void test1_42() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("10:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute2();//2班
		
		
		
	}
	
	@Test
	public void test1_44() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("10:59:00",1);
		f1_1=procedureTime("13:05:00",2);
		e1_2=procedureTime("13:05:00",3);
		f1_2=procedureTime("17:00:00",4);
		e1_3=procedureTime("09:00:00",5);
		f1_3=procedureTime("10:59:00",8);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请2次假
		Test_execute2();//3班
		
		
		
	}
	
	@Test
	public void test1_45() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("02:00:00",7);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_46() throws Exception{
		
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		e1_1=procedureTime("09:05:00",1);
		f1_1=procedureTime("20:01:00",2);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_47() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:55:00",6);
		e1_1=procedureTime("09:55:00",1);
		f1_1=procedureTime("02:00:00",7);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_48() throws Exception{
		
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("05:29:00",6);
		e1_1=procedureTime("09:00:00",1);
		f1_1=procedureTime("02:00:00",7);
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请1次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_49() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("20:04:00",2);
		e1_2=procedureTime("20:04:00",3);
		f1_2=procedureTime("20:05:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//2班
		
		
		
	}
	
	
	@Test
	public void test1_50() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("20:03:00",2);
		e1_2=procedureTime("20:03:00",3);
		f1_2=procedureTime("20:04:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//3班
		
		
		
	}
	
	
	@Test
	public void test1_51() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("20:05:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("10:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_52() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("01:55:00",6);
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("20:04:00",2);
		e1_2=procedureTime("20:04:00",3);
		f1_2=procedureTime("20:05:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_53() throws Exception{
		
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("01:55:00",6);
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("20:05:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("10:00:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_54() throws Exception{
		
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("20:05:00",2);
		e1_2=procedureTime("09:00:00",3);
		f1_2=procedureTime("09:05:00",4);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_55() throws Exception{
		
		
		
		t1_1=Attendancetime("09:05:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("10:00:00",1);
		f1_1=procedureTime("20:05:00",2);
		e1_2=procedureTime("21:00:00",3);
		f1_2=procedureTime("1:00:00",9);
		e1_3=null;
		f1_3=null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_56() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("13:05:00",3);
		t1_4=Attendancetime("16:55:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("09:59:00",1);
		f1_1=procedureTime("20:01:00",2);
		e1_2=procedureTime("20:01:00",3);
		f1_2=procedureTime("20:03:00",4);
		e1_3=procedureTime("20:04:00",5);
		f1_3=procedureTime("20:05:00",8);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请3次假
		Test_execute3();//3班
		
		
		
	}
	
	@Test
	public void test1_57() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("10:05:00",1);
		f1_1=procedureTime("20:05:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("10:01:00",4);
		e1_3=procedureTime("10:01:00",5);
		f1_3=procedureTime("10:05:00",6);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请3次假
		Test_execute3();//3班
				
	}
	@Test
	public void test1_58() throws Exception{
		
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:05:00",5);
		t1_6=Attendancetime("02:00:00",6);
		e1_1=procedureTime("10:05:00",1);
		f1_1=procedureTime("20:05:00",2);
		e1_2=procedureTime("09:59:00",3);
		f1_2=procedureTime("10:01:00",4);
		e1_3=procedureTime("10:01:00",5);
		f1_3=procedureTime("10:05:00",8);
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请3次假
		Test_execute3();//3班
				
	}
	
	public void test1_59() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("11:00:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_60() throws Exception{
		
		
		t1_1=Attendancetime("09:59:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	
	public void test1_61() throws Exception{
		
		
		t1_1=Attendancetime("10:01:00",1);
		t1_2=Attendancetime("11:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_62() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("11:00:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_63() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("11:00:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_64() throws Exception{
		
		
		t1_1=Attendancetime("09:30:00",1);
		t1_2=Attendancetime("10:29:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:30:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_65() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:30:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_66() throws Exception{
		
		
		t1_1=Attendancetime("09:20:00",1);
		t1_2=Attendancetime("10:40:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:30:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute4();//1班
		
		
	}
	
	public void test1_67() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:00:00", 3);
		f1_2=procedureTime("11:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请1次假
		Test_execute4();//2班
		
		
	}
	public void test1_68() throws Exception{
		
		
		t1_1=Attendancetime("09:30:00",1);
		t1_2=Attendancetime("10:20:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:00:00", 3);
		f1_2=procedureTime("10:30:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute4();//2班
		
		
	}
	
	public void test1_69() throws Exception{
		
		
		t1_1=Attendancetime("09:20:00",1);
		t1_2=Attendancetime("10:20:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("11:00:00", 2);
		
		e1_2=procedureTime("09:30:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请1次假
		Test_execute4();//2班
		
		
	}
	
	public void test1_70() throws Exception{
		
		
		t1_1=Attendancetime("09:10:00",1);
		t1_2=Attendancetime("09:20:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("11:00:00", 2);
		
		e1_2=procedureTime("09:30:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请1次假
		Test_execute4();//2班
		
		
	}
	
	public void test1_71() throws Exception{
		
		
		t1_1=Attendancetime("10:01:00",1);
		t1_2=Attendancetime("10:29:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:30:00", 3);
		f1_2=procedureTime("10:50:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请1次假
		Test_execute4();//2班
		
		
	}
	
	
	public void test1_72() throws Exception{
		
		
		t1_1=Attendancetime("09:10:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:30:00", 3);
		f1_2=procedureTime("10:50:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请1次假
		Test_execute4();//2班
		
		
	}
	
	public void test1_73() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:00:00", 3);
		f1_2=procedureTime("10:30:00", 4);
		e1_3=procedureTime("10:30:00", 5);
		f1_3=procedureTime("11:00:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请1次假
		Test_execute4();//3班
		
		
	}
	
	public void test1_74() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:10:00", 3);
		f1_2=procedureTime("10:30:00", 4);
		e1_3=procedureTime("10:30:00", 5);
		f1_3=procedureTime("10:40:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请1次假
		Test_execute4();//3班
		
		
	}
	
	public void test1_75() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("10:00:00", 2);
		
		e1_2=procedureTime("10:10:00", 3);
		f1_2=procedureTime("10:30:00", 4);
		e1_3=procedureTime("10:40:00", 5);
		f1_3=procedureTime("10:50:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请1次假
		Test_execute3();//3班
		
		
	}
	public void test1_76() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("17:00:00", 2);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_77() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("15:00:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请1次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_78() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("15:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_79() throws Exception{
		
		
		t1_3=null;
		t1_4=null;
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:00:00",2);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("17:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//2班
		
		
	}
	
	public void test1_80() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("15:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("17:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_81() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:00:00",2);
		t1_3=Attendancetime("15:00:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_82() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_83() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("15:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请2次假
		Test_execute5();//1班
		
		
	}
	
	public void test1_84() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=procedureTime("15:00:00", 3);
		f1_2=procedureTime("17:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute5();//2班
		
		
	}
	
	public void test1_85() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("17:00:00", 2);
		
 		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute5();//2班
		
		
	}
	
	public void test1_86() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("09:59:00",2);
		t1_3=Attendancetime("16:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=procedureTime("15:00:00", 3);
		f1_2=procedureTime("16:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute5();//2班
		
		
	}
	
	public void test1_87() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:01:00",2);
		t1_3=Attendancetime("14:59:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请2次假
		Test_execute5();//2班
		
		
	}
	
	public void test1_88() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=procedureTime("15:00:00", 5);
		f1_3=procedureTime("17:00:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请2次假
		Test_execute5();//3班
		
		
	}
	
	public void test1_89() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=procedureTime("15:00:00", 5);
		f1_3=procedureTime("16:00:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请2次假
		Test_execute5();//3班
		
		
	}
	
	public void test1_90() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("10:00:00", 1);
 		f1_1=procedureTime("15:00:00", 2);
		
 		e1_2=procedureTime("09:30:00", 3);
		f1_2=procedureTime("10:00:00", 4);
		e1_3=procedureTime("15:00:00", 5);
		f1_3=procedureTime("17:00:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请2次假
		Test_execute5();//3班
		
		
	}
	
	
	public void test1_91() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("02:00:00", 7);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请3次假
		Test_execute6();//1班
		
		
	}
	
	
	
	public void test1_92() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("09:29:00",2);
		t1_3=Attendancetime("16:01:00",3);
		t1_4=null;
		t1_5=Attendancetime("01:01:00",7);
		t1_6=Attendancetime("01:59:00",6);
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("01:00:00", 7);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请3次假
		Test_execute6();//1班
		
		
	}
	
	public void test1_93() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("09:30:00",2);
		t1_3=null;
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("00:30:00",7);
		t1_6=Attendancetime("05:29:00",6);
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("02:00:00", 7);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请3次假
		Test_execute6();//1班
		
		
	}
	
	public void test1_94() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("16:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("01:01:00",7);
		t1_6=Attendancetime("01:59:00",6);
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("01:00:00", 7);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;//请3次假
		Test_execute6();//1班
		
		
	}
	
	
	public void test1_95() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("09:40:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("01:50:00",7);
		t1_6=Attendancetime("02:00:00",6);
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("01:10:00", 7);
		
		e1_2=procedureTime("01:10:00", 10);
		f1_2=procedureTime("01:50:00", 9);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请3次假
		Test_execute6();//2班
		
		
	}
	
	public void test1_96() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("00:40:00",7);
		t1_6=Attendancetime("01:01:00",6);
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("01:10:00", 7);
		
		e1_2=procedureTime("01:10:00", 10);
		f1_2=procedureTime("01:50:00", 9);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请3次假
		Test_execute6();//2班
		
		
	}
	
	public void test1_97() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("00:40:00",7);
		t1_6=Attendancetime("01:59:00",6);
		
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("01:10:00", 7);
		
		e1_2=procedureTime("01:10:00", 10);
		f1_2=procedureTime("01:50:00", 9);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请3次假
		Test_execute6();//2班
		
		
	}
	
	public void test1_98() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("02:00:00", 7);
		
		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("09:30:00", 4);
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=2;//请3次假
		Test_execute6();//2班
		
		
	}
	
	public void test1_99() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("01:00:00", 7);
		
		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("09:30:00", 4);
		e1_3=procedureTime("01:00:00", 11);
		f1_3=procedureTime("02:00:00", 6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请3次假
		Test_execute6();//3班
		
		
	}
	
	public void test1_100() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		e1_1=procedureTime("09:00:00", 1);
 		f1_1=procedureTime("21:00:00", 2);
		
		e1_2=procedureTime("21:01:00", 3);
		f1_2=procedureTime("01:10:00", 9);
		e1_3=procedureTime("01:10:00", 11);
		f1_3=procedureTime("02:00:00", 6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;//请3次假
		Test_execute6();//3班
		
		
	}

	

	
	public void test1_101() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		e1_1=procedureTime("09:30:00", 1);
 		f1_1=procedureTime("02:00:00", 7);
		
		e1_2=procedureTime("09:00:00", 3);
		f1_2=procedureTime("09:29:00", 4);
		e1_3=procedureTime("09:29:00", 5);
		f1_3=procedureTime("09:30:00", 8);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=3;
		Test_execute6();
		
		
	}
	
	//跨10天请假 
	
	public void test1_102() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;

		
		e1_1=procedureTime("09:30:00", 12);
 		f1_1=procedureTime("16:00:00", 13);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute7();
		
		
	}

	
	public void test1_103() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;

		
		e1_1=procedureTime("09:00:00", 12);
 		f1_1=procedureTime("17:00:00", 13);
		
		e1_2=null;
		f1_2=null;
		e1_3=null;
		f1_3=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		No=1;
		Test_execute2();
		
		
	}


	

	
	//不跨时段  --一班
public void Testx_x_1(){
		
		attendanceCreate(1);//先生成记录,一天一班}
	
		if(No==1){		
		procedureCreate(1);//一次请假
		
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		if(employeeDay1!=null){
		ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		}
		}
		if(No==2){
			procedureCreate(1);//一次请假
			procedureCreate(2);//两次请假
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);			
			}
			
			
		}
		if(No==3){
			procedureCreate(1);//一次请假
			procedureCreate(2);//两次请假	
			procedureCreate(3);//三次请假	
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			}
		}
							
	}

	
	//跨时段  --一天2班
	public void Testx_x_2(){
		
		attendanceCreate(1);//先生成记录
		attendanceCreate(2);//先生成记录,一天2班}
	
		if(No==1){		
		procedureCreate(1);//一次请假
		
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
		
		if(employeeDay1!=null){
		ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
		
		ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
		t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
		employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
		}
		}
		if(No==2){
			procedureCreate(1);//一次请假
			procedureCreate(2);//两次请假
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			}
			
		}
		if(No==3){
			procedureCreate(1);//一次请假
			procedureCreate(2);//两次请假	
			procedureCreate(3);//三次请假	
			
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
		}
		}
							
	}
	

	
	//跨时段  --一天3班
		public void Testx_x_3(){
			
			attendanceCreate(1);//先生成记录
			attendanceCreate(2);//先生成记录
			attendanceCreate(3);//先生成记录,一天3班
		
			if(No==1){		
			procedureCreate(1);//一次请假
			
					
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
			
			if(employeeDay1!=null){
			
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
			}
			}
			if(No==2){
				procedureCreate(1);//一次请假
				procedureCreate(2);//两次请假
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
				
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
				}	
			}
			if(No==3){
				procedureCreate(1);//一次请假
				procedureCreate(2);//两次请假	
				procedureCreate(3);//三次请假	
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
				
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
				}	
			}
								
		}
	

		
		//先请假生成
		//不跨时段  --一班
		public void Testx_x_4(){
			
	
		
			if(No==1){		
			procedureCreate(1);//一次请假
			
					
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			}
			attendanceCreate(1);//先生成记录,一天一班}
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			}
			}
			if(No==2){
				procedureCreate(1);//一次请假
				procedureCreate(2);//两次请假
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);			
				}
				attendanceCreate(1);//先生成记录,一天一班}
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
				
				}	
			}
			if(No==3){
				procedureCreate(1);//一次请假
				procedureCreate(2);//两次请假	
				procedureCreate(3);//三次请假	
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
				}
				attendanceCreate(1);//先生成记录,一天一班}
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			}
			}
								
		}
	
		//跨时段  --一天2班
		public void Testx_x_5(){		
		
			if(No==1){		
			procedureCreate(1);//一次请假
			
					
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
			}
			attendanceCreate(1);//先生成记录
			attendanceCreate(2);//先生成记录,一天2班}
			employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
			employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
			employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
			if(employeeDay1!=null){
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
			
			ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
			t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
			employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
			}
			}
			if(No==2){
				procedureCreate(1);//一次请假
				procedureCreate(2);//两次请假
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
				}
				if(employeeDay1!=null){
				attendanceCreate(1);//先生成记录
				attendanceCreate(2);//先生成记录,一天2班}
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
				}
				
			}
			if(No==3){
				procedureCreate(1);//一次请假
				procedureCreate(2);//两次请假	
				procedureCreate(3);//三次请假	
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
				}
				attendanceCreate(1);//先生成记录
				attendanceCreate(2);//先生成记录,一天2班}
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
				}
				
			}
								
		}
		

		
		//跨时段  --一天3班,先请假后打卡
			public void Testx_x_6(){
				
				System.out.println("执行");
			
				if(No==1){		
				procedureCreate(1);//一次请假
				
						
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
				}
				attendanceCreate(1);//先生成记录
				attendanceCreate(2);//先生成记录
				attendanceCreate(3);//先生成记录,一天3班
				employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
				
				if(employeeDay1!=null){
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
				
				ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
				employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
				}
				}
				if(No==2){
					
					procedureCreate(1);//一次请假
					procedureCreate(2);//两次请假
					
					employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
					employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
					employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
					employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
					if(employeeDay1!=null){
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
					
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
					}
					attendanceCreate(1);//先生成记录
					attendanceCreate(2);//先生成记录
					attendanceCreate(3);//先生成记录,一天3班
					employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
					employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
					employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
					employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
					if(employeeDay1!=null){
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
					
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
					}
				}
				if(No==3){
					procedureCreate(1);//一次请假
					procedureCreate(2);//两次请假	
					procedureCreate(3);//三次请假	
					
					employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
					employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
					employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
					employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
					if(employeeDay1!=null){
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(1);
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(2);	
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(3);
					
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test_1(4);
					}
					attendanceCreate(1);//先生成记录
					attendanceCreate(2);//先生成记录
					attendanceCreate(3);//先生成记录,一天3班
					employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
					employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
					employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
					employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
					if(employeeDay1!=null){
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);	
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
							t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
							employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
					
					
					ProcedureBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
					t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1,
					employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
					}
				}else{
					System.out.println("异常退出");
				}
									
			}
		
		
	public void Testx_x_7(){
				
				System.out.println("执行");
				attendanceCreate(1);//先生成记录
				attendanceCreate(2);//先生成记录
				if(No==1){		
				procedureCreate(1);//一次请假
			
				employeeDay1_0=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
				employeeDay2_0=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
				employeeDay3_0=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
				
				
				employeeDay1=dao.getEmployeeDay(userId, employeeId, nextday, 1);//总记录
				employeeDay2=dao.getEmployeeDay(userId, employeeId, nextday, 2);//分记录
				employeeDay3=dao.getEmployeeDay(userId, employeeId, nextday, 3);//分记录
				
//				employeeDay1_2=dao.getEmployeeDay(userId, employeeId, day1, 1);//总记录
//				employeeDay2_2=dao.getEmployeeDay(userId, employeeId, day1, 2);//分记录
//				employeeDay3_2=dao.getEmployeeDay(userId, employeeId, day1, 3);//分记录
//				
//				employeeDay1_3=dao.getEmployeeDay(userId, employeeId, day2, 1);//总记录
//				employeeDay2_3=dao.getEmployeeDay(userId, employeeId, day2, 2);//分记录
//				employeeDay3_3=dao.getEmployeeDay(userId, employeeId, day2, 3);//分记录
				
				employeeDay1_4=dao.getEmployeeDay(userId, employeeId, day3, 1);//总记录
				employeeDay2_4=dao.getEmployeeDay(userId, employeeId, day3, 2);//分记录
				employeeDay3_4=dao.getEmployeeDay(userId, employeeId, day3, 3);//分记录
				
				ProcedureBase.getInstance2(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1_0,
						employeeDay2_0, employeeDay3_0, employeeDay4_0,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, employeeDay1_2,
						employeeDay2_2, employeeDay3_2, employeeDay4_2,employeeDay1_3,
						employeeDay2_3, employeeDay3_3, employeeDay4_3,employeeDay1_4,
						employeeDay2_4, employeeDay3_4, employeeDay4_4,caseNo).test(1);
				
				ProcedureBase.getInstance2(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1_0,
						employeeDay2_0, employeeDay3_0, employeeDay4_0,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, employeeDay1_2,
						employeeDay2_2, employeeDay3_2, employeeDay4_2,employeeDay1_3,
						employeeDay2_3, employeeDay3_3, employeeDay4_3,employeeDay1_4,
						employeeDay2_4, employeeDay3_4, employeeDay4_4,caseNo).test(2);
				
				ProcedureBase.getInstance2(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1_0,
						employeeDay2_0, employeeDay3_0, employeeDay4_0,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, employeeDay1_2,
						employeeDay2_2, employeeDay3_2, employeeDay4_2,employeeDay1_3,
						employeeDay2_3, employeeDay3_3, employeeDay4_3,employeeDay1_4,
						employeeDay2_4, employeeDay3_4, employeeDay4_4,caseNo).test(3);
				ProcedureBase.getInstance2(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
						t1_3, t1_4, t1_5, t1_6,e1_1,f1_1,e1_2,f1_2,e1_3,f1_3,M1_1,M1_2,M1_3,employeeDay1_0,
						employeeDay2_0, employeeDay3_0, employeeDay4_0,employeeDay1,
						employeeDay2, employeeDay3, employeeDay4, employeeDay1_2,
						employeeDay2_2, employeeDay3_2, employeeDay4_2,employeeDay1_3,
						employeeDay2_3, employeeDay3_3, employeeDay4_3,employeeDay1_4,
						employeeDay2_4, employeeDay3_4, employeeDay4_4,caseNo).test(4);
				
	
				
			
				
									
			}
		
		
		
		
}
}