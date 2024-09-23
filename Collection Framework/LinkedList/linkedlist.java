
import java.util.LinkedList;

public class linkedlist {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        l1.add(7);
        l1.add(6);
        l1.add(4);
        l1.add(9);
        l1.add(5);
        l1.add(0, 5);
        l1.add(0, 2);
        l1.addAll(l2);
        System.out.println(l1.contains(4));
        System.out.println(l1.indexOf(400));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));
        l1.set(1, 13);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + ", ");
        }
    }
}
