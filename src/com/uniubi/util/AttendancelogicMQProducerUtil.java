package com.uniubi.util;

import com.uniubi.entity.Attendance;
import com.uniubi.entity.CreateRecreationModel;
import com.uniubi.entity.Procedure;
import com.uniubi.model.ModelConstant;
import com.uniubi.sdk.http.MQProducer;

public class AttendancelogicMQProducerUtil {
 
	public static void init(){
		MQProducer.init(ModelConstant.ATTENDANCE_LOGIC_PRODUCER_ID);
	}
	
	public static boolean sendAttendanceMessage(Attendance attendance){
        return MQProducer.sendMessage(ModelConstant.ATTENDANCE_LOGIC_TOPIC, ModelConstant.NEW_ATTENDANCE_TAG, JsonUtil.toString(attendance));
	}
	
	public static boolean sendProcedureMessage(Procedure procedure){
		return MQProducer.sendMessage(ModelConstant.ATTENDANCE_LOGIC_TOPIC, ModelConstant.NEW_PROCEDURE_TAG, JsonUtil.toString(procedure));
	}
	
	public static boolean sendCreateRecreationMessage(CreateRecreationModel createrecreation){
		return MQProducer.sendMessage(ModelConstant.ATTENDANCE_LOGIC_TOPIC, ModelConstant.CREATE_ONE_PERSON_TAG, JsonUtil.toString(createrecreation));
	}
	
}
