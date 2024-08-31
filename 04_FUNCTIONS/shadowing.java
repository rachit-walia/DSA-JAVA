
public class shadowing {

    static int x = 90; // this variable is available to everyone inside

    public static void main(String[] args) {
        System.out.println(x);
        int x = 5; // the class variable at line 4 is a shadowed by this 
        System.err.println(x);
        // scope will began when value is initialized 
        x = 40;
        System.out.println(x);
        fun();

    }

    static void fun() {
        System.out.println(x);
    }
}
