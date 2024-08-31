
import java.util.Arrays;

public class passinginfunction {

    public static void main(String[] args) {
        int[] nums = {3, 5, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
// Arrays are mutable in java that means we change change the object
// strings are im-mutable in java
