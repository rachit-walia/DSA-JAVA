
public class Substring {

    public static void main(String[] args) {
        // String str = "abc";
        // String str1 = "abcdef";
        // boolean found = str1.contains(str);
        // System.out.println(found);

        // String str = "58219";
        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = i + 1; j <= str.length(); j++) {
        //         System.out.print(str.substring(i, j) + " ");
        //     }
        // }
        String str = "58219";
        StringBuilder sumString = new StringBuilder();

        // Start the sum string with the first number
        sumString.append(str.charAt(0));

        // Output the sum with the format Sum = 5 + (5+8) + (5+8+2) + (5+8+2+1) + (5+8+2+1+9)
        System.out.print("Sum = " + str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            sumString.append(str.charAt(i)); // Append the next character
            System.out.print(" + (" + sumString + ")");
        }
    }
}
