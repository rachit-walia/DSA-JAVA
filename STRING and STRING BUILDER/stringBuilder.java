
public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");

        // Modify the first character
        str.setCharAt(0, 'm');
        System.out.println(str); // Output: "mello"

        // Insert "wal" at index 4
        str.insert(4, "wal");
        System.out.println(str); // Output: "melwallo"
        str.reverse();
        System.out.println(str);
    }
}
