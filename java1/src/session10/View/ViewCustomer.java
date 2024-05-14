
package session10.View;

import session10.Controller.CustomerController;
import session10.Entities.Customer;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ViewCustomer {
    private final CustomerController customerController;
    private final Scanner scanner;

    public ViewCustomer() throws SQLException {
        customerController = new CustomerController();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Show all customers");
        System.out.println("2. Add a customer");
        System.out.println("3. Update a customer");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public void showAllCustomers() throws SQLException {
        List<Customer> customers = customerController.getAllCustomers();
        if (!customers.isEmpty()) {
            System.out.println("===== All Customers =====");
            for (Customer customer : customers) {
                System.out.println(customer);
            }
            System.out.println("=========================");
        } else {
            System.out.println("No customers found.");
        }
    }

    public void addCustomer() throws SQLException {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter customer phone: ");
        int customerPhone = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter customer email: ");
        String customerEmail = scanner.nextLine();

        Customer newCustomer = new Customer(customerName, customerPhone, customerEmail);
        customerController.addCustomer(newCustomer);
        System.out.println("Customer added successfully.");
    }

    public void updateCustomer() throws SQLException {
        System.out.print("Enter customer ID to update: ");
        int customerId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter new customer phone: ");
        int customerPhone = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new customer email: ");
        String customerEmail = scanner.nextLine();

        Customer updatedCustomer = new Customer(customerName, customerPhone, customerEmail);
        customerController.updateCustomer(updatedCustomer);
        System.out.println("Customer updated successfully.");
    }

    public void run() throws SQLException {
        int choice;
        do {
            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showAllCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        try {
            ViewCustomer viewCustomer = new ViewCustomer();
            viewCustomer.run();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
