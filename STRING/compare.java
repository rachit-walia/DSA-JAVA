
import java.util.*;

public class compare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

       try{
        if(!id.contains("@")){
            throw new Exception("Invalid");
           }
        
        if(!id.contains(".")){
            throw new Exception("Invalid");
           }
    
        int atIndex = id.indexOf("@");
        if(!id.indexOf(".",atIndex)==-1){
            throw new Exception("Invalid");
           }
        System.out.println("Valid");
       }catch(Exception e){
        System.out.println(e.getMessage());
       }    


    }
}
