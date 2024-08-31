
import java.util.*;

public class fruits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" ->
                System.err.println("King of fruits");
            case "Apple" ->
                System.err.println("A bekr fruit");

            case "Grapes" ->
                System.err.println("small fruit");
            default ->
                System.err.println("please enter a valid fruit");
        }

    }
}
