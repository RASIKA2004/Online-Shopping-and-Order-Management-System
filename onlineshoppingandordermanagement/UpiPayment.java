package onlineshoppingandordermanagement;

// UPI Payment Implementation
public class UpiPayment implements Payment {

    private long upiId;
    private double amount;

    // Constructor
    public UpiPayment(long upiId,
                      double amount) {

        this.upiId = upiId;
        this.amount = amount;
    }

    @Override
    public void makePayment() {

        System.out.println("\nProcessing UPI Payment...");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount : ₹" + amount);
        System.out.println("Payment Successful");
    }

    @Override
    public void generateReceipt() {

        System.out.println("\n----- UPI RECEIPT -----");
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount Paid : ₹" + amount);
    }

    public double getAmount() {
        return amount;
    }
}