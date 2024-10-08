
import java.util.*;

public class hashing {

    public static void main(String[] args) {
        // country(key),population(value)
        HashMap<String, Integer> map = new HashMap<>();
        // insertion
        map.put("india", 120);
        map.put("Us", 30);
        map.put("china", 130);
        System.out.println(map);

        map.put("china", 180);
        System.out.println(map);

        // search
        if (map.containsKey("china")) {
            System.out.println("key is Present is the map");
        } else {
            System.out.println("Not present in ther map");
        }
        System.out.println(map.get("china"));
        System.out.println(map.get("Indonesia"));

    }
}
