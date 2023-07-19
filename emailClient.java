package emailClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Index number-200334F
//add your email address and password to the javaMail class 


public class emailClient {
	static ArrayList<mail> arr = new ArrayList<mail>();

  public static void main(String[] args) throws Exception {
	  BirthdayWish birthdayWish = new BirthdayWish();
	  recipientObjects RecipientObjects = new recipientObjects(); 
	  RecipientObjects.method();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter option type: \n"
              + "1 - Adding a new recipient\n"
              + "2 - Sending an email\n"
              + "3 - Printing out all the recipients who have birthdays\n"
              + "4 - Printing out details of all the emails sent\n"
              + "5 - Printing out the number of recipient objects in the application\n"
              + "-1 - Exit from the program");

        int option = scanner.nextInt();
        
        while(option !=-1) {
        	objectSerialize objectserialize2 = new objectSerialize();

        switch(option){
              case 1:  //Adding a new recipient
            	  Scanner sc = new Scanner(System.in);
                  System.out.println("input format - \n"
                  +"Official: nimal,nimal@gmail.com,ceo\n"
                  +"Office_friend: kamal,kamal@gmail.com,clerk,2000/12/12\n"
                  +"Personal: sunil,<nick-name>,sunil@gmail.com,2000/10/10");
                  String str= sc.nextLine();
				  NewRecipientFactory newRecipientFactory = new NewRecipientFactory(str);
				  newRecipientFactory.method();
                  break;
                  
              case 2: //Sending an email
            	  Scanner sc1 = new Scanner(System.in);
            	  System.out.println("input format - email, subject, content");
            	  String send_email =sc1.nextLine();
				  SendMails sendMails = new SendMails(send_email);
				  sendMails.print();
                  break;
                  
              case 3://Printing out all the names of recipients who have their birthday set to current date
            	  Scanner sc2 = new Scanner(System.in);
            	  System.out.println("input format - yyyy/MM/dd (ex: 2018/09/17)");
            	  String Today =sc2.nextLine();
            	  print_Birthday print_birthday = new print_Birthday(Today);
            	  print_birthday.print();
                  break;
                  
              case 4://Printing out details (subject and recipient) of all the emails sent on a date
            	  Scanner sc3 = new Scanner(System.in);
            	  System.out.println("input format - yyyy-MM-dd (ex: 2018-09-17)");
            	  String date =sc3.nextLine();
            	  objectSerialize objectserialize = new objectSerialize(date);
            	  objectserialize2.writeToFile();// serielize the birthday recipients
            	  arr.clear(); // clear the birthday recipients
            	  objectserialize.readFile();
                  break;
                  
              case 5:
            	  RecipientObjects.printNoOfRecipients();
                  break;
               
        }
        
        objectserialize2.writeToFile();
        arr.clear();
        printList();
        option = scanner.nextInt();
        }

    }
  public static void printList() {
	  System.out.println();
	  System.out.println("Enter option type: \n"
              + "1 - Adding a new recipient\n"
              + "2 - Sending an email\n"
              + "3 - Printing out all the recipients who have birthdays\n"
              + "4 - Printing out details of all the emails sent\n"
              + "5 - Printing out the number of recipient objects in the application\n"
              + "-1 - Exit from the program");
  }
}
// ====================================

