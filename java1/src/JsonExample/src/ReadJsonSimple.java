package JsonExample.src;

import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonException;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class ReadJsonSimple {
    public static void main(String[] args) throws IOException, JsonException {
// Tạo 1 đối tượng reader để đọc dữ liệu từ file json Paths.get("employee.json") chỗ đến vị trí của file

        Reader reader = Files.newBufferedReader(Paths.get("employee.json"));
// phân tích reader thành obj JsonObject = pt Jsoner.deserialize của thư viện json-simple

        JsonObject parser= (JsonObject) Jsoner.deserialize(reader);
        //truy cập và in ra các thông tin nhân viên
        BigDecimal id =(BigDecimal)parser.get("id");
        String name=(String)parser.get("name");
        String email=(String)parser.get("email");
        BigDecimal age =(BigDecimal)parser.get("age");
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
        Map<Object,Object> address=(Map<Object, Object>) parser.get("address");
        // lấy "address" từ jsonỌbject, nó được ép thành kiểu Map vì "address"
        //  chứa các cặp key-value
        address.forEach((key,value)->System.out.println( key +":"+ value));
        //lặp qua từng key-value trong map "address"
        JsonArray projects=(JsonArray)parser.get("projects");
        projects.forEach(entry->{
            //lặp qua từng phần tử trong mảng projects
            JsonObject project=(JsonObject) entry;
            //mỗi đối tượng project dc ép kiểu  thành JsonObject
            System.out.println(project.get("title"));
            System.out.println(project.get("Budget"));

        });
    }

}
