import java.util.*;

public class Backtracking {

    public static void generateSubsets(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans) {
        if (i == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        generateSubsets(arr, i + 1, curr, ans);
        
        curr.add(arr[i]);
        generateSubsets(arr, i + 1, curr, ans);
        curr.remove(curr.size() - 1);
        
    }

    public static void main(String[] args) {

        // Backtracking is a technique to solve problems by trying to build a solution
        // incrementally and removing the last added element if it doesn't lead to a
        // solution.

        // we have choices in the recursive call
        // We choose one of the choice and move with recursion
        // come back and remove the selected choice and try with the next choice

        // normal recursion
        // Sum of all numbers in an array

        // Fibonacci series
        // fib(n) = fib(n-1) + fib(n-2)

        // Backtracking
        // Find all possible subsets of elements in an array

        int[] arr = { 1, 2, 3 };

        // subsets of {1,2,3} are: {}, {1}, {2}, {3}, {1,2}, {1,3}, {2,3}, {1,2,3}

        List<List<Integer>> ans = new ArrayList<>();

        generateSubsets(arr, 0, new ArrayList<>(), ans);

        for (List<Integer> subset : ans) {
            System.out.print("Subset: ");
            for (Integer num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
