package emailClient;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {
	private String recievers_emailaddress;
	private static String subject;
	private static String content;
	public JavaMail(String emailaddress, String subject, String content) throws Exception {
		recievers_emailaddress =emailaddress;
		this.subject =subject;
		this.content =content;
		sendMail(recievers_emailaddress);
	}
	
	private static void sendMail(String recepient) throws Exception{
		//System.out.println("Preparing to send mail");
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth","true");
		properties.put("mail.smtp.starttls.enable","true");
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		
		String myAccountEmail=".........@gmail.com"; //give the email address
		String password ="..........";   //give the password
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(myAccountEmail,password);
			}
		});
		Message message = prepareMessage(session,myAccountEmail,recepient);
		Transport.send(message);
		//System.out.println("Message sent successfully");
	}

	private static Message prepareMessage(Session session, String myAccountEmail, String recepient) {
		try {
			Message message =new MimeMessage(session);
			message.setFrom(new InternetAddress(myAccountEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject(subject);
			//message.setSubject("first java program");
			message.setText(content);
			//message.setText("ravini did great");
			return message;
		}catch (Exception ex) {
			Logger.getLogger(JavaMail.class.getName()).log(Level.SEVERE,null,ex);
		}
		
		return null;
	}

}
