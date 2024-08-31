
public class needofarray {

    public static void main(String[] args) {
        // Q: store a roll no.
        int a = 19;

        // Q: Store a person's name
        // String name = "Rachit walia";
        // Q: Store 5 roll no.
        // int[] rollno = new int[5];
        // or directly
        // int[] rollno2 = {23, 5, 45, 3, 67};
        //
        int ros[]; // this is called decleration of array. ros is getting defined in the stack

        ros = new int[5]; // initialization: actually here object is being created in the memory(heap).
        String[] arr = new String[4];
        System.out.println(arr[0]); // output: null
    }
}

// array is a collection of data types it can either be primitive or non primitive.
// syntax
// datatype[] variable_name=new datatype[size];
