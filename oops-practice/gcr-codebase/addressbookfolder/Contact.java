package addressbookfolder;

import java.util.Objects;

public class Contact {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;
	
	public Contact() {
		this("first_name_not_set","second_name_not_set","address_not_set","city_not_set","state_not_set","00000","000000000","email_not_set");
	}
	
	public Contact(String firstName, String lastNmae, String address, String city, String state, String zip ,String phoneNumber, String email) {
		setFirstName(firstName);
		setLastName(lastNmae);
		setAddress(address);
		setCity(city);
		setState(state);
		setZip(zip);
		setPhoneNumber(phoneNumber);
		setEmail(email);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Name:"+ getFirstName() +" "+ getLastName() 
		+"\nAddress:"+ getAddress() 
		+"\nCity:"+ getCity() 
		+"\nState:"+ getState() 
		+"\nZip:"+ getZip() 
		+"\nPhone Number:"+ getPhoneNumber() 
		+"\nEmail:"+ getEmail();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this== obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Contact other= (Contact) obj;
		
		return firstName.equalsIgnoreCase(other.firstName) && lastName.equalsIgnoreCase(other.lastName);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstName.toLowerCase(), lastName.toLowerCase());
	}
	
}
