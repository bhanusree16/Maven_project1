package gmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class not_working_Email_sent {

	public static void main(String[] args) throws EmailException {
		
		System.out.println("======started======");
		Email email = new SimpleEmail();
		email.setHostName("smtp.google.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("smilybhanu62@gmail.com", "de3mo123"));
		email.setSSLOnConnect(true);
		email.setFrom("jaganmail03@gmail.com");
		email.setSubject("TestMail");
		email.setMsg("This is a test mail ... :-)");
		email.addTo("sareddy.bhanu2@gmail.com");
		email.send();
		System.out.println("=======email sent=======");

	}

}
