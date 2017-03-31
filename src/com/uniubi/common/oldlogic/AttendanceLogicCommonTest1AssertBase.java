package com.uniubi.common.oldlogic;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import org.junit.Test;
import com.uniubi.test.EmployeeDay;

public abstract class AttendanceLogicCommonTest1AssertBase {

	 //最晚上班时间
	 static Date A1 = null;
	 static Date B1 = null;
	
	//第一天第一次打卡
	 static Date t1;
	//第一天最后一次打卡
	 static Date tn;
	//第一个请假开始时间
	 static Date e1;
	//第一个请假结束时间
	 static Date f1;
	//第二个请假开始时间
	 static Date e2;
	//第二个请假结束时间
	 static Date f2;
	 
	 //工作时长
	 static long t;
	 
	 static EmployeeDay employeeDay;
	
	 static AttendanceLogicCommonTest1AssertBase instance;
	
	public AttendanceLogicCommonTest1AssertBase(){
		
	}
	
	public static AttendanceLogicCommonTest1AssertBase getInstance(Date A1,Date B1,Date t1,Date tn,Date e1,Date f1,Date e2,Date f2,EmployeeDay employeeDay,String caseNo){
		try {
			Class<AttendanceLogicCommonTest1AssertBase> clazz = (Class<AttendanceLogicCommonTest1AssertBase>) Class.forName("com.uniubi.common.oldlogic.AttendanceLogicCommonTest1Assert"+caseNo);
			instance = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		instance.A1 = A1;
		instance.B1 = B1;
		instance.tn = tn;
		instance.t1 = t1;
		instance.e1 = e1;
		instance.f1 = f1;
		instance.e2 = e2;
		instance.f2 = f2;
		instance.employeeDay = employeeDay;
		instance.t = B1.getTime()-A1.getTime();
		return instance;
	}
	
	/***
	 * 
	 * <p>方法说明：测试方法1</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x(int code){
		if(code == 1){
			Testx_x_1();
			Testx_x_1_leave();
		}else{
			Testx_x_2();
			Testx_x_2_leave();
		}
	}
	
	/***
	 * 
	 * <p>方法说明：用例表中蓝色（1）部分全公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public abstract void Testx_x_1();
	
	/***
	 * 
	 * <p>方法说明：用例表中绿色（2）部分全公式-也就是第二流程处理完毕后的公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public abstract void Testx_x_2();
	
	/***
	 * 
	 * <p>方法说明：蓝色（1）部分的请假时间公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public void Testx_x_1_leave(){
		System.out.println(convertMsToMinutes(f1.getTime()-e1.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-e1.getTime()));
	}
	
	/***
	 * 
	 * <p>方法说明：绿色（2）部分的请假时间公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public void Testx_x_2_leave(){
		System.out.println(convertMsToMinutes(f1.getTime()-e1.getTime()+f2.getTime()-e2.getTime()));
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-e1.getTime()+f2.getTime()-e2.getTime()));
	}
	
	static int convertMsToMinutes(long ms){
		return (int) (ms/1000/60);
	}
}
