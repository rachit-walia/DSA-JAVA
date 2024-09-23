
public class builder {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        str.append("World");
        System.out.println(str);
        // hello-> mello
        str.setCharAt(0, 'm'); // set char
        System.out.println(str);
        str.append(10);
        System.out.println(str);
        str.insert(2, 'y');
        System.out.println(str);
        str.delete(0, 5);
        System.out.println(str);

        StringBuilder sb = new StringBuilder("Rachit");
        sb.reverse();
        System.out.println(sb);

    }
}
