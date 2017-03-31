package com.uniubi.common.repair;

import java.util.Date;

import com.uniubi.test.EmployeeDay;



public class RepairBase{
	
	 static Date A1_1 = null;
	 static Date A1_2 = null;
	 static Date A1_3 = null;
	 static Date A1_4 = null;
	 
	 static Date B1_1 = null;
	 static Date B1_2 = null;
	 static Date B1_3 = null;
	 static Date B1_4 = null;
	 
	 
	 static Date t1_1=null;
	 static Date t1_2=null;
	 static Date t1_3=null;
	 static Date t1_4=null;
	 static Date t1_5=null;
	 static Date t1_6=null;
	 
	 static Date e1_1= null;
	 static Date e1_2= null;
	 static Date e1_3= null;
	 static Date f1_1= null;
	 static Date f1_2= null;
	 static Date f1_3= null;
	 
	 static Date r1_1=null;
	 static Date r1_2=null;
	 static Date r1_3=null;
	 static Date r1_4=null;
	 static Date r1_5=null;
	 static Date r1_6=null;
	 
	 
	static Date M1_1=null;
	static Date M1_2=null;
	static Date M1_3=null;
	 
	 
	 static EmployeeDay employeeday1=null;
	 static EmployeeDay employeeday2=null;
	 static EmployeeDay employeeday3=null;
	 static EmployeeDay employeeday4=null;
	 
	 static RepairBase instance;
	 
	 static int userId=52;
	 static int employeeId=100000004;
	 
	 
	


	public static RepairBase getInstance(Date A1_1,Date A1_2,Date A1_3,Date B1_1,Date B1_2,Date B1_3,Date t1_1,Date t1_2,Date t1_3,Date t1_4,Date t1_5,Date t1_6,
			Date e1_1,Date f1_1,Date e1_2,Date f1_2,Date e1_3,Date f1_3,Date r1_1,Date r1_2,Date r1_3,Date r1_4,Date r1_5,Date r1_6,EmployeeDay employeeday1,EmployeeDay employeeday2,EmployeeDay employeeday3,EmployeeDay employeeday4,String caseNo){
			try {
				Class<RepairBase> clazz = (Class<RepairBase>) Class.forName("com.uniubi.common.repair.CommonRepairtest"+caseNo);
				instance = clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
			instance.t1_1=t1_1;
			instance.t1_2=t1_2;
			instance.t1_3=t1_3;
			instance.t1_4=t1_4;
			instance.t1_5=t1_5;
			instance.t1_6=t1_6;
			instance.A1_1=A1_1;
			instance.A1_2=A1_2;
			instance.A1_3=A1_3;
			
			instance.e1_1= e1_1;
			instance.e1_2= e1_2;
			instance.e1_3= e1_3;
			instance.f1_1= f1_1;
			instance.f1_2= f1_2;
			instance.f1_3= f1_3;
			
			instance.r1_1=r1_1;
			instance.r1_2=r1_2;
			instance.r1_3=r1_3;
			instance.r1_4=r1_4;
			instance.r1_5=r1_5;
			instance.r1_6=r1_6;
			
			instance.M1_1=M1_1;
			instance.M1_2=M1_2;
			instance.M1_3=M1_3;
			
			
			
			instance.B1_1=B1_1;
			instance.B1_2=B1_2;
			instance.B1_3=B1_3;
			
			instance.employeeday1=employeeday1;
			instance.employeeday2=employeeday2;
			instance.employeeday3=employeeday3;
			instance.employeeday4=employeeday4;
			
			

			return instance;
		}
	
	
	public int convserToMinutes(long ms){
		return (int)ms/1000/60;
				
	}
	
	public void test1(){
		System.out.println("对比总表的数据");
	}
	public void test2(){
		System.out.println("对比分表1中的数据");		
	}
	public void test3(){
		System.out.println("对比分表2中的数据");		
	}
	public void test4(){
		System.out.println("对比分表3中的数据");		
	}
	
	public void test1_1(){
		System.out.println("对比只有请假数据无打卡的总表");
	}
	public void test2_1(){
		System.out.println("对比只有请假数据无打卡的分表1");		
	}
	public void test3_1(){
		System.out.println("对比只有请假数据无打卡的分表2");		
	}
	public void test4_1(){
		System.out.println("对比只有请假数据无打卡的分表3");		
	}
	
	
	
	
	public void test(int No){
		if(No==1){
			System.out.println("对比总表的数据");
			test1();
				} 
		if(No==2){
			System.out.println("对比分表1中的数据");	
			test2();}
		if(No==3){
			System.out.println("对比分表2中的数据");	
			test3();			
		}
		if(No==4){
			System.out.println("对比分表3中的数据");	
			test4();
		}
		
		
	}
	
	
	
	public void test_1(int No){
		if(No==1){
			System.out.println("对比总表的数据");
			test1_1();
				} 
		if(No==2){
			System.out.println("对比分表1中的数据");	
			
			test2_1();
		}
		if(No==3){
			System.out.println("对比分表2中的数据");	
			test3_1();			
		}
		if(No==4){
			System.out.println("对比分表3中的数据");	
			test4_1();
		}
		
		
	}
	
	
	
	
	
	
	
}