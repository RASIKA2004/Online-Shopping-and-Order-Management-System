package onlineshoppingandordermanagement;

// Customer inherits Person
public class Customer extends Person {

    private int customerId;
    private String password;

    static int totalCustomers = 0;

    // Constructor
    public Customer() {
        super();
        totalCustomers++;
    }

    // Register Customer
    public void registerCustomer(int customerId,
                                 String password) {

        if (customerId <= 0) {
            throw new IllegalArgumentException(
                    "Customer ID must be positive");
        }

        if (password.length() < 8) {
            throw new IllegalArgumentException(
                    "Password must be minimum 8 characters");
        }

        this.customerId = customerId;
        this.password = password;

        System.out.println("Customer Registered Successfully");
    }

    // Login Customer
    public boolean loginCustomer(String enteredPassword) {

        return password.equals(enteredPassword);
    }

    // Display Customer
    public void displayCustomer() {

        System.out.println("\n----- Customer Details -----");

        displayPersonDetails();

        System.out.println("Customer ID : "
                + customerId);

        System.out.println("Total Customers : "
                + totalCustomers);
    }

    // Getter
    public int getCustomerId() {
        return customerId;
    }

    public String getPassword() {
        return password;
    }

    
}
