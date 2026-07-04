package onlineshoppingandordermanagement;

// Multithreading for Order Processing
public class OrderProcessingThread extends Thread {

    private Order order;
    //because the thread should know which order it has to process.

    // Constructor
    public OrderProcessingThread(Order order) {
        this.order = order;
        // this constructor will initialize the order field with the order to be processed.
    }

    @Override
    public void run() {
        // we override the run() method to define the behavior of the thread when it is started. This method will simulate the order processing steps.

        try {
                // because we use the thread.sleep() method to simulate delays in processing and shipping.also throws exception.

            System.out.println(
                    "\nProcessing Order "
                            + order.getOrderId());

            // Shipping Delay Simulation
            Thread.sleep(2000); // pause the thread 

            order.setStatus(
                    Order.OrderStatus.SHIPPED);
                // we update the order status to SHIPPED after the simulated delay.our enum be sated as enum orderstatus{peding,confirmed,shipped,delivered,cancelled}. 
            System.out.println(
                    "Order "
                            + order.getOrderId()
                            + " Shipped");

            Thread.sleep(2000);

            order.setStatus(
                    Order.OrderStatus.DELIVERED);

            System.out.println(
                    "Order "
                            + order.getOrderId()
                            + " Delivered");

        } catch (InterruptedException e) {
//when some other thread interrupts this thread while it is sleeping, an InterruptedException is thrown. we catch this exception and print a message indicating that the thread was interrupted.
            System.out.println(
                    "Thread Interrupted");
        }
    }
}

///"Order processing takes time in real-world e-commerce systems. To simulate background order processing and shipping updates, I used multithreading with a separate OrderProcessingThread class." 