package com.uniubi.test.old;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.uniubi.flexible.oldlogic.AttendanceLogicFlexibleTest2AssertBase;




/**
 * 请假跨天-弹性考勤规则-考勤逻辑测试
 * 方法名最后一个下划线后的编号代表测试方式：
 * 	1========
 * 		插入第一天打卡记录；
 * 		更新流程请假时间；
 * 		执行流程处理exe；
 * 		执行第一天考勤生成exe；
 * 		查看第一天考勤结果；
 * 		查看第二天的考勤结果中请假记录；
 * 		插入第二天打卡记录；
 * 		执行第二天考勤生成exe；
 * 		查看第二天考勤结果；
 * 		补充流程测试。
 *  2========
 *  	插入第一天打卡记录；
 *  	执行第一天考勤生成exe；
 *  	更新流程请假时间；
 *  	执行流程处理exe；
 *  	查看第一天考勤结果；
 *  	查看第二天的考勤结果中请假记录；
 *  	插入第二天打卡记录；
 *  	执行第二天考勤生成exe；
 *  	查看第二天考勤结果；
 *  	补充流程测试。
 *  3========
 *  	插入第一天打卡记录；
 *  	执行第一天考勤生成exe；
 *  	插入第二天打卡记录；
 *  	执行第二天考勤生成exe；
 *  	更新流程请假时间；
 *  	执行流程处理exe；
 *  	查看两天的考勤结果；
 *  	补充流程测试。
 * 
 * 	ps.涉及补充流程的用例，都已经在后面加上了补充流程的测试。(若处理的是未来的数据，还需要再执行生成考勤记录，若处理过去的数据，则不需要再执行)
 * @author 潘雷
 * 2016-05-28
 */
