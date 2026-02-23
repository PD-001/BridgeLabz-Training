package com.healthclinic.dao;

import com.healthclinic.model.Visit;
import com.healthclinic.utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VisitDAO {
	
	public void recordVisit(Visit visit) throws SQLException{
		
		String insertVisitSQL= "insert into visits (appointment_id, diagnosis, bill_amount) values (?, ?, ?)";
		
		String updateAppointmentSQL= "update appointments set status='completed' where appointment_id=?";
		
		try(Connection conn= DBConnection.getConnection()){
			
			conn.setAutoCommit(false);
			
			try(
				PreparedStatement insertStmt= conn.prepareStatement(insertVisitSQL);
				PreparedStatement updateStmt= conn.prepareStatement(updateAppointmentSQL)
			){
				
				insertStmt.setInt(1, visit.getAppointmentId());
				insertStmt.setString(2, visit.getDiagnosis());
				insertStmt.setDouble(3, visit.getBillAmount());
				
				insertStmt.executeUpdate();
				
				updateStmt.setInt(1, visit.getAppointmentId());
				updateStmt.executeUpdate();
				
				conn.commit();
				
				System.out.println("Visit recorded successfully & appointment completed!");
			}
			catch(Exception e){
				
				conn.rollback();
				System.out.println("Transaction Failed. Rolled Back.");
				throw e;
			}
		}
	}
	
}