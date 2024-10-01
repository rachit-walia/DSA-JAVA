
import java.util.*;

public class LearnSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(20);

        set.remove(10);
        System.out.println(set);

    }
}
