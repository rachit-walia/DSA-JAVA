
import java.util.*;

public class SetAndHashSet {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Rachit Walia");
        names.add("Nandita");
        names.add("nike");
        names.add("Mikkle");
        names.add("nike");
        System.out.println(names);
        names.remove(0);// this will  not work

        // for (String name : names) {
        //     System.out.println(name);
        // }

        /* 
        names.forEach(System.out::println);
        System.out.println(names);
        System.out.println(names.contains("nike"));
        System.out.println(names.isEmpty());
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
         */
        List<Integer> numberList = new ArrayList<>();
        numberList.add(3);
        numberList.add(31);
        numberList.add(3);
        numberList.add(23);
        numberList.add(41);
        System.out.println(numberList);

        Set<Integer> numberSet = new HashSet<>();
        numberSet.addAll(numberList);
        System.out.println(numberSet);
    }
}
