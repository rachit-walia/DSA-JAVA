public class conversion{
    public static void main(String[]args){
        decimaltobinary(5);
    }
    static void decimaltobinary(int n){
        int remainder=0;
        int sum=0;
        int multiply=1;
        while(n>0){
            remainder=n%2;
            sum=sum+remainder*multiply;
            n=n/2;
            multiply=multiply*10;
        }
        System.out.println(sum);
    }
}