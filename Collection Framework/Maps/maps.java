
import java.util.*;

public class maps {

    public static void main(String[] args) {
        // Creating a HashMap to store employee IDs
        HashMap<String, Integer> empIds = new HashMap<>();

        // Adding entries to the map
        empIds.put("John", 1234);
        empIds.put("Curl", 1245);
        empIds.put("Dickk", 124);
        empIds.put("Mia", 123);

        // Printing the entire map
        System.out.println("Employee IDs: " + empIds);
        System.out.println(empIds.get("Curl"));
        System.out.println(empIds.containsValue(123));
    }
}
