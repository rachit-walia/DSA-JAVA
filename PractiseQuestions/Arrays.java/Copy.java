
public class Copy {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10};
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
