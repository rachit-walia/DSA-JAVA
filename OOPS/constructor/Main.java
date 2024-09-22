
class MyEmployee {

    private int id;
    private String name;

    //constructor
    // public MyEmployee() {
    //     id = 45;
    //     name = "Your name here";
    // }
    public MyEmployee(String Myname, int Myid) {
        id = Myid;
        name = Myname;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }

}

public class Main {

    public static void main(String[] args) {
        MyEmployee rachit = new MyEmployee("Rachit walia", 695);
        System.out.println(rachit.getId());
        System.out.println(rachit.getName());

    }
}
