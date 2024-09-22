
public class Ques1 {

    public static void main(String[] args) {
        // Syntax error

        // logical error
        try {
            int age = 78;
        } catch (Exception e) {
            System.out.println("this give an error for " + e);
        }

        try {
            System.out.print(6 / 0);
        } catch (Exception e) {
            System.out.println("This will give an logical error " + e);
        }
    }
}
