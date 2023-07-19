package emailClient;

import java.io.IOException;
import java.util.Date;

public class Office_friend extends recipientObjects{
	public Office_friend() {
		
	}

	private String name;
    private String email;
    private String designation;
    private String birthday;
	public Office_friend(String name, String email, String designation, String birthday) {
		this.name=name;
		this.email=email;
		this.designation=designation;
		this.birthday= birthday;
		
	}
	



	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


}
