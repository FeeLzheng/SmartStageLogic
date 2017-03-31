package com.uniubi.test.old;



import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.uniubi.util.AttendancelogicMQProducerUtil;

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
//		suite.addTestSuite(AttendanceLogicFlexibleTest1.class);
//		suite.addTest(new AttendanceLogicCommonROTest1("test1_1"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test1_2"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test1_3"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test1_4"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test1_5"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_1"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_2"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_3"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_4"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_5"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_6"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_7"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_8"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test2_9"));
//    suite.addTest(new AttendanceLogicCommonROTest1("test3_1"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test3_2"));	
//	suite.addTest(new AttendanceLogicCommonROTest1("test4_1"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test4_2"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test4_3"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test4_4"));
//	suite.addTest(new AttendanceLogicCommonROTest1("test4_5"));
		
//		suite.addTest(new AttendanceLogicCommonTest1("test1_1"));
//		suite.addTest(new AttendanceLogicCommonTest1("test1_2"));
//		suite.addTest(new AttendanceLogicCommonTest1("test1_3"));
//		suite.addTest(new AttendanceLogicCommonTest1("test1_4"));
//		suite.addTest(new AttendanceLogicCommonTest1("test1_5"));	
//		suite.addTest(new AttendanceLogicCommonTest1("test2_1"));
//		suite.addTest(new AttendanceLogicCommonTest1("test2_2"));
//		suite.addTest(new AttendanceLogicCommonTest1("test2_3"));
//		suite.addTest(new AttendanceLogicCommonTest1("test2_4")); 
//		suite.addTest(new AttendanceLogicCommonTest1("test2_5"));
//		suite.addTest(new AttendanceLogicCommonTest1("test2_6"));
//		suite.addTest(new AttendanceLogicCommonTest1("test2_7"));
//		suite.addTest(new AttendanceLogicCommonTest1("test2_8"));		
//		suite.addTest(new AttendanceLogicCommonTest1("test3_1"));	
//		suite.addTest(new AttendanceLogicCommonTest1("test4_1"));
//		suite.addTest(new AttendanceLogicCommonTest1("test4_2"));
//		suite.addTest(new AttendanceLogicCommonTest1("test4_3"));
//		suite.addTest(new AttendanceLogicCommonTest1("test4_4"));
//		
//
//		suite.addTest(new AttendanceLogicCommonTest2("test1_2"));
//		suite.addTest(new AttendanceLogicCommonTest2("test1_3"));
//		suite.addTest(new AttendanceLogicCommonTest2("test1_4"));
//		suite.addTest(new AttendanceLogicCommonTest2("test1_5"));
//		suite.addTest(new AttendanceLogicCommonTest2("test1_6"));	
//		suite.addTest(new AttendanceLogicCommonTest2("test2_1"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_2"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_3"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_4"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_5"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_6"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_7"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_8"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_9"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_10"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_11"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_12"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_13"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_14"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_15"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_16"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_17"));
//		suite.addTest(new AttendanceLogicCommonTest2("test2_18"));		
//		suite.addTest(new AttendanceLogicCommonTest2("test3_1"));
//		suite.addTest(new AttendanceLogicCommonTest2("test3_2"));	
//		suite.addTest(new AttendanceLogicCommonTest2("test4_1"));
//		suite.addTest(new AttendanceLogicCommonTest2("test4_2"));
//		suite.addTest(new AttendanceLogicCommonTest2("test4_3"));
//		suite.addTest(new AttendanceLogicCommonTest2("test4_4"));
//		
//		
//		
//		
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test1_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test1_2"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test1_3"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test1_4"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test1_5"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_2"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_3"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_4"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_5"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_6"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_7"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_8"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test2_9"));		
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test3_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test3_2"));	//206
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test4_1"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test4_2"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test4_3"));
//		suite.addTest(new AttendanceLogicCommonROTestWeekend1("test4_4"));
////		
////		
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test1_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test1_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test1_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test1_4"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test1_5"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test1_6"));	
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_4"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_5"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_6"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_7"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test2_8"));	
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test3_1"));	
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test4_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test4_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test4_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend1("test4_4"));
////		
////	12323123123	
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test1_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test1_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test1_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test1_4"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test1_5"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test1_6"));		
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_4"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_5"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_6"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_7"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_8"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_9"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_10"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_11"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_12"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_13"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_14"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_15"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_16"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_17"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test2_18"));	
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test3_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test3_2"));	
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test4_1"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test4_2"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test4_3"));
//		suite.addTest(new AttendanceLogicCommonTestWeekend2("test4_4"));
////		
////		
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_4"));
		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_5"));//225
//	    suite.addTest(new AttendanceLogicFlexibleROTest1("test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_7"));
		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_8"));//225
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_9"));
		suite.addTest(new AttendanceLogicFlexibleROTest1("test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_3"));
		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_4"));//bug206
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_6"));
		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_10"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test2_11"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test3_1"));
		suite.addTest(new AttendanceLogicFlexibleROTest1("test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test3_3"));	
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test4_1"));//bug207
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test4_2"));//bug207
		suite.addTest(new AttendanceLogicFlexibleROTest1("test4_3"));//bug207
//		suite.addTest(new AttendanceLogicFlexibleROTest1("test4_4"));//bug207
		suite.addTest(new AttendanceLogicFlexibleROTest1("test4_5"));//待定
		
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_5"));
//	    suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_8"));
//  	    suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_10"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test2_11"));	
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test3_3"));	
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test4_3"));
//		suite.addTest(new AttendanceLogicFlexibleROTestWeekend1("test4_4"));
		
		
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_5"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_8"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_11"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_12"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_13"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_14"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_15"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_16"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_17"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_18"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test1_19"));		
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_10"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_11"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_12"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_13"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_14"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test2_15"));		
//		suite.addTest(new AttendanceLogicFlexibleTest1("test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test3_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test3_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test4_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest1("test4_4"));
		
//		<明天继续>
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_5"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_8"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_11"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_12"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_13"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_14"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test1_15"));	
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test2_10"));		
//		suite.addTest(new AttendanceLogicFlexibleTest2("test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test3_2"));//bug
//		suite.addTest(new AttendanceLogicFlexibleTest2("test3_3"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test3_4"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleTest2("test4_3"));
//		
//		
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_5"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_8"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_11"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_12"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_13"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_14"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_15"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_16"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_17"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_18"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test1_19"));		
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_10"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_11"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_12"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_13"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_14"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test2_15"));	
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test3_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test3_4"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test4_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend1("test4_4"));
//		
//		
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_4"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_5"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_6"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_7"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_8"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_9"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_10"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_11"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_12"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_13"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_14"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test1_15"));				
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_4"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_5"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_6"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_7"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_8"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_9"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test2_10"));	
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test3_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test3_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test3_3"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test3_4"));		
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test4_1"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test4_2"));
//		suite.addTest(new AttendanceLogicFlexibleTestWeekend2("test4_3"));
		
		return suite;
		
		
		
		
	}
	

	
	
	}