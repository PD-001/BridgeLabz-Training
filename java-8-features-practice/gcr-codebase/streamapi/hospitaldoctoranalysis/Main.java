package streamapi.hospitaldoctoranalysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Doctor{
	
	private String name;
	private boolean weekendAvailability;
	private String speciality;
	
	public Doctor(String name, boolean weekendAvailability, String speciality) {
		this.name= name;
		this.weekendAvailability= weekendAvailability;
		this.speciality= speciality;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}

	public boolean isWeekendAvailability() {
		return weekendAvailability;
	}
	public void setWeekendAvailability(boolean weekendAvailability) {
		this.weekendAvailability= weekendAvailability;
	}

	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality= speciality;
	}

	@Override
	public String toString() {
		return "Name: "+ name +" -Spciality: "+ speciality;
	}
	
		
}

public class Main {
	public static void main(String[] args) {
		List<Doctor> doctors= new ArrayList<Doctor>(
				Arrays.asList(
							new Doctor("Prakash", true, "Neuro"),
							new Doctor("Pushpak", true, "Gastric"),
							new Doctor("Anubhav", false, "Gyno"),
							new Doctor("Sahil", false, "Oestophysicist"),
							new Doctor("Divanshu", true, "Pediatrician")							
						)
				);
		
		doctors.stream()
		.filter(d->d.isWeekendAvailability()==true)
		.sorted(Comparator.comparing(Doctor::getSpeciality))
		.forEach(System.out::println);		
	}
}
