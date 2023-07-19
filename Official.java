package emailClient;

public class Official {

	public Official() {
		
		
	}
	public Official(String name, String email, String designation) {
		this.name =name;
		this.email =email;
		this.designation =designation;
	}
	private String name;
	private String email;
    private String designation;

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

    @Override
    public String toString() {
        return "OfficialRecipient{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    
}
