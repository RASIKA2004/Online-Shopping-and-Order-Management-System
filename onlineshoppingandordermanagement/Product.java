package onlineshoppingandordermanagement;

// Stores product information
public class Product {

    private int productId;
    private String productName;
    private String category;
    private double price;
    private int stock;

    // Constructor
    public Product(int productId,
                   String productName,
                   String category,
                   double price,
                   int stock) {

        if (productId <= 0) {
            throw new IllegalArgumentException(
                    "Product ID must be positive");
        }

        if (price < 0) {
            throw new IllegalArgumentException(
                    "Price cannot be negative");
        }

        if (stock < 0) {
            throw new IllegalArgumentException(
                    "Stock cannot be negative");
        }

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Add Product
    public void addProduct() {

        System.out.println(
                "Product Added Successfully");
    }

    // Update Product
    public void updateProduct(double price,
                              int stock) {

        if (price >= 0) {
            this.price = price;
        }

        if (stock >= 0) {
            this.stock = stock;
        }

        System.out.println(
                "Product Updated Successfully");
    }

    // Display Product
    public void displayProduct() {

        System.out.println(
                "\n----- Product Details -----");

        System.out.println(
                "Product ID : " + productId);

        System.out.println(
                "Product Name : " + productName);

        System.out.println(
                "Category : " + category);

        System.out.println(
                "Price : ₹" + price);

        System.out.println(
                "Stock : " + stock);
    }

    // Getters

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setter for stock

    public void setStock(int stock) {
        this.stock = stock;
    }

    // For file handling

    @Override
    public String toString() {

        return productId + ","
                + productName + ","
                + category + ","
                + price + ","
                + stock;
    }
}
