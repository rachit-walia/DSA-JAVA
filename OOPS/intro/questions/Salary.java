
class Employee {

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;

    }
}

public class Salary {

    public static void main(String[] args) {

        Employee rachit = new Employee();
        rachit.setName("Rachit Walia");
        rachit.salary = 50000;
        System.out.println(rachit.getSalary());

        System.out.println(rachit.getName());

    }
}
