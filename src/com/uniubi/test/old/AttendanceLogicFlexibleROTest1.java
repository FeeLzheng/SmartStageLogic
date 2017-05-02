package com.uniubi.test.old;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;

import com.uniubi.flexible.oldlogic.AttendanceLogicFlexibleROTest1AssertBase;


/**
 * 流程（请假、补签、出差）同天-弹性考勤规则-考勤逻辑测试
 * 方法名最后一个下划线后的编号代表测试方式：
 * 	1========
 * 		插入第一天打卡记录；
 * 		更新流程类别、始末时间、补签时间；
 * 		执行流程处理exe；
 * 		执行第一天考勤生成exe；
 * 		查看考勤结果；
 * 		补充流程测试。
 *  2========
 *  	插入第一天打卡记录；
 *  	执行第一天考勤生成exe；
 *  	更新流程类别、始末时间、补签时间；
 *  	执行流程处理exe；
 *  	查看考勤结果；
 *  	补充流程测试。
 * 
 * 	ps.涉及补充流程的用例，都已经在后面加上了补充流程的测试。(若处理的是未来的数据，还需要再执行生成考勤记录，若处理过去的数据，则不需要再执行)
 * @author 潘雷
 * 2016-06-06
 */
public class AttendanceLogicFlexibleROTest1 extends OldBaseTestCase{

	private static Date r1_1;//第一天已发起的第一个补签流程补签时间
	private static Date r1_2;//第一天已发起的第二个补签流程补签时间
	private static Date r2_1;//第一天补充发起的第一个补签流程补签时间
	private static Date r2_2;//第一天补充发起的第二个补签流程补签时间
	private static Date o1_1;//第一天已发起的出差流程开始时间
	private static Date o1_2;//第一天已发起的出差流程结束时间
	private static Date o2_1;//第一天补充发起的出差流程开始时间
	private static Date o2_2;//第一天补充发起的出差流程结束时间
	private static Date o3_1;//第二天出差流程开始时间
	private static Date o3_2;//第二天出差流程结束时间
	
	
	
	private static int leaveProcedureId1 =  1192;
	private static int leaveProcedureId2 =  1189;
	private static int repairProcedureId1_1 = 25;//第一天已发起的第一个补签流程id
	private static int repairProcedureId1_2 =26;//第一天已发起的第二个补签流程id
	private static int repairProcedureId1r_1 = 27;//第一天补充发起的第一个补签流程id
	private static int repairProcedureId1r_2 = 28;//第一天补充发起的第二个补签流程id
	private static int outworkProcedureId = 29;//第一天已发起的出差流程id
	
	//测试流程
	private static int repairProcedureId1r_4 = 711;//第一天补充发起的第一个补签流程id
	private static int repairProcedureId1r_3 = 712;//第一天补充发起的第二个补签流程id
	
	private static int repairProcedureId1r_5 = 713;//第一天补充发起的第一个补签流程id
	private static int repairProcedureId1r_6 = 714;//第一天补充发起的第二个补签流程id

	private static Date r2_3;//第一天补充发起的第一个补签流程补签时间
	private static Date r2_4;//第一天补充发起的第二个补签流程补签时间
	
	
	
	
	private static Date DL1 = null;
	private static long t;
	
