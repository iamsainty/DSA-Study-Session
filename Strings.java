import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // Priyanshu


        // String name = "Priyanshu Chaurasiya";
        // String anotherName = "Priyanshu Chaurasiya";

        // System.out.println(name == anotherName);

        // String s1 = new String("Hello");
        // String s2 = new String("Hello");

        // System.out.println(s1 == s2);

        // System.out.println(s1.equals(s2));

        // Java has immutable Strings, the value can not be changed 

        // String s = "Hello"; // 1000

        // s = s + 'A';

        // Hello + A = HelloA // 2000

        // System.out.println(a);
        // System.out.println(s);

        // Hello
        // HelloA

        // int a = 8;
        // a = 10;

        // String newString = s.concat("World");

        // System.out.println(s);
        // System.out.println(newString);


        // String s = "Hello";

        // System.out.println(s.toUpperCase());

        // String upper = s.toUpperCase();


        // "ABCDEFGH.......Z";

        // String s = "";

        // for(int i = 0; i < 26; i++){
        //     s = s + (char) ('A' + i);

        //     ""

        //     "A"
        //     "AB"
        //     "ABC"
        //     "ABCD"



        //     "ABC.....Z"

        //     // 25 previous copy - then append
        // }

        // O(26)
        // O(26 * 26);


        // StringBuilder - 

        StringBuilder sb = new StringBuilder();

        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        sb.append("1234567812345678");

        sb.insert(2, 'A');

        // StringBuffer 

        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // sb.append('A');

        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // return sb.toString(); - Converts into String

        // char[] arr = {'H', 'E', 'L', 'L', 'O'};

        System.out.println(sb);


        // capacity, length

        // 16 - Initial capacity of 
        
        // char[] 

        // sb.append('A');

        // ['A']; // C - 16, L - 1

        // sb.append('B');

        // ['A', 'B'] // C - 16, L2

        // 


        // ['A',..........['P']] // C - 16 , L - 16

        // sb.append('S'); 

        // newCapacity = oldCapacity * 2 + 2 - 34




















    
    }
}
