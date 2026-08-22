public class Mathematics {
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void getFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void getPrimeFactorisation(int n) {

        int num = 2;

        while (n > 1) {
            while (n % num == 0) {
                n /= num;
                System.out.print(num + " ");
            }
            num++;
        }
    }

    public static void main(String[] args) {

        // Number Representation

        // 35738 _ 0->9

        // 3 * 10000
        // 5 * 1000
        // 7 * 100
        // 3 * 10
        // 8 * 1

        // 102201

        // 1 * 3^0
        // 0 * 3^1
        // 2 * 3^2

        // "10110" - String
        // 0 * 1
        // 1 * 2
        // 1 * 4
        // 0 * 8
        // 1 * 16

        // 1011 - 11

        // 88492594 - Integer

        // While number is greater than 0
        // digit = number % 10
        // number = number / 10

        // Reverse
        // Sum of digits
        // Product of Digits
        // Check Palindrome
        // Armstrong number

        // Divisibility, Factors & Multiples

        // Divisibility - If a number is divisible completely by X
        // Factors - Set of all numbers that divide number completely
        // Multiples - Set of numbers that that have current number as a factor

        // Factors <= Number <= Multiple

        // 12
        // Factors - 1, 2, 3, 4, 6, 12
        // Multiples - 12, 24, 36, 48......

        // Prime Numbers
        // Divisble by 1 and self

        // 27

        // 36
        // 1 * 36
        // 2 * 18
        // 3 * 12
        // 4 * 9
        // 6 * 6
        // 9 * 4
        // 12 * 3
        // 18 * 2
        // 36 * 1

        // O(n) -> O(root n)

        // Prime Factorization

        // getFactors(24);

        getPrimeFactorisation(60);

        System.out.println("End");

        // 2 * 2 * 2 * 3

        // int[] arr = {1,2,3,4,5,6};

        // i = 6 % 6 = 0

        // 1 * 12
        // 2 * 6
        // 3 * 4

        // 12 -> 6

        // 1 -> 1
        // 2 -> 4
        // 3 -> 9
        // 4 -> 16
        // 5 -> 25

        // 2 root 3
        // 16 - 4 * 4

        // x^2 = number

        int n = 15;
        boolean[] prime = new boolean[n];

        // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}
        // {_, F, T, T, F, T, F, T, F, F, F, T, F, T, F, F }

        for (int i = 2; i * i <= 15; i++) {
            if (!prime[i])
                continue;

            int j = i * 2;

            while (j <= n) {
                prime[j] = false;

                j += i;
            }
        }

        // (n root n)

        // int x = (int) Math.pow(n, n);

        // 5/2 = 2.5
        // ceil = 3
        // floor = 2

    }
}
