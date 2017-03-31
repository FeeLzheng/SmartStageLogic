package com.uniubi.test;

import java.beans.PropertyVetoException;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ServiceJdbcDataSource_procedure {

	private ComboPooledDataSource pool;
	private static ServiceJdbcDataSource_procedure instance;
	
	public static final ServiceJdbcDataSource_procedure getInstance(){
		if (instance == null) {
		 	try {
		 		instance = new ServiceJdbcDataSource_procedure();
		 	} catch (Exception e) {
		 		e.printStackTrace();
		 	}
		}
		return instance;
	}
	
	public ServiceJdbcDataSource_procedure(){
		int poolSize = 1;
    	String driverName = "com.mysql.jdbc.Driver";
    	String url = "jdbc:mysql://192.168.1.37:3307/smartstage_procedure?useUnicode=true&characterEncoding=utf-8&&zeroDateTimeBehavior=convertToNull";
    	String username = "smartstage";
    	String password = "Uni-Ubi@SS2016";
    	
		pool = new ComboPooledDataSource();
		pool.setJdbcUrl(url);
		pool.setUser(username);
		pool.setPassword(password);
		pool.setAutoCommitOnClose(true);
		pool.setIdleConnectionTestPeriod(14400);
		try {
			pool.setDriverClass(driverName);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		pool.setInitialPoolSize(poolSize);
	}
	
	public Connection getConnection(){
		try {
			Connection connection = pool.getConnection();
			if(null == connection){
				throw new Exception("no avaliable connection in jdbc connection pool");
			}
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void release_procedure(Connection connection){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close2(ResultSet rs,Statement ps,Connection connection){
		try {
			if(null != rs)rs.close();
			if(null != ps)ps.close();
			if(null != connection){
				connection.close();}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs,PreparedStatement ps,Connection connection){
		try {
			if(null != rs)rs.close();
			if(null != ps)ps.close();
			if(null != connection){
				connection.close();}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void rsclose(ResultSet rs){
		try{
			rs.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void stclose(Statement st){
		try{
			st.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public static void psclose(PreparedStatement ps){
		try{
			if(ps!=null){
			ps.close();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void connclose(Connection  conn){
		try{if(conn!=null){
			conn.close();
		}}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	
}
