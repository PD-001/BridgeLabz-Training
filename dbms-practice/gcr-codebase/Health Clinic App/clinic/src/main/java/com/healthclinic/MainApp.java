package com.healthclinic;

import com.healthclinic.dao.*;
import com.healthclinic.model.*;
import com.healthclinic.utils.DBConnection;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.Date;

public class MainApp{

	public static void main(String[] args){

		try(Connection conn= DBConnection.getConnection()){

			System.out.println("Connected to Database Successfully!");

			PatientDAO patientDAO= new PatientDAO();
			DoctorDAO doctorDAO= new DoctorDAO();
			AppointmentDAO appointmentDAO= new AppointmentDAO();
			VisitDAO visitDAO= new VisitDAO();
			BillDAO billDAO= new BillDAO();

			Patient patient= new Patient();
			patient.setName("Anubhav Kumar");
			patient.setDob(Date.valueOf("2001-08-21"));
			patient.setPhone("9876543210");
			patient.setEmail("anubhav@email.com");
			patient.setAddress("Kanpur, UP");
			patient.setBloodGroup("O+");

			patientDAO.addPatient(patient);

			Doctor doctor= new Doctor();
			doctor.setName("Dr. Prakash");
			doctor.setSpecialty("Gastroenterology");
			doctor.setPhone("9123456789");
			doctor.setConsultationFee(600.00);

			doctorDAO.addDoctor(doctor);

			Appointment appointment= new Appointment();
			appointment.setPatientId(1);
			appointment.setDoctorId(1);
			appointment.setAppointmentDate(Timestamp.valueOf("2026-03-05 11:30:00"));

			appointmentDAO.bookAppointment(appointment);

			Visit visit= new Visit();
			visit.setAppointmentId(1);
			visit.setDiagnosis("Mild stomach pain");
			visit.setBillAmount(600.00);

			visitDAO.recordVisit(visit);

			billDAO.generateBill(1, 600.00);

			System.out.println("Test Flow Executed Successfully!");

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}