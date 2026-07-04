package onlineshoppingandordermanagement;

import java.util.ArrayList;

// Manages shopping cart
public class ShoppingCart {

    private ArrayList<Product> cartProducts;

    // Constructor
    public ShoppingCart() {
        cartProducts = new ArrayList<>();
    }

    // Add Product To Cart
    public void addToCart(Product product) {

        cartProducts.add(product);

        System.out.println(
                product.getProductName()
                + " added to cart.");
    }

    // Remove Product From Cart
    public void removeFromCart(int productId) {

        for (Product p : cartProducts) {

            if (p.getProductId() == productId) {

                cartProducts.remove(p);

                System.out.println(
                        "Product removed from cart.");

                return;
            }
        }

        System.out.println(
                "Product not found in cart.");
    }

    // Update Quantity
    public void updateQuantity(int productId,
                               int quantity) {

        for (Product p : cartProducts) {

            if (p.getProductId() == productId) {

                p.setStock(quantity);

                System.out.println(
                        "Quantity updated.");

                return;
            }
        }

        System.out.println(
                "Product not found.");
    }

    // Display Cart
    public void displayCart() {

        if (cartProducts.isEmpty()) {

            System.out.println(
                    "Cart is Empty");

            return;
        }

        System.out.println(
                "\n===== SHOPPING CART =====");

        for (Product p : cartProducts) {

            p.displayProduct();
        }
    }

    // Calculate Bill
    public double calculateBill() {

        double total = 0;

        for (Product p : cartProducts) {

            total += p.getPrice();
        }

        return total;
    }

    // Getter
    public ArrayList<Product> getCartProducts() {
        return cartProducts;
    }
}
