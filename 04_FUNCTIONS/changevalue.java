
import java.util.Arrays;

public class changevalue {

    public static void main(String[] args) {
        // create an array
        int[] arr = {1, 2, 4, 45, 6};
        change(arr);
        System.err.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable,same object will be changed 
    }
}
