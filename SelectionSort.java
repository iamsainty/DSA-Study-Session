public class SelectionSort {

    public static void selectionSort(int[] nums){

        int n = nums.length;

        for(int i = 0; i < n; i++){
            int min = i;

            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }

            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
    public static void main(String[] args) {
        

        // Selection Sort

        // We select the smallest value in the unsorted part
        // Put that at the front

        // 8    5   9   3   7
        // 3    5   9   8   7
        // 3    5   9   8   7
        // 3    5   7   8   9
        // 3    5   7   8   9

        int[] arr = {8, 5, 9, 3, 7};

        selectionSort(arr);

        for(int val : arr){
            System.out.print(val + " ");
        }


        // Time Complexity - O(n ^ 2)
    }
}
