package com.uniubi.common.weekend;

import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;





public class attendanceTest extends BaseTestCase{
	
	public attendanceTest(String name){
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
//		suite.addTest(new attendanceTest("test1_1"));
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
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
		
	}
	
	public void test1_2() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_3() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	
	public void test1_4() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	
	public void test1_5() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	
	public void test1_6() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_7() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute2();
		
		
	}
	
	
	
	public void test1_8() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_9() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_10() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_11() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	public void test1_12() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_13() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_14() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_15() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_16() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_17() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_18() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_19() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_20() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;		
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_21() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_22() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();	
	}
	
	
	public void test1_23() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=null;		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();	
	}
	
	
	public void test1_24() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();	
	}
	
	public void test1_25() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();	
	}
	
	public void test1_26() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
	}
	
	public void test1_27() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
	}
	
	public void test1_28() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);	
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();	
	}
	
	public void test1_29() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();	
	}
	
	public void test1_30() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		
		t1_4=Attendancetime("18:29:00",4);		
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
	}
	
	public void test1_31() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute1();
	}
	
	public void test1_32() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute2();
		
		
	}
	
	public void test1_33() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_34() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_35() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_36() throws Exception{
		
		
		t1_1=null;
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}

	public void test1_37() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_38() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_39() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_40() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_41() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_42() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	public void test1_43() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_44() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_45() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_46() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_47() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_48() throws Exception{
		
		
		t1_1=null;
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_49() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_50() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_51() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_52() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_53() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_54() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	public void test1_55() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_56() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_57() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_58() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_59() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_60() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	public void test1_61() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_62() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	public void test1_63() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_64() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_65() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_66() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("13:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_67() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_68() throws Exception{
		
		
		t1_1=Attendancetime("10:59:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_69() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_70() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	public void test1_71() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_72() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=null;
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_73() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_74() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_75() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute2();
		
	}
	
	public void test1_76() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_77() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute2();
	}
	
	public void test1_78() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("02:00:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_79() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_80() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_81() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_82() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_83() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_84() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	public void test1_85() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_86() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_87() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_88() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	
	public void test1_89() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_90() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_91() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_92() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_93() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_94() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_95() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_96() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_97() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_98() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_99() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_100() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_101() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	
	public void test1_102() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	public void test1_103() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	public void test1_104() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_105() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_106() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_107() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_108() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_109() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_110() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_111() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
		
	}
	
	public void test1_112() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_113() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_114() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
		Test_execute3();
	}
	
	public void test1_115() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_116() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_117() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	public void test1_118() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
		
	}
	
	
	public void test1_119() throws Exception{
		
		
		t1_1=Attendancetime("06:30:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_120() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_121() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_122() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	public void test1_123() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_124() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_125() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_126() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_127() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_128() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_129() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_130() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_131() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_132() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_133() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_134() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	public void test1_135() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_136() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_137() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_138() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_139() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_140() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_141() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_142() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	public void test1_143() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	
	public void test1_144() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	
	public void test1_145() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	
	public void test1_146() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	
	public void test1_147() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_148() throws Exception{
		
		
		t1_1=null;
		t1_2=Attendancetime("10:59:00",3);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	public void test1_149() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	public void test1_150() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_151() throws Exception{
		
		
		t1_1=null;
		t1_2=Attendancetime("10:59:00",3);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_152() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_153() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_154() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_155() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_156() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_157() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_158() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_159() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_160() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=null;
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_161() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_162() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	
	public void test1_163() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		
	}
	
	public void test1_164() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_165() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_166() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=Attendancetime("01:59:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute3();
	}
	
	public void test1_167() throws Exception{
		
		
		t1_1=Attendancetime("09:01:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_168() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_169() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("10:59:00",2);
		t1_3=Attendancetime("14:01:00",3);
		t1_4=Attendancetime("16:59:00",4);
		t1_5=Attendancetime("20:01:00",5);
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	public void test1_170() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute1();
		
	}
	
	public void test1_171() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("18:29:00",4);
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute2();
		
	}
	
	public void test1_172() throws Exception{
		
		
		t1_1=Attendancetime("09:00:00",1);
		t1_2=Attendancetime("11:00:00",2);
		t1_3=Attendancetime("12:00:00",3);
		t1_4=Attendancetime("17:00:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=Attendancetime("05:29:00",6);
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_173() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute1();
		
	}
	
	public void test1_174() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute2();
		
	}
	
	public void test1_175() throws Exception{
		
		
		t1_1=null;
		t1_2=null;
		t1_3=null;
		t1_4=null;
		t1_5=null;
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}
	
	public void test1_176() throws Exception{
		
		
		t1_1=null;
		t1_2=Attendancetime("11:00:00",2);
		t1_3=null;
		t1_4=Attendancetime("17:00:00",4);
		t1_5=Attendancetime("18:30:00",5);
		t1_6=null;
		
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		Test_execute3();
		
	}	

	
	//一天一班
	public void Testx_x_1(){
		
		attendanceCreate2(1);
//		attendanceCreate(2);
//		attendanceCreate(3);
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		

		
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
							
	}
	//一天2班
	public void Testx_x_2(){
		
		attendanceCreate2(1);
		attendanceCreate2(2);
//		attendanceCreate2(3);
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
							
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4, t1_5, t1_6,employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
	}
	
	public void Testx_x_3(){
		
		attendanceCreate2(1);
		attendanceCreate2(2);
		attendanceCreate2(3);
				
		employeeDay1=dao.getEmployeeDay(userId, employeeId, day, 1);//总记录
		employeeDay2=dao.getEmployeeDay(userId, employeeId, day, 2);//分记录
		employeeDay3=dao.getEmployeeDay(userId, employeeId, day, 3);//分记录
		employeeDay4=dao.getEmployeeDay(userId, employeeId, day, 4);//分记录
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(1);
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(2);
							
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(3);
		
		AttendanceBase.getInstance(A1_1, A1_2, A1_3, B1_1, B1_2, B1_3, t1_1, t1_2, 
				t1_3, t1_4,t1_5, t1_6, employeeDay1, employeeDay2, employeeDay3, employeeDay4, caseNo).test(4);
	}
	
	
	


}