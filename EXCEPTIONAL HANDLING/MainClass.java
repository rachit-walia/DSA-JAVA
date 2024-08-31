
public class MainClass {

    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("HelloGuys");
        try {
            System.out.println(a[8]);
            int result = 5 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access the out of bound element");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("bye guys");
    }
}
