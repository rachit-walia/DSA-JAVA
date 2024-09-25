
import java.util.*;

public class LearnList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);
        System.out.println("Elements of list 1 are: " + list);

        System.out.println(list.get(0));
        list.set(1, 200);
        System.out.println(list);
        list.add(0, 695);
        System.out.println(list);

        // System.out.println(list.size());
        // System.out.println(list.contains(20));
        // System.out.println(list.contains(200));
        // list.remove(1);
        // System.out.println(list);
        // list.remove(Integer.valueOf(1));
        // System.out.println(list);
        //
        //
        //
        // List<Integer> list2 = new ArrayList<>();
        // list2.add(5);
        // list2.add(4);
        // list2.add(3);
        // list2.add(2);
        // list2.add(1);
        // System.out.println("Elements of list2 are: " + list2);
        // list.addAll(list2);
        // System.out.println(list);
        // // list.removeAll(list2);
        // list.retainAll(list2);
        // System.out.println(list);
        // // Object a[]=list.toArray();
        // list.clear();
        // System.out.println(list);
    }
}