public class AttendanceLogicFlexibleTest2 extends OldBaseTestCase{
	private static byte type1=4;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static byte type2=8;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static Date DL1 = null;
	private static Date DL2 = null;
	private static long t;
	
	
	public AttendanceLogicFlexibleTest2(String name){
		super(name);
		try {
			C1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + STARTStr);
			D1 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + ENDStr);
			C2 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + STARTStr);
			D2 = COMPLICATED_DATE_FORMAT.parse(next2DayStr + " " + ENDStr);
			DL1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + DLStr);
			DL2 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + DLStr);
			t = B1.getTime()-A1.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		junit.textui.TestRunner.run(suite());//字符界面
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_1"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_2"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_3"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_4"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_5"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_6"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_7"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_8"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_9"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_10"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_11"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_12"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_13"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_14"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test1_15"));
//		
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_1"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_2"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_3"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_4"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_5"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_6"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_7"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_8"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_9"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test2_10"));
//		
		suite.addTest(new AttendanceLogicFlexibleTest2("Test3_1"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test3_2"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test3_3"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test3_4"));
		
		suite.addTest(new AttendanceLogicFlexibleTest2("Test4_1"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test4_2"));
		suite.addTest(new AttendanceLogicFlexibleTest2("Test4_3"));
	
		return suite;
	}
	
	@Test
	public void test1_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()+t-A2.getTime())+A2.getTime()));
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()+t-A2.getTime())+A2.getTime()));
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_5() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第一类用例中，前五个用例此字段相同，不需修改
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}

	@Test
	public void test1_6() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));//在第一类用例中，第六、七个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));//在第一类用例中，第六、七个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_n.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_7() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));//在第一类用例中，第六、七个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));//在第一类用例中，第六、七个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_n.getTime())+t2_n.getTime()));
		
		e2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		f2 = null;//在第一类用例中，前七个用例此字段相同，不需修改
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_8() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第八、九、十个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(t2_1.getTime()+t-A2.getTime())+A2.getTime()));//在第一类用例中，第八、九、十个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_n.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = new Date((long)(Math.random()*(t2_1.getTime()+t-t2_n.getTime())+t2_n.getTime()));
		f2 = new Date((long)(Math.random()*(t2_1.getTime()+t-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_9() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第八、九、十个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(t2_1.getTime()+t-A2.getTime())+A2.getTime()));//在第一类用例中，第八、九、十个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()+t-t2_n.getTime())+t2_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(t2_1.getTime()+t-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(t2_1.getTime()+t-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_10() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第八、九、十个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(t2_1.getTime()+t-A2.getTime())+A2.getTime()));//在第一类用例中，第八、九、十个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()+t-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_11() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第十一、十二个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(A2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第一类用例中，第十一、十二个用例此字段相同
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_12() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第十一、十二个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(A2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第一类用例中，第十一、十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_13() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = null;//在第一类用例中，第十三、十四、十五个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = null;//在第一类用例中，第十三、十四、十五个用例此字段相同
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_14() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = null;//在第一类用例中，第十三、十四、十五个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = null;//在第一类用例中，第十三、十四、十五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = f1;
		f2 = B2;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test1_15() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同，不需修改
		t1_n = null;//在第一类用例中，第十三、十四、十五个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(A2.getTime()-D1.getTime())+D1.getTime()));//在第一类用例中，此字段相同，不需修改
		t2_n = null;//在第一类用例中，第十三、十四、十五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = B2;
		
		e2 = A1;
		f2 = e1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));//在第二类用例中，前两个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));//在第二类用例中，前两个用例此字段相同，不需修改
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = f1;
		f2 = new Date((long)(Math.random()*(t2_1.getTime()-f1.getTime())+f1.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-t1_1.getTime()-t)+t+t1_1.getTime()));//在第二类用例中，前两个用例此字段相同，不需修改
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-t2_1.getTime()-t)+t+t2_1.getTime()));//在第二类用例中，前两个用例此字段相同，不需修改
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime())+t2_1.getTime()));
		
		e2 = A1;
		f2 = e1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第三、第四个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(t2_1.getTime()+t-B2.getTime())+B2.getTime()));//在第二类用例中，第三、第四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime())+t2_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B2.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B2.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第三、第四个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(t2_1.getTime()+t-B2.getTime())+B2.getTime()));//在第二类用例中，第三、第四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-B1.getTime())+B1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_5() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第五、第六、第七个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第二类用例中，第五、第六、第七个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_n.getTime()-t2_1.getTime())+t2_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B2.getTime()-t2_n.getTime())+t2_n.getTime()));
		f2 = new Date((long)(Math.random()*(B2.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_6() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第五、第六、第七个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第二类用例中，第五、第六、第七个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_n.getTime())+t2_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_7() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第五、第六、第七个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第二类用例中，第五、第六、第七个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = new Date((long)(Math.random()*(B2.getTime()-t2_n.getTime())+t2_n.getTime()));
		f2 = new Date((long)(Math.random()*(B2.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_8() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = null;//在第二类用例中，第八、第九、第十个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = null;//在第二类用例中，第八、第九、第十个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t2_1.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = A1;
		f2 = e1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_9() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = null;//在第二类用例中，第八、第九、第十个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = null;//在第二类用例中，第八、第九、第十个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-B1.getTime())+B1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-t2_1.getTime())+t2_1.getTime()));
		
		e2 = f1;
		f2 = B2;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test2_10() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同，不需修改
		t1_n = null;//在第二类用例中，第八、第九、第十个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(DL2.getTime()-A2.getTime())+A2.getTime()));//在第二类用例中，此字段相同，不需修改
		t2_n = null;//在第二类用例中，第八、第九、第十个用例此字段相同
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test3_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同，不需修改
		t1_n = null;//在第三类用例中，前两个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第三类用例中，此字段相同，不需修改
		t2_n = null;//在第三类用例中，前两个用例此字段相同
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test3_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同，不需修改
		t1_n = null;//在第三类用例中，前两个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第三类用例中，此字段相同，不需修改
		t2_n = null;//在第三类用例中，前两个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B2.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test3_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，第三、第四个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第三类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第三类用例中，第三、第四个用例此字段相同
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test3_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(C2.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同，不需修改
		t1_n = new Date((long)(Math.random()*(C2.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，第三、第四个用例此字段相同
		
		t2_1 = new Date((long)(Math.random()*(D2.getTime()-B2.getTime())+B2.getTime()));//在第三类用例中，此字段相同，不需修改
		t2_n = new Date((long)(Math.random()*(D2.getTime()-t2_1.getTime())+t2_1.getTime()));//在第三类用例中，第三、第四个用例此字段相同
		
		e1 = A1;
		f1 = new Date((long)(Math.random()*(B2.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = f1;
		f2 = B2;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test4_1() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		t2_1 = null;//在第四类用例中，此字段相同
		t2_n = null;//在第四类用例中，此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = B2;
		
		e2 = A1;
		f2 = e1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test4_2() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		t2_1 = null;//在第四类用例中，此字段相同
		t2_n = null;//在第四类用例中，此字段相同
		
		e1 = A1;
		f1 = new Date((long)(Math.random()*(B2.getTime()-A2.getTime())+A2.getTime()));
		
		e2 = f1;
		f2 = B2;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	@Test
	public void test4_3() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		t2_1 = null;//在第四类用例中，此字段相同
		t2_n = null;//在第四类用例中，此字段相同
		
		e1 = A1;
		f1 = B2;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
		
		
	}
	
	//测试方式1执行模板
	@Override
	public void Testx_x_1() throws Exception {
		
		
		//更新流程请假时间（跨天）
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		
		//插入第一天打卡记录
				attendancesCreate(1);
		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 

		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_1_1();
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 

		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_1_1();
		
		//插入第二天打卡记录
		attendancesCreate(2);
		

		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDay(userId,employeeId,nextday,1); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_1_2();
		
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_1_2();
		
		if(e2 != null && f2 != null){
			//更新第二个流程请假时间
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			

			
			//校验第一天,工时、迟到时间、早退时间、请假时间
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			//System.out.println(JsonUtil.toString(employeeDay));
			//校验第二天,工时、请假时间
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			//System.out.println(JsonUtil.toString(employeeNextDay));
			AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_1_3();
		
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
			//System.out.println(JsonUtil.toString(employeeDay));
			//校验第二天,工时、请假时间
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
			//System.out.println(JsonUtil.toString(employeeNextDay));
			AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_1_3();
		
		}
		
	}
	
	//测试方式2执行模板
	@Override
	public void Testx_x_2() throws Exception {
		//插入第一天打卡记录
		attendancesCreate(1);
		

		
		//更新流程请假时间（跨天）
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		
		//处理流程

		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
		//System.out.println(JsonUtil.toString(employeeDay));
		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_2_1();
		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
		//System.out.println(JsonUtil.toString(employeeDay));
		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_2_1();
		
		
		//插入第二天打卡记录
		attendancesCreate(2);
		

		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDay(userId,employeeId,nextday,1); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_2_2();
		
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
		//System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_2_2();
		
		if(e2 != null && f2 != null){
			//更新第二个流程请假时间
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			
	
			//校验第一天,工时、迟到时间、早退时间、请假时间
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
			//System.out.println(JsonUtil.toString(employeeDay));
			//校验第二天,工时、请假时间
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			//System.out.println(JsonUtil.toString(employeeNextDay));
			AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_2_3();
	
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
			//System.out.println(JsonUtil.toString(employeeDay));
			//校验第二天,工时、请假时间
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
			//System.out.println(JsonUtil.toString(employeeNextDay));
			AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_2_3();
		}
		
		
	}
	
	//测试方式3执行模板
	@Override
	public void Testx_x_3() throws Exception {
		//插入第一天打卡记录
		attendancesCreate(1);

		
		//插入第二天打卡记录
		attendancesCreate(2);
		

		
		//更新流程请假时间（跨天）
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		

		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
		//System.out.println(JsonUtil.toString(employeeDay));
		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
	//	System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_3_1();
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
		//System.out.println(JsonUtil.toString(employeeDay));
		//校验第二天,工时、请假时间
		employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
	//	System.out.println(JsonUtil.toString(employeeNextDay));
		AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_3_1();
		
		if(e2 != null && f2 != null){
			//更新第二个流程请假时间
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			
			
			
			//校验第一天,工时、迟到时间、早退时间、请假时间
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
		//	System.out.println(JsonUtil.toString(employeeDay));
			//校验第二天,工时、请假时间
			employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,1); 
			AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_3_2();
		
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
			//	System.out.println(JsonUtil.toString(employeeDay));
				//校验第二天,工时、请假时间
				employeeNextDay = dao.getEmployeeDayall(userId,employeeId,nextday,2); 
				AttendanceLogicFlexibleTest2AssertBase.getInstance( A1, B1, A2, B2, t1_1, t1_n, t2_1, t2_n, e1, f1, e2, f2,employeeDay,employeeNextDay,caseNo).Testx_x_3_2();
		}
		
	}
	
	public void Testx_x_4() throws Exception {
		
	}
	public void Testx_x_5() throws Exception {
		
	}
	public void Testx_x_6() throws Exception {
		
	}
}
