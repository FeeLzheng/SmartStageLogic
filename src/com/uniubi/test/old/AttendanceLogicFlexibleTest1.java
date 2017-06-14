package com.uniubi.test.old;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestSuite;

import org.junit.After;
import org.junit.Test;

import com.uniubi.flexible.oldlogic.AttendanceLogicFlexibleTest1AssertBase;



/**
 * 请假不跨天-弹性考勤规则-考勤逻辑测试
 * 方法名最后一个下划线后的编号代表测试方式：
 * 	1========
 * 		插入第一天打卡记录；
 * 		更新流程请假时间；
 * 		执行流程处理exe；
 * 		执行第一天考勤生成exe；
 * 		查看考勤结果；
 * 		补充流程测试。
 *  2========
 *  	插入第一天打卡记录；
 *  	执行第一天考勤生成exe；
 *  	更新流程请假时间；
 *  	执行流程处理exe；
 *  	查看考勤结果；
 *  	补充流程测试。
 * 
 * 	ps.涉及补充流程的用例，都已经在后面加上了补充流程的测试。(若处理的是未来的数据，还需要再执行生成考勤记录，若处理过去的数据，则不需要再执行)
 * @author 潘雷
 * 2016-05-31
 */
public class AttendanceLogicFlexibleTest1 extends OldBaseTestCase{

	private static byte type1=1;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static byte type2=2;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static long t;
	private static Date DL1;
	private static String DLStr = "18:00:00";
	
	public AttendanceLogicFlexibleTest1(String name){
		super(name);
		try {
			START1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + STARTStr);
			END1 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + ENDStr);
			DL1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + DLStr); 
			//C1 = new Date((long)(Math.random()*(A1.getTime()-START1.getTime())+START1.getTime()));			
			//D1 = new Date((long)(Math.random()*(END1.getTime()-B1.getTime())+B1.getTime()));
			//弹性规则中一天的开始时间和结束时间不可变
			C1=new Date((long)START1.getTime());
			D1=new Date((long)END1.getTime());
			t = B1.getTime()-A1.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] args){
//		junit.textui.TestRunner.run(suite());//字符界面
//	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_5"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_8"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_11"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_12"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_13"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_14"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_15"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_16"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_17"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_18"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test1_19"));
//////		
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_10"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_11"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_12"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_13"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_14"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test2_15"));
//////		
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test3_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test3_4"));
////////
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test4_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("Test4_4"));
		
		return suite;
	}
	
	@Test
	public void test1_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前两个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()+t-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，前五个用例此字段相同
		f2 = null;//在第一类用例中，前五个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，前两个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		
		e2 = null;//在第一类用例中，前五个用例此字段相同
		f2 = null;//在第一类用例中，前五个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}

	@Test
	public void test1_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前四个用例此字段相同
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;//在第一类用例中，前五个用例此字段相同
		f2 = null;//在第一类用例中，前五个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第一类用例中，前四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，前五个用例此字段相同
		f2 = null;//在第一类用例中，前五个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_5() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，第五、六、七个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		
		e2 = null;//在第一类用例中，前五个用例此字段相同
		f2 = null;//在第一类用例中，前五个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_6() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第六到第十一个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，第五、六、七个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_n.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()+t-e2.getTime())+e2.getTime()));//在第一类用例中，第六、第七个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_7() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第六到第十一个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，第五、六、七个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()+t-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()+t-e2.getTime())+e2.getTime()));//在第一类用例中，第六、第七个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_8() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第六到第十一个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_9() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第六到第十一个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));//在第一类用例中，第九、第十个用例此字段
		f1 = new Date((long)(Math.random()*(t1_1.getTime()+t-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_10() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第六到第十一个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-t1_n.getTime())+t1_n.getTime()));//在第一类用例中，第九、第十个用例此字段
		f1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_n.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_11() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第六到第十一个用例此字段
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_12() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第十二到第十五个用例此字段
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}

	@Test
	public void test1_13() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第十二到第十五个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第十三、十四个用例此字段
		f1 = new Date((long)(Math.random()*(t1_1.getTime()+t-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_14() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第十二到第十五个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第十三、十四个用例此字段
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_15() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第十二到第十五个用例此字段
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_16() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = null;//在第一类用例中，第十六到第十九个用例此字段
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_17() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = null;//在第一类用例中，第十六到第十九个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第十七到第十八个用例此字段
		f1 = new Date((long)(Math.random()*(t1_1.getTime()+t-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_18() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = null;//在第一类用例中，第十六到第十九个用例此字段
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()+t-A1.getTime())+A1.getTime()));//在第一类用例中，第十七到第十八个用例此字段
		f1 = new Date((long)(Math.random()*(B1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test1_19() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = null;//在第一类用例中，第十六到第十九个用例此字段
		
		e1 = new Date(t1_1.getTime()+t);
		f1 = B1;
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前六个用例此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));//在第二类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前两个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前六个用例此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));//在第二类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前两个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前六个用例此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t-t1_1.getTime())+t+t1_1.getTime()));//在第二类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前六个用例此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第四、五、六个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第四、五个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_5() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前六个用例此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第四、五、六个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第四、五个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_6() throws Exception {
		t1_1 = new Date((long)(Math.random()*(DL1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前六个用例此字段相同
		t1_n = new Date((long)(Math.random()*(t1_1.getTime()+t-B1.getTime())+B1.getTime()));//在第二类用例中，第四、五、六个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_7() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第七到十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七、八、九个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_8() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第七到十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七、八、九个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_9() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第七到十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七、八、九个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_10() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第七到十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第十、十一个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_n.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_11() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第七到十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第十、十一个用例此字段相同
		f1 = new Date((long)(Math.random()*(A1.getTime()+t-t1_n.getTime())+t1_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_12() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第七到十二个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_13() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = null;//在第二类用例中，第十三到十五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第十三、十四个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_14() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = null;//在第二类用例中，第十三到十五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第十三、十四个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test2_15() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第七到十五个用例此字段相同
		t1_n = null;//在第二类用例中，第十三到十五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test3_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = null;//在第三类用例中，前两个用例此字段相同
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test3_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = null;//在第三类用例中，前两个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test3_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，第三、第四个用例此字段相同
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test3_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，第三、第四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test4_1() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = B1;
		
		e2 = A1;
		f2 = e1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test4_2() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = A1;
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = f1;
		f2 = B1;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test4_3() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	@Test
	public void test4_4() throws Exception {
		t1_1 = null;//在第四类用例中，此字段相同
		t1_n = null;//在第四类用例中，此字段相同
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute1();
	}
	
	
	//测试方式1执行模板
	@Override
	public void Testx_x_1() throws Exception {
		//插入打卡记录
		
		
		//更新流程
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		
		attendancesCreate(1);
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		if(e2 != null && f2 != null){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
							
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
		}
		
	}
	
	//测试方式2执行模板
	@Override
	public void Testx_x_2() throws Exception {
		//插入打卡记录
		attendancesCreate(1);
		
	
		
		
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		

		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		if(e2 != null && f2 != null){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			

			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicFlexibleTest1AssertBase.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Override
	public void Testx_x_3() throws Exception {
		
	}
	public void Testx_x_4() throws Exception {
		
	}
	public void Testx_x_5() throws Exception {
		
	}
	public void Testx_x_6() throws Exception {
		
	}
	
}
