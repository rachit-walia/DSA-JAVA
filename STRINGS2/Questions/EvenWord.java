
public class EvenWord {

    public static void main(String[] args) {
        String str = "Hell World";
        for (String s : str.split(" ")) { // Fixed the parentheses
            if (s.length() % 2 == 0) {
                System.out.println(s);
            }
        }
    }
}
