//package com.fab_alley.generic;
//
//import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//
//import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.Email;
//import org.apache.commons.mail.EmailAttachment;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.MultiPartEmail;
//import org.apache.commons.mail.SimpleEmail;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import com.fab_alley.generic.ExcelUtils;
//
//public class SendEmail {
//	
//	//=========== Simple Mail for Text ======================//
//
////	public static void sendEmail(Boolean istrue) throws EmailException {
////		Email email = new SimpleEmail();
////		email.setHostName("smtp.gmail.com");
////		email.setSmtpPort(465);
////		email.setAuthenticator(new DefaultAuthenticator("anuptesterqa@gmail.com", "Anupkumar@1195"));
////		email.setSSLOnConnect(true);
////		if(istrue)
////		{
////			email.addTo("anupkumar505@gmail.com");
////		}
////		else
////		{
////			email.addTo("avinash@faballey.com");
////		}
////		email.setFrom("anup@faballey.com");
////		email.setSubject("Selenium Test Report");
////		email.setMsg("This is a selenium test report");
////		email.send();
////	}
//	
//	
//	
//	//===========  Mail with attachment  ======================//
//	
//	
////	public static void sendEmail(Boolean istrue) throws EmailException, InvalidFormatException {
////		
////	// Create the attachment
////		
////	  EmailAttachment attachment = new EmailAttachment();
////	  attachment.setPath(".\\test-output\\emailable-report.html");
////	 // attachment.setPath(".\\test-output\\Final.html");
////	  attachment.setDisposition(EmailAttachment.ATTACHMENT);
////	  attachment.setDescription("Test Result");
////	  attachment.setName("Anup");
////
////	  EmailAttachment attachment1 = new EmailAttachment();
////	  //attachment.setPath(".\\test-output\\emailable-report.html");
////	  attachment1.setPath(".\\test-output\\Final.html");
////	  attachment1.setDisposition(EmailAttachment.ATTACHMENT);
////	  attachment1.setDescription("Test Result");
////	  attachment1.setName("Anup");
////	 // Create the email message
////	  
////	  MultiPartEmail email = new MultiPartEmail();
////	  email.setHostName("smtp.gmail.com");
////	  email.setSmtpPort(465);
////	  email.setSSLOnConnect(true);
//////	  String username=ExcelUtils.readData(VConstants.emailfrom);
//////	  String password=ExcelUtils.readData("Mail", 1,1);
////	  email.setAuthenticator(new DefaultAuthenticator(VConstants.emailfrom, VConstants.emailfrompsw));
////	  if(istrue)
////			{
////		  		//String emailto=ExcelUtils.readData("Mail",1,2);
////				email.addTo(VConstants.emailto1);
//////				 String emailcc1=ExcelUtils.readData("Mail", 1, 3);
//////				 email.addCc(emailcc1);
//////				 String emailcc2=ExcelUtils.readData("Mail", 2, 3);
//////				 email.addCc(emailcc2);
////			}
////			else
////			{
////				//String emailto=ExcelUtils.readData("Mail",1,2);
////				//String emailto1=ExcelUtils.readData("Mail",2,3);
////				//String emailto2=ExcelUtils.readData("Mail",1,4);
////				//String emailto3=ExcelUtils.readData("Mail",2,3);
////				email.addTo(VConstants.emailto1);
////				//email.addTo(emailto1);
////				//email.addTo(emailto2);
//////				 String emailcc1=ExcelUtils.readData("Mail", 1, 3);
//////				 email.addCc(emailcc1);
//////				 String emailcc2=ExcelUtils.readData("Mail", 2, 3);
//////				 email.addCc(emailcc2);
////				//email.addCc("anupkumar20july@gmail.com");
////			}
////	  
////	  LocalDateTime current = LocalDateTime.now();
////     // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:");
////      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
////      String formatted = current.format(formatter);
////	  email.setFrom("anup@faballey","FabAlley Automation Report");
////	  //String subject=ExcelUtils.readData("Mail",1,4);
////	  email.setSubject(VConstants.emailsubject + "\t" + formatted);
////	// String msg=ExcelUtils.readData("Mail",1,5);
////	  email.setMsg(VConstants.emailcontent);
////
////	  // add the attachment
////	  email.attach(attachment);
////	  email.attach(attachment1);
////
////	  // send the email
////	  email.send();
////}
//}