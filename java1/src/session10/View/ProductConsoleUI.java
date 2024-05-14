package session10.View;

import session10.Controller.ProductController;
import session10.Entities.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsoleUI {
    private final ProductController productController;
    private final Scanner scanner;

    public ProductConsoleUI() throws SQLException {
        this.productController = new ProductController();
        this.scanner = new Scanner(System.in);
    }

    private int menu() {
        System.out.println("====Product Management Menu====");
        System.out.println("1. Create Product");
        System.out.println("2. Get Product By ID");
        System.out.println("3. Get All Products");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void createProductView() throws SQLException {
        System.out.print("Enter product ID: ");
        int prodId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product description: ");
        String productDesc = scanner.nextLine();
        System.out.print("Enter price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter stock quantity: ");
        int stockQuantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(prodId, name, productDesc, price, stockQuantity);
        productController.createProductController(product);
        System.out.println("Product created successfully.");
    }

    public void getProductByIdView() throws SQLException {
        System.out.print("Enter product ID: ");
        int prodId = Integer.parseInt(scanner.nextLine());
        Product product = productController.getProductByIdController(prodId);
        if (product != null) {
            System.out.println("=====Product details=====");
            System.out.println("ID: " + product.getProductID());
            System.out.println("Name: " + product.getProductName());
            System.out.println("Description: " + product.getProductDescription());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Stock Quantity: " + product.getStockQuantity());
        } else {
            System.out.println("Product not found.");
        }
    }

    public void getAllProductView() throws SQLException {
        ArrayList<Product> allProduct = productController.getAllProductController();
        if (!allProduct.isEmpty()) {
            System.out.println("=====All Products=====");
            for (Product product : allProduct) {
                System.out.println("ID: " + product.getProductID());
                System.out.println("Name: " + product.getProductName());
                System.out.println("Description: " + product.getProductDescription());
                System.out.println("Price: " + product.getPrice());
                System.out.println("Stock Quantity: " + product.getStockQuantity());
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No products found.");
        }
    }

    public void start() {
        int choice;
        do {
            choice = menu();
            try {
                switch (choice) {
                    case 1:
                        createProductView();
                        break;
                    case 2:
                        getProductByIdView();
                        break;
                    case 3:
                        getAllProductView();
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from the menu.");
                }
            } catch (SQLException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        try {
            ProductConsoleUI productConsoleUI = new ProductConsoleUI();
            productConsoleUI.start();
        } catch (SQLException e) {
            System.out.println("Unable to start product console: " + e.getMessage());
        }
    }
}
