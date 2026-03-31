package com.healthclinic.dao;

import com.healthclinic.model.Doctor;
import com.healthclinic.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DoctorDAO {
	
	public void addDoctor(Doctor doctor) throws SQLException{
		
		String sql= "insert into doctors(name, specialty, phone, consultation_fee, is_active) values(?,?,?,?,?)";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setString(1, doctor.getName());
			ps.setString(2, doctor.getSpecialty());
			ps.setString(3, doctor.getPhone());
			ps.setDouble(4, doctor.getConsultationFee());
			ps.setBoolean(5, doctor.isActive());
			
			ps.executeUpdate();
		}
	}
	
	public List<Doctor> getAllDoctors() throws SQLException{
		
		List<Doctor> list= new ArrayList<>();
		String sql= "select * from doctors where is_active=true";
		
		try(Connection conn= DBConnection.getConnection();
			Statement stmt= conn.createStatement();
			ResultSet rs= stmt.executeQuery(sql)){
			
			while(rs.next()){
				
				Doctor d= new Doctor();
				d.setDoctorId(rs.getInt("doctor_id"));
				d.setName(rs.getString("name"));
				d.setSpecialty(rs.getString("specialty"));
				d.setPhone(rs.getString("phone"));
				d.setConsultationFee(rs.getDouble("consultation_fee"));
				d.setActive(rs.getBoolean("is_active"));
				
				list.add(d);
			}
		}
		return list;
	}
	
	public List<Doctor> getDoctorsBySpecialty(String specialty) throws SQLException{
		
		List<Doctor> list= new ArrayList<>();
		String sql= "select * from doctors where specialty=? and is_active=true";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setString(1, specialty);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()){
				
				Doctor d= new Doctor();
				d.setDoctorId(rs.getInt("doctor_id"));
				d.setName(rs.getString("name"));
				d.setSpecialty(rs.getString("specialty"));
				d.setPhone(rs.getString("phone"));
				d.setConsultationFee(rs.getDouble("consultation_fee"));
				d.setActive(rs.getBoolean("is_active"));
				
				list.add(d);
			}
		}
		return list;
	}
	
	public void deactivateDoctor(int doctorId) throws SQLException{
		
		String checkSql= "select count(*) from appointments where doctor_id=? and status='scheduled'";
		String updateSql= "update doctors set is_active=false where doctor_id=?";
		
		try(Connection conn= DBConnection.getConnection()){
			
			PreparedStatement check= conn.prepareStatement(checkSql);
			check.setInt(1, doctorId);
			ResultSet rs= check.executeQuery();
			rs.next();
			
			if(rs.getInt(1)>0){
				System.out.println("Doctor has future appointments. Cannot be deactivated.");
				return;
			}
			
			PreparedStatement update= conn.prepareStatement(updateSql);
			update.setInt(1, doctorId);
			update.executeUpdate();
			
			System.out.println("Doctor deactivated successfully.");
		}
	}
	
}