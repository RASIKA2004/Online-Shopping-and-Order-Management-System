package onlineshoppingandordermanagement; 
import java.util.Scanner;

// Base class for customer details
public class Person { 
    // Genralization of person details to be used by customer and other classes in future.

    protected int personId;
    protected String name;
    protected String email;
    protected String mobile;

    // Default Constructor
    public Person() {
    }

    // Accept Details
   // Accept Details
public void acceptPersonDetails(Scanner sc) {

    System.out.print("Enter Person ID : ");
    personId = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Name : ");
    name = sc.nextLine();

    System.out.print("Enter Email : ");
    email = sc.nextLine();

    System.out.print("Enter Mobile Number : ");
    mobile = sc.nextLine();
}
    // Display Details
    public void displayPersonDetails() {

        System.out.println("\n----- Person Details -----");
        System.out.println("Person ID : " + personId);
        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Mobile : " + mobile);
    }
}