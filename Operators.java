public class Operators {
    public static void main(String[] args) {
        // OPERATORS

        // Operators are symbols that perform operations on operands (variables/values).

        // Arithmetic Operators

        // + Addition
        // - Subtraction
        // * Multiplication
        // / Division
        // % Modulus (Remainder)

        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

        // Division by zero

        // int x = 10;
        // int y = 0;

        // System.out.println(x / y); // ArithmeticException

        if (b != 0) {
            System.out.println(a / b);
        }

        // Relational Operators

        // > Greater than
        // < Less than
        // >= Greater than equal to
        // <= Less than equal to
        // == Equal to
        // != Not Equal to

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // Logical Operators

        // && AND
        // || OR
        // ! NOT

        // AND
        // true && true -> true
        // otherwise -> false

        System.out.println(true && true);
        System.out.println(true && false);

        // OR
        // false || false -> false
        // otherwise -> true

        System.out.println(false || true);
        System.out.println(false || false);

        // NOT

        System.out.println(!true);
        System.out.println(!false);

        // Bitwise XOR (^)

        // Different -> true
        // Same -> false

        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ false); // false

        // Assignment Operators

        // =
        // +=
        // -=
        // *=
        // /=
        // %=

        int num = 10;

        num += 5; // num = num + 5

        System.out.println(num);

        num -= 2;

        System.out.println(num);

        num *= 3;

        System.out.println(num);

        // Unary Operators

        // ++ Increment
        // -- Decrement

        int x = 5;

        System.out.println(++x); // 6

        System.out.println(x++); // 6

        System.out.println(x); // 7

        int y = 5;

        System.out.println(--y); // 4

        System.out.println(y--); // 4

        System.out.println(y); // 3

        // Pre Increment

        int p = 10;

        int q = ++p;

        System.out.println(q);

        // p = 11
        // q = 11

        // Post Increment

        int m = 10;

        int n = m++;
        System.out.println(n);

        // m = 11
        // n = 10

        // Important

        // Integer Division

        System.out.println(10 / 3); // 3

        System.out.println(10.0 / 3); // 3.333333...

        System.out.println((double) 10 / 3); // 3.333333...

        // Common Mistake

        // = -> Assignment

        // == -> Comparison

        // if(a = 10) // Error

        // if(a == 10) // Correct

    }
}
