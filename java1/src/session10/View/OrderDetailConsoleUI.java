package session10.View;

import session10.Controller.OrderDetailController;
import session10.Entities.OrderDetail;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class OrderDetailConsoleUI {
    private final OrderDetailController orderDetailController;
    private final Scanner scanner;

    public OrderDetailConsoleUI() throws SQLException {
        this.orderDetailController = new OrderDetailController();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Display all order details");
        System.out.println("2. Add a new order detail");
        System.out.println("3. Update an order detail");
        System.out.println("4. Delete an order detail");
        System.out.println("5. Exit");
        System.out.print("Please choose: ");
    }

    public void run() throws SQLException {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayAllOrderDetails();
                    break;
                case 2:
                    addOrderDetail();
                    break;
                case 3:
                    updateOrderDetail();
                    break;
                case 4:
                    deleteOrderDetail();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    public void displayAllOrderDetails() throws SQLException{

            List<OrderDetail> orderDetails = orderDetailController.getAllOrderDetails();
            if (orderDetails != null && !orderDetails.isEmpty()) {
                System.out.println("List of order details:");
                for (OrderDetail orderDetail : orderDetails) {
                    System.out.println(orderDetail);
                }
            } else {
                System.out.println("No order details available.");
            }


    }

    public void addOrderDetail() throws SQLException{
        System.out.println("Enter information for the new order detail:");
        System.out.print("Order ID: ");
        int orderID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit Price: ");
        int unitPrice = scanner.nextInt();
        scanner.nextLine();

        OrderDetail newOrderDetail = new OrderDetail(0, orderID, productID, quantity, unitPrice);


            orderDetailController.addOrderDetail(newOrderDetail);
            System.out.println("New order detail has been added successfully.");

    }

    public void updateOrderDetail() throws SQLException{
        System.out.println("Enter information to update an order detail:");
        System.out.print("Order Detail ID: ");
        int orderDetailID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Order ID: ");
        int orderID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Product ID: ");
        int productID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Unit Price: ");
        int unitPrice = scanner.nextInt();
        scanner.nextLine();

        OrderDetail updatedOrderDetail = new OrderDetail(orderDetailID, orderID, productID, quantity, unitPrice);


            orderDetailController.updateOrderDetail(updatedOrderDetail);
            System.out.println("Order detail has been updated successfully.");

    }

    public void deleteOrderDetail() throws SQLException{
        System.out.print("Enter the ID of the order detail to delete: ");
        int orderDetailID = scanner.nextInt();
        scanner.nextLine();


            orderDetailController.deleteOrderDetail(orderDetailID);
            System.out.println("Order detail has been deleted successfully.");


    }

    public static void main(String[] args) throws SQLException{


            OrderDetailConsoleUI consoleUI = new OrderDetailConsoleUI();
            consoleUI.run();


    }
}

