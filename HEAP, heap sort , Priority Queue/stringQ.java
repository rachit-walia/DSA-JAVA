// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class stringQ {

    public static void main(String[] args) {
        // // System.out.println("Try programiz.pro");
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String[] hello = str.trim().split("\\s+");
        // int s = hello.length;
        // System.out.println(s);
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder hello = new StringBuilder(str);

        // remove the vowels
        for (int i = 0; i < hello.length(); i++) {
            if (hello.charAt(i) == 'a') {
                hello.deleteCharAt(i);
                i--;
            }

        }
        System.out.println(hello);

    }
}
