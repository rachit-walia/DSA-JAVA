
public class RemoveWhiteSpaces {

    public static void main(String[] args) {
        String str = "R A C H I T";

        // using replaceAll method
        String better = str.replaceAll(" ", "");
        System.out.println(better);
        // using trim method
        // String trimmedStr = str.trim();
        // System.out.println(trimmedStr); // this is not working as it only removing last and forst spaces of string
    }
}
