public class Searching {


    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }


    public static int binarySearch(int[] arr, int target){

        // int can store upto 100;

        // you took an array of size 100;

        // [............99, 100];

        // i = 99;
        // j = 100;

        // i + j = 199 

        // 99 + (100 - 99) / 2
        // 99 + 1 / 2
        // 99 + 0.5

        // i + (j - i) / 2
        // (2*i + j - i) / 2
        // (i + j) / 2


        int i = 0;
        int j = arr.length - 1;

        while(i <= j){
            // int mid = (i + j) / 2;

            int mid = i + (j - i) / 2;

            if(arr[mid] == target) return mid;

            if(arr[mid] > target) j = mid - 1;
            else i = mid + 1;
        }

        return -1;
    }

    public static int binarySearchRotated(int[] nums, int target){

        int i = 0;
        int j = nums.length - 1;

        while(i <= j){
            int mid = i + (j - i) / 2;

            int left = nums[i];
            int middle = nums[mid];
            int right = nums[j];

            if(middle == target) return mid;

            if(left <= middle){
                if(target >= left && target < middle){
                    j = mid - 1;
                }
                else{
                    i = mid + 1;
                }
            }
            else{
                if(target > middle && target <= right){
                    i = mid + 1;
                }
                else{
                    j = mid - 1;
                }
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        

        // Searching - To search an element in a given search space 


        // Linear Search - Sequential Search
        // We search each element one by one

        // Algorithm

        // Start from first index
        // Compare the current element with target
        // if match return the index
        // else move to next index
        // if no element match return -1

        int[] arr = {3, 8, 1, 0, 8, 3, 9};

        int res = linearSearch(arr, 2);

        if(res != -1){
            System.out.println("Target found at index " + res);
        }
        else{
            System.out.println("Target not found");
        }

        // Complexity - O(n)



        // Binary Search - 
        // It is a searching algorithm to find index of element in a search space

        // Why binary search
        // It is optimal (fast) than linear search

        // Pre-requites
        // Sorted
        // Random access

        // Algorithm
        // Use two pointers, one at the start and another at the end
        // Find mid of the search space
        // check if the mid is target, return
        // if mid is greater than target, eliminate right part
        // else eliminate the left part
        // if the left pointer crosses the right pointer, return -1

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int ans = binarySearch(nums, 2);

        if(ans != -1){
            System.out.println("Target found at index " + ans);
        }
        else{
            System.out.println("Target not found");
        }

        // Complexity O(log n)


        // 1 - n / 1 - n / 2^0
        // 2 - n / 2 - n / 2^1
        // 3 - n / 4 - n / 2^2
        // 4 - n / 8 - n / 2^3

        // k - n / 2^(k - 1) = 1


        // n
        // 2^(k - 1)     = 1

        // n = 2 ^ (k - 1);

        // log n = log (2 ^ (k - 1));

        // log2 n = k





        // Binary Search on Rotated Sorted Array

        // 1, 2, 3, 4, 5, 6, 7 - Sorted

        // 3, 4, 5, 6, 7, 1, 2 - Rotated Sorted

        // Binary Search on Answer

















    }
}
