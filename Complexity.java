import java.util.*;

public class Complexity {
    public static void main(String[] args) {
        

        // to check / measure the number of operations done and space used with reference to input size given

        // Time complexity 

        // Time complexity is not the time taken to run the code 
        // it is number of operation based on the input given

        // Actual time taken to execute the program is dependednt system, RAM, JVM etc. things, This can vary for same program on different platforms 

        // Time complexity is operations performed 

        // O(1)
        System.out.println(123); 

        // O(5) -> O(1)
        System.out.println(123); 
        System.out.println(123); 
        System.out.println(123); 
        System.out.println(123); 
        System.out.println(123); 

        Scanner sc = new Scanner(System.in);



        // O(n)
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(123); 
        }

        sc.close();

        // O(n2)
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println(123); 
            }
        }

        //
        int i = 0;
        int j = n - 1;

        while(i <= j){
            int mid = (i + j) / 2;

            if(mid > 5) i = mid + 1;
            else j = mid - 1;
        }

        // 1 - m
        // 2 - m/2
        // 3 - m/4
        // 4 - m/8


        // ...

        // opr - 
        
        // O(log n)




        // {1, 2, 3}

        // {2, 2, 2};

        // 2 * 2 * 2 * 2.....

        // O(2 ^ n)

        // {} - {} - {}
        //         - {3}

        //    - {2} - {2}
        //         - {2, 3}

        // {1} - {1} - {1}
        //           - {1,3}

        //     - {1, 2} - {1,2}
        //             - {1,2,3}





        // Worst case - n

        // Average case - n / 2 -> n

        // Best case - 1

        // {1, 2, 3, 4, 5};

        

        

        




    



        // Space complexity



    }
}
