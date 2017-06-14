package com.uniubi.test.old;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;

import com.uniubi.common.oldlogic.weekend.AttendanceLogicCommonROTest1AssertBaseWeekend;


/**
 * 流程（请假、补签、出差）同天-常规考勤规则-考勤逻辑测试
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
 * 2016-05-27
 */
public class AttendanceLogicCommonROTestWeekend1 extends OldBaseTestCaseWeekend{

	private static byte type1;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static byte type2;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static Date r1_1;//第一天已发起的第一个补签流程补签时间
	private static Date r1_2;//第一天已发起的第二个补签流程补签时间
	private static Date r2_1;//第一天补充发起的第一个补签流程补签时间
	private static Date r2_2;//第一天补充发起的第二个补签流程补签时间
	private static Date o1_1;//第一天已发起的出差流程开始时间
	private static Date o1_2;//第一天已发起的出差流程结束时间
	private static Date o2_1;//第一天补充发起的出差流程开始时间
	private static Date o2_2;//第一天补充发起的出差流程结束时间
	
	
	private static final byte SICK_LEAVE_TYPE = 1;
	private static final byte ISSUE_LEAVE_TYPE = 2;
	private static final byte MATERNITY_LEAVE_TYPE = 3;
	private static final byte ANNUAL_LEAVE_TYPE = 4;
	private static final byte OTHER_LEAVE_TYPE = 8;
	private static final byte REPAIR_TYPE = 5;
	private static final byte OUTWORK_TYPE = 6;
	private static final byte OTHER_TYPE = 7;
	
	//private static int leaveProcedureId1 =  1192;
//	private static int leaveProcedureId2 =  1189;
	private static int repairProcedureId1_1 = 25;//第一天已发起的第一个补签流程id
	private static int repairProcedureId1_2 = 26;//第一天已发起的第二个补签流程id
	private static int repairProcedureId1r_1 = 27;//第一天补充发起的第一个补签流程id
	private static int repairProcedureId1r_2 = 28;//第一天补充发起的第二个补签流程id
	private static int outworkProcedureId = 29;//第一天已发起的出差流程id
	
	public AttendanceLogicCommonROTestWeekend1(String name){
		super(name);
		try {
			START1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + STARTStr);
			END1 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + ENDStr);
			C1 = new Date((long)(Math.random()*(A1.getTime()-START1.getTime())+START1.getTime()));
			D1 = new Date((long)(Math.random()*(END1.getTime()-B1.getTime())+B1.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		junit.textui.TestRunner.run(suite());//字符界面
	}
	
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test1_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test1_2"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test1_3"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test1_4"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test1_5"));
////		
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_2"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_3"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_4"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_5"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_6"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_7"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_8"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test2_9"));
////		
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test3_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test3_2"));
		
		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test4_1"));
		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test4_2"));
		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test4_3"));
		suite.addTest(new AttendanceLogicCommonROTestWeekend1("Test4_4"));
		
		//5、6、7三类全是特殊情况，手动测试。
		
		return suite;
	}
	
	
	@Test
	public void test1_1() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		r1_1 = null;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;

		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test1_2() throws Exception {
		 
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，前三个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = r1_1;
		f2 = B1;
		r2_1 = null;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;

		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test1_3() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，前三个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
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
		
		Test_execute();
		
	}
	
	@Test
	public void test1_4() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第四、五个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = new Date((long)(Math.random()*(END1.getTime()-B1.getTime())+B1.getTime()));
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
		
		Test_execute();
		
	}
	
	@Test
	public void test1_5() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第一类用例中，第四、五个用例此字段相同
		
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_1() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第二类用例中，前三个用例此字段相同
		
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_2() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第二类用例中，前三个用例此字段相同
		
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_3() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第二类用例中，前三个用例此字段相同
		
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_4() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第四道第九个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_5() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第四道第九个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
		r1_2 = null;
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_6() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第四道第九个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = B1;
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_7() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第四道第九个用例此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
		r1_2 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		o1_1 = null;
		o1_2 = null;
		
		e2 = null;
		f2 = null;
		r2_1 = B1;
		r2_2 = null;
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_8() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第四道第九个用例此字段相同
		
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
		
		Test_execute();
		
	}
	
	@Test
	public void test2_9() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，第四道第九个用例此字段相同
		
		e1 = null;
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
		
		Test_execute();
		
	}
	
	@Test
	public void test3_1() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，此字段相同
		
		e1 = null;
		f1 = null;
		r1_1 = A1;
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
		
		Test_execute();
		
	}
	
	@Test
	public void test3_2() throws Exception {
		
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第三类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第三类用例中，此字段相同
		
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
		
		Test_execute();
		
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
		
		Test_execute();
		
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
		o2_1 = null;
		o2_2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
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
		
		Test_execute();
		
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
		
		Test_execute();
		
	}
	
	
	
	//测试方式1执行模板
	@Override
	public void Testx_x_1() throws Exception {
		//插入打卡记录
		
		
		//更新请假流程
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_1,repairProcedureId1_1,employeeId);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_2,repairProcedureId1_2,employeeId);
		//更新第一天已发起的出差流程
		dao.OutworkCreate(o1_1,o1_2,outworkProcedureId,employeeId,6);
		
		attendancesCreate2(1);
		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//		System.out.println(JsonUtil.toString(employeeDay));
		
		AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(1);
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		
		AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(1);
		
		if((e2 != null && f2 != null) || (r2_1 != null) || (o2_1 != null && o2_2 != null)){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			//更新第一天补充发起的补签流程1
			dao.RepairCreate(r2_1,repairProcedureId1r_1,employeeId);
			//更新第一天补充发起的补签流程2
			dao.RepairCreate(r2_2,repairProcedureId1r_1,employeeId);
			//更新第一天补充发起的出差流程
			dao.OutworkCreate(o2_1,o2_2,outworkProcedureId,employeeId,6);
			
			
	
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(2);
		
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(2);
		}
		
	}
	
	//测试方式2执行模板
	@Override
	public void Testx_x_2() throws Exception {
		//插入打卡记录
		attendancesCreate2(1);
		
	
		
		//更新请假流程
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_1,repairProcedureId1_1,employeeId);
		//更新第一天已发起的补签流程1
		dao.RepairCreate(r1_2,repairProcedureId1_2,employeeId);
		//更新第一天已发起的出差流程
		dao.OutworkCreate(o1_1,o1_2,outworkProcedureId,employeeId,6);
		

		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(1);
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(1);
		
		
		if((e2 != null && f2 != null) || (r2_1 != null) || (o2_1 != null && o2_2 != null)){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			//更新第一天补充发起的补签流程1
			dao.RepairCreate(r2_1,repairProcedureId1r_1,employeeId);
			//更新第一天补充发起的补签流程2
			dao.RepairCreate(r2_2,repairProcedureId1r_1,employeeId);
			//更新第一天补充发起的出差流程
			dao.OutworkCreate(o2_1,o2_2,outworkProcedureId,employeeId,6);
			
			

			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(2);
		
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonROTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,r1_1,r1_2,r2_1,r2_2,employeeDay,caseNo).Testx_x(2);
		
		
		}
	}
	
	@Override
	public void Testx_x_3() throws Exception {
		
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
