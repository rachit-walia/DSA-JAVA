public class Custom {

    public static void main(String[] args) {
        Employee Rachit = new Employee(); // instantiating a new Employee object
        Employee John = new Employee(); // instantiating a new Employee object

        // setting attributes for Rachit
        Rachit.id = 695;
        Rachit.name = "Rachit Walia";
        Rachit.salary = 500000;

        // setting attributes for John
        John.id = 16;
        John.name = "John Sharma";
        John.salary = 5000;

        // printing the attributes 
        Rachit.printDetails();
        John.printDetails();
        
        // getting salary for John
        int salary = John.getSalary();
        System.out.println("John's salary is: " + salary);
    }
}

class Employee {

    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My id is " + id);
        System.out.println("And my name is " + name);
    }

    // method to return salary
    public int getSalary() {
        return salary;
    }
}
