public class BubbleSort {
    public static void bubbleSort(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){

            for(int j = 0; j < n - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        
        // Sorting -
        // Sorting is done to sort the data given in an order 
        // Generally we sort in ascending order


        // Bubble Sort 

        // if we the left value in adjacent elements is greater, we swap them
        // By this, everytime the largest element in the unsorted array goes to end


        // 8    5   9   3   7
        // 5    8   3   7   9
        // 5    3   7   8   9
        // 3    5   7   8   9

        int[] arr = {8, 5, 9, 3, 7};

        bubbleSort(arr);

        for(int val : arr){
            System.out.print(val + " ");
        }


        // Time Complexity - O(n ^ 2)
    }
}
