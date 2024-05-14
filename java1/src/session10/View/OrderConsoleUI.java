
package session10.View;

import session10.Controller.OrderController;
import session10.Entities.Order;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderConsoleUI {
    private OrderController orderController;
    private Scanner scanner;

    public OrderConsoleUI() throws SQLException {
        orderController = new OrderController();
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Create an order");
        System.out.println("2. Get order by ID");
        System.out.println("3. Get all orders");
        System.out.println("4. Update an order");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public void createOrder() throws SQLException {
        Order order = new Order();
        System.out.print("Enter order date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        try {
            Date orderDate = java.sql.Date.valueOf(dateString);
            order.setOrderDate(orderDate);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
            return;
        }
        System.out.print("Enter customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        order.setCustomerID(customerId);
        System.out.print("Enter total amount: ");
        int totalAmount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        order.setTotalAmount(totalAmount);
        System.out.print("Enter order status: ");
        String status = scanner.nextLine();
        order.setStatus(status);

        boolean success = orderController.createOrder(order);
        if (success) {
            System.out.println("Order created successfully.");
        } else {
            System.out.println("Failed to create order.");
        }
    }

    public void getOrderById() throws SQLException {
        System.out.print("Enter order ID: ");
        int orderId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Order order = orderController.getOrderById(orderId);
        if (order != null) {
            System.out.println("Order found:");
            System.out.println(order);
        } else {
            System.out.println("Order not found.");
        }
    }

    public void getAllOrders() throws SQLException {
        List<Order> orders = orderController.getAllOrders();
        if (!orders.isEmpty()) {
            System.out.println("All orders:");
            for (Order order : orders) {
                System.out.println(order);
            }
        } else {
            System.out.println("No orders found.");
        }
    }

    public void updateOrder() throws SQLException {
        System.out.print("Enter order ID to update: ");
        int orderId = scanner.nextInt();
        scanner.nextLine();

        Order order = orderController.getOrderById(orderId);
        if (order != null) {
            System.out.print("Enter new order date (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            try {
                Date orderDate = java.sql.Date.valueOf(dateString);
                order.setOrderDate(orderDate);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid date format. Please enter date in yyyy-MM-dd format.");
                return;
            }
            System.out.print("Enter new customer ID: ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            order.setCustomerID(customerId);
            System.out.print("Enter new total amount: ");
            int totalAmount = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            order.setTotalAmount(totalAmount);
            System.out.print("Enter new order status: ");
            String status = scanner.nextLine();
            order.setStatus(status);

            boolean success = orderController.updateOrder(order);
            if (success) {
                System.out.println("Order updated successfully.");
            } else {
                System.out.println("Failed to update order.");
            }
        } else {
            System.out.println("Order not found.");
        }
    }

    public void start() throws SQLException {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    getOrderById();
                    break;
                case 3:
                    getAllOrders();
                    break;
                case 4:
                    updateOrder();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        try {
            OrderConsoleUI orderConsoleUI = new OrderConsoleUI();
            orderConsoleUI.start();
        } catch (SQLException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
