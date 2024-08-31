
public class ifelse {

    public static void main(String[] args) {
        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 1000;
        } else {
            salary = salary + 500;
        }
        System.err.println("salary is: " + salary);
    }
}
