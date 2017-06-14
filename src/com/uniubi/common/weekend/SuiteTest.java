package com.uniubi.common.weekend;

import com.uniubi.test.ServiceJdbcDataSource;
import com.uniubi.test.ServiceJdbcDataSource_attendance;
import com.uniubi.test.ServiceJdbcDataSource_procedure;
import com.uniubi.util.AttendancelogicMQProducerUtil;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({
//        attendanceTest.class //test case 1
//       
//})

public class SuiteTest extends TestCase{

	public static void main(String[] args){
//		ServiceJdbcDataSource.getInstance();
//		ServiceJdbcDataSource_procedure.getInstance();
//		ServiceJdbcDataSource_attendance.getInstance();
		AttendancelogicMQProducerUtil.init();
		System.out.println("MQ PRODUCER started");
		
		
		TestRunner.run(Test());//字符界面
	}
	
	public static TestSuite Test(){
		
		TestSuite suite = new TestSuite();
//		suite.addTestSuite(attendanceTest.class);
//		suite.addTest(new JUnit4TestAdapter(attendanceTest.class));
//		suite.addTest(new attendanceTest("test1_1"));	
//		suite.addTest(new attendanceTest("test1_2"));	
//		suite.addTest(new attendanceTest("test1_3"));	
//		suite.addTest(new attendanceTest("test1_4"));	
//		suite.addTest(new attendanceTest("test1_5"));
//		suite.addTest(new attendanceTest("test1_6"));
//		suite.addTest(new attendanceTest("test1_7"));
//		suite.addTest(new attendanceTest("test1_8"));	
//		suite.addTest(new attendanceTest("test1_9"));	
//		suite.addTest(new attendanceTest("test1_10"));
//		suite.addTest(new attendanceTest("test1_11"));
//		suite.addTest(new attendanceTest("test1_12"));
//		suite.addTest(new attendanceTest("test1_13"));	
//		suite.addTest(new attendanceTest("test1_14"));	
//		suite.addTest(new attendanceTest("test1_15"));
//		suite.addTest(new attendanceTest("test1_16"));
//		suite.addTest(new attendanceTest("test1_17"));
		
		
		return suite;
		
		
				
	}
	

	
	
	}