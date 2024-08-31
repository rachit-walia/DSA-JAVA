
import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        // Syntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(67);
        // list.add(452);
        // list.add(671);
        // list.add(657);
        // list.add(6157);

        //System.out.println(list.contains(654));// output: false
        //System.out.println(list.contains(657)); // output:true
        // we can update stuff as well
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list); // updated on zero index its showing 99
        //list.remove(3); // removing an element in arraylist
        // System.out.println(list); // output:[99, 452, 671, 6157]
        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list [index] will not work here
        }

    }
}
