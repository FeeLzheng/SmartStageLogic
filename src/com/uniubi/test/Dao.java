package com.uniubi.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.uniubi.entity.Attendance;
import com.uniubi.entity.CreateRecreationModel;
import com.uniubi.entity.Procedure;
import com.uniubi.util.AttendancelogicMQProducerUtil;





public class Dao{
	
	String date1="2017-06-08";
	String date2="2017-06-09";
	String date3="2017-06-03";
	String date4="2017-06-04";
	static String DATE_FORMAT_SIMPLE = "yyyy-MM-dd";
	 static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(DATE_FORMAT_SIMPLE);
	 
	
	
	public void deleteAttendanceOneDay(String day,int employeeId,int userId){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try{
			conn= ServiceJdbcDataSource_attendance.getInstance().getConnection();
		
			String sql0="select * from UNIUBI_ATTENDANCE40000 where EMPLOYEE_ID = " + employeeId + " and USER_ID = "+userId+" and Show_Time like '"+ day +"%'";
//			System.out.println(sql0);
			st=conn.prepareStatement(sql0);
			rs=st.executeQuery();
			if(rs.next()){
			String sql = "delete from UNIUBI_ATTENDANCE40000 where EMPLOYEE_ID = " + employeeId + " and USER_ID = "+userId+" and date(SHOW_TIME) = ?"; 
			st=conn.prepareStatement(sql);
			st.setString(1,day);
			//System.out.println(sql);
			st.executeUpdate();			
			}
		}catch(Exception e){
			e.printStackTrace();									
		}finally{
			ServiceJdbcDataSource_attendance.psclose(st);
			ServiceJdbcDataSource_attendance.rsclose(rs);
			ServiceJdbcDataSource_attendance.connclose(conn);
			
		}
		
		
		
	}
	
	
//	
//	public void deleteAttendanceOneDay(Date day, int employeeId, int userId) {
//		Connection conn=null;
//		PreparedStatement ps =null;
//		ResultSet rs = null;
//		try {
////			 conn= ServiceJdbcDataSource.getInstance().getConnection();
////			 String sql = "select ID from UNIUBI_EMPLOYEE2 where ID = "+employeeId+" and USER_ID = "+userId+" and STATE = 2 LIMIT 1";
////			 ps = conn.prepareStatement(sql);
////			 rs = ps.executeQuery();
////			 if(!rs.next()){
////				 System.out.println("员工不存在：id("+employeeId+"),userId("+userId+")");
////			 }
//			conn= ServiceJdbcDataSource_attendance.getInstance().getConnection();
//			String sql = "delete from UNIUBI_ATTENDANCE40000 where EMPLOYEE_ID = " + employeeId + " and USER_ID = "+userId+" and date(SHOW_TIME) = ?"; 
//			 ps = conn.prepareStatement(sql);
//			 ps.setTimestamp(1, new Timestamp(day.getTime()));
//			 ps.executeUpdate();
//		} catch(Exception e){
//			e.printStackTrace();
//		} finally{
//	//		ServiceJdbcDataSource.close(rs, ps, conn);
//			ServiceJdbcDataSource_attendance.close2(rs, ps, conn);
//			
//		}
//	}
	
	public void deleteEmployeDayoneDay(int employeeId,int userId,String day){
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try{
		conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
		
		String sql0="select * from UNIUBI_EMPLOYEE_DAY0 where EMPLOYEE_ID = " + employeeId + " and USER_ID = "+userId+" and Day='"+day+"'";
//		System.out.println(sql0);
		st=conn.prepareStatement(sql0);
		rs=st.executeQuery();
		if(rs.next()){
		String sql="delete from UNIUBI_EMPLOYEE_DAY0 where employee_id="+employeeId+" and USER_ID="+userId+" and Day= ?";
		st=conn.prepareStatement(sql);
		st.setString(1, day);
		st.executeUpdate();
		
		System.out.println("删除成功");
		}
		
		
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			ServiceJdbcDataSource_attendance.psclose(st);
			ServiceJdbcDataSource_attendance.rsclose(rs);		
			ServiceJdbcDataSource_attendance.connclose(conn);
		}
	}
	
