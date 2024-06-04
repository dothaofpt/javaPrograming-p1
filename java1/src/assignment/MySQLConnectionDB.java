package assignment;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class MySQLConnectionDB {
    private static final HttpClient httpClient=HttpClient.newHttpClient();
    private static final String URL_API="https://664f66b9ec9b4a4a602ea815.mockapi.io/api/Employees";
   public  static final Gson gson=new Gson();
    public static List<Employee> getEmployeeFromMockAPI() throws Exception{
        HttpRequest request= HttpRequest.newBuilder()
        //tao 1 yeu cau GET toi mockAPI
                .uri(new URI(URL_API))
        .GET()
        .build();
        //gui yeu cau va nhan phan hoi duoi dang chuoi
      HttpResponse<String> response=httpClient.send(request,HttpResponse.BodyHandlers.ofString());
        System.out.println("JSON Response:" + response.body());
      //chuyen doi chuoi json thanh danh sach "employee"
      return gson.fromJson(response.body(),new TypeToken<List<Employee>>(){}.getType());

    }
    public static Optional<Employee> addEmployeeToAPI(Employee employee) throws Exception {
        String requestBody = gson.toJson(employee);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(URL_API))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 201) {
            return Optional.of(gson.fromJson(response.body(), Employee.class));
        } else {
            System.err.println("Failed to add employee: " + response.body());
            return Optional.empty();
        }
    }
    public static void main(String[] args) throws Exception {
       List<Employee> employeeList=getEmployeeFromMockAPI();
        System.out.println("Employee:"+employeeList);
        Employee newEmployee =new Employee(6,"gia binh","so 8 ton that thuyet",30);
        Optional<Employee> addemployee= addEmployeeToAPI(newEmployee);
        addemployee.ifPresent(employee -> System.out.println("Added Employee"+employee));

    }
}
