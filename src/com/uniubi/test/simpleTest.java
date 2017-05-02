package com.uniubi.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.uniubi.entity.CreateRecreationModel;
import com.uniubi.util.AttendancelogicMQProducerUtil;

public class simpleTest {

	public static void main(String[] args) {
		AttendancelogicMQProducerUtil.init();
		System.out.println("MQ PRODUCER started");
		AttendancelogicMQProducerUtil
				.sendCreateRecreationMessage(test());
		System.out.println("生成成功");
	}

	public static CreateRecreationModel test() {

		String DATE_FORMAT_SIMPLE = "yyyy-MM-dd";
		SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(
				DATE_FORMAT_SIMPLE);
		int employeeId = 100000004;
		int userId = 52;
		String date1 = "2017-04-12";
		System.out.println("生成"+date1+"天的记录且UserID为"+employeeId);
		CreateRecreationModel createrecreation=null;
		try {
			Date createoneday = SIMPLE_DATE_FORMAT.parse(date1);
			createrecreation = new CreateRecreationModel();
			createrecreation.setUserId(userId);
			createrecreation.setEmployeeId(employeeId);
			createrecreation.setStart(createoneday);
			createrecreation.setEnd(createoneday);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return createrecreation;
	}

}