	public void AttendanceCreate(int userId,int employeeId,Date t1,Date t2){
		Connection conn=null;
		PreparedStatement st=null;
//		ResultSet rs=null;
		try{
			conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
			String sql ="insert into UNIUBI_ATTENDANCE40000(USER_ID,EMPLOYEE_ID,SHOW_TIME) values( "+userId+","+employeeId+",?)";
			st=conn.prepareStatement(sql);
			boolean flag=false;
			if(t1!=null){
				st.setTimestamp(1,new Timestamp(t1.getTime()));
				st.addBatch();
				flag=true;
			}
			if(t2!=null){
				st.setTimestamp(1,new Timestamp(t2.getTime()));
				st.addBatch();
				flag=true;
				
			}
			if(flag){
				st.executeBatch();
			}	
			
//			AttendancelogicMQProducerUtil.init();
			Attendance attendance = new Attendance();
			attendance.setUserId(userId);
//			
			attendance.setEmployeeId(employeeId);
			if(t1!=null){
			attendance.setShowTime(t1);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t1);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t2!=null){
			attendance.setShowTime(t2);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t2);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t1==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date1);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
				
			
			}
			if(t2==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date1);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ServiceJdbcDataSource_attendance.psclose(st);
			ServiceJdbcDataSource_attendance.connclose(conn);
			
			
		}		
	}	
		
	
	public void AttendanceCreate2(int userId,int employeeId,Date t1,Date t2){
		Connection conn=null;
		PreparedStatement st=null;
//		ResultSet rs=null;
		try{
			conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
			String sql ="insert into UNIUBI_ATTENDANCE40000(USER_ID,EMPLOYEE_ID,SHOW_TIME) values( "+userId+","+employeeId+",?)";
			st=conn.prepareStatement(sql);
			boolean flag=false;
			if(t1!=null){
				st.setTimestamp(1,new Timestamp(t1.getTime()));
				st.addBatch();
				flag=true;
			}
			if(t2!=null){
				st.setTimestamp(1,new Timestamp(t2.getTime()));
				st.addBatch();
				flag=true;
				
			}
			if(flag){
				st.executeBatch();
			}	
			
//			AttendancelogicMQProducerUtil.init();
			Attendance attendance = new Attendance();
			attendance.setUserId(userId);
//			
			attendance.setEmployeeId(employeeId);
			if(t1!=null){
			attendance.setShowTime(t1);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t1);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t2!=null){
			attendance.setShowTime(t2);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t2);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t1==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date2);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
				
			
			}
			if(t2==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date2);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ServiceJdbcDataSource_attendance.psclose(st);
			ServiceJdbcDataSource_attendance.connclose(conn);
			
			
		}		
	}	
	
	//插入周末打卡  03-04
	public void AttendanceCreate3(int userId,int employeeId,Date t1,Date t2){
		Connection conn=null;
		PreparedStatement st=null;
//		ResultSet rs=null;
		try{
			conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
			String sql ="insert into UNIUBI_ATTENDANCE40000(USER_ID,EMPLOYEE_ID,SHOW_TIME) values( "+userId+","+employeeId+",?)";
			st=conn.prepareStatement(sql);
			boolean flag=false;
			if(t1!=null){
				st.setTimestamp(1,new Timestamp(t1.getTime()));
				st.addBatch();
				flag=true;
			}
			if(t2!=null){
				st.setTimestamp(1,new Timestamp(t2.getTime()));
				st.addBatch();
				flag=true;
				
			}
			if(flag){
				st.executeBatch();
			}	
			
//			AttendancelogicMQProducerUtil.init();
			Attendance attendance = new Attendance();
			attendance.setUserId(userId);
//			
			attendance.setEmployeeId(employeeId);
			if(t1!=null){
			attendance.setShowTime(t1);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t1);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t2!=null){
			attendance.setShowTime(t2);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t2);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t1==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date3);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
				
			
			}
			if(t2==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date3);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ServiceJdbcDataSource_attendance.psclose(st);
			ServiceJdbcDataSource_attendance.connclose(conn);
			
			
		}		
	}	
	//插入周末打卡  03-05
	public void AttendanceCreate4(int userId,int employeeId,Date t1,Date t2){
		Connection conn=null;
		PreparedStatement st=null;
//		ResultSet rs=null;
		try{
			conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
			String sql ="insert into UNIUBI_ATTENDANCE40000(USER_ID,EMPLOYEE_ID,SHOW_TIME) values( "+userId+","+employeeId+",?)";
			st=conn.prepareStatement(sql);
			boolean flag=false;
			if(t1!=null){
				st.setTimestamp(1,new Timestamp(t1.getTime()));
				st.addBatch();
				flag=true;
			}
			if(t2!=null){
				st.setTimestamp(1,new Timestamp(t2.getTime()));
				st.addBatch();
				flag=true;
				
			}
			if(flag){
				st.executeBatch();
			}	
			
//			AttendancelogicMQProducerUtil.init();
			Attendance attendance = new Attendance();
			attendance.setUserId(userId);
//			
			attendance.setEmployeeId(employeeId);
			if(t1!=null){
			attendance.setShowTime(t1);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t1);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t2!=null){
			attendance.setShowTime(t2);
			System.out.println("发送给服务器员工的Id "+employeeId);
			System.out.println("发送给服务器的时间 "+t2);
			AttendancelogicMQProducerUtil.sendAttendanceMessage(attendance);
			}
			if(t1==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date4);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
				
			
			}
			if(t2==null){
				
				Date createoneday=SIMPLE_DATE_FORMAT.parse(date4);
				CreateRecreationModel createrecreation =new CreateRecreationModel();
				createrecreation.setUserId(userId);
				createrecreation.setEmployeeId(employeeId);
				createrecreation.setStart(createoneday);
				createrecreation.setEnd(createoneday);
				AttendancelogicMQProducerUtil.sendCreateRecreationMessage(createrecreation);
				System.out.println("生成"+createoneday+"全天记录");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			ServiceJdbcDataSource_attendance.psclose(st);
			ServiceJdbcDataSource_attendance.connclose(conn);
			
			
		}		
	}	
	
