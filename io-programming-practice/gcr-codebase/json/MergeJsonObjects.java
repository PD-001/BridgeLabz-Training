package json;

import java.nio.file.Files;
import java.nio.file.Path;

import org.json.JSONObject;

public class MergeJsonObjects {

    public static void main(String[] args) {

        try {
            String json1 = Files.readString(Path.of("E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\filetomerge1.json"));
            String json2 = Files.readString(Path.of("E:\\DevTools\\Projects\\JAVA\\BTraining\\src\\json\\filetomerge2.json"));

            JSONObject obj1 = new JSONObject(json1);
            JSONObject obj2 = new JSONObject(json2);

            for (String key : obj2.keySet()) {
                obj1.put(key, obj2.get(key));
            }

            System.out.println(obj1.toString());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
