package emailClient;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class file  {
	 private ArrayList<String> email_recipeints = new ArrayList<String>();
	
	public void write(String str) throws IOException{
		File f = new File("clientList.txt");
		if(f.exists()) {
			FileWriter fw = new FileWriter(f, true);
			PrintWriter pw = new PrintWriter(fw);
	        pw.println(str);
	        pw.close();
	        fw.close();
	        
        }else {
        	FileWriter fw = new FileWriter(f, false);
        	PrintWriter pw = new PrintWriter(fw);
	        pw.print(str);
	        pw.close();
	        fw.close();
        }
		
		readAll();
		
	}
	public void readAll() throws IOException{
		File f = new File("clientList.txt");
		Scanner scanner = new Scanner(f);
		while(scanner.hasNextLine()) {
			//load all the recipients in to an array list
			email_recipeints.add(scanner.nextLine());}
		}
		
		
	public ArrayList<String> getarray(){
		return email_recipeints;
	}
		
	}


