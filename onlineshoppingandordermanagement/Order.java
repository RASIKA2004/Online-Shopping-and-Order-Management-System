package onlineshoppingandordermanagement;

// Represents Customer Order
public class Order {

    // Enum
    public enum OrderStatus {
        PENDING,
        CONFIRMED,
        SHIPPED,
        DELIVERED,
        CANCELLED
    }

    private int orderId;
    private String orderDate;
    private double orderAmount;
    private OrderStatus status;

    // Constructor
    public Order(int orderId,
                 String orderDate,
                 double orderAmount) {

        if (orderId <= 0) {
            throw new IllegalArgumentException(
                    "Order ID must be positive");
        }

        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;

        status = OrderStatus.PENDING;
    }

    // Place Order
    public void placeOrder() {

        status = OrderStatus.CONFIRMED;

        System.out.println(
                "Order Placed Successfully");
    }

    // Cancel Order
    public void cancelOrder() {

        status = OrderStatus.CANCELLED;

        System.out.println(
                "Order Cancelled");
    }

    // Display Order
    public void displayOrder() {

        System.out.println(
                "\n===== ORDER DETAILS =====");

        System.out.println(
                "Order ID : " + orderId);

        System.out.println(
                "Order Date : " + orderDate);

        System.out.println(
                "Order Amount : ₹" + orderAmount);

        System.out.println(
                "Order Status : " + status);
    }

    // Getters

    public int getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    // Setter for Thread Processing

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
