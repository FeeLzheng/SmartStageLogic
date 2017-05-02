package com.uniubi.common.procedure.weekend;

//import com.uniubi.test.ServiceJdbcDataSource;
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
//		suite.addTestSuite(procedureTest.class);
////		suite.addTest(new JUnit4TestAdapter(procedureTest.class));
//		suite.addTest(new procedureTest("test1_1"));	
//		suite.addTest(new procedureTest("test1_2"));	
//		suite.addTest(new procedureTest("test1_3"));	
//		suite.addTest(new procedureTest("test1_4"));	
//		suite.addTest(new procedureTest("test1_5"));
//		suite.addTest(new procedureTest("test1_6"));
//		suite.addTest(new procedureTest("test1_7"));
//		suite.addTest(new procedureTest("test1_8"));	
//		suite.addTest(new procedureTest("test1_9"));	
//		suite.addTest(new procedureTest("test1_10"));
//		suite.addTest(new procedureTest("test1_11"));
//		suite.addTest(new procedureTest("test1_12"));
//		suite.addTest(new procedureTest("test1_13"));	
//		suite.addTest(new procedureTest("test1_14"));	
//		suite.addTest(new procedureTest("test1_15"));
//		suite.addTest(new procedureTest("test1_16"));
//		suite.addTest(new procedureTest("test1_17"));
//		suite.addTest(new procedureTest("test1_18"));
//		suite.addTest(new procedureTest("test1_19"));
//		suite.addTest(new procedureTest("test1_20"));
//		suite.addTest(new procedureTest("test1_21"));
//		suite.addTest(new procedureTest("test1_22"));
//		suite.addTest(new procedureTest("test1_23"));	
//		suite.addTest(new procedureTest("test1_24"));
//		suite.addTest(new procedureTest("test1_25"));
//		suite.addTest(new procedureTest("test1_26"));
//		suite.addTest(new procedureTest("test1_27"));//产假BUG
//		suite.addTest(new procedureTest("test1_28"));//产假BUG
//		suite.addTest(new procedureTest("test1_29"));
//		suite.addTest(new procedureTest("test1_30"));
//		suite.addTest(new procedureTest("test1_31"));//173
//		suite.addTest(new procedureTest("test1_32"));
//		suite.addTest(new procedureTest("test1_33"));	
//		suite.addTest(new procedureTest("test1_34"));	
//		suite.addTest(new procedureTest("test1_35"));
//		suite.addTest(new procedureTest("test1_36"));
//		suite.addTest(new procedureTest("test1_37"));
//		suite.addTest(new procedureTest("test1_38"));
//		suite.addTest(new procedureTest("test1_39"));
//		suite.addTest(new procedureTest("test1_40"));//bug169
//		suite.addTest(new procedureTest("test1_41"));
//		suite.addTest(new procedureTest("test1_42"));
//		suite.addTest(new procedureTest("test1_43"));	
//		suite.addTest(new procedureTest("test1_44"));//172	
//		suite.addTest(new procedureTest("test1_45"));//171
//		suite.addTest(new procedureTest("test1_46"));
//		suite.addTest(new procedureTest("test1_47"));
//		suite.addTest(new procedureTest("test1_48"));
//		suite.addTest(new procedureTest("test1_49"));
//		suite.addTest(new procedureTest("test1_50"));
//		suite.addTest(new procedureTest("test1_51"));
//		suite.addTest(new procedureTest("test1_52"));
//		suite.addTest(new procedureTest("test1_53"));	
//		suite.addTest(new procedureTest("test1_54"));	
//		suite.addTest(new procedureTest("test1_55"));
//		suite.addTest(new procedureTest("test1_56"));
//		suite.addTest(new procedureTest("test1_57"));
//		suite.addTest(new procedureTest("test1_58"));
//		suite.addTest(new procedureTest("test1_59"));
//		suite.addTest(new procedureTest("test1_60"));
//		suite.addTest(new procedureTest("test1_61"));
//		suite.addTest(new procedureTest("test1_62"));
//		suite.addTest(new procedureTest("test1_63"));	
//		suite.addTest(new procedureTest("test1_64"));	
//		suite.addTest(new procedureTest("test1_65"));
//		suite.addTest(new procedureTest("test1_66"));
//		suite.addTest(new procedureTest("test1_67"));
//		suite.addTest(new procedureTest("test1_68"));
//		suite.addTest(new procedureTest("test1_69"));
//		suite.addTest(new procedureTest("test1_70"));
//		suite.addTest(new procedureTest("test1_71"));
//		suite.addTest(new procedureTest("test1_72"));
//		suite.addTest(new procedureTest("test1_73"));	
//		suite.addTest(new procedureTest("test1_74"));	
//		suite.addTest(new procedureTest("test1_75"));
//		suite.addTest(new procedureTest("test1_76"));
//		suite.addTest(new procedureTest("test1_77"));
//		suite.addTest(new procedureTest("test1_78"));
//		suite.addTest(new procedureTest("test1_79"));
//		suite.addTest(new procedureTest("test1_80"));//new bug
//		suite.addTest(new procedureTest("test1_81"));
//		suite.addTest(new procedureTest("test1_82"));
//		suite.addTest(new procedureTest("test1_83"));	
//		suite.addTest(new procedureTest("test1_84"));
//		suite.addTest(new procedureTest("test1_85"));
//		suite.addTest(new procedureTest("test1_86"));
//		suite.addTest(new procedureTest("test1_87"));
//		suite.addTest(new procedureTest("test1_88"));//173
//		suite.addTest(new procedureTest("test1_89"));//174
//		suite.addTest(new procedureTest("test1_90"));//174
//		suite.addTest(new procedureTest("test1_91"));
//		suite.addTest(new procedureTest("test1_92"));
//		suite.addTest(new procedureTest("test1_93"));	//175
//		suite.addTest(new procedureTest("test1_94"));	
//		suite.addTest(new procedureTest("test1_95"));
//		suite.addTest(new procedureTest("test1_96"));
//		suite.addTest(new procedureTest("test1_97"));
//		suite.addTest(new procedureTest("test1_98"));
//		suite.addTest(new procedureTest("test1_99"));
//		suite.addTest(new procedureTest("test1_100"));
		suite.addTest(new procedureTest("test1_101"));
//		suite.addTest(new procedureTest("test1_102"));
//		suite.addTest(new procedureTest("test1_103"));	
//		suite.addTest(new procedureTest("test1_104"));	
//		suite.addTest(new procedureTest("test1_105"));
//		suite.addTest(new procedureTest("test1_106"));
//		suite.addTest(new procedureTest("test1_107"));
//		suite.addTest(new procedureTest("test1_108"));
//		suite.addTest(new procedureTest("test1_109"));
//		suite.addTest(new procedureTest("test1_110"));
//		suite.addTest(new procedureTest("test1_111"));
//		
		return suite;
		
		
				
	}
	

	
	
	}