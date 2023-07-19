package emailClient;
import java.io.FileWriter;
import java.io.IOException;  

public class NewRecipientFactory extends file{
	private String str;
	
 
	public NewRecipientFactory(String str) throws IOException {
		this.str=str;
		
	}

	
	public void method() throws IOException {
		try {
		String[] parts = str.split("\\s+");
		String part1 = parts[0]; 
        String part2 = parts[1];
        file f = new file(); //add to the file
        f.write(part2);
		}catch(Exception e) {
			System.out.println("Invalid form of inputs");
		}
		System.out.println("new recipient successfully added");
		/*if(part1.equalsIgnoreCase("Official:")) {
       	 //System.out.println("Official:");
       	 getOfficial();
        }else if(part1.equalsIgnoreCase("Personal:")) {
       	 //System.out.println("Personal:");
         getPersonal();
        }else if(part1.equalsIgnoreCase("Office_friend:")){
       	 //System.out.println("Office_friend:");
       	 getOffice_friend();
        }else {
       	 System.out.println("invalid input");
        }   */
	}
	
	public Official getOfficial() {
		return new Official();
	}
	public Personal getPersonal() {
		return new Personal();
	}
	public Office_friend getOffice_friend() {
		return new Office_friend();
	}

}
