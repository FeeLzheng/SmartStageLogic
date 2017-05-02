package com.uniubi.common;

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
////	
//		suite.addTestSuite(com.uniubi.common.procedure.procedureTest.class);
//		suite.addTestSuite(com.uniubi.common.weekend.attendanceTest.class);
//		suite.addTestSuite(com.uniubi.common.procedure.weekend.procedureTest.class);
//////	
//		suite.addTestSuite(com.uniubi.common.outwork.outworkTest.class);
//		suite.addTestSuite(com.uniubi.common.outwork.weekend.outworkTest.class);
//		suite.addTestSuite(com.uniubi.common.repair.repairTest.class);
//		suite.addTestSuite(com.uniubi.common.repair.weekend.repairTest.class);					
////////		//old logic
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicCommonROTest1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicCommonROTestWeekend1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicCommonTest1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicCommonTest2.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicCommonTestWeekend1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicCommonTestWeekend2.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicFlexibleROTest1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicFlexibleROTestWeekend1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicFlexibleTest1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicFlexibleTest2.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicFlexibleTestWeekend1.class);
//		suite.addTestSuite(com.uniubi.test.old.AttendanceLogicFlexibleTestWeekend2.class);
		
		
		
		
		
////		suite.addTest(new JUnit4TestAdapter(attendanceTest.class));
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
//		suite.addTest(new attendanceTest("test1_18"));
//		suite.addTest(new attendanceTest("test1_19"));
//		suite.addTest(new attendanceTest("test1_20"));
//		suite.addTest(new attendanceTest("test1_21"));
//		suite.addTest(new attendanceTest("test1_22"));
//		suite.addTest(new attendanceTest("test1_23"));	
//		suite.addTest(new attendanceTest("test1_24"));	//160
//		suite.addTest(new attendanceTest("test1_25"));//160
//		suite.addTest(new attendanceTest("test1_26"));//160
//		suite.addTest(new attendanceTest("test1_27"));
//		suite.addTest(new attendanceTest("test1_28"));//160
//		suite.addTest(new attendanceTest("test1_29"));
//		suite.addTest(new attendanceTest("test1_30"));
//		suite.addTest(new attendanceTest("test1_31"));
//		suite.addTest(new attendanceTest("test1_32"));
//		suite.addTest(new attendanceTest("test1_33"));	
//		suite.addTest(new attendanceTest("test1_34"));	
//		suite.addTest(new attendanceTest("test1_35"));
//		suite.addTest(new attendanceTest("test1_36"));
//		suite.addTest(new attendanceTest("test1_37"));
//		suite.addTest(new attendanceTest("test1_38"));
//		suite.addTest(new attendanceTest("test1_39"));
//		suite.addTest(new attendanceTest("test1_40"));
//		suite.addTest(new attendanceTest("test1_41"));
//		suite.addTest(new attendanceTest("test1_42"));
//		suite.addTest(new attendanceTest("test1_43"));	
//		suite.addTest(new attendanceTest("test1_44"));	
//		suite.addTest(new attendanceTest("test1_45"));
//		suite.addTest(new attendanceTest("test1_46"));
//		suite.addTest(new attendanceTest("test1_47"));
//		suite.addTest(new attendanceTest("test1_48"));
//		suite.addTest(new attendanceTest("test1_49"));
//		suite.addTest(new attendanceTest("test1_50"));
//		suite.addTest(new attendanceTest("test1_51"));
//		suite.addTest(new attendanceTest("test1_52"));
//		suite.addTest(new attendanceTest("test1_53"));	
//		suite.addTest(new attendanceTest("test1_54"));	//160
//		suite.addTest(new attendanceTest("test1_55"));//160
//		suite.addTest(new attendanceTest("test1_56"));
//		suite.addTest(new attendanceTest("test1_57"));
//		suite.addTest(new attendanceTest("test1_58"));//160
//		suite.addTest(new attendanceTest("test1_59"));
//		suite.addTest(new attendanceTest("test1_60"));
//		suite.addTest(new attendanceTest("test1_61"));
//		suite.addTest(new attendanceTest("test1_62"));
//		suite.addTest(new attendanceTest("test1_63"));	
//		suite.addTest(new attendanceTest("test1_64"));	
//		suite.addTest(new attendanceTest("test1_65"));
//		suite.addTest(new attendanceTest("test1_66"));
//		suite.addTest(new attendanceTest("test1_67"));
//		suite.addTest(new attendanceTest("test1_68"));
//		suite.addTest(new attendanceTest("test1_69"));
//		suite.addTest(new attendanceTest("test1_70"));
//		suite.addTest(new attendanceTest("test1_71"));
//		suite.addTest(new attendanceTest("test1_72"));
//		suite.addTest(new attendanceTest("test1_73"));	
//		suite.addTest(new attendanceTest("test1_74"));	
//		suite.addTest(new attendanceTest("test1_75"));
//		suite.addTest(new attendanceTest("test1_76"));
//		suite.addTest(new attendanceTest("test1_77"));
//		suite.addTest(new attendanceTest("test1_78"));
//		suite.addTest(new attendanceTest("test1_79"));
//		suite.addTest(new attendanceTest("test1_80"));
//		suite.addTest(new attendanceTest("test1_81"));
//		suite.addTest(new attendanceTest("test1_82"));
//		suite.addTest(new attendanceTest("test1_83"));	
//		suite.addTest(new attendanceTest("test1_84"));	
//		suite.addTest(new attendanceTest("test1_85"));
//		suite.addTest(new attendanceTest("test1_86"));
//		suite.addTest(new attendanceTest("test1_87"));
//		suite.addTest(new attendanceTest("test1_88"));
//		suite.addTest(new attendanceTest("test1_89"));
//		suite.addTest(new attendanceTest("test1_90"));
//		suite.addTest(new attendanceTest("test1_91"));
//		suite.addTest(new attendanceTest("test1_92"));
//		suite.addTest(new attendanceTest("test1_93"));	
//		suite.addTest(new attendanceTest("test1_94"));	
//		suite.addTest(new attendanceTest("test1_95"));
//		suite.addTest(new attendanceTest("test1_96"));
//		suite.addTest(new attendanceTest("test1_97"));
//		suite.addTest(new attendanceTest("test1_98"));
//		suite.addTest(new attendanceTest("test1_99"));
//		suite.addTest(new attendanceTest("test1_100"));
//		suite.addTest(new attendanceTest("test1_101"));
//		suite.addTest(new attendanceTest("test1_102"));
//		suite.addTest(new attendanceTest("test1_103"));	
//		suite.addTest(new attendanceTest("test1_104"));	
//		suite.addTest(new attendanceTest("test1_105"));
//		suite.addTest(new attendanceTest("test1_106"));
//		suite.addTest(new attendanceTest("test1_107"));
//		suite.addTest(new attendanceTest("test1_108"));
//		suite.addTest(new attendanceTest("test1_109"));
//		suite.addTest(new attendanceTest("test1_110"));
//		suite.addTest(new attendanceTest("test1_111"));
//		suite.addTest(new attendanceTest("test1_112"));
//		suite.addTest(new attendanceTest("test1_113"));	
//		suite.addTest(new attendanceTest("test1_114"));	
//		suite.addTest(new attendanceTest("test1_115"));
//		suite.addTest(new attendanceTest("test1_116"));
//		suite.addTest(new attendanceTest("test1_117"));
//		suite.addTest(new attendanceTest("test1_118"));
//		suite.addTest(new attendanceTest("test1_119"));
//		suite.addTest(new attendanceTest("test1_120"));
//		suite.addTest(new attendanceTest("test1_121"));
//		suite.addTest(new attendanceTest("test1_122"));
//		suite.addTest(new attendanceTest("test1_123"));	
//		suite.addTest(new attendanceTest("test1_124"));	
//		suite.addTest(new attendanceTest("test1_125"));
//		suite.addTest(new attendanceTest("test1_126"));
//		suite.addTest(new attendanceTest("test1_127"));
//		suite.addTest(new attendanceTest("test1_128"));
//		suite.addTest(new attendanceTest("test1_129"));
//		suite.addTest(new attendanceTest("test1_130"));
//		suite.addTest(new attendanceTest("test1_131"));
//		suite.addTest(new attendanceTest("test1_132"));
//		suite.addTest(new attendanceTest("test1_133"));	
//		suite.addTest(new attendanceTest("test1_134"));	
//		suite.addTest(new attendanceTest("test1_135"));
//		suite.addTest(new attendanceTest("test1_136"));
//		suite.addTest(new attendanceTest("test1_137"));
//		suite.addTest(new attendanceTest("test1_138"));
//		suite.addTest(new attendanceTest("test1_139"));
//		suite.addTest(new attendanceTest("test1_140"));
//		suite.addTest(new attendanceTest("test1_141"));
//		suite.addTest(new attendanceTest("test1_142"));
//		suite.addTest(new attendanceTest("test1_143"));	
//		suite.addTest(new attendanceTest("test1_144"));	
//		suite.addTest(new attendanceTest("test1_145"));
//		suite.addTest(new attendanceTest("test1_146"));
//		suite.addTest(new attendanceTest("test1_147"));
//		suite.addTest(new attendanceTest("test1_148"));
//		suite.addTest(new attendanceTest("test1_149"));
//		suite.addTest(new attendanceTest("test1_150"));
//		suite.addTest(new attendanceTest("test1_151"));
//		suite.addTest(new attendanceTest("test1_152"));
//		suite.addTest(new attendanceTest("test1_153"));	
//		suite.addTest(new attendanceTest("test1_154"));	
//		suite.addTest(new attendanceTest("test1_155"));
//		suite.addTest(new attendanceTest("test1_156"));
//		suite.addTest(new attendanceTest("test1_157"));
//		suite.addTest(new attendanceTest("test1_158"));
//		suite.addTest(new attendanceTest("test1_159"));
//		suite.addTest(new attendanceTest("test1_160"));
//		suite.addTest(new attendanceTest("test1_161"));//160
//		suite.addTest(new attendanceTest("test1_162"));
//		suite.addTest(new attendanceTest("test1_163"));	
//		suite.addTest(new attendanceTest("test1_164"));//160	
//		suite.addTest(new attendanceTest("test1_165"));//160
//		suite.addTest(new attendanceTest("test1_166"));
//		suite.addTest(new attendanceTest("test1_167"));//160
//		suite.addTest(new attendanceTest("test1_168"));//160
//		suite.addTest(new attendanceTest("test1_169"));
//		suite.addTest(new attendanceTest("test1_170"));
//		suite.addTest(new attendanceTest("test1_171"));
//		suite.addTest(new attendanceTest("test1_172"));
//		suite.addTest(new attendanceTest("test1_173"));	
//		suite.addTest(new attendanceTest("test1_174"));	
//		suite.addTest(new attendanceTest("test1_175"));
//		suite.addTest(new attendanceTest("test1_176"));
		
		
		//测试打卡
		suite.addTest(new attendanceTest("test1_177"));
//		
		return suite;
		
		
				
	}
	

	
	
	}