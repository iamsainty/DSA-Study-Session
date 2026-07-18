import java.util.*;

public class Program {
    public static void main(String[] args) {
        // SYSTEM class is predefined class of java, used for IO operations

        // OUTPUT

        // 3 methods to output the value, print on screen

        // System.out

        // 1 - System.out.println - print and then go to next line

        // System.out.println("Priyanshu");
        // System.out.println("Chaurasiya");

        // // 2 - System.out.print - print and remains in the same line

        // System.out.print("Priyanshu ");
        // System.out.print("Chaurasiya\n");

        // // 3 - System.out.printf - formatted print

        // String name = "Priyanshu";
        // String lastName = "Chaurasiya";

        // System.out.printf("NAME = " + name + "LASTNAME = " + lastName);
        // System.out.println();
        // System.out.printf("NAME = %s LASTNAME = %s", name, lastName);

        // %b, %d, %c, - same as CPP

        // INPUT

        // System.in

        Scanner sc = new Scanner(System.in);

        // int val = sc.nextInt();

        // System.out.println(val);

        // int - nextInt
        // byte - nextByte
        // float - nextFloat
        // double - nextDouble

        // string - next() - single word -
        // string - nextLine() - complete line
        // char - next().charAt(0)

        // hfjkbjksnav
        // khdsbfhjkbfdjklpriyashu

        // String name = sc.next();
        // System.out.println(name);

        // sc.nextLine(); // consume the rest of the current line

        // String anotherName = sc.nextLine();
        // System.out.println(anotherName);

        // CASTING

        // implicit

        // int x = 10;
        // long y = (int) x;

        // long a = 10; // 8 byte
        // int b = (int) a; // 4 byte

        // long c = 100000000000L;

        // int d = (int) c;

        // System.out.println(d);

        // int p = 2; // '0'

        String p = "0";

        // char q = (char) ('0' + p);

        // System.out.println(q);

        // String s = "1234"; // 1234

        int n = Integer.valueOf(p);

        System.out.println(n);

        // explicit

    }
}