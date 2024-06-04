package JsonExample.src;


import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Write_JSON_simple {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("employee.json"));
        JsonObject employee = new JsonObject();
        employee.put("id", 1);
        employee.put("name", "binh@gmail.com");
        employee.put("age", 20);

        JsonObject address = new JsonObject();
        address.put("Street", "So 8 ton that thuyet");
        address.put("city", "Hanoi");
        employee.put("address", address);
       JsonArray projects = new JsonArray();
        JsonObject p1=new JsonObject();
        p1.put("bugget",15000);

        JsonObject p2 =new JsonObject();
        p2.put("title","Push Sale");
        p2.put("bugget",5000);
        projects.addAll(Arrays.asList(p1,p2));
        employee.put("projects",projects);
        Jsoner.serialize(employee,writer);
        writer.close();


    }

}
