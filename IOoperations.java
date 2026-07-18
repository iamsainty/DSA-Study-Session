import java.util.Scanner;

public class IOoperations {
    public static void main(String[] args) {

        // System -> predefined class in Java
        // Used for standard Input & Output operations

        // 3 ways to print output on screen

        // 1. println() -> prints and moves cursor to next line

        // System.out.println("Priyanshu");
        // System.out.println("Chaurasiya");

        // 2. print() -> prints and cursor remains on same line

        // System.out.print("Priyanshu ");
        // System.out.print("Chaurasiya\n"); // \n also moves to next line

        // 3. printf() -> formatted output

        // String name = "Priyanshu";
        // String lastName = "Chaurasiya";

        // System.out.printf("NAME = " + name + " LASTNAME = " + lastName);

        // System.out.println();

        // System.out.printf("NAME = %s LASTNAME = %s", name, lastName);

        // Format Specifiers
        // %d -> int
        // %f -> float/double
        // %c -> char
        // %s -> String
        // %b -> boolean

        // Example
        // double pi = 3.141592;
        // System.out.printf("%.2f", pi); // 3.14

        // Scanner -> predefined class used to take input from keyboard

        // import java.util.Scanner;

        // System.in -> standard input stream (keyboard)

        // Scanner sc = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();

        System.out.println(val);

        // Primitive Inputs

        // byte -> nextByte()
        // short -> nextShort()
        // int -> nextInt()
        // long -> nextLong()
        // float -> nextFloat()
        // double -> nextDouble()
        // boolean -> nextBoolean()

        // String

        // next() -> reads only one word (stops at space)
        // nextLine() -> reads complete line until Enter

        // Character

        // Scanner has NO nextChar()

        // char ch = sc.next().charAt(0);

        // Example

        // Input
        // Priyanshu Chaurasiya

        // next() returns
        // Priyanshu

        // nextLine() returns
        // Priyanshu Chaurasiya

        // Buffer Issue

        // int age = sc.nextInt();

        // nextInt() reads only number
        // Enter (\n) remains in buffer

        // sc.nextLine(); // consume leftover Enter

        // String name = sc.nextLine();

        // Good Practice

        // sc.close();




        // Type Casting
        // Converting one data type into another

        // Implicit Casting

        // Automatic
        // Smaller -> Bigger

        // byte -> short -> int -> long -> float -> double

        // int x = 10;

        // long y = x;

        // double z = x;

        // No data loss

        // Explicit Casting

        // Manual
        // Bigger -> Smaller

        // long a = 10;
        // int b = (int) a;

        // double pi = 3.14;
        // int num = (int) pi;
        // num = 3

        // Overflow Example

        // long c = 100000000000L;
        // int d = (int) c;
        // System.out.println(d);

        // char and int

        // char ch = 'A';
        // int ascii = ch;
        // System.out.println(ascii); // 65

        // int val = 66;
        // char letter = (char)val;
        // System.out.println(letter); // B

        // String <-> Integer

        String p = "123";

        // String -> int

        int n = Integer.parseInt(p);

        // int n = Integer.valueOf(p);

        // Both work
        // parseInt() returns primitive int
        // valueOf() returns Integer object (Auto-unboxed into int)

        System.out.println(n);

        // int -> String

        // int age = 21;

        // String s = String.valueOf(age);

        // next() vs nextLine()

        String name = sc.next();

        sc.nextLine(); // consume remaining newline

        String fullName = sc.nextLine();

        System.out.println(name);

        System.out.println(fullName);

        sc.close();
    }
}
