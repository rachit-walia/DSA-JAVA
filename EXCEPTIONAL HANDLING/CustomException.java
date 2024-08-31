
import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        try {
            if (age > 100) {
                throw new MyException("Age cannot be greater than 100");
            }
            System.out.println("Valid age entered: " + age);
        } catch (MyException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            sc.close(); // Close the Scanner resource
        }
    }
}

// Custom exception class
class MyException extends RuntimeException {

    public MyException(String message) {
        super(message); // Pass the message to the RuntimeException constructor
    }

}
