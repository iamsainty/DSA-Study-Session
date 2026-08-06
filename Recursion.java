public class Recursion {
    public static int getSum(int[] arr, int i){
        // base case
        if(i >= arr.length){
            return 0;
        }

        return arr[i] + getSum(arr, i + 1);
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


    }
}
