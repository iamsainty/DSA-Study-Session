import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        // 1D - Array
        // if we had to store marks of students

        // int m1, m2, m3, m4;
        // int[] marks = new int[5];

        // Roll No English Hindi Science
        // 1 12 13 16
        // 2 11 72 83
        // 3 47 78 48
        // 4 82 74 44

        // {12, 13, 16, 11, 72, 83}

        // int[] marks = new int[5];
        // int[][] marks = new int[4][3];

        // int[][] marks = { { 12, 13, 16 }, { 11, 72, 83 }, { 47, 78, 48 }, { 82, 74, 44 } };

        int[] arr = new int[5];

        int[][] marks = new int[3][3];

        // 1    2   3
        // 4    5   6
        // 7    8   9

        // marks.length;

        // marks[0].length;

        // int[][] nums = new int[0][0];

        // // System.out.println(nums[0].length);

        // for(int[] row : marks){
        //     for(int val : row){
        //         System.out.print(val);
        //     }
        // }


        // Accesing

        // marks[1] // this returns object 
        // marks[1][2] // this returns element 


        // Input

        // Scanner sc = new Scanner(System.in);

        // for(int i = 0; i < 3; i++){
        //     for(int j = 0; j < 3; j++){
        //         int val = sc.nextInt();
        //         marks[i][j] = val;
        //     }
        // }

        // sc.close();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(marks[i][j]);
            }
            System.out.println();
        }

        // Jagged

        int[][] jaggedArr = new int[4][];

        // for(int[] row : jaggedArr){
        //     System.out.println(row);
        // }

        jaggedArr[0] = new int[5];
        jaggedArr[1] = new int[2];
        jaggedArr[2] = new int[6];
        jaggedArr[3] = new int[0];

        for(int[] row : jaggedArr){
            for(int val : row){
                System.out.print(val);
            }
            System.out.println();
        }
        

    }
}
