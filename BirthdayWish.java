package emailClient;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BirthdayWish {
	private String today;
	private ArrayList<String> birthday_recipeints;
	private String greeting;
	private String name;
	
	public BirthdayWish() throws Exception {
		getDate();
	}
	public void getDate() throws Exception { // get todays date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date = LocalDate.now();
		today =dtf.format(date).toString();
	    get_recipeints();
		
	}
	
	public void get_recipeints() throws Exception { //get recipeints who have birthday today
		Birthday birthday = new Birthday(today);
		birthday_recipeints = birthday.get_birthday_recipeints(); //get the arraylist of recipeints who have birthday today
		System.out.println("sending bithday mails");
		
		for (int i = 0; i < birthday_recipeints.size(); i++) { //iterate through the birthday_recipeints arraylist
			String[] parts =birthday_recipeints.get(i).split(",");
			
			name= parts[0];
			if(parts[1].contains("@")) { // official friend
				official_birthdayWish(name,parts[1]);
				
			}else {
				personal_birthdayWish(name,parts[2]);
			}
			}
	}
	
	public void personal_birthdayWish(String name,String emailaddress) throws Exception {
		greeting = emailaddress+","+"Happy Birthday,hugs and love on your birthday "+name;
		SendMails sendMails = new SendMails(greeting);
	}
	
	public void official_birthdayWish(String name,String emailaddress) throws Exception {
		greeting = emailaddress+","+"Happy Birthday,Wish you a Happy Birthday "+name;
		SendMails sendMails = new SendMails(greeting);
	}

}
