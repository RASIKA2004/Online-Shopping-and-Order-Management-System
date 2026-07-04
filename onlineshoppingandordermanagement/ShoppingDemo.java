package onlineshoppingandordermanagement;

import java.util.Scanner;
//this is driver class for the online shopping and order management system. It provides a menu-driven interface for users to interact with the system, allowing them to add products, register customers, manage shopping carts, place orders, and view revenue reports.

public class ShoppingDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();

        int choice;

        do {

            System.out.println("\n========== ONLINE SHOPPING SYSTEM ==========");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Register Customer");
            System.out.println("4. Add Product To Cart");
            System.out.println("5. Display Cart");
            System.out.println("6. Place Order");
            System.out.println("7. Revenue Report");
            System.out.println("8. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID : ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name : ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Category : ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price : ");
                    double price = sc.nextDouble();

                    System.out.print("Enter Stock : ");
                    int stock = sc.nextInt();

                    Product product =
                            new Product(
                                    pid,
                                    pname,
                                    category,
                                    price,
                                    stock);

                    store.addProduct(product);

                    break;

                case 2:

                    for (Product p :
                            store.getProducts()) {

                        p.displayProduct();
                    }

                    break;

                case 3:

                    Customer customer =
                            new Customer();

                    customer.acceptPersonDetails(sc);

                    System.out.print(
                            "Enter Customer ID : ");

                    int customerId =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Enter Password : ");

                    String password =
                            sc.nextLine();

                    customer.registerCustomer(
                            customerId,
                            password);

                    store.registerCustomer(
                            customer);

                    break;

                case 4:

                    System.out.print(
                            "Enter Product ID : ");

                    int productId =
                            sc.nextInt();

                    Product selected =
                            store.searchProduct(
                                    productId);

                    if (selected != null) {

                        cart.addToCart(
                                selected);
                    } else {

                        System.out.println(
                                "Product Not Found");
                    }

                    break;

                case 5:

                    cart.displayCart();

                    System.out.println(
                            "\nTotal Bill : ₹"
                                    + cart.calculateBill());

                    break;

                case 6:

                    double bill =
                            cart.calculateBill();

                    Order order =
                            new Order(
                                    Store.totalOrders + 1,
                                    "2026-06-23",
                                    bill);

                    store.placeOrder(order);

                    Payment payment =
                            new UpiPayment(
                                    9876543210L,
                                    bill);

                    payment.makePayment();

                    payment.generateReceipt();

                    InvoiceUtility
                            .printInvoice(order);

                    OrderProcessingThread thread =
                            new OrderProcessingThread(
                                    order);

                    thread.start();

                    break;

                case 7:

                    store.displayRevenueReport();

                    break;

                case 8:

                    System.out.println(
                            "Thank You!");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice");
            }

        } while (choice != 8);

        sc.close();
    }
}

//cd c:\Users\Admin\OneDrive\Documents\RPA\codes\java

//javac onlineshoppingandordermanagement\*.java

//java onlineshoppingandordermanagement.ShoppingDemo

//cd Online-Shopping-and-Order-Management-System