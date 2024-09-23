
public class interning {

    public static void main(String[] args) {
        String s = "hello"; //we cannot change a indiviudal letter in a string
        String x = "hello";
        x = "mello";
        System.out.println(s);
        System.out.println(x);
        // s.charAt(0)="q";
        s = "Dello";
        System.out.println(s);
        s = s.substring(0, 2) + "y" + s.substring(3);
        System.out.println(s);
    }
}
