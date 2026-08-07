public class Recursion {
    public static int getSum(int[] arr, int i){
        // base case
        if(i >= arr.length){
            return 0;
        }

        int sum = arr[i] + getSum(arr, i + 1);

        return sum;
    }

    // sum = 1 + getSum(arr, 1);
    //           2 + getSum(arr, 2);
    //               3 + getSum(arr, 3);
    //                   4 + getSum(arr, 4)
    //                       5 + getSum(arr, 5);
    //                            0 


    // sum = 1 + 14
    //           2 + 12
    //               3 + 9
    //                   4 + 5
    //                       5 + 0
    //                            0 
                               
                      

    public static void star(int n){
        if(n <= 0) return;

        System.out.print('*' + " ");

        star(n - 1);

    }
                      

    public static void printStar(int n){

        if(n <= 0){
            return;
        }

        star(n);
        System.out.println();

        printStar(n - 1);

    }




    public static void main(String[] args) {
        

        int[] arr = {1, 2, 3, 4, 5};

        // sum from 1 to 10
        // 1 + sum from 2 to 10

        

        // int sum = 0;

        // for(int i = 0; i < 10; i++){
        //     sum += arr[i];
        // }
        // TC - O(n) - SC - O(1)


        int sum = getSum(arr, 0);
        // TC - O(n) - SC - O(n)

        System.out.println(sum);

        printStar(5);


        // *    *   *   *   *
        // *    *   *   *
        // *    *   *
        // *    *
        // *

        // Recursion - Do the small work, and use that for bigger problem



        // --------------------------------------------------------------------------------------------


        // Recursion - A method calling itself is a recursion

        // Everytime a method calls itself, a new Stack Frame is created in the Stack Memory

        // Forward Phase
        // When a method is called in recursion, and a new stack frame is created, that is called forward phase 

        // Backward Phase
        // When the method in recursion completed execution and returns the value, and a new stack frame is destroyed, that is called backward phase 



        // Time complexity 




        

    }


    public static int fun(int n){

        if(n >= 0) return 0;

        return n + fun(n - 1);
    }
    // TC - O(n) - SC - O(n)


    public static int fun2(int n){

        if(n >= 0) return 0;

        return n + fun2(n / 2);
    }
    // TC - O(log n) - SC - O(log n)


    public static int fun3(int n){

        if(n <= 0) return 0;

        return n + fun3(n - 1) + fun3(n - 2);
    }


    // TC - O(2 ^ n) - SC - O(2 ^ n)



    public static int fun4(int n, int[] memo){

        if(n <= 0) return 0;
        if(memo[n] != -1) return memo[n];

        int val = n + fun3(n - 1) + fun3(n - 2);

        memo[n] = val;

        return val;
    }

    // TC - 2 * n = n
    // SC - n for stack frame, n for memorization - 2 * n = n



    // Tail recursion and Normal recusrion

    // Tail recursion - the method, where any computation or work is not left after the recursive method returns some value 

    
    // Normal recurstion
    public static int sum(int[] arr, int i){
        if(i >= arr.length) return 0;
        return arr[i] + sum(arr, i + 1);
    }

    // tail recursion
    public static void print(int n){
        if(n <= 0) return;
        System.out.println("Hello");
        print(n - 1);
    }

    // HOMEWORK 

    // Binary Search with recursion
    // print 1 2 3 4 5 6 7 8 9 10
    // print 10 9 8 7 6 5 4 3 2 1

    // for question 2, 3
    // Do not do something like for one question passing starting parameter as 1 and 10 for other
    // You have pass same value (Either 1 or 10) to both the methods

}
