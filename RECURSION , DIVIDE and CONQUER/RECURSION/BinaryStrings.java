
public class BinaryStrings {

    public static void binary(int n, int lastPlace, String str) {
        // Base case: If length is reached, print the string and return
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // Always add '0'
        binary(n - 1, 0, str + "0");

        // Add '1' only if the last placed digit was '0'
        if (lastPlace == 0) {
            binary(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        int n = 3; // Length of binary strings
        binary(n, 0, "");
    }
}
