package emailClient;

import java.io.IOException;
import java.util.ArrayList;

public class print_Birthday{ // get the names of recipients who have their birthday set to current date
	private ArrayList<String> birthday_recipeints;
	private String today;
	private String name;
	
	public print_Birthday(String today) throws IOException {
		this.today= today;
	}
	
	
	public void print() throws IOException {
		try {
		Birthday birthday = new Birthday(today);
		birthday_recipeints = birthday.get_birthday_recipeints();
		
		if(birthday_recipeints.size()==0) {
			System.out.println("Not birthdays");
		}
		
		for (int i = 0; i < birthday_recipeints.size(); i++) {
			String[] parts =birthday_recipeints.get(i).split(",");
			name= parts[0];
			System.out.println(name);
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("wrong input format");
	}
	}
}
