
import java.util.Arrays;

public class SortStringAlphabet {

    public static void main(String[] args) {
        // without using sort method
        String str = "rachit";
        char arr[] = str.toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];    // store arr[i] in temp
                    arr[i] = arr[j];  // swap arr[i] with arr[j]
                    arr[j] = temp;    // assign temp (original arr[i]) to arr[j]
                }
            }
        }
        System.out.println(new String(arr));
        // using sort method

        String str1 = "rock";
        char[] chararray = str1.toCharArray();
        Arrays.sort(chararray);
        System.out.println(new String(chararray));
    }
}
