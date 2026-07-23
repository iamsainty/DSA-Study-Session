import java.util.*;

public class Function {
    public static void main(String[] args) {

        // Function and Methods

        // Function - Normal function created outside the class
        // Method - Functions created inside the class

        // Java has only method, no function 

        // a - b;

        // int a , iunt









        // a - b;













        // sum()

        
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello"); <- 
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");

        // for (int i = 0; i < 10; i++) {
        // System.out.println("Hi");
        // System.out.println("World");

        // int a = 3;
        // int b = 4;

        // System.out.println(a - b);
        // }

        // int a = function(5);

        // greet();
        // greet2("Priyanshu");
        // System.out.println(genOTP());
        // System.out.println(sum(4, 5));


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);

        changeVal(list);

        for(int val : list){
            System.out.println(val);
        }
    }

    public static void changeVal(List<Integer> list){

        list.add(3);
        
        List<Integer> newList = new ArrayList<>();

        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);

        list = newList;
    }

    // public static int sum(int a, int b){
    //     return a - b;
    // }

    // Function - To remove redundancy

    // Structure

    // public static void add(parameters){
    // Function Implementation - Whatever we want the function to perform
    // }

    // accessModifier static returnType functionName(dataType variableName){

    // }

    // Access Modifier - Public, Private, Default - We will see in OOPs
    // static - we can use without creating object - We will see in OOPs
    // Return Type - What kind of data, the function will return - int, boolean,
    // String, Array, if nothing to be returned then use VOID

    // 4 Types of functions

    // // No Input No Return
    // public static void greet(){

    // A()
    // System.out.println("Hello");
    // }

    // // Input, No Return
    // public static void greet2(String name2){
    // System.out.println("Hello" + name2);
    // }

    // // No Input, Return
    // public static int genOTP(){
    // int otp = (int) (Math.random() * 10000);
    // return otp;
    // }

    // // Input, Return
    // public static int sum(int a, int b){
    // return a + b;
    // }

    // Function Overloading - Multiple functions with same name, but should have
    // something unique identifier

    // different number of parameters
    // different order of parameters
    // different data type of parameters

    public static void greet(int a, String name) {
        System.out.println("Hello");
    }

    public static void greet(String name, int a) {
        System.out.println("Hello" + name);
    }

    // Method - Defined within a class 
    // Function - Defined outside a class

    // Java do NOT have function, java only has method


    // Call by Value - Copy is passed to function / method 
    // Call by reference - Original value itself is passed

    // Java do not have Call by value, Java only has Call by reference

    int[] arr = new int[10];

    // in CPP

    // int function(int &arr[])  -- & by reference


    // fucntion(arr);





    // |---------------------------|
    // |   HEAP                    |
    // |                           |
    // |    Array is stored here   |
    // |                           |
    // |                           |
    // |---------------------------|
    // |    Stack                  |
    // |    arr                    |
    // |                           |
    // |---------------------------|

}
