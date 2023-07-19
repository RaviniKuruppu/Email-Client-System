package emailClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class objectSerialize extends emailClient {
	private ArrayList<mail> Read_arr;
	private ArrayList<mail> existing_arr = new ArrayList<mail>();
	private String fileName;
	
	public objectSerialize(String date) throws FileNotFoundException, ClassNotFoundException, IOException {
		fileName = date+".ser";
		//readFile();
		//fileName=date;
		
	}

	public objectSerialize() {
		
	}

	public void writeToFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		createFileName(); //create file name according to the date
		File f = new File(fileName);
		if(f.exists()) {
			fileExist(fileName);
		}else {
		ObjectOutputStream objout =new ObjectOutputStream(new FileOutputStream(f));
		objout.writeObject(arr);
		}
	}
	
	public void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		try {
		File file = new File(fileName);
		//System.out.println(fileName);
		if(file.exists()) {
		ObjectInputStream objin =new ObjectInputStream(new FileInputStream(file));
		Read_arr =(ArrayList<mail>)objin.readObject();
		//System.out.println(Read_arr.size());
		if(Read_arr.size()==0) {
			System.out.println("No mails sent on that date");
		}
		for(mail Mail:Read_arr) {
			System.out.println(Mail.getEmailaddress());
			System.out.println(Mail.getSubject());
			System.out.println(Mail.getContent());
			System.out.println();
		}
		}else {
			System.out.println("file does not exist/ wrong input format");
		}
		}catch(Exception e) {
			System.out.println("wrong input format");
		}
		
		
	}
	
	public void createFileName() {
		
		LocalDate date = LocalDate.now();
		String today = date.toString();
		fileName = today+".ser";  //2022-08-08.ser
	}
	
	public void fileExist(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objin =new ObjectInputStream(new FileInputStream(fileName));
		Read_arr =(ArrayList<mail>)objin.readObject();
		for(mail Mail:arr) {
			Read_arr.add(Mail); // add the existing array into Read_arr
		}
		ObjectOutputStream objout =new ObjectOutputStream(new FileOutputStream(fileName));
		objout.writeObject(Read_arr);
	}

}
