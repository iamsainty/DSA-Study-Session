public class QuickSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int st, int end){

        if(st < end){

            int left = st;
            int right = end;

            int pivot = end;

            int key = arr[pivot];
            
            while(left < right){
                
                while(arr[left] < key){
                    left++;
                }
                
                while(arr[right] >= key){
                    right--;
                }
                
                if(left < right) swap(arr, left, right);
                
            }
            
            swap(arr, left, pivot);
            
            quickSort(arr, st, right);
            quickSort(arr, left + 1, end);
        }
    }
    public static void main(String[] args) {
        

        // Quick Sort
        // It is a divide and conquor algorithm, where we choose a key (pivot) and place all elements less than key before it, and all elements greater than key after it, and perform this recursively

        // Algorithm
        // pick a key element
        // place all elements less than or equal to before the key
        // place all elements greater than after the key
        // recursively perform on the subarray left to the key and right to the key


        int[] arr = {7, 3, 1, 5, 0, 4, 8, 9};

        quickSort(arr, 0, 7);

        for(int val : arr){
            System.out.print(val + " ");
        }

        System.out.println();

    



    }
}
