
import java.util.*;

public class employee {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Rachit walia");
                break;
            case 2:
                System.out.println("Rahul gupta");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.err.println("Management");
                        break;
                    default:
                        System.err.println("No department");
                        break;

                }
                break;
            default:
                System.err.println("No employee id");
        }

    }
}
