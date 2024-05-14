
package Generic.View;

import Generic.Controller.Controller;
import Generic.Entity.Customer;
import Generic.Model.CustomerDaoImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    //tạo fields làm việc với với entity customer
    //Scanner để nhập dữ liệu từ bàn phím
    private Controller<Customer> controller;
    private Scanner scanner;

    //constructor
    public CustomerView(Controller<Customer> controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    //tạo 1 menu sử dụng vòng lặp do while và switch-case
    public void displayMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all customers");
            System.out.println("2. Add a new customer");
            System.out.println("3. Update customer information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        displayAllCustomers();
                        break;
                    case 2:
                        addNewCustomer();
                        break;
                    case 3:
                        updateCustomer();
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 4);
    }

    //tạo ra hàm làm việc với controller
    public void displayAllCustomers() throws SQLException {

        List<Customer> customers = controller.getAllEntities();
        System.out.println("List of customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void addNewCustomer() throws SQLException {
        System.out.println("Enter details of the new customer!!!");
        int customerID= Integer.parseInt(scanner.nextLine());
        System.out.println("Customer id");
        System.out.print("Customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Customer phone: ");
        int customerPhone = Integer.parseInt(scanner.nextLine());
        System.out.print("Customer email: ");
        String customerEmail = scanner.nextLine();
        Customer newCustomer = new Customer(customerID,customerName,customerPhone,customerEmail);
        controller.addEntity(newCustomer);
        System.out.println("New customer added successfully.");
    }

    public void updateCustomer() throws SQLException {
        System.out.print("Enter ID of the customer to update: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new name for the customer: ");
        String name = scanner.nextLine();
        System.out.print("Enter new phone for the customer: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new email for the customer: ");
        String email = scanner.nextLine();
        Customer updatedCustomer = new Customer(customerId, name, phone, email);
        controller.updateEntity(updatedCustomer);
        System.out.println("Customer information updated successfully.");
    }

    public static void main(String[] args) {
        try {
            CustomerDaoImpl customerDao = new CustomerDaoImpl();
            Controller<Customer> customerController = new Controller<>(customerDao);
            CustomerView customerView = new CustomerView(customerController);
            customerView.displayMenu();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
