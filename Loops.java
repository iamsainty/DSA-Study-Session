import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        // LOOPS

        // Used to execute a block of code multiple times.

        // FOR LOOP

        // Best when number of iterations is known.

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // initialization -> runs only once
        // condition -> checked before every iteration
        // update -> runs after every iteration

        // WHILE LOOP

        // Used when number of iterations is unknown.

        int i = 0;

        while (i < 5) {

            System.out.println(i);

            i++;
        }

        // DO WHILE
        // Executes at least once.

        int j = 10;

        do {

            System.out.println(j);

        } while (j < 5);

        // Output
        // 10

        // because condition is checked AFTER execution

        // FOR EACH LOOP

        // Used to traverse arrays and collections.

        int[] arr = { 1, 2, 3, 4 };

        for (int val : arr) {
            System.out.println(val);
        }

        // val is COPY of each element.

        // Changing val does NOT change array.

        for (int val : arr) {
            System.out.println(val);
            val = 100;
        }

        System.out.println(Arrays.toString(arr));

        // [1, 2, 3, 4]

        // If modification is required

        for (int k = 0; k < arr.length; k++) {
            arr[k] = 100;
        }

        System.out.println(Arrays.toString(arr));

        // [100, 100, 100, 100]

        // break

        // Immediately exits the loop.

        for (int k = 1; k <= 10; k++) {

            if (k == 5) {
                break;
            }

            System.out.println(k);
        }

        // Output
        // 1 2 3 4

        // continue

        // Skip current iteration.

        for (int k = 1; k <= 5; k++) {

            if (k == 3) {
                continue;
            }

            System.out.println(k);
        }

        // Output
        // 1 2 4 5

        // Nested Loop

        for (int row = 1; row <= 3; row++) {

            for (int col = 1; col <= 3; col++) {

                System.out.print("* ");

            }

            System.out.println();

        }

        // * * *
        // * * *
        // * * *

    }
}
