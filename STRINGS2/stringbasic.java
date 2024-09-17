
import java.util.*;

public class stringbasic {

    public static void main(String[] args) {
        // String str = "Rachit Walia";
        // System.out.println(str);
        Scanner sc = new Scanner(System.in);
        // String f = sc.next(); //input from the string , but this will print only one word. this will not read the word next to space.

        // String s = sc.nextLine(); // this will print all the lines even after the spaces.
        // System.out.println(s);
        //
        // Inbuilt function that are charAt() and length(), indexof() and compareTo().
        //
        // String str = "Rachit";
        // String gtr = "Rachit";
        //
        // int len = str.length();
        // System.out.println(len);
        // char ch = str.charAt(3);
        // System.out.println(ch);
        // System.out.println(str.charAt(5));
        // System.out.println(str.indexOf('R'));
        // System.out.println(str.compareTo(gtr));
        //
        //contains() and startswith()
        //
        // String str = "Rachit walia";
        // System.out.println(str.contains("alia"));
        //
        // toLowercase() and toUpperCase()
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        String s1 = "abc";
        String s2 = "def";
        String f3 = s1.concat((s2));
        System.out.print(f3);
    }
}
