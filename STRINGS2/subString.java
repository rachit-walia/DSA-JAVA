
public class subString {

    public static void main(String[] args) {
        // substring-- it is a continous part of a string
        // String str = "abcd";
        // System.out.println(str.substring(0, 4));

        String str = "abcd";
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }

    }
}
