package emailApp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String department;
    private String company = "hsbc";
    private String password;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    private int passwordLength = 10;

    private String email;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Name Created: " + this.firstName + "." + this.lastName);

        this.department = setDepartment();

        System.out.println("The department is :" + this.department);

        this.password = generatePassword(passwordLength);
        System.out.println("The password is :" + this.password);

        //Combine all to have 1 email id

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company + ".co.in" ;

        System.out.println("Your Organisation Email Id:" + email);


    }

    private String generatePassword(int length) {
        String passwordCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ%#@*%!1234567890";
        char[] passwordSet = new char[length];
        for (int i = 0; i < length; i++) {
            int randomChar = (int) (Math.random() * passwordCharacters.length());

            passwordSet[i] = passwordCharacters.charAt(randomChar);
        }
        return new String(passwordSet);

    }

    private String setDepartment() {
        System.out.println("Department Codes\n1 for mss\n2 for wbp\n3 for cloud");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Department:");
        int depChoice = sc.nextInt();
        if (depChoice == 1) {
            return "mss";
        } else if (depChoice == 2) {
            return "wbp";
        } else if (depChoice == 3) {
            return "cloud";
        }
        return "no dep";
    }

    //encapsulation
    //it's a regular method using in such a controlled way to modify the internal logic of the objects.
    public void setMailBoxCapacity(int capacity)
    {
        this.mailBoxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;                                    //there is no ambiguity between class level variable and the local variable but it's a good practice to write this.
    }

    public void changePassword(String Password)
    {
        this.password = password;
    }

    //setting is setting some properties and getting is actually retrieving them.

    public int getMailBoxCapacity()
    {
        return mailBoxCapacity;
    }

    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public String getChangePassword()
    {
        return password;
    }

    public String showInfo()
    {
        return "DISPLAY Name: " +firstName + " " + lastName
                + "\nCOMPANY NAME:" +company
                + "\nMAILBOX CAPACITY:" + mailBoxCapacity
                +"\nALTERNATE EMAIL:" + alternateEmail;
    }

}