	public AttendanceLogicFlexibleROTest1(String name){
		super(name);
		try {
			START1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + STARTStr);
			END1 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + ENDStr);
			C1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + STARTStr);
			D1 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + ENDStr);
			t = B1.getTime()-A1.getTime();
			DL1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + DLStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		junit.textui.TestRunner.run(suite());//字符界面
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_5"));
//	    suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_8"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test1_10"));
////
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_10"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test2_11"));
//	
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test3_3"));
//////	
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test4_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test4_4"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("Test4_5"));
		
		//5、6、7三类全是特殊情况，手动测试。
		
		return suite;
	}
	
	
	@Test
	public void test1_1() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		f1 = new Date((long)(Math.random()*(t1_1.getTime()+t-e1.getTime())+e1.getTime()));
		r1_1 = null;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(D1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;

		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_2() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = r1_1;
		f2 = new Date(t1_1.getTime()+t);
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;

		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_3() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date(t1_1.getTime()+t);;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_4() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(C1.getTime()-t1_1.getTime())+t1_1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = B1;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_5() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = A1;
		o1_2 = B1;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_6() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_7() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前七个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_8() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第八、第九个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = A1;
		o1_2 = B1;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_9() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第八、第九个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(D1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test1_10() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = null;
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = A1;
		o2_2 = B1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	
	@Test
	public void test2_1() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-(B1.getTime()-A1.getTime()+t1_1.getTime()))+(B1.getTime()-A1.getTime()+t1_1.getTime())));//在第二类用例中，前四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		r1_1 = null;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = f1;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;

		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_2() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-(B1.getTime()-A1.getTime()+t1_1.getTime()))+(B1.getTime()-A1.getTime()+t1_1.getTime())));//在第二类用例中，前四个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(A1.getTime()-START1.getTime())+START1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_3() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-(B1.getTime()-A1.getTime()+t1_1.getTime()))+(B1.getTime()-A1.getTime()+t1_1.getTime())));//在第二类用例中，前四个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = A1;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_4() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-(B1.getTime()-A1.getTime()+t1_1.getTime()))+(B1.getTime()-A1.getTime()+t1_1.getTime())));//在第二类用例中，前四个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = A1;
		o1_2 = B1;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_5() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第五到第八个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date(t1_1.getTime()+t);
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_6() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第五到第八个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_7() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第五到第八个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date(t1_1.getTime()+t);
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = A1;
		o2_2 = B1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_8() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第五到第八个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date(t1_1.getTime()+t);
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_9() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_10() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
		r1_2 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date(r1_1.getTime()+t);
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test2_11() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = null;
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date(t1_1.getTime()+t);
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test3_1() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，前两个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date(t1_n.getTime()-t);
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test3_2() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，前两个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = A1;
		o1_2 = B1;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test3_3() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = null;
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = A1;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test4_1() throws Exception {
		
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = A1;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test4_2() throws Exception {
		
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = A1;
		r2_2 = B1;
//		r2_3 = A2;
//		r2_4 = B2;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test4_3() throws Exception {
		
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = A1;
		o2_2 = B1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	@Test
	public void test4_4() throws Exception {
		
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
		r1_2 = B1;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
	}
	
	public void test4_5() throws Exception {
		
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = null;
		r1_2 = null;
		o3_1 = A1;
		o3_2 = B2;
		
		e2 = null;
		f2 = null;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1_next();
		
	}
	
	//测试方式1执行模板
	@Override
	public void Testx_x_1() throws Exception {
	
		
		//更新请假流程
		dao.ProcedureCreate(e1,f1,procedureId1);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_1,repairProcedureId1_1);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_2,repairProcedureId1_2);
		//更新第一天已发起的出差流程
		dao.OutworkCreate(o1_1,o1_2,outworkProcedureId);
		
		//插入打卡记录
		attendancesCreate(1);
		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
		employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
		employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		
		AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(1);
		AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(1);
		
		if((e2 != null && f2 != null) || (r2_1 != null) || (o2_1 != null && o2_2 != null)){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2);
			//更新第一天补充发起的补签流程1
			dao.RepairCreate(r2_1,repairProcedureId1r_1);
			//更新第一天补充发起的补签流程2
			dao.RepairCreate(r2_2,repairProcedureId1r_2);
			//更新第一天补充发起的出差流程
			dao.OutworkCreate(o2_1,o2_2,outworkProcedureId);
			
			

			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(2);
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(2);
		}
		
	}
	
	//测试方式2执行模板
	@Override
	public void Testx_x_2() throws Exception {
		//插入打卡记录
		attendancesCreate(1);
		

		
		//更新请假流程
		dao.ProcedureCreate(e1,f1,procedureId1);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_1,repairProcedureId1_1);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_2,repairProcedureId1_2);

		
		dao.OutworkCreate(o1_1,o1_2,outworkProcedureId);
		
	
		
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
		employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
		employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(1);
		AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(1);
		
		if((e2 != null && f2 != null) || (r2_1 != null) || (o2_1 != null && o2_2 != null)){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2);
			//更新第一天补充发起的补签流程1
			dao.RepairCreate(r2_1,repairProcedureId1r_5);
			//更新第一天补充发起的补签流程2
			dao.RepairCreate(r2_2,repairProcedureId1r_6);
			
			//更新第一天已发起的出差流程
			//更新第一天已发起的补签流程1
