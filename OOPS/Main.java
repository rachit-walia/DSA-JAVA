
public class Main {

    public static void main(String[] args) {
        // Initialize a Student object
        Student rachit = new Student();

        // Assign values to the object
        rachit.rollno = 1;
        rachit.name = "Rachit Walia";
        rachit.marks = 85.5f;

        // Print the student details
        System.out.println("Roll No: " + rachit.rollno);
        System.out.println("Name: " + rachit.name);
        System.out.println("Marks: " + rachit.marks);
    }

    // Define the Student class
    static class Student {

        int rollno;
        String name;
        float marks;
    }
}
