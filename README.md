# Email-client
Send email using Java Program


The email client has two types of recipients, official and personal. Some official recipients are close friends.
Details of the recipient list are stored in a text file. 

An official recipient’s record in the text file has the following format:
official: <name>, <email>, <designation>. A sample record for official recipients in the text file looks as follows:
Official: nimal,nimal@gmail.com,ceo
 A sample record for official friends in the text file looks as follows (last value is the recipient's birthday):

Office_friend: kamal,kamal@gmail.com,clerk,2000/12/12

A sample record for personal recipients in the text file looks as follows (last value is the recipient's birthday):
Personal: sunil,<nick-name>,sunil@gmail.com,2000/10/10

The users are given the option to update this text file, i.e., the user can add a new recipient through command-line, and these details should be added to the text file. 

When the email client is running, an object for each email recipient are maintained in the application. For this, you will have to load the recipient details from the text file into the application. For each recipient having a birthday, a birthday greeting is sent on the correct day. 
Official friends and personal recipients should be sent different messages (e.g., Wish you a Happy Birthday. <your name> for an office friend, and hugs and love on your birthday. <your name> for personal recipients). But all personal recipients receive the same message, and all office friends should receive the same message.  

A list of recipients to whom a birthday greeting is sent is maintained in the application, when it is running. When the email client is started, it should traverse this list, and send a greeting email to anyone having their birthday on that day.

The system is able to keep a count of the recipient objects. Use static members to keep this count.

All the emails sent out by the email client are saved into the hard disk, in the form of objects – object serialization is used for this. The user is able to retrieve information of all the mails sent on a particular day by using a command-line option

In the given code, note that it imports the javax.mail package. This package is included in the javax.mail.jar, which can be downloaded from here
https://javaee.github.io/javamail/#Download_JavaMail_Release

To run the program

Add your email address and email password to the javaMail class in the javaMail.java file.

List of recipients are maintained in clientList.txt file.

serialized files are named as Year-month-day. EX: 2022-08-08.ser
