package com.uniubi.common.outwork.weekend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.uniubi.test.Dao;
import com.uniubi.test.EmployeeDay;

import junit.framework.TestCase;



public class OutworkBaseTestCase extends TestCase {
	
	 static final String DATE_FORMAT_SIMPLE = "yyyy-MM-dd";
	 static final String DATE_FORMAT_COMPLICATED = "yyyy-MM-dd HH:mm:ss";
	 static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_SIMPLE);
	 static SimpleDateFormat COMPLICATED_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_COMPLICATED);
	 
	 static final String yesterdayStr="2017-06-09";
	 static final String dayStr="2017-06-10";
	 static final String nextdayStr="2017-06-11";
	 
	 
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
	 static int procedureid4=29;//出差  type=6
	 
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
	 
	 static Date o1_1;
	 static Date o1_2;
	 static Date o1_3;
	 static Date o1_4;
	 
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
	 static EmployeeDay employeeDay1;//总表
	 static EmployeeDay employeeDay2;//第一段考勤记录报
	 static EmployeeDay employeeDay3;//第二段考勤记录
	 static EmployeeDay employeeDay4;//第三段考勤记录
	 
	 static EmployeeDay employeeNextDay;
	 
	
	public OutworkBaseTestCase(String name){
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
		t2_3 = setDateSecondAsZero(t2_3);
		t2_4 = setDateSecondAsZero(t2_4);

		
		if(t1_1 != null) System.out.println("t1_1="+COMPLICATED_DATE_FORMAT.format(t1_1));
		if(t1_2 != null) System.out.println("t1_2="+COMPLICATED_DATE_FORMAT.format(t1_2));
		if(t1_3 != null) System.out.println("t1_3="+COMPLICATED_DATE_FORMAT.format(t1_3));
		if(t1_4 != null) System.out.println("t1_4="+COMPLICATED_DATE_FORMAT.format(t1_4));
		if(t1_5 != null) System.out.println("t1_5="+COMPLICATED_DATE_FORMAT.format(t1_5));
		if(t1_6 != null) System.out.println("t1_6="+COMPLICATED_DATE_FORMAT.format(t1_6));
		if(t2_3 != null) System.out.println("t2_3="+COMPLICATED_DATE_FORMAT.format(t2_3));
		if(t2_4 != null) System.out.println("t2_4="+COMPLICATED_DATE_FORMAT.format(t2_4));
		
	
		if(o1_1 != null) System.out.println("o1_1="+COMPLICATED_DATE_FORMAT.format(o1_1));
		if(o1_2 != null) System.out.println("o1_2="+COMPLICATED_DATE_FORMAT.format(o1_2));
		if(o1_3 != null) System.out.println("o1_3="+COMPLICATED_DATE_FORMAT.format(o1_3));
		
		
		if(o1_4 != null) System.out.println("o1_4="+COMPLICATED_DATE_FORMAT.format(o1_4));

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
	//No 表示请假几次  Test_execute2 表示打卡2次
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
	//No 表示请假几次  Test_execute2 表示打卡2次
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
	//No 表示请假几次  Test_execute2 表示打卡2次
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
	//No 表示请假几次  Test_execute2 表示打卡2次
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
	
	
	public Date outworkTime(String time,int No){
		
		try{
			if (No==1){
				o1_1=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return o1_1;		
			}
		if (No==2){
			o1_2=COMPLICATED_DATE_FORMAT.parse(dayStr+" "+time);
				return o1_2;			
			}	
		if (No==3){
			o1_3=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
				return o1_3;			
			}		
		if (No==4){
			o1_4=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
				return o1_4;			
			}	
		if (No==5){
			o1_2=COMPLICATED_DATE_FORMAT.parse(nextdayStr+" "+time);
				return o1_2;			
			}	
	
		
		}catch(Exception e){
			e.printStackTrace();			
			}
		return o1_1;
	}
		
		
		
	
	
	
	
	
	
	public void attendanceCreate2(int No){
		try{
			Thread.sleep(1500);
			}catch(Exception e){
				e.printStackTrace();
			
			}
		if(No==1){
			
				dao.AttendanceCreate3(userId, employeeId, t1_1, t1_2);
			
		}
		if(No==2){
			
				dao.AttendanceCreate3(userId, employeeId, t1_3, t1_4);
			
			
		}
		if(No==3){
			
			dao.AttendanceCreate3(userId, employeeId, t1_5, t1_6);
		}
		if(No==4){
			
				dao.AttendanceCreate3(userId, employeeId, t2_1, t2_2);
			
		}
		if(No==5){
			
				dao.AttendanceCreate3(userId, employeeId, t2_3, t2_4);
				
			
		}
		if(No==5){
		
				
				dao.AttendanceCreate3(userId, employeeId, t2_5, t2_6);
			
				
		}
	}
	
		public void outworkCreate(int No){
			try{
				Thread.sleep(1500);
				}catch(Exception e){
					e.printStackTrace();
				
				}
			if(No==1){
				if(o1_1!=null||o1_2!=null){
					dao.OutworkCreate(o1_1, o1_2, procedureid4,employeeId,6);
					}
			}
				if(No==2){
					if(o1_3!=null||o1_4!=null){
						dao.OutworkCreate(o1_3, o1_4, procedureid4,employeeId,6);
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
		

		
		
	}
	
	public void Testx_x_3(){
		

		
		
	}
	
	public void Testx_x_4(){
		

		
		
	}
	
	public void Testx_x_5(){
		

		
		
	}
	
	public void Testx_x_6(){
		

		
		
	}
	
	
	
	}
	
	 
	 
	
	