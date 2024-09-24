
public class RemoveSpecialCharacter {

    public static void main(String[] args) {
        String inputString = "$$$@#Strin#@gStart#$";

        // Approach 1: Using replaceAll() method to remove all non-alphanumeric characters
        String cleanedString = inputString.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("String after removing special characters: " + cleanedString);
    }
}
