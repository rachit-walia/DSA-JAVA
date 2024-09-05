
public class Numbers {

    public static void main(String[] args) {
        // write a function that takes in a numbers and prints it
        // print first 5 numbers
        print1(1);
    }

    static void print1(int n) {
        if (n == 5) {
            System.out.println("5");
            return;
        }
        System.out.println(n);
        print1(n + 1);
    }
}
