package com.uniubi.test.old;

import java.text.ParseException;
import java.util.Date;

import junit.framework.TestSuite;

import org.junit.Test;

import com.uniubi.common.oldlogic.weekend.AttendanceLogicCommonTest1AssertBaseWeekend;

//import com.uniubi.test.biz.common.AttendanceLogicCommonTest1AssertBase;


/**
 * 请假不跨天-常规考勤规则-考勤逻辑测试---时间为周末
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
 * 2016-05-27
 */
public class AttendanceLogicCommonTestWeekend1 extends OldBaseTestCaseWeekend{

	
	private static byte type1=3;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	private static byte type2=8;//流程类别。1-病假;2-事假;3-产假;4-年假;8-特殊假;5-补签;6-出差;7-其他;
	public AttendanceLogicCommonTestWeekend1(String name){
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
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test1_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test1_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test1_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test1_4"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test1_5"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test1_6"));
		
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_1"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_2"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_3"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_4"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_5"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_6"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_7"));
		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test2_8"));
////	
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test3_1"));
////	
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test4_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test4_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test4_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("Test4_4"));
		
		return suite;
	}
	
	
	@Test
	public void test1_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，此字段相同
		f2 = null;//在第一类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test1_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，第二、第三、第四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，此字段相同
		f2 = null;//在第一类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test1_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，第二、第三、第四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		
		e2 = null;//在第一类用例中，此字段相同
		f2 = null;//在第一类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test1_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第一类用例中，第二、第三、第四个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(t1_n.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，此字段相同
		f2 = null;//在第一类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test1_5() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(A1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，此字段相同
		f2 = null;//在第一类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	
	public void test1_6() throws Exception {
		t1_1 = new Date((long)(Math.random()*(A1.getTime()-C1.getTime())+C1.getTime()));//在第一类用例中，此字段相同
		t1_n = null;
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//在第一类用例中，此字段相同
		f2 = null;//在第一类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第二类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前两个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前两个用例此字段相同
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));//在第二类用例中，前两个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_2() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第二类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前两个用例此字段相同
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(e1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，前两个用例此字段相同
		f2 = new Date((long)(Math.random()*(e1.getTime()-e2.getTime())+e2.getTime()));//在第二类用例中，前两个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_3() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));//在第二类用例中，前三个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_4() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，后五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第四、第五个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-f1.getTime())+f1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_5() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，后五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，第四、第五个用例此字段相同
		f1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_6() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，后五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(t1_n.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f2 = new Date((long)(Math.random()*(t1_1.getTime()-e2.getTime())+e2.getTime()));
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
		
	}
	
	@Test
	public void test2_7() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，后五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_n.getTime()-t1_1.getTime())+t1_1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));//在第二类用例中，第七、八个用例此字段相同
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));//在第二类用例中，第七、八个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	@Test
	public void test2_8() throws Exception {
		t1_1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));//在第二类用例中，此字段相同
		t1_n = new Date((long)(Math.random()*(B1.getTime()-t1_1.getTime())+t1_1.getTime()));//在第二类用例中，后五个用例此字段相同
		
		e1 = new Date((long)(Math.random()*(t1_1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-t1_n.getTime())+t1_n.getTime()));
		
		e2 = new Date((long)(Math.random()*(B1.getTime()-f1.getTime())+f1.getTime()));//在第二类用例中，第七、八个用例此字段相同
		f2 = new Date((long)(Math.random()*(B1.getTime()-e2.getTime())+e2.getTime()));//在第二类用例中，第七、八个用例此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	@Test
	public void test3_1() throws Exception {
		t1_1 = new Date((long)(Math.random()*(D1.getTime()-B1.getTime())+B1.getTime()));
		t1_n = new Date((long)(Math.random()*(D1.getTime()-t1_1.getTime())+t1_1.getTime()));
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;
		f2 = null;
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	@Test
	public void test4_1() throws Exception {
		t1_1 = null;//第四类用例中，此字段相同
		t1_n = null;//第四类用例中，此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//第四类用例中，此字段相同
		f2 = null;//第四类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	@Test
	public void test4_2() throws Exception {
		t1_1 = null;//第四类用例中，此字段相同
		t1_n = null;//第四类用例中，此字段相同
		
		e1 = A1;
		f1 = new Date((long)(Math.random()*(B1.getTime()-e1.getTime())+e1.getTime()));
		
		e2 = null;//第四类用例中，此字段相同
		f2 = null;//第四类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	@Test
	public void test4_3() throws Exception {
		t1_1 = null;//第四类用例中，此字段相同
		t1_n = null;//第四类用例中，此字段相同
		
		e1 = new Date((long)(Math.random()*(B1.getTime()-A1.getTime())+A1.getTime()));
		f1 = B1;
		
		e2 = null;//第四类用例中，此字段相同
		f2 = null;//第四类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	@Test
	public void test4_4() throws Exception {
		t1_1 = null;//第四类用例中，此字段相同
		t1_n = null;//第四类用例中，此字段相同
		
		e1 = A1;
		f1 = B1;
		
		e2 = null;//第四类用例中，此字段相同
		f2 = null;//第四类用例中，此字段相同
		
		caseNo = buildCaseNoFromMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
		
		Test_execute();
	}
	
	
	
	
	
	
	
	
	//测试方式1执行模板
	@Override
	public void Testx_x_1() throws Exception {
		//插入打卡记录
	
		
		//更新流程
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		
		attendancesCreate2(1);
		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		if(e2 != null && f2 != null){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			
	
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
		}
		
	}
	
	//测试方式3执行模板
	@Override
	public void Testx_x_2() throws Exception {
		//插入打卡记录
		attendancesCreate2(1);
		

		
		//更新流程
		dao.ProcedureCreate(e1,f1,procedureId1,employeeId,type1);
		

		
		//校验第一天,工时、迟到时间、早退时间、请假时间
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		
		
		employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//		System.out.println(JsonUtil.toString(employeeDay));
		AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(1);
		if(e2 != null && f2 != null){
			//更新第二个流程
			dao.ProcedureCreate(e2,f2,procedureId2,employeeId,type2);
			

			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,1); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
			
			employeeDay = dao.getEmployeeDay(userId,employeeId,day,2); 
//			System.out.println(JsonUtil.toString(employeeDay));
			AttendanceLogicCommonTest1AssertBaseWeekend.getInstance( A1, B1, t1_1, t1_n, e1, f1, e2, f2,employeeDay,caseNo).Testx_x(2);
		}
		
	}
	
	@Override
	public void Testx_x_3() throws Exception {
		
	}
	
}
