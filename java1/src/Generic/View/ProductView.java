package Generic.View;

import Generic.Controller.Controller;
import Generic.Entity.Product;
import Generic.Model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private final Controller<Product> productController;
    private final Scanner scanner;

    public ProductView(Controller<Product> productController, Scanner scanner) {
        this.productController = productController;
        this.scanner = scanner;
    }

    public void displayMenu() throws SQLException {
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Display all products");
            System.out.println("2. Add a new product");
            System.out.println("3. Update product information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau lệnh nextInt

            switch (choice) {
                case 1:
                    displayAllProducts();
                    break;
                case 2:
                    addNewProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public void displayAllProducts() {
        try {
            List<Product> products;
            products = productController.getAllEntities();
            System.out.println("List of products:");
            for (Product product : products) {
                System.out.println(product);
            }
        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public void addNewProduct() {
        try {
            System.out.println("Enter details for the new product:");
            System.out.print("Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau lệnh nextInt
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Product Description: ");
            String productDescription = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Stock Quantity: ");
            int stockQuantity = scanner.nextInt();

            Product newProduct = new Product(productId, productName, productDescription,(int) price, stockQuantity);
            productController.addEntity(newProduct);

            System.out.println("New product added successfully!");
        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }

    public void updateProduct() throws SQLException {

            System.out.print("Enter the ID of the product to update: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau lệnh nextInt
                System.out.println("Enter new details for the product:");
                System.out.print("Product Name: ");
                String productName = scanner.nextLine();
                System.out.print("Product Description: ");
                String productDescription = scanner.nextLine();
                System.out.print("Price: ");
                double price = scanner.nextDouble();
                System.out.print("Stock Quantity: ");
                int stockQuantity = scanner.nextInt();
        Product newProduct = new Product(productId, productName, productDescription, (int) price, stockQuantity);
        productController.addEntity(newProduct);

        System.out.println("New product updated successfully!");

    }

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        try {
            // Tạo một instance của ProductController, có thể là thể hiện của lớp ProductController
            // hoặc bất kỳ lớp nào khác thực hiện interface Controller<Product>
            Controller<Product> productController = new Controller(new ProductDaoImpl());
            ProductView productView = new ProductView(productController, scanner);
            productView.displayMenu();
        } finally {
            scanner.close(); // Đóng Scanner sau khi sử dụng xong để tránh rò rỉ bộ nhớ
        }
    }
}
