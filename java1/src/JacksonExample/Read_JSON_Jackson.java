package JacksonExample;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Reader;
import java.lang.foreign.PaddingLayout;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read_JSON_Jackson {
    public static void main(String[] args) throws IOException {
        //Tao dong doc
        Reader reader= Files.newBufferedReader(Paths.get("employee.json"));
        ObjectMapper objectMapper=new ObjectMapper();
        //Read employee-doc tu dong reader
        JsonNode parser= objectMapper.readTree(reader);
        //list details employee
        System.out.println(parser.path("id").asLong());
        System.out.println(parser.path("name").asText());
        System.out.println(parser.path("email").asText());
        System.out.println(parser.path("age").asLong());
JsonNode address= parser.path("address");
        System.out.println(address.path("street").asText());
        System.out.println(address.path("city").asText());
        System.out.println(address.path("zipCode").asLong());
        System.out.println(address.path("project").asText());
        System.out.println(address.path("title").asText());
        System.out.println(address.path("budget").asLong());
    }
}
