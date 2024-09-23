
public class palindrome {

    public static void main(String[] args) {

        String str = "abcdcba";
        // StringBuilder gtr = new StringBuilder(str);
        // String rev = gtr.reverse().toString();
        // if (str.equals(rev)) {
        //     System.out.println(str + " is a palindrome.");
        // } else {
        //     System.out.println(str + " is not a palindrome.");
        // }
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;

        }
        if (flag == true) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
