
public class FinallyBlock {

    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("HelloWorld");
        try {
            int c = 5;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("I will run always");
        }
        System.out.println("Bye world");
    }
}
