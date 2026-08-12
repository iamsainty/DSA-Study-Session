public class MergeSort {
    public static void merge(int[] arr, int st, int mid, int end){
        int len1 = mid - st + 1;
        int len2 = end - mid;

        int[] temp1 = new int[len1];
        int[] temp2 = new int[len2];

        for(int i = 0; i < len1; i++){
            temp1[i] = arr[st + i];
        }

        for(int i = 0; i < len2; i++){
            temp2[i] = arr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = st;

        while(i < len1 && j < len2){
            if(temp1[i] <= temp2[j]){
                arr[k] = temp1[i];
                i++;
            }
            else{
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i < len1){
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while(j < len2){
            arr[k] = temp2[j];
            j++;
            k++;
        }
    }


    public static void mergeSort(int[] arr, int st, int end){
        if(st < end){
            int mid = st + (end - st) / 2;

            mergeSort(arr, st, mid);
            mergeSort(arr, mid + 1, end); // log N

            merge(arr, st, mid, end);  // (N * (log N) )
        }
    }

    // log N + log N + N Log N = N log N

    public static void main(String[] args) {
        

        // It is a divide and conqour approach where we break the array into halves and then merge them while sorting

        // Algorithm
        // While the array size is greater than 1
        // Divide the arrays into two halves
        // then merge the two divided arrays while sorting

        int[] arr = {5, 6, 3, 2, 9, 4, 0, 1};

        mergeSort(arr, 0, 7);

        for(int val : arr){
            System.out.print(val + " ");
        }

        System.out.println();
    }
}
