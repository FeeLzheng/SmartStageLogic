package com.uniubi.common.procedure.weekend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.uniubi.test.Dao;
import com.uniubi.test.EmployeeDay;

import junit.framework.TestCase;



public class ProcedureBaseTestCase extends TestCase {
	
	 static final String DATE_FORMAT_SIMPLE = "yyyy-MM-dd";
	 static final String DATE_FORMAT_COMPLICATED = "yyyy-MM-dd HH:mm:ss";
	 static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_SIMPLE);
	 static SimpleDateFormat COMPLICATED_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_COMPLICATED);
	 
	 static final String yesterdayStr="2017-03-01";
	 static final String dayStr="2017-03-04";
	 static final String nextdayStr="2017-03-05";
	 
	 
	 static final String A1Str="09:00:00";
	 static final String B1Str="11:00:00";

	 static final String M1Str="12:00:00";

	 static final String A2Str="13:00:00";
	 static final String B2Str="17:00:00";
	 static final String M2Str="18:30:00";
	 static final String A3Str="20:00:00";
	 static final String B3Str="2:00:00";
	 static final String M3Str="5:30:00";	 
	 
	 
	static Date day=null;
	static Date day1=null;
	static Date day2=null;
	static Date day3=null;
	static Date day4=null;
	static Date nextday=null;
	//第一天
	
	static Date A_2=null;
	static Date B_2=null;
	static Date A1_1=null;  //上午上班时间打卡
	static Date B1_1=null;  //上午下班时间打卡
	static Date A1_2=null;  //下午上班时间打卡
	static Date B1_2=null;  //下午下班时间打卡
	static Date A1_3=null;  //晚上上班时间打卡
	static Date B1_3=null;  //晚上下班时间打卡
	
	static Date M1_1=null;
	static Date M1_2=null;
	static Date M1_3=null;
	
	//第二天
	static Date A2_1=null;  //上午上班时间打卡
	static Date B2_1=null;  //上午下班时间打卡
	static Date A2_2=null;  //下午上班时间打卡
	static Date B2_2=null;  //下午下班时间打卡
	
	static Date C1_1 = null;
	 static Date D1_1 = null;
		static Date C1_2 = null;
		 static Date D1_2 = null;
	 static Date C2 = null;
	 static Date D2 = null;
	 
	 static int procedureId1;
	 static int procedureId2;
	 static int employeeId=100000004;
	 static int userId=52;
	 static String caseNo;
	 static int No;
	 static int ruleId1=325;//一段考勤规则
	 static int ruleId3=324;//二段考勤规则
	 static int ruleId2=323;//三段考勤规则
	 
	 static int procedureid1=22;//
	 static int procedureid2=23;
	 static int procedureid3=24;
	 
	 
	 //第一天4次打卡
	 static Date t1_1;
	 static Date t1_2;
	 static Date t1_3;
	 static Date t1_4;
	 static Date t1_5;
	 static Date t1_6;
	 //第一天请假
	 static Date e1_1;
	 static Date f1_1;
	 static Date e1_2;
	 static Date f1_2;
	 static Date e1_3;
	 static Date f1_3;
	 static Date e1;//第一天夸2班请假
	 static Date f1;
	 
	 
	 //第二天4次打卡
	 static Date t2_1;
	 static Date t2_2;
	 static Date t2_3;
	 static Date t2_4;
	 static Date t2_5;
	 static Date t2_6;
	 
	 //第二天请假
	 static Date e2_1;
	 static Date f2_1;
	 static Date e2_2;
	 static Date f2_2;
	 static Date e2;//第二天夸2班请假
	 static Date f2;
	 
	 Dao dao=new Dao();
	 static EmployeeDay employeeDay1_0;//总表
	 static EmployeeDay employeeDay2_0;//第一段考勤记录报
	 static EmployeeDay employeeDay3_0;//第二段考勤记录
	 static EmployeeDay employeeDay4_0;//第三段考勤记录
	 
	 static EmployeeDay employeeDay1;//总表
	 static EmployeeDay employeeDay2;//第一段考勤记录报
	 static EmployeeDay employeeDay3;//第二段考勤记录
	 static EmployeeDay employeeDay4;//第三段考勤记录
	 
	 //第二天
	 static EmployeeDay employeeDay1_2;//总表
	 static EmployeeDay employeeDay2_2;//第一段考勤记录报
	 static EmployeeDay employeeDay3_2;//第二段考勤记录
	 static EmployeeDay employeeDay4_2;//第三段考勤记录
	 
	 //第三天
	 static EmployeeDay employeeDay1_3;//总表
	 static EmployeeDay employeeDay2_3;//第一段考勤记录报
	 static EmployeeDay employeeDay3_3;//第二段考勤记录
	 static EmployeeDay employeeDay4_3;//第三段考勤记录
	 
	 //第四天
	 static EmployeeDay employeeDay1_4;//总表
	 static EmployeeDay employeeDay2_4;//第一段考勤记录报
	 static EmployeeDay employeeDay3_4;//第二段考勤记录
	 static EmployeeDay employeeDay4_4;//第三段考勤记录
	 
	 static EmployeeDay employeeNextDay;
	 
	
	public ProcedureBaseTestCase(String name){
			super(name);
			userId = 52;
			procedureId1 = 23;
			procedureId2 = 24;
			employeeId = 100000004;
		try{
			day=SIMPLE_DATE_FORMAT.parse(dayStr);
			nextday=SIMPLE_DATE_FORMAT.parse(nextdayStr);
			
			B_2=COMPLICATED_DATE_FORMAT.parse(yesterdayStr+" "+B2Str);
			A1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+A1Str);
			B1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+B1Str);
			A1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+A2Str);
			B1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+B2Str);
			A1_3=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+A3Str);
			B1_3=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+B3Str);
			
			M1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+M1Str);
			M1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+M2Str);
			M1_3=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+M3Str);
			
			A2_1=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+A1Str);
			B2_1=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+B1Str);
			A2_2=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+A2Str);
			B2_2=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+B2Str);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		 
	 }
	 
	 
	@SuppressWarnings("deprecation")
	Date setDateSecondAsZero(Date date ) {
		if(date !=null){
			date.setSeconds(0);
			try{
				return COMPLICATED_DATE_FORMAT.parse(COMPLICATED_DATE_FORMAT.format(date));
			}catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return date;
	}
		
	void setDateSecondZero() {
		t1_1 = setDateSecondAsZero(t1_1);
		t1_2 = setDateSecondAsZero(t1_2);
		t2_1 = setDateSecondAsZero(t2_1);
		t2_2 = setDateSecondAsZero(t2_2);
		t1_3 = setDateSecondAsZero(t1_3);
		t1_4 = setDateSecondAsZero(t1_4);
		t1_5 = setDateSecondAsZero(t1_5);
		t1_6 = setDateSecondAsZero(t1_6);
		t2_3 = setDateSecondAsZero(t2_3);
		t2_4 = setDateSecondAsZero(t2_4);
		e1_1=setDateSecondAsZero(e1_1);
		e1_2=setDateSecondAsZero(e1_2);	
		e2_1=setDateSecondAsZero(e2_1);
		e2_2=setDateSecondAsZero(e2_2);
		e1_3=setDateSecondAsZero(e1_3);
		f1_3=setDateSecondAsZero(f1_3);
		f1_1=setDateSecondAsZero(f1_1);
		f1_2=setDateSecondAsZero(f1_2);	
		f2_1=setDateSecondAsZero(f2_1);
		f2_2=setDateSecondAsZero(f2_2);
		e1 = setDateSecondAsZero(e1);
		f1 = setDateSecondAsZero(f1);
		e2 = setDateSecondAsZero(e2);
		f2 = setDateSecondAsZero(f2);
		
		if(t1_1 != null) System.out.println("t1_1="+COMPLICATED_DATE_FORMAT.format(t1_1));
		if(t1_2 != null) System.out.println("t1_2="+COMPLICATED_DATE_FORMAT.format(t1_2));
		if(t1_3 != null) System.out.println("t1_3="+COMPLICATED_DATE_FORMAT.format(t1_3));
		if(t1_4 != null) System.out.println("t1_4="+COMPLICATED_DATE_FORMAT.format(t1_4));
		if(t1_5 != null) System.out.println("t1_5="+COMPLICATED_DATE_FORMAT.format(t1_5));
		if(t1_6 != null) System.out.println("t1_6="+COMPLICATED_DATE_FORMAT.format(t1_6));
		if(t2_1 != null) System.out.println("t2_1="+COMPLICATED_DATE_FORMAT.format(t2_1));
		if(t2_2 != null) System.out.println("t2_2="+COMPLICATED_DATE_FORMAT.format(t2_2));
		if(t2_3 != null) System.out.println("t2_3="+COMPLICATED_DATE_FORMAT.format(t2_3));
		if(t2_4 != null) System.out.println("t2_4="+COMPLICATED_DATE_FORMAT.format(t2_4));
		
	
		if(e1_1 != null) System.out.println("e1_1="+COMPLICATED_DATE_FORMAT.format(e1_1));
		if(e1_2 != null) System.out.println("e1_2="+COMPLICATED_DATE_FORMAT.format(e1_2));
		if(e1_3 != null) System.out.println("e1_3="+COMPLICATED_DATE_FORMAT.format(e1_3));
		
		
		if(f1_1 != null) System.out.println("f1_1="+COMPLICATED_DATE_FORMAT.format(f1_1));
		if(f1_2 != null) System.out.println("f1_2="+COMPLICATED_DATE_FORMAT.format(f1_2));
		if(f1_3 != null) System.out.println("f1_3="+COMPLICATED_DATE_FORMAT.format(f1_3));
		if(f1 != null) System.out.println("f1="+COMPLICATED_DATE_FORMAT.format(f1));
		if(e2 != null) System.out.println("e2="+COMPLICATED_DATE_FORMAT.format(e2));
		if(f2 != null) System.out.println("f2="+COMPLICATED_DATE_FORMAT.format(f2));
		
	}
	@Before
	public void setUp() throws Exception{
		dao.deleteAttendanceOneDay(dayStr,employeeId,userId);
		dao.deleteEmployeDayoneDay(employeeId, userId, dayStr);
		dao.deleteAttendanceOneDay(nextdayStr,employeeId,userId);
		dao.deleteEmployeDayoneDay(employeeId, userId, nextdayStr);
		
			} 
	@After
	public void tearDown() throws Exception{
		
		
	}
	
	@Test
	//No 表示请假几次  Test_execute1 表示打卡1次
	public void Test_execute1() throws Exception{
		setDateSecondZero();
		//Thread.sleep(1000);
		
		try{
			dao.UpdateRule(ruleId1, employeeId);
		
				Testx_x_1();
	
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}
		
		
		
	
		}
	
	@Test
	//No 表示请假几次  Test_execute2 表示打卡2次
	public void Test_execute2() throws Exception{
		setDateSecondZero();
		//Thread.sleep(1000);
		
		try{
			dao.UpdateRule(ruleId2, employeeId);
			Testx_x_2();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}
		
		
		
	
		}
	@Test
	//No 表示请假几次  Test_execute3 表示打卡3次
	public void Test_execute3() throws Exception{
		setDateSecondZero();
		//Thread.sleep(1000);
		
		try{
			dao.UpdateRule(ruleId3, employeeId);
			Testx_x_3();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}
		
		
		
	
		}
	
	@Test
	//No 表示请假几次  Test_execute4 表示打卡1次
	public void Test_execute4() throws Exception{
		setDateSecondZero();
		//Thread.sleep(1000);
		
		try{
			dao.UpdateRule(ruleId1, employeeId);
		
				Testx_x_4();
	
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}
		
		
		
	
		}
	
	@Test
	//No 表示请假几次  Test_execute5 表示打卡2次
	public void Test_execute5() throws Exception{
		setDateSecondZero();
		//Thread.sleep(1000);
		
		try{
			dao.UpdateRule(ruleId2, employeeId);
			Testx_x_5();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}
		
		
		
	
		}
	@Test
	//No 表示请假几次  Test_execute6 表示打卡3次
	public void Test_execute6() throws Exception{
		setDateSecondZero();
		//Thread.sleep(1000);
		
		try{
			dao.UpdateRule(ruleId3, employeeId);
			Testx_x_6();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
			
		}
		
		@Test
		//No 表示请假几次  Test_execute6 表示打卡3次
		public void Test_execute7() throws Exception{
			setDateSecondZero();
			//Thread.sleep(1000);
			
			try{
				dao.UpdateRule(ruleId3, employeeId);
				Testx_x_7();
				
				
			}catch(Exception e){
				e.printStackTrace();
				
				
				
			}
		
		
	
		}
		
	public Date Attendancetime(String time,int No){
		Date t1_1=null;
		try{
			if (No==1){
				t1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return t1_1;		
		}
		if (No==2){
			t1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return t1_2;			
			}	
		if (No==3){
			t1_3=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return t1_3;			
			}		
		if (No==4){
			t1_4=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return t1_4;			
			}	
		if (No==5){
			t1_5=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return t1_5;			
			}	
		if (No==6){
			t1_6=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
				return t1_6;			
			}
		if (No==7){
			t1_1=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
				return t1_1;			
			}
		}catch(Exception e){
			e.printStackTrace();			
			}
		return t1_1;
	}
	
	
	public Date procedureTime(String time,int No){
		
		try{
			if (No==1){
				e1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return e1_1;		
			}
		if (No==2){
			f1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return f1_1;			
			}	
		if (No==3){
			e1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return e1_2;			
			}		
		if (No==4){
			f1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return f1_2;			
			}	
		if (No==5){
			e1_3=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return e1_3;			
			}	
		if (No==6){
			f1_3=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
				return f1_3;			
			}
		if(No==7){
			f1_1=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
			return f1_1;		
			
		}
		if(No==8){
			f1_3=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
			return f1_3;		
			
		}
		if(No==9){
			f1_2=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
			return f1_2;		
			
		}
		if(No==10){
			e1_2=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
			return e1_2;		
			
		}
		if(No==11){
			e1_3=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
			return e1_3;		
			
		}
		}catch(Exception e){
			e.printStackTrace();			
			}
		return f1_1;
	}
		
		
		
	
	
	
	
	
	
	public void attendanceCreate(int No){
		try{
			Thread.sleep(1500);
			}catch(Exception e){
				e.printStackTrace();
			
			}
		if(No==1){
			if(t1_1 != null || t1_2 != null){
				dao.AttendanceCreate(userId, employeeId, t1_1, t1_2);
			}
		}
		if(No==2){
			if(t1_3 != null || t1_4 != null){
				dao.AttendanceCreate(userId, employeeId, t1_3, t1_4);
			}
			
		}
		if(No==3){
			
			dao.AttendanceCreate(userId, employeeId, t1_5, t1_6);
		}
		if(No==4){
			if(t2_1!=null || t2_2!=null){
				dao.AttendanceCreate(userId, employeeId, t2_1, t2_2);
			}
		}
		if(No==5){
			if(t2_3!=null || t2_4!=null){
				dao.AttendanceCreate(userId, employeeId, t2_3, t2_4);
				
			}
		}
		if(No==5){
			if(t2_5!=null || t2_6 !=null ){
				
				dao.AttendanceCreate(userId, employeeId, t2_5, t2_6);
			}
				
		}
	}
	
		public void procedureCreate(int No){
			try{
				Thread.sleep(1500);
				}catch(Exception e){
					e.printStackTrace();
				
				}
			if(No==1){
				if(e1_1!=null||f1_1!=null){
					dao.ProcedureCreate(e1_1, f1_1, procedureid1);
					}
			}
				if(No==2){
					if(e1_2!=null||f1_2!=null){
						dao.ProcedureCreate(e1_2, f1_2, procedureid2);
						}
				}
				if(No==3){
					if(e1_3!=null||f1_3!=null){
						dao.ProcedureCreate(e1_3, f1_3, procedureid3);
						}
				
			}
			
			
			
		}
	
			
		
		
	public  String buildCaseNoFromMethodName(String methodName){
		System.out.println(methodName);
		String[] methodNameArr = methodName.replace("test", "").split("_");
		return methodNameArr[0]+methodNameArr[1];
		
	}
	
	
	public void Testx_x_1(){
		

		
		
		
	}
	public void Testx_x_2(){
		

		
		
		
	}	public void Testx_x_3(){
		

		
		
		
	}	public void Testx_x_4(){
		

		
		
		
	}	public void Testx_x_5(){
		

		
		
		
	}
	public void Testx_x_6(){
		

		
		
		
	}
	public void Testx_x_7(){
		

		
		
		
	}
	
	
	}
	
	 
	 
	
	