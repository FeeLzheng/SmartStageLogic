package com.uniubi.flexible.oldlogic;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

import com.uniubi.test.EmployeeDay;

public abstract class AttendanceLogicFlexibleTest2AssertBase {

	 static Date A1 = null;
	 static Date B1 = null;
	 static Date A2 = null;
	 static Date B2 = null;
	
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
	 
	//工作时长
	 static long t;
	 
	 static EmployeeDay employeeDay;
	 static EmployeeDay employeeNextDay;
	
	 static AttendanceLogicFlexibleTest2AssertBase instance;
	
	public AttendanceLogicFlexibleTest2AssertBase(){
		
	}
	
	public static AttendanceLogicFlexibleTest2AssertBase getInstance(Date A1,Date B1,Date A2,Date B2,Date t1_1,Date t1_n,Date t2_1,Date t2_n,Date e1,Date f1,Date e2,Date f2,EmployeeDay employeeDay,EmployeeDay employeeNextDay,String caseNo){
		try {
			Class<AttendanceLogicFlexibleTest2AssertBase> clazz = (Class<AttendanceLogicFlexibleTest2AssertBase>) Class.forName("com.uniubi.flexible.oldlogic.AttendanceLogicFlexibleTest2Assert"+caseNo);
			instance = clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		instance.A1 = A1;
		instance.B1 = B1;
		instance.A2 = A2;
		instance.B2 = B2;
		instance.t1_1 = t1_1;
		instance.t1_n = t1_n;
		instance.t2_1 = t2_1;
		instance.t2_n = t2_n;
		instance.e1 = e1;
		instance.f1 = f1;
		instance.e2 = e2;
		instance.f2 = f2;
		instance.employeeDay = employeeDay;
		instance.employeeNextDay = employeeNextDay;
		instance.t = B1.getTime()-A1.getTime();
		return instance;
	}
	
	
	/***
	 * 
	 * <p>方法说明：用例表中蓝色（1）部分第一天全公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public abstract void Testx_x_1_all();
	
	/***
	 * 
	 * <p>方法说明：用例表中第二天请假公式（工时、早退、迟到都为0）</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_2_leave(){
		assertEquals(employeeNextDay.getWorkDur(),0);
		assertEquals(employeeNextDay.getDelayDur(),0);
//		assertEquals(employeeNextDay.getLeaveDur(),0);
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}
	
	/***
	 * 
	 * <p>方法说明：用例表中深绿（2）部分第二天全公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public abstract void Testx_x_2_all();
	
	/***
	 * 
	 * <p>方法说明：用例表中蓝色（1）部分第一天全公式+第二天的请假公式（工时、早退、迟到都为0）</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_1_1(){
		Testx_x_1_all();
		Testx_x_1_simple_leave();
		Testx_x_2_leave();
	}
	/***
	 * 
	 * <p>方法说明：用例表中深绿（2）部分第二天全公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_1_2(){
		Testx_x_2_all();
		Testx_x_2_simple_leave();
	}
	/***
	 * 
	 * <p>方法说明：用例表中第二流程处理完毕后的橙色（3）第一天全公式和浅绿（4）第二天的全公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_1_3(){
		Textx_x_last();
		Testx_x_3_simple_leave();
		Testx_x_4_simple_leave();
	}
	
	/***
	 * 
	 * <p>方法说明：用例表中蓝色（1）部分第一天全公式+第二天的请假公式（工时、早退、迟到都为0）；和Textx_x_1_1一样</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_2_1(){
		Testx_x_1_all();
		Testx_x_1_simple_leave();
		Testx_x_2_leave();
	}
	/***
	 * 
	 * <p>方法说明：用例表中深绿（2）部分第二天全公式；和Testx_x_1_2一样</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_2_2(){
		Testx_x_2_all();
		Testx_x_2_simple_leave();
	}
	/***
	 * 
	 * <p>方法说明：用例表中第二流程处理完毕后的橙色（3）第一天部分公式和浅绿（4）第二天的部分公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_2_3(){
		Textx_x_last();
		Testx_x_3_simple_leave();
		Testx_x_4_simple_leave();
	}
	
	/***
	 * 
	 * <p>方法说明：用例表中蓝色（1）部分第一天完全公式和深绿（2）部分第二天完全公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_3_1(){
		Testx_x_1_all();
		Testx_x_1_simple_leave();
		Testx_x_2_all();
		Testx_x_2_simple_leave();
	}
	/***
	 * 
	 * <p>方法说明：用例表中第二流程处理完毕后的橙色（3）第一天部分公式和浅绿（4）第二天的部分公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public void Testx_x_3_2(){
		Textx_x_last();
		Testx_x_3_simple_leave();
		Testx_x_4_simple_leave();
	}
	
	/***
	 * 
	 * <p>方法说明：用例表中第二流程处理完毕后的橙色（3）第一天部分公式和浅绿（4）第二天的部分公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-30
	 */
	@Test
	public abstract void Textx_x_last();
	
	/***
	 * 
	 * <p>方法说明：蓝色（1）部分的请假时间公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public void Testx_x_1_simple_leave(){
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(A1.getTime()+t-e1.getTime()));
	}
	
	/***
	 * 
	 * <p>方法说明：绿色（2）部分的请假时间单独公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public void Testx_x_2_simple_leave(){
		System.out.println(convertMsToMinutes(f1.getTime()-A2.getTime()));
		System.out.println(employeeNextDay.getLeaveDur());
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}
	
	/***
	 * 
	 * <p>方法说明：橙色（3）部分的请假时间公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public void Testx_x_3_simple_leave(){
		System.out.println(convertMsToMinutes(A1.getTime()+t-e1.getTime()));
		System.out.println(employeeDay.getLeaveDur());
		assertEquals(employeeDay.getAllLeaveDur(),convertMsToMinutes(A1.getTime()+t-e1.getTime()));
	}
	
	/***
	 * 
	 * <p>方法说明：青色（4）部分的请假时间单独公式</p>
	 * @return void
	 * @author panlei
	 * @throws Exception 
	 * @date 2016-5-31
	 */
	@Test
	public void Testx_x_4_simple_leave(){
		assertEquals(employeeNextDay.getAllLeaveDur(),convertMsToMinutes(f1.getTime()-A2.getTime()));
	}
	
	
	
	
	
	static int convertMsToMinutes(long ms){
		int result = (int) (ms/1000/60);
		return result < 0 ? 0 : result;
	}
}
