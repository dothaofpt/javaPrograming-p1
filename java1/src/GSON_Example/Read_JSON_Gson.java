
package GSON_Example;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Read_JSON_Gson {
    public static void main(String[] args) throws IOException {
        Reader reader = Files.newBufferedReader(Paths.get("employee.json"));

        // Parse JSON object
        JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();

        // Read and print employee details
        System.out.println(parser.get("id").getAsLong());
        System.out.println(parser.get("name").getAsString());
        System.out.println(parser.get("age").getAsLong());

        // Read and print address details
        JsonObject address = parser.get("address").getAsJsonObject();
        System.out.println(address.get("street").getAsString());
        System.out.println(address.get("city").getAsString());
        System.out.println(address.get("zipcode").getAsLong());

        // Read and print project details
        for (JsonElement projectElement : parser.get("projects").getAsJsonArray()) {
            JsonObject project = projectElement.getAsJsonObject();
            System.out.println(project.get("title").getAsString());
            System.out.println(project.get("budget").getAsLong());
        }

        reader.close();
    }
}
