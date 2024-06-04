package assignment;

import JSon_database.Employee;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeeToJsonFileWrite {
    public static void writeEmployeeToJsonFile(List<Employee> employees, String filePath) throws IOException {
        Gson gson =new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer=new FileWriter(filePath);
        gson.toJson(employees,writer);

    }

}
