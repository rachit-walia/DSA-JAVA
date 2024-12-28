
public class palindromeSubstring {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abbd";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) { // Loop to generate substrings
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) { // Check if the substring is a palindrome
                    System.out.println(substring);
                    count++;
                }
            }
        }
        System.out.println("The number of palindrome substrings are: " + count);
    }
}
