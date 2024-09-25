
import java.util.*;

public class ListMore {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("apple");
        fruits.add("mango");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("fruits is " + fruits.get(i));
        }
        for (String fruit : fruits) {
            System.out.println("for each fruits" + fruits);
        }
        List<String> smalllist = fruits.subList(1, 2);
        System.out.println(smalllist);
    }
}
