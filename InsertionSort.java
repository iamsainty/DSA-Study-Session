public class InsertionSort {
    public static void insertionSort(int[] arr){

        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int val = arr[i + 1];

            int j = i;

            while(j >= 0 && arr[j] > val){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = val;
        }
    }
    public static void main(String[] args) {
        

        // Insertion Sort

        // Consider array has two parts
        // left is Sorted and Right is unsorted
        // Pick element from the unsorted part, put at the correct position in sorted
        // Slowly the sorted part get bigger

        // 8  |  5   9   3   7
        // 5   8  | 9    3   7
        // 5   8    9  |  3   7
        // 3    5   8    9  |    7
        // 3    5   7   8    9  |



        // Selection Sort 
        // Pick smallest from unsorted and put at front

        // Insertion Sort
        // Pick first element from unsorted, put at correct position in sorted part
        
        int[] arr = {8, 5, 9, 3, 7};

        insertionSort(arr);

        for(int val : arr){
            System.out.print(val + " ");
        }

        System.out.println();



    }
}
