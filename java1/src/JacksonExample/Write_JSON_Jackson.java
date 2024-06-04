package JacksonExample;



import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Write_JSON_Jackson {
    public static void main(String[] args) throws IOException {
        //Tao dong ghi
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("employee.json"));
        //tao doi tuong Employee voi map
        Map<String,Object> employee=new HashMap<>();
        employee.put("id",1);
        employee.put("name","Gia Binh");
        employee.put("age",18);
        //Tao address
        Map<String,Object> address=new HashMap<>();
        address.put("street","so 8 ton that thuyet");
        address.put("city","Hanoi");
        address.put("zipcode",1000);
        //Add an address to the employee
        employee.put("address",address);
        //create projects
        Map<String,Object> project1=new HashMap<>();
        project1.put("title","Json Application");
        project1.put("budget",20000);

        Map<String,Object> project2=new HashMap<>();
        project2.put("title","Employee management");
        project2.put("budget",20000);
        //Them project vao employee
        employee.put("projects", Arrays.asList(project1,project2));
        //Tao project:ObjectMapper
       ObjectMapper mapper= new ObjectMapper();
        //ghi dt ra json file
        writer.write(mapper.writeValueAsString((employee)));
  writer.close();
    }
}
