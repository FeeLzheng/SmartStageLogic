package com.uniubi.util;

import java.lang.reflect.Type;
import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonUtil {

	public static Gson gson = GsonBuilderUtil.create();
	
	
	public static String toString(Object object){
		if(null == object){
			return "null";
		}
		return gson.toJson(object);
	}
	
	public static <T> T toObject(String json,Class<T> type){
		return gson.fromJson(json, type);
	}
	
	public static <T> T toObject(String json,Type type){
		return gson.fromJson(json, type);
	}
	
	public static HashMap<String,String> toMap(String json){
		return gson.fromJson(json, new TypeToken<HashMap<String, String>>(){}.getType());
	}

}
