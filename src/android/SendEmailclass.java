package android;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailclass {

	public static void sendEmail(Boolean istrue) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("anuptesterqa@gmail.com", "Anupkumar@1195"));
		email.setSSLOnConnect(true);
		if(istrue)
		{
			email.addTo("anupkumar505@gmail.com");
		}
		else
		{
			email.addTo("avinash@faballey.com");
		}
		email.setFrom("anup@faballey.com");
		email.setSubject("Selenium Test Report");
		email.setMsg("This is a selenium test report");
		email.send();
	}
}
//	public static void sendEmail22(Boolean istrue) throws EmailException {
//	// Create the attachment
//	
//	  EmailAttachment attachment = new EmailAttachment();
//	  attachment.setPath(".\\test-output\\emailable-report.html");
//	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
//	  attachment.setDescription("Test Result");
//	  attachment.setName("Anup");
//
//	  // Create the email message
//	  MultiPartEmail email = new MultiPartEmail();
//	  email.setHostName("smtp.gmail.com");
//	  email.setSmtpPort(587);
////	  email.setSSLOnConnect(true);
//	  email.setAuthenticator(new DefaultAuthenticator("anup@faballey.com", "Anupkumar@123"));
//	  if(istrue)
//			{
//				email.addTo("anupkumar505@gmail.com","Anup Kumar");
//			}
//			else
//			{
//				email.addTo("anup@faballey.com","Anup Kumar");
//			}
//	  //email.addTo("anupkumar505@gmail.com", "Anup Kumar");
//	  email.setFrom("anup@faballey.com", "Anupkumar@123");
//	  email.setSubject("The picture");
//	  email.setMsg("Selenium test report");
//
//	  // add the attachment
//	  email.attach(attachment);
//
//	  // send the email
//	  email.send();
//}
//}