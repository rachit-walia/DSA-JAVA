
public class FindSubsets {

    public static void findSets(String str, String ans, int i) {
        // basecase
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // recursion
        // yes choice
        findSets(str, ans + str.charAt(i), i + 1);
        // no choice
        findSets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSets(str, " ", 0);
    }
}
