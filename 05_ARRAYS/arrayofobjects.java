
import java.util.*;

public class arrayofobjects {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        // modify
        str[2] = "rachit";
        System.out.println(Arrays.toString(str));

    }
}
