package emailClient;

import java.util.Date;

public class Personal {
	private String email;
    private String nickName;
    private String birthday;
    private String name;
    
	public Personal() {
		//System.out.println("Personal:");
	}
	public Personal(String name, String nickName, String email, String birthday) {
		this.name=name;
		this.nickName=nickName;
		this.email=email;
		this.birthday=birthday;
		
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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    

    @Override
    public String toString() {
        return "PersonalRecipient{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", nickName='" + nickName + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
