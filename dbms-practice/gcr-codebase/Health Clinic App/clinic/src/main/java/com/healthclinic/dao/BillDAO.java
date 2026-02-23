package com.healthclinic.dao;

import com.healthclinic.utils.DBConnection;

import java.sql.*;

public class BillDAO{
	
	public void generateBill(int visitId, double totalAmount) throws SQLException{
		
		String sql= "insert into bills(visit_id, total_amount) values(?,?)";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setInt(1, visitId);
			ps.setDouble(2, totalAmount);
			ps.executeUpdate();
		}
	}
	
	public void recordPayment(int billId, String mode) throws SQLException{
		
		String sql= "update bills set payment_status='PAID', payment_date=now(), payment_mode=? where bill_id=?";
		
		try(Connection conn= DBConnection.getConnection()){
			
			conn.setAutoCommit(false);
			
			try(PreparedStatement ps= conn.prepareStatement(sql)){
				
				ps.setString(1, mode);
				ps.setInt(2, billId);
				
				ps.executeUpdate();
				conn.commit();
			}
			catch(Exception e){
				conn.rollback();
				throw e;
			}
		}
	}
	
	public void getOutstandingBills() throws SQLException{
		
		String sql= """
				select b.bill_id, p.name, b.total_amount
				from bills b
				join visits v on b.visit_id = v.visit_id
				join appointments a on v.appointment_id = a.appointment_id
				join patients p on a.patient_id = p.patient_id
				where b.payment_status='UNPAID'
				""";
		
		try(Connection conn= DBConnection.getConnection();
			Statement stmt= conn.createStatement();
			ResultSet rs= stmt.executeQuery(sql)){
			
			while(rs.next()){
				
				System.out.println(
						"Bill ID: "+rs.getInt("bill_id")+
						", Patient: "+rs.getString("name")+
						", Amount: "+rs.getDouble("total_amount")
				);
			}
		}
	}
	
	public double getRevenueReport(Date start, Date end) throws SQLException{
		
		String sql= "select sum(total_amount) from bills where payment_status='PAID' and payment_date between ? and ?";
		
		try(Connection conn= DBConnection.getConnection();
			PreparedStatement ps= conn.prepareStatement(sql)){
			
			ps.setDate(1, start);
			ps.setDate(2, end);
			
			ResultSet rs= ps.executeQuery();
			rs.next();
			
			return rs.getDouble(1);
		}
	}
	
}