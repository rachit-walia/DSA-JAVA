
public class functionOverloading {

    public static void main(String[] args) {
        fun(56);
        fun("Rachit walia");

    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Rachit Walia");
    }
}
// if two function have same name but different argumnents is called function overloading/ method overloading.
