# Command-Line Email Client System 📧

This application is a versatile command-line email client designed to send emails to clients, either automatically or manually. It also keeps a comprehensive record of all sent emails. Embracing **Object-Oriented Programming (OOP) principles**, **Design Patterns**, and **Object Serialization**, this system offers a robust and extensible solution.

## Key Features

- **Dual Recipient Types:** The email client supports two types of recipients: official and personal. Official recipients include close friends, and details are stored in a text file.

- **Flexible Recipient Records:** Recipient records include information such as name, email, designation, and, for official friends, their birthdays.

- **Dynamic Recipient Management:** Users can update the recipient list through the command line, adding new recipients seamlessly.

- **Automated Birthday Greetings:** The system automatically sends birthday greetings to recipients on their respective birthdays. The application maintains a list of recipients for whom birthday greetings are sent.

- **Recipient Count Tracking:** The system keeps track of recipient objects using static members, providing valuable insights into recipient statistics.

- **Email Archiving:** All emails sent by the client are saved in the hard disk using object serialization. Users can retrieve information on emails sent on a particular day through a command-line option.

## Getting Started

Before executing the program, make sure to:

1. Add your email address and password to the `javaMail` class in the `javaMail.java` file.
2. Maintain the recipient list in the `clientList.txt` file.

Note: The application imports the `javax.mail` package, which is included in the `javax.mail.jar`. You can download it [here](https://javaee.github.io/javamail/#Download_JavaMail_Release).

Serialized files are named based on the date (e.g., `2022-08-08.ser`).




