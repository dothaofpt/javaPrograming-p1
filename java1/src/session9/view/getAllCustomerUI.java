package session9.view;

import session9.controller.GetAllCustomers;
import session9.entity.Customers;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class getAllCustomerUI {
    private final Scanner sc;
   private final GetAllCustomers getAllCustomers;
    public getAllCustomerUI(Scanner sc) throws SQLException{
        this.sc=sc;
        this.getAllCustomers= new GetAllCustomers();
    }
    public getAllCustomerUI() throws SQLException{
        this(new Scanner(System.in));
    }
    private int menu(){
        System.out.println("All customer");
//        System.out.println("Customer 1:");
//        System.out.println("Customer 2:");
//        System.out.println("Customer 3:");
//        System.out.println("Customer 4:");
        System.out.println("1.GetCustomer");
        System.out.println("0.Exit");
        return Integer.parseInt(sc.nextLine());
    }

    private void setGetAllCustomers() throws SQLException{
        System.out.println("Enter firstName");
        String first_name=sc.nextLine();
        System.out.println("Enter lastName");
        String last_name=sc.nextLine();
        System.out.println("Enter email");
        String email=sc.nextLine();
        Customers customers=new Customers();
        customers.setFirst_name(first_name);
        customers.setLast_name(last_name);
        customers.setEmail(email);
        ArrayList<Customers> result=GetAllCustomers.getAllCustomersStatementController(customers);
        System.out.println(result);


    }
     public void start()throws SQLException{
        while(true){
            int choice =menu();
            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    setGetAllCustomers();
                    break;
                default:
                    throw new AssertionError();
            }
        }
     }
     public static void main(String[] args) throws SQLException{
        getAllCustomerUI getAllCustomerUI=new getAllCustomerUI();
        getAllCustomerUI.start();
     }

}
