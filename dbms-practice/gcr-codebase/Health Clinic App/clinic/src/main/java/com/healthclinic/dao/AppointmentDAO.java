package com.healthclinic.dao;

import com.healthclinic.model.Appointment;
import com.healthclinic.utils.DBConnection;

import java.sql.*;

public class AppointmentDAO {
	
	public void bookAppointment(Appointment appointment) throws SQLException{
		
		String sql= "insert into appointments(patient_id, doctor_id, appointment_date, status) values(?,?,?,?)";
		
		try(Connection conn= DBConnection.getConnection()){
			
			conn.setAutoCommit(false);
			
			try(PreparedStatement ps= conn.prepareStatement(sql)){
				
				ps.setInt(1, appointment.getPatientId());
				ps.setInt(2, appointment.getDoctorId());
				ps.setTimestamp(3, appointment.getAppointmentDate());
				ps.setString(4, "scheduled");
				
				ps.executeUpdate();
				
				conn.commit();
			}
			catch(Exception e){
				conn.rollback();
				throw e;
			}
		}
	}
	
	public boolean checkAvailability(int doctorId, Timestamp dateTime) throws SQLException{
		
		String sql= "select count(*) from appointments where doctor_id=? and appointment_date=? and status='scheduled'";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setInt(1, doctorId);
			ps.setTimestamp(2, dateTime);
			
			ResultSet rs= ps.executeQuery();
			rs.next();
			
			return rs.getInt(1)==0;
		}
	}
	
	public void cancelAppointment(int appointmentId) throws SQLException{
		
		String sql= "update appointments set status='cancelled' where appointment_id=?";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setInt(1, appointmentId);
			ps.executeUpdate();
		}
	}
	
	public void getDailySchedule(Date date) throws SQLException{
		
		String sql= """
				select a.appointment_id, p.name as patient_name,
				       d.name as doctor_name, a.appointment_date
				from appointments a
				join patients p on a.patient_id = p.patient_id
				join doctors d on a.doctor_id = d.doctor_id
				where date(a.appointment_date) = ?
				order by a.appointment_date
				""";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setDate(1, date);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()){
				
				System.out.println(
						rs.getTimestamp("appointment_date")+
						" - Patient: "+rs.getString("patient_name")+
						", Doctor: "+rs.getString("doctor_name")
				);
			}
		}
	}
	
}