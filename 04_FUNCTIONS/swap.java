
public class swap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swapping two numbers
        // int temp = a;
        // a = b;
        // b = temp;
        //
        swapping(a, b);
        System.out.println(a + " " + b);
        String name = "Rachit walia";
        changeName(name);
        // System.out.println(name);

    }

    public static void changeName(String name) {
        name = "Rahul Rana";
        // System.err.println(name);
    }

    static void swapping(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        // this change will only be valid in this function scope only!!

    }
}
