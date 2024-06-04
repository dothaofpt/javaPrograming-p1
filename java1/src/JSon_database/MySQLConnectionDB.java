package JSon_database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLConnectionDB {
   private static final String JDBC_URL="jdbc:mysql://localhost:3306/EmployeeFPT";
   private static final String JDBC_USER="root";
   private static final String JDBC_PASSWORD="";

    public static List<Employee> getEmployeeFromDatabase() throws SQLException{
       List<Employee> employees=new ArrayList<>();
       //b1: ket noi,tao doi tuong statement ket noi den
       Connection connection=DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
       Statement statement= connection.createStatement();
       ResultSet resultSet= statement.executeQuery("Select *from employee");
       //dung while loc qua phan tu
       while(resultSet.next()){
           int id=resultSet.getInt("id");
           String name=resultSet.getString("name");
           String address=resultSet.getString("address");
           int age =resultSet.getInt("age");
           employees.add(new Employee(id,name,address,age));
       }
       //tra ve employee
       return employees;
   }

}
//viet ctr them sua xoa (put post delete) vs http request;
//lay data o mock api
