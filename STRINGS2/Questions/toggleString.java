
public class toggleString {

    public static void main(String[] args) {
        String str = "PhYSics";
        System.out.println(str);
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int) ch;
            if (asci >= 97) {
                flag = false;
            }
            if (flag == true) {
                asci = asci + 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            } else {
                asci = asci - 32;
                char dh = (char) asci;
                str = str.substring(0, i) + dh + str.substring(i + 1);
            }
        }
        System.out.println(str);

    }
}
