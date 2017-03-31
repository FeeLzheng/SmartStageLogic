package com.uniubi.test.old;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.uniubi.test.Dao;
import com.uniubi.test.EmployeeDay;

import junit.framework.TestCase;

public abstract class OldBaseTestCaseWeekend extends TestCase {

	 static final String DATE_FORMAT_SIMPLE = "yyyy-MM-dd";
	 static final String DATE_FORMAT_COMPLICATED = "yyyy-MM-dd HH:mm:ss";
	 static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_SIMPLE);
	 static SimpleDateFormat COMPLICATED_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_COMPLICATED);
	 static final String dayStr = "2017-03-04";//周六
	 static final String nextDayStr = "2017-03-05";//周六
	 static final String next2DayStr = "2017-03-06";//工作日
	 static final String AStr = "10:00:00";
	 static final String BStr = "20:00:00";
	 static final String STARTStr = "03:00:00";
	 static final String ENDStr = "02:59:00";
	 static final String DLStr = "17:59:00";//要上满工时，最晚打卡时间  deadline
	
	
	 static Date day = null;
	 static Date nextday = null;
	 static Date next2day = null;
	 static Date A1 = null;
	 static Date B1 = null;
	 static Date A2 = null;
	 static Date B2 = null;
	 static Date C1 = null;
	 static Date D1 = null;
	 static Date C2 = null;
	 static Date D2 = null;
	 static Date START1 = null;
	 static Date END1 = null;
	 static Date START2 = null;
	 static Date END2 = null;
	 static int procedureId1;
	 static int procedureId2;
	 static int employeeId;
	 static int userId = 52;
	 static String caseNo;
	
	//第一天第一次打卡
	 static Date t1_1;
	//第一天最后一次打卡
	 static Date t1_n;
	//第二天第一次打卡
	 static Date t2_1;
	//第二天最后一次打卡
	 static Date t2_n;
	//第一个请假开始时间
	 static Date e1;
	//第一个请假结束时间
	 static Date f1;
	//第二个请假开始时间
	 static Date e2;
	//第二个请假结束时间
	 static Date f2;
	
	 static Dao dao = new Dao();
		
	 static EmployeeDay employeeDay;
	 static EmployeeDay employeeNextDay;
	
	
	
	public OldBaseTestCaseWeekend(String name){
		super(name);
		userId = 52;
		procedureId1 = 23;
		procedureId2 = 24;
		employeeId = 100000004;
		try {
			day = SIMPLE_DATE_FORMAT.parse(dayStr);
			nextday = SIMPLE_DATE_FORMAT.parse(nextDayStr);
			next2day = SIMPLE_DATE_FORMAT.parse(next2DayStr);
			A1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + AStr);
			B1 = COMPLICATED_DATE_FORMAT.parse(dayStr + " " + BStr);
			A2 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + AStr);
			B2 = COMPLICATED_DATE_FORMAT.parse(nextDayStr + " " + BStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void Test_execute(){
		setDateSecondZero();
		
		try {
			dao.UpdateRule(338,100000004);
			Testx_x_1();
			setUp();
			Testx_x_2();
			setUp();
			Testx_x_3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void Test_execute1(){
		setDateSecondZero();
		
		try {
			dao.UpdateRule(339,100000004);
			Testx_x_1();
			setUp();
			Testx_x_2();
			setUp();
			Testx_x_3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void setDateSecondZero() {
		t1_1 = setDateSecondAsZero(t1_1);
		t1_n = setDateSecondAsZero(t1_n);
		t2_1 = setDateSecondAsZero(t2_1);
		t2_n = setDateSecondAsZero(t2_n);
		e1 = setDateSecondAsZero(e1);
		f1 = setDateSecondAsZero(f1);
		e2 = setDateSecondAsZero(e2);
		f2 = setDateSecondAsZero(f2);
		
		if(t1_1 != null) System.out.println("t1_1="+COMPLICATED_DATE_FORMAT.format(t1_1));
		if(t1_n != null) System.out.println("t1_2="+COMPLICATED_DATE_FORMAT.format(t1_n));
		if(t2_1 != null) System.out.println("t2_1="+COMPLICATED_DATE_FORMAT.format(t2_1));
		if(t2_n != null) System.out.println("t2_n="+COMPLICATED_DATE_FORMAT.format(t2_n));
		if(e1 != null) System.out.println("e1="+COMPLICATED_DATE_FORMAT.format(e1));
		if(f1 != null) System.out.println("f1="+COMPLICATED_DATE_FORMAT.format(f1));
		if(e2 != null) System.out.println("e2="+COMPLICATED_DATE_FORMAT.format(e2));
		if(f2 != null) System.out.println("f2="+COMPLICATED_DATE_FORMAT.format(f2));
		
	}

	@SuppressWarnings("deprecation")
	Date setDateSecondAsZero(Date date){
		if(date != null){
			date.setSeconds(0);
			try {
				return COMPLICATED_DATE_FORMAT.parse(COMPLICATED_DATE_FORMAT.format(date));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
	
	public abstract void Testx_x_1() throws Exception;
	public abstract void Testx_x_2() throws Exception;
	public abstract void Testx_x_3() throws Exception;
	
	//插入打卡记录
	void attendancesCreate(int dayNo)
		throws ParseException {
		if(dayNo == 1){
			
				dao.AttendanceCreate(userId,employeeId,t1_1,t1_n);
		}else if (dayNo == 2){
			
				dao.AttendanceCreate2(userId,employeeId,t2_1,t2_n);
		}
	}
	
	void attendancesCreate2(int dayNo)
			throws ParseException {
			if(dayNo == 1){
			
					dao.AttendanceCreate3(userId,employeeId,t1_1,t1_n);
			}else if (dayNo == 2){
				
					dao.AttendanceCreate4(userId,employeeId,t2_1,t2_n);
			}
		}
	
	//根据方法名，构建用例编号。下划线分割后第一个和第二个合并
	String buildCaseNoFromMethodName(String methodName) {
		System.out.println(methodName);
		String[] methodNameArr = methodName.replace("test", "").split("_");
		return methodNameArr[0]+methodNameArr[1];
	}
	
	@Before
	public void setUp() throws Exception {
		//删除原有的考勤记录和打卡记录,包括第一天和第二天
		dao.deleteAttendanceOneDay(dayStr,employeeId,userId);
		dao.deleteEmployeDayoneDay(employeeId,userId,dayStr);
		dao.deleteAttendanceOneDay(nextDayStr,employeeId,userId);
		dao.deleteEmployeDayoneDay(employeeId,userId,nextDayStr);
		dao.deleteAttendanceOneDay(next2DayStr,employeeId,userId);
	}

	@After
	public void tearDown() throws Exception {
	}
}
