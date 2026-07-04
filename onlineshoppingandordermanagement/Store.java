package onlineshoppingandordermanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Main Store Management Class
public class Store {

    private ArrayList<Product> products;
    private ArrayList<Customer> customers;
    private ArrayList<Order> orders;

    static String storeName = "Raj Online Store";
    static int totalOrders = 0;
    static double totalRevenue = 0;

    // Constructor
    public Store() {

        products = new ArrayList<>();
        customers = new ArrayList<>();
        orders = new ArrayList<>();
    }

    // =========================
    // Product Management
    // =========================

    public void addProduct(Product product) {

        products.add(product);

        System.out.println(
                "Product Added Successfully");
    }

    public void deleteProduct(int productId) {

        for (Product p : products) {

            if (p.getProductId() == productId) {

                products.remove(p);

                System.out.println(
                        "Product Deleted Successfully");

                return;
            }
        }

        System.out.println(
                "Product Not Found");
    }

    public Product searchProduct(int productId) {

        for (Product p : products) {

            if (p.getProductId() == productId) {

                return p;
            }
        }

        return null;
    }

    public void sortProducts() {

        Collections.sort(
                products,
                Comparator.comparing(
                        Product::getPrice));

        System.out.println(
                "Products Sorted By Price");
    }

    // =========================
    // Customer Management
    // =========================

    public void registerCustomer(
            Customer customer) {

        customers.add(customer);

        System.out.println(
                "Customer Registered Successfully");
    }

    public Customer searchCustomer(
            int customerId) {

        for (Customer c : customers) {

            if (c.getCustomerId()
                    == customerId) {

                return c;
            }
        }

        return null;
    }

    // =========================
    // Order Management
    // =========================

    public void placeOrder(Order order) {

        orders.add(order);

        totalOrders++;

        totalRevenue +=
                order.getOrderAmount();

        order.placeOrder();
    }

    public void cancelOrder(int orderId) {

        for (Order o : orders) {

            if (o.getOrderId()
                    == orderId) {

                o.cancelOrder();

                return;
            }
        }

        System.out.println(
                "Order Not Found");
    }

    public void displayOrders() {

        if (orders.isEmpty()) {

            System.out.println(
                    "No Orders Found");

            return;
        }

        for (Order o : orders) {

            o.displayOrder();
        }
    }

    // =========================
    // Reports
    // =========================

    public void displayRevenueReport() {

        System.out.println(
                "\n===== REVENUE REPORT =====");

        System.out.println(
                "Store Name : "
                        + storeName);

        System.out.println(
                "Total Orders : "
                        + totalOrders);

        System.out.println(
                "Total Revenue : ₹"
                        + totalRevenue);
    }

    public void displayTopSellingProducts() {

        System.out.println(
                "\nTop Selling Products Feature Added");
    }

    // =========================
    // Getters
    // =========================

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }
}
