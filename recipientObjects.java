package emailClient;

import java.io.IOException;
import java.util.ArrayList;

public class recipientObjects { //maintain object for each recipient in the application
	private ArrayList<String> email_recipeints;
	private ArrayList<Object> recipientObjectArr = new ArrayList<Object>();
	/**
	 * @return the recipientObjectArr
	 */
	public ArrayList<Object> getRecipientObjectArr() {
		return recipientObjectArr;
	}
	/**
	 * @param recipientObjectArr the recipientObjectArr to set
	 */
	public void setRecipientObjectArr(ArrayList<Object> recipientObjectArr) {
		this.recipientObjectArr = recipientObjectArr;
	}
	//this maintain the recipient objects
	public recipientObjects()  {
		
	}
	public void method() throws IOException {
		file fi = new file();
		fi.readAll();
		email_recipeints =fi.getarray();
		
		for (int i = 0; i <  email_recipeints.size(); i++) {
			String[] parts = email_recipeints.get(i).split(",");
			if(parts.length==3) {
				 Official official= new Official(parts[0],parts[1],parts[2]);// if it is a official recipient 
				 recipientObjectArr.add(official);
			}else if(parts[1].contains("@")) {
				Office_friend office_friend = new Office_friend(parts[0],parts[1],parts[2],parts[3]);
				recipientObjectArr.add(office_friend);
			}else{
				Personal personal = new Personal(parts[0],parts[1],parts[2],parts[3]);
				recipientObjectArr.add(personal);
			}
	}
	}
	public void printNoOfRecipients() {
		System.out.println("number of recipient objects: "+recipientObjectArr.size());
	}
}
