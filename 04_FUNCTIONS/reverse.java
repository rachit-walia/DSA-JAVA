import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        arrayDemo();
    }
    
    private static void arrayDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        
        // array before reverse
        System.out.println("Array before reverse");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("Array after reverse");
        for(int i = arr.length - 1; i >= 0; i--){
        System.out.println(arr[i]);
}

        // int max = arr[0];
        // int maxIndex = 0;

        // for (int i = 1;i<arr.length;i++) {
        //     if (arr[i]>max) {
        //         max = arr[i];
        //         maxIndex = i+1;
        //     }
        // }
        
        // System.out.println("The largest element is: " + max + " and its position is: " + maxIndex);
    }
}
