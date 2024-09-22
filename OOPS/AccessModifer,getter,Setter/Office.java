
class MyEmployee {

    // Private fields
    private int id;
    private String name;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int i) {
        id = i;
    }

}

public class Office {

    public static void main(String[] args) {
        MyEmployee rachit = new MyEmployee();

        // Using setters to assign values to private fields
        rachit.setId(45);
        rachit.setName("Rachit Walia");

        // Using getters to access and print the values
        System.out.println("Employee ID: " + rachit.getId());
        System.out.println("Employee Name: " + rachit.getName());
    }
}
