package JSon_database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Application {
    //load data
    public static void main(String[] args) throws IOException, SQLException {


        List<Employee> employees = MySQLConnectionDB.getEmployeeFromDatabase();
        //ghi file json
        String filePath="employee.json";
        EmployeeToJsonFileWrite.writeEmployeeToJsonFile(employees,filePath);
        System.out.println("Data has been written to:"+filePath);
    }
}
