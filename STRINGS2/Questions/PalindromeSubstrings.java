
public class PalindromeSubstrings {

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        // Check characters from both ends
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;  // Not a palindrome
            }
            i++;
            j--;
        }
        return true;  // It's a palindrome
    }

    public static void main(String[] args) {
        String str = "aabbaabbaa";
        int count = 0;

        // Iterate over all substrings
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j);
                if (isPalindrome(substring)) {  // Check if the substring is a palindrome
                    System.out.print(substring + " ");
                    count++;
                }
            }
        }
        System.out.println("Total palindrome substrings: " + count);
    }
}
