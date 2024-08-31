import java.util.Scanner;

class MAXmin {
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
        
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1;i<arr.length;i++) {
            if (arr[i]>max) {
                max = arr[i];
                maxIndex = i+1;
            }
        }
        
        System.out.println("The largest element is: " + max + " and its position is: " + maxIndex);
    }
}
