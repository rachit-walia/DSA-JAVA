
public class CustomException2 {

    public static void main(String[] args) {
        int[] h = new int[5];
        System.out.println("The code before error");
        try {
            // try {
            //     int a = 100 / 0;
            // } 
            throw new HelloException("this is  throw ");
        } // try {
        //     System.out.println(h[18]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("The array error is: " + e.getMessage());
        // }
        // try {
        //     double b = 6.0;  
        //     int c = (int) b; 
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        catch (Exception e) {
            System.out.println("Error is: " + e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
        System.out.println("code after exceptions");
    }
}

class HelloException extends Exception {

    // Constructor
    HelloException(String message) {

        super(message);
    }
}
