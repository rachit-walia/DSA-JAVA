
public class Ques2 {

    public static void main(String[] args) {
        try {
            int e = 666 / 0;
        } catch (IllegalArgumentException e) {
            System.out.println("hehhe");
        } catch (ArithmeticException e) {
            System.out.println("hahhaha");
        }
    }
}
