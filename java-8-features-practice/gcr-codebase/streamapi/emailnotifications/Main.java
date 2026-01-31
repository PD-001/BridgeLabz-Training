package streamapi.emailnotifications;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Email{
	
	private String subject;
	private String body;

	public Email(String subject, String body) {
		super();
		this.subject= subject;
		this.body= body;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject= subject;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body= body;
	}

	@Override
	public String toString() {
		return "Email subject=" + subject + ", body=" + body ;
	}
	
}

public class Main {
	public static void main(String[] args) {
		List<Email> emails= new ArrayList<>(
				Arrays.asList(
							new Email("Important","important stuff"),
							new Email("Public","announcement"),							
							new Email("Private","photos")
						)
				);
		
		emails.stream().forEach(email->sendEmailNotification(email));
		
	}
	
	public static void sendEmailNotification(Email email) {
		System.out.println(email.toString());
	}
}
