package emailClient;

import java.io.Serializable;
import java.util.ArrayList;

public class SendMails extends emailClient{
	private String str;
	
	
	public SendMails(String send_email) throws Exception {
		str=send_email;
		method();
	}
	public SendMails() {
		}
	private void method() throws Exception {
		String[] parts = str.split(",");
		String emailaddress = parts[0]; 
        String subject = parts[1];
        String content = parts[2];
        JavaMail javamail = new JavaMail(emailaddress,subject,content);
        
        //create a mail object
        mail Mail = new mail(emailaddress,subject,content);
        arr.add(Mail); // add all the mail objects to the array to store data of all the mails send on today.
        //System.out.println(arr.size());
        
        
	}
	public void print() {
		System.out.println("Mail sent successfully");
	}
		

}
