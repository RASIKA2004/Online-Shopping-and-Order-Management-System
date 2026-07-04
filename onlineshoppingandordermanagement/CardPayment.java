package onlineshoppingandordermanagement;

// Card Payment Implementation
public class CardPayment implements Payment {

    private long cardNumber;
    private String cardHolderName;
    private double amount;

    // Constructor
    public CardPayment(long cardNumber,
                       String cardHolderName,
                       double amount) {

        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.amount = amount;
    }

    @Override
    public void makePayment() {

        System.out.println("\nProcessing Card Payment...");
        System.out.println("Card Holder : "
                + cardHolderName);

        System.out.println("Amount : ₹"
                + amount);

        System.out.println("Payment Successful");
    }

    @Override
    public void generateReceipt() {

        System.out.println("\n----- CARD RECEIPT -----");

        System.out.println("Card Holder : "
                + cardHolderName);

        System.out.println("Card Number : "
                + cardNumber);

        System.out.println("Amount Paid : ₹"
                + amount);
    }

    public double getAmount() {
        return amount;
    }
}