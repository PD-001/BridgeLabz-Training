package json;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJSONUsingJackson {
    public static void main(String[] args) {
        String source= "E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\student.json";
        ObjectMapper mapper= new ObjectMapper();

        try {
            JsonNode rootNode= mapper.readTree(new File(source));

            if (!rootNode.isArray()) {
                throw new RuntimeException("Invalid JSON: Root element must be an array");
            }

            for (JsonNode node: rootNode) {
                if (!node.has("id")||!node.get("id").isInt()) {
                    throw new RuntimeException("Invalid or missing 'id'");
                }

                if (!node.has("name")||!node.get("name").isTextual()) {
                    throw new RuntimeException("Invalid or missing 'name'");
                }

                if (!node.has("email")||!node.get("email").isTextual()) {
                    throw new RuntimeException("Invalid or missing 'email'");
                }
                int id= node.get("id").asInt();
                String name= node.get("name").asText();
                String email= node.get("email").asText();

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
            }

            System.out.println("JSON structure is valid");

        } catch (Exception e) {
            System.out.println("JSON validation failed: " + e.getMessage());
        }
    }
}
