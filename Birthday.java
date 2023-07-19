package emailClient;

import java.io.IOException;
import java.util.ArrayList;

public class Birthday  { //This seperate the operation of getting recipients who have birthdays today.
	private String bday;
	private  String today;
	private int count;
	private ArrayList<String> email_recipeints1;
	private ArrayList<String> birthday_recipeints = new ArrayList<String>();
	private String month;
	private String day;

	public Birthday(String today) throws IOException {
		this.today= today;
		String[] split_today =today.split("/");
		month =split_today[1];
		day = split_today[2];
		iterate();
	}
	
	public void iterate() throws IOException { //read the file and get to a list of email recipients
	file fi = new file();
	 fi.readAll();
	email_recipeints1 =fi.getarray(); //get the arraylist of email recipients
		
		
	for (int i = 0; i < email_recipeints1.size(); i++) {
		String[] parts =email_recipeints1.get(i).split(",");
		//System.out.println(email_recipeints.get(i)); // print the arraylist
		if(parts.length==3) {
			continue; // if it is a official recipient no birthdays
		}
		String[] bday = parts[3].split("/");
		
		
		if(bday[1].equalsIgnoreCase(month) && bday[2].equalsIgnoreCase(day)) {
			 getBirthday_recipeints().add(email_recipeints1.get(i));
			 //System.out.println("Name:"+parts[0]);
			// System.out.println(parts[3]);
		}
       
        
        
         }      
   

	}
	public ArrayList<String> get_birthday_recipeints(){ //return the recipients who have birthday
		return getBirthday_recipeints();
	}

	public ArrayList<String> getBirthday_recipeints() {
		return birthday_recipeints;
	}

	public void setBirthday_recipeints(ArrayList<String> birthday_recipeints) {
		this.birthday_recipeints = birthday_recipeints;
	}

}
