package onlineshoppingandordermanagement;

// Utility Class for Invoice Generation
public class InvoiceUtility {

    // Generate Invoice
    public static String generateInvoice(Order order) {

        String invoice =
                "\n========== INVOICE ==========\n"
                + "Order ID      : "
                + order.getOrderId()
                + "\nOrder Date    : "
                + order.getOrderDate()
                + "\nOrder Amount  : ₹"
                + order.getOrderAmount()
                + "\nOrder Status  : "
                + order.getStatus()
                + "\n=============================";

        return invoice;
    }

    // Print Invoice
    public static void printInvoice(Order order) {

        System.out.println(
                generateInvoice(order));
    }
}