//	public void attandanceCreate(int userId,int employeeId,Date t1,Date t2){
//		Connection conn=null;
//		PreparedStatement ps=null;
//		ResultSet rs=null;
//		
//		try{
//			
//			ServiceJdbcDataSource db =new ServiceJdbcDataSource();
//			conn=db.getConnection();
//			
//			String sql="insert into UNIUBI_ATTENDANCE40000(USER_ID,EMPLOYEE_ID,SHOW_TIME) values("+userId+","+employeeId+",?)"; 
//			
//			ps=conn.prepareStatement(sql);
//						
//		}
//				
//	}
	
	
	public void UpdateRule(int ruleId, int employeeId) throws Exception{
		Connection conn=null;
		Statement st =null;
//		ResultSet rs=null;
		
//		ServiceJdbcDataSource db=new ServiceJdbcDataSource();
		conn=ServiceJdbcDataSource.getInstance().getConnection();
		try{
			
			String sql = "update uniubi_employee2 set RULE_ID="+ruleId + " where ID="+ employeeId;
			st=conn.createStatement();
			st.executeUpdate(sql);
			if(ruleId==323){
				System.out.println("变更成四次打卡考勤规则");
			}if(ruleId==324){
				System.out.println("变更成六次打卡考勤规则");
			}if(ruleId==325){
				System.out.println("变更成一次打卡考勤规则");
			}if(ruleId==338){
				System.out.println("变更成常规打卡考勤规则");
			}if(ruleId==339){
				System.out.println("变更成弹性打卡考勤规则");
			}
			
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			
			ServiceJdbcDataSource.stclose(st);
			ServiceJdbcDataSource.connclose(conn);
		}
		
		
	}
		
		public void ProcedureCreate(Date e1, Date f1,int procedureid,int employeeid,int type) {
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			
//			ServiceJdbcDataSource_procedure db =new ServiceJdbcDataSource_procedure();
			conn=ServiceJdbcDataSource_procedure.getInstance().getConnection();
			
			try {
				
					String sql0="select * from uniubi_procedure193 where ID="+procedureid;
					ps=conn.prepareStatement(sql0);
					rs=ps.executeQuery();
				    
				
					if(rs.next()){
						String sql2="update uniubi_procedure193 set EMPLOYEE_ID=?,type= "+type+ " where ID="+procedureid;
						ps=conn.prepareStatement(sql2);
						ps.setInt(1,employeeid);
						ps.executeUpdate();
					}else{
						String sql1="insert into uniubi_procedure193(ID,USER_ID,EMPLOYEE_ID,APPROVER_ID,TYPE,STATE,CREATE_TIME,DEAL_TIME,START_TIME,END_TIME,REPAIR_TIME)values("+procedureid+",52,"+employeeid+",100000001,"+type+",2,'2016-08-19 20:32:00','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38')";
						ps=conn.prepareStatement(sql1);
						ps.executeUpdate();
					}
						
				
				
				String sql="update uniubi_procedure193 set START_TIME=?,END_TIME=?,STATE=2 where ID="+procedureid;
				if(e1!=null){
				ps=conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(e1.getTime()));
				ps.setTimestamp(2, new Timestamp(f1.getTime()));
				
				ps.executeUpdate();
				
				
				
				AttendancelogicMQProducerUtil.sendProcedureMessage(getProcedure(procedureid));//发送procedure 对象
				
				System.out.println("发送给服务器的请假类型：" +getProcedure(procedureid).getType());
				System.out.println( "员工ID： "  +employeeid+" 发送给服务器的请假时间  开始时间：" +getProcedure(procedureid).getStartTime()+ "结束时间：" +getProcedure(procedureid).getEndTime());
//				Thread.sleep(1000);
				}	
			}catch(Exception e){
				e.printStackTrace();
				
				
				
				
			}finally{
				
				ServiceJdbcDataSource_procedure.psclose(ps);
				ServiceJdbcDataSource_procedure.connclose(conn);
			}
			
			
			
			
			
		}
		
		public void OutworkCreate(Date e1, Date f1,int procedureid,int employeeid,int type) {
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			
//			ServiceJdbcDataSource_procedure db =new ServiceJdbcDataSource_procedure();
			conn=ServiceJdbcDataSource_procedure.getInstance().getConnection();
			
			try {
				
				
				String sql0="select * from uniubi_procedure193 where ID="+procedureid;
				ps=conn.prepareStatement(sql0);
				rs=ps.executeQuery();
				if(rs.next()){
					String sql2="update uniubi_procedure193 set EMPLOYEE_ID=? where ID="+procedureid;
					ps=conn.prepareStatement(sql2);
					ps.setInt(1,employeeid);
					
					
					ps.executeUpdate();
				}else{
					String sql1="insert into uniubi_procedure193(ID,USER_ID,EMPLOYEE_ID,APPROVER_ID,TYPE,STATE,CREATE_TIME,DEAL_TIME,START_TIME,END_TIME,REPAIR_TIME)values("+procedureid+",52,"+employeeid+",100000001,"+type+",2,'2016-08-19 20:32:00','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38')";
					ps=conn.prepareStatement(sql1);
					ps.executeUpdate();
				}
					
				String sql="update uniubi_procedure193 set START_TIME=?,END_TIME=?,STATE=2 where ID="+procedureid;
				if(e1!=null){
				ps=conn.prepareStatement(sql);
				ps.setTimestamp(1, new Timestamp(e1.getTime()));
				ps.setTimestamp(2, new Timestamp(f1.getTime()));
				
				ps.executeUpdate();
				
				
				
				AttendancelogicMQProducerUtil.sendProcedureMessage(getProcedure(procedureid));//发送procedure 对象
				System.out.println("发送给服务器的请假类型：" +getProcedure(procedureid).getType());
				System.out.println("发送给服务器的请假时间  开始时间：" +getProcedure(procedureid).getStartTime()+ "结束时间：" +getProcedure(procedureid).getEndTime());
//				System.out.println("发送给服务器的请假时间  开始时间：" +getProcedure(procedureid).getRepairTime());
//				Thread.sleep(1000);
				}
			}catch(Exception e){
				e.printStackTrace();
				
				
				
				
			}finally{
				
				ServiceJdbcDataSource_procedure.psclose(ps);
				ServiceJdbcDataSource_procedure.connclose(conn);
			}
			
			
			
			
			
		}
		
		
		public void RepairCreateNoattendance(Date r1,int procedureid,int employeeId) {
			Connection conn=null;
			PreparedStatement ps=null;
			ResultSet rs=null;
			
//			ServiceJdbcDataSource_procedure db =new ServiceJdbcDataSource_procedure();
			conn=ServiceJdbcDataSource_procedure.getInstance().getConnection();
			
			try {
				
				String sql0="select * from uniubi_procedure193 where ID="+procedureid;
				ps=conn.prepareStatement(sql0);
				rs=ps.executeQuery();
				if(rs.next()){
					String sql2="update uniubi_procedure193 set EMPLOYEE_ID=? ,REPAIR_TIME=? ,type=5 where ID="+procedureid;
					ps=conn.prepareStatement(sql2);
					
					ps.setInt(1,employeeId);
					ps.setTimestamp(2, new Timestamp(r1.getTime()));
					ps.executeUpdate();
				}else{
					String sql1="insert into uniubi_procedure193(ID,USER_ID,EMPLOYEE_ID,APPROVER_ID,TYPE,STATE,CREATE_TIME,DEAL_TIME,START_TIME,END_TIME,REPAIR_TIME)values("+procedureid+",52,"+employeeId+",100000001,"+5+",2,'2016-08-19 20:32:00','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38',?)";
//					String sql1="insert into uniubi_procedure193(ID,USER_ID,EMPLOYEE_ID,APPROVER_ID,TYPE,STATE,CREATE_TIME,DEAL_TIME,START_TIME,END_TIME,REPAIR_TIME)values("+procedureid+",52,"+employeeId+",100000001,"+type+",2,'2016-08-19 20:32:00','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38','2017-03-31 20:17:38')";
					ps=conn.prepareStatement(sql1);
					ps.setTimestamp(1, new Timestamp(r1.getTime()));
					ps.executeUpdate();
				}
				
				
				
//				if(r1!=null){
//				ps=conn.prepareStatement(sql1);
//				ps.setTimestamp(1, new Timestamp(r1.getTime()));
//				
//				
//				ps.executeUpdate();
//				
//				
//				}
				
				
			}catch(Exception e){
				e.printStackTrace();
				
				
				
				
			}finally{
				
				ServiceJdbcDataSource_procedure.psclose(ps);
				ServiceJdbcDataSource_procedure.connclose(conn);
			}
			
			
			
			
			
		}
		
		public void RepairCreate(Date r1,int procedureid,int employeeId) {
			if(r1!=null){
			RepairCreateNoattendance(r1,procedureid,employeeId);
			Connection conn=null;
			PreparedStatement ps=null;		
			
			try{
				conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
				String sql ="insert into UNIUBI_ATTENDANCE40000(USER_ID,EMPLOYEE_ID,SHOW_TIME) values( "+getProcedure(procedureid).getUserid()+","+getProcedure(procedureid).getEmployeeid()+",?)";
				if(r1!=null){
					ps=conn.prepareStatement(sql);
				
				ps.setTimestamp(1,new Timestamp(r1.getTime()));
				ps.executeUpdate();
				System.out.println("数据库插入成功");
				AttendancelogicMQProducerUtil.sendProcedureMessage(getProcedure(procedureid));//发送procedure 对象
				System.out.println("发送给服务器的请假类型：" +getProcedure(procedureid).getType());
				System.out.println("发送给服务器的请假时间  开始时间：" +getProcedure(procedureid).getRepairTime());
				}
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				ServiceJdbcDataSource_attendance.psclose(ps);
				ServiceJdbcDataSource_attendance.connclose(conn);
			}
			}
			
		}
		
		
	public Procedure getProcedure(int procedureid){
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Procedure procedure=null;
		
		
//			ServiceJdbcDataSource_procedure db=new ServiceJdbcDataSource_procedure();
			conn=ServiceJdbcDataSource_procedure.getInstance().getConnection();
		try{
			String sql="select * from uniubi_procedure193 where id ="+procedureid;
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			if(rs.next()){
				procedure=new Procedure();
				procedure.setId(rs.getInt("ID"));
				procedure.setUserId(rs.getInt("USER_ID"));
				procedure.setEmployeeId(rs.getInt("EMPLOYEE_ID"));
				procedure.setType(rs.getByte("Type"));
				procedure.setState(rs.getByte("STATE"));
				procedure.setStartTime(rs.getTimestamp("START_TIME"));
				procedure.setEndTime(rs.getTimestamp("END_TIME"));
				procedure.setRepairTime(rs.getTimestamp("REPAIR_TIME"));
				
			
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				
				ServiceJdbcDataSource_procedure.psclose(ps);
				ServiceJdbcDataSource_procedure.connclose(conn);
				
			}
			
			return procedure;
		
			
		
		
		
		
		
	}
	
	
	public EmployeeDay getEmployeeDay(int userId,int employeeId,Date day,int type){
		EmployeeDay employee=null;
		int i=1;
		try{
			
			
			while (getEmployeeDayall(userId,employeeId,day,type)==null){
				
				Thread.sleep(1000);
				System.out.println("耐心等待记录生成，已等待" +i+"秒");
				i++;				
				if(i==10){
					System.out.println("数据没有生成，可能是考勤逻辑崩溃了,可以咨询徐宇杰");
					break;
				
				}
					
			}
			
			Thread.sleep(6000);
			employee=getEmployeeDayall(userId,employeeId,day,type);
//			Thread.sleep(3000);		
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return employee;
		}
		
		
	

	
	
	
	
	public EmployeeDay getEmployeeDayall(int userId,int employeeId,Date day,int type){
		
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		 EmployeeDay employeeDay=null;
		
		try{
//			ServiceJdbcDataSource_attendance db =new ServiceJdbcDataSource_attendance();
			conn=ServiceJdbcDataSource_attendance.getInstance().getConnection();
			String sql="select * from UNIUBI_EMPLOYEE_DAY0 where USER_ID="+userId+" and employee_id="+employeeId+" and type="+type+ " and day=?";
//			System.out.println(sql);
//			System.out.println(sql);
			ps=conn.prepareStatement(sql);
			ps.setTimestamp(1, new Timestamp(day.getTime()));
			//System.out.println(sql);
			rs=ps.executeQuery();
			if(rs.next()){
				 employeeDay = new EmployeeDay();
				
				 employeeDay.setId(rs.getInt("ID"));
			
				 employeeDay.setUserid(rs.getInt("USER_ID"));
				 employeeDay.setEmployeeid(rs.getInt("EMPLOYEE_ID"));
				 employeeDay.setDelay(rs.getByte("DELAY"));
				 employeeDay.setDelayDur(rs.getInt("DELAY_DUR"));
				 employeeDay.setLeaveOff(rs.getByte("LEAVE_OFF"));
				 employeeDay.setLeaveStart(rs.getTimestamp("LEAVE_START"));
				 employeeDay.setLeaveEnd(rs.getTimestamp("LEAVE_END"));
				 employeeDay.setSickLeave(rs.getByte("SICK_LEAVE"));
				 employeeDay.setSickLeaveStart(rs.getTimestamp("SICK_LEAVE_START"));
				 employeeDay.setSickLeaveEnd(rs.getTimestamp("SICK_LEAVE_END"));
				 employeeDay.setSickLeaveDur(rs.getInt("SICK_LEAVE_DUR"));
				 employeeDay.setIssueLeave(rs.getByte("ISSUE_LEAVE"));
				 employeeDay.setIssueLeaveStart(rs.getTimestamp("ISSUE_LEAVE_START"));
				 employeeDay.setIssueLeaveEnd(rs.getTimestamp("ISSUE_LEAVE_END"));
				 employeeDay.setIssueLeaveDur(rs.getInt("ISSUE_LEAVE_DUR"));
				 employeeDay.setAnnualLeave(rs.getByte("ANNUAL_LEAVE"));
				 employeeDay.setAnnualLeaveStart(rs.getTimestamp("ANNUAL_LEAVE_START"));
				 employeeDay.setAnnualLeaveEnd(rs.getTimestamp("ANNUAL_LEAVE_END"));
				 employeeDay.setAnnualLeaveDur(rs.getInt("ANNUAL_LEAVE_DUR"));
				 employeeDay.setMaternityLeave(rs.getByte("MATERNITY_LEAVE"));
				 employeeDay.setMaternityLeaveStart(rs.getTimestamp("MATERNITY_LEAVE_START"));
				 employeeDay.setMaternityLeaveEnd(rs.getTimestamp("MATERNITY_LEAVE_END"));
				 employeeDay.setMaternityLeaveDur(rs.getInt("MATERNITY_LEAVE_DUR"));
				 employeeDay.setOtherLeave(rs.getByte("OTHER_LEAVE"));
				 employeeDay.setOtherLeaveStart(rs.getTimestamp("OTHER_LEAVE_START"));
				 employeeDay.setOtherLeaveEnd(rs.getTimestamp("OTHER_LEAVE_END"));
				 employeeDay.setOtherLeaveDur(rs.getInt("OTHER_LEAVE_DUR"));
				 employeeDay.setLeaveEarly(rs.getByte("LEAVE_EARLY"));
				 employeeDay.setLeaveDur(rs.getInt("LEAVE_EARLY_DUR"));
				 employeeDay.setWorkShow(rs.getByte("WORK_SHOW"));
				 employeeDay.setWorkDur(rs.getInt("WORK_DUR"));
				 employeeDay.setNoShow(rs.getByte("NO_SHOW"));
				 employeeDay.setOutWork(rs.getByte("OUT_WORK"));
				 employeeDay.setDay(rs.getTimestamp("DAY"));
				 employeeDay.setFirstTime(rs.getTimestamp("FIRST_TIME"));
				 employeeDay.setLastTime(rs.getTimestamp("LAST_TIME"));
				 employeeDay.setType(rs.getInt("Type"));
				 employeeDay.setdaytype(rs.getInt("DAY_TYPE"));//0默认，是以前的数据，1：工作，2：休息。
//				 employeeDay.setAllLeaveDur(rs.getInt("LEAVE_DUR"));			
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
			
			
		}finally{
			
			ServiceJdbcDataSource_attendance.psclose(ps);
			ServiceJdbcDataSource_attendance.rsclose(rs);
			ServiceJdbcDataSource_attendance.connclose(conn);
		}
			
	    return employeeDay;
			
			
	}


			
		
		
		
		
		
		
		
		
	
	
}