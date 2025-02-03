
public class RemoveDuplicates {

    public static void remove(String str, int idx, StringBuilder newStr, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        if (!map[currChar - 'a']) { // Check if character is not already added
            map[currChar - 'a'] = true;
            newStr.append(currChar);
        }

        remove(str, idx + 1, newStr, map); // Recursive call
    }

    public static void main(String[] args) {
        String str = "programming";
        boolean[] map = new boolean[26]; // For tracking lowercase a-z characters
        remove(str, 0, new StringBuilder(), map);
    }
}