//			dao.updateRepairProcedure(r2_3,repairProcedureId1r_3);
//			//更新第一天已发起的补签流程1
//			dao.updateRepairProcedure(r2_4,repairProcedureId1r_4);
			//更新第一天补充发起的出差流程
			dao.OutworkCreate(o2_1,o2_2,outworkProcedureId);
						
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(2);
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(2);
		}
	}
	
	@Override
	public void Testx_x_3() throws Exception {
		
	}
	
	//测试跨天出差--先生成在更新
		@Override
		public void Testx_x_4() throws Exception {
			//
			attendancesCreate(1);
			attendancesCreate(2);
	
			
//			dao.OutworkCreate(o3_1,o3_2,outworkProcedureId);
			

			//校验第一天,和第二天的考勤记录
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2);
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(1);
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(1);
			
			if((e2 != null && f2 != null) || (r2_1 != null) || (o3_1 != null && o3_2 != null)){
		
				//更新第一天和第二天补充发起的出差流程
				dao.OutworkCreate(o3_1,o3_2,outworkProcedureId);
				
				

				employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
				employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
				employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
				employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2);
				AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(2);
				AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(2);
			}
		}
		
		
		//测试跨天出差--先更新在生成
		@Override
		public void Testx_x_5() throws Exception {
			//插入打卡记录
			dao.OutworkCreate(o3_1,o3_2,outworkProcedureId);
			
			attendancesCreate(1);
			attendancesCreate(2);
			

			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2);
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(2);
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(2);
			
		}
		
		
		//测试跨天出差--生成，更新，生成
		@Override
		public void Testx_x_6() throws Exception {
			//插入打卡记录
			attendancesCreate(1);
			
			
			dao.OutworkCreate(o3_1,o3_2,outworkProcedureId);
			
			
			
//			dao.OutworkCreate(o3_1,o3_2,outworkProcedureId);
			
			

			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			employeeDay2 = dao.getEmployeeDay(userId,employeeId,day,2); 
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			employeeNextDay2 = dao.getEmployeeDayall(userId,employeeId,nextday,2);
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,employeeNextDay,caseNo).Testx_x(2);
			AttendanceLogicFlexibleROTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay2,employeeNextDay2,caseNo).Testx_x(2);
			
		}
	

	
	@Override
	void setDateSecondZero() {
		super.setDateSecondZero();
		
		r1_1 = setDateSecondAsZero(r1_1);
		r1_2 = setDateSecondAsZero(r1_2);
		r2_1 = setDateSecondAsZero(r2_1);
		r2_2 = setDateSecondAsZero(r2_2);
		o1_1 = setDateSecondAsZero(o1_1);
		o1_2 = setDateSecondAsZero(o1_2);
		o2_1 = setDateSecondAsZero(o2_1);
		o2_2 = setDateSecondAsZero(o2_2);
		
		if(r1_1 != null) System.out.println("r1_1="+COMPLICATED_DATE_FORMAT.format(r1_1));
		if(r1_2 != null) System.out.println("r1_2="+COMPLICATED_DATE_FORMAT.format(r1_2));
		if(r2_1 != null) System.out.println("r2_1="+COMPLICATED_DATE_FORMAT.format(r2_1));
		if(r2_2 != null) System.out.println("r2_2="+COMPLICATED_DATE_FORMAT.format(r2_2));
		if(o1_1 != null) System.out.println("o1_1="+COMPLICATED_DATE_FORMAT.format(o1_1));
		if(o1_2 != null) System.out.println("o1_2="+COMPLICATED_DATE_FORMAT.format(o1_2));
		if(o2_1 != null) System.out.println("o2_1="+COMPLICATED_DATE_FORMAT.format(o2_1));
		if(o2_2 != null) System.out.println("o2_2="+COMPLICATED_DATE_FORMAT.format(o2_2));
		
	}
	
}
