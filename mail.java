package emailClient;

import java.io.Serializable;

public class mail implements Serializable{
	private String emailaddress;
	private String subject;
	private String content;
	
	public mail(String emailaddress,String subject,String content) {
		this.emailaddress =emailaddress;
		this.subject= subject;
		this.content= content;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	

	
}
