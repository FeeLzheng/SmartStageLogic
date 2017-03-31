package com.uniubi.entity;

import com.uniubi.common.attendanceTest;
import com.uniubi.common.procedure.procedureTest;
import com.uniubi.util.AttendancelogicMQProducerUtil;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({
//        attendanceTest.class, //test case 1
//       
//})

public class SuiteTest extends TestCase{

	public static void main(String[] args){
		
		AttendancelogicMQProducerUtil.init();
		System.out.println("MQ PRODUCER started");
		
		
		
		TestRunner.run(Test());//字符界面
	}
	
	public static TestSuite Test(){
		
		TestSuite suite = new TestSuite();
//		suite.addTestSuite(attendanceTest.class);
		//suite.addTest(new attendanceTest("Test1_1"));	
		suite.addTest(new procedureTest("Test1_100"));
		return suite;
		
		
		
		
	}
	

	
	
	}