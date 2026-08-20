public class BitManipulation {
    public static void main(String[] args) {
        

        // Bit - 0, 1
        // Byte - Made using combined 8 bits
        // Everything in programming works on bits

        // Example - int x = 5
        // int uses 4 Byte - 32 Bits
        // 00000000 00000000 00000000 00000101

        // Decimal to Binary

        int x = 5;

        while(x > 0){
            if(x % 2 == 0) System.out.print('0');
            else System.out.print('1');

            x /= 2;
        }

        // Binary To Decimal

        char[] bin = {'1', '0', '1'};
        int num = 0;

        int pos = 2;

        for(char ch : bin){
            if(ch == '1'){
                num += (int) Math.pow(2, pos);
            }
            pos--;
        }

        System.out.println(num);


        // 2, 4, 8, 16, 32, 64
        // 10, 100, 1000, 10000, 101000

        // LSB - Least significant bit - most right bit - has lowest value
        // MSB - Most significant bit - most left bit - has highest value


        // Bitwise operators

        // Bitwise AND & - 1 only if all inputs are 1

        // 5 & 6
        // 101
        // 110
        // -------
        // 100 - 4

        System.out.println(5 & 6);

        // Bitwise OR | - 1 if any inputs is 1

        // 5 | 6
        // 101
        // 110
        // -------
        // 111 - 7

        System.out.println(5 | 6);

        // Bitwise XOR ^ - 1 if different inputs, 0 on same input

        // 5 ^ 6
        // 101
        // 110
        // -------
        // 011 - 3

        System.out.println(5 ^ 6);

        // Bitwise NOT ~ - 1 on 0, 0 on 1

        // ~5 
        // 000000000000000101

        // 111111111111111010
        // -------
        // 010 - 2

        System.out.println(~5);


        // Shift in bits

        // left shift << 
        // 001010 << 1

        // 010100

        // 101000

        // 2 * (2^3 + 2^1) = (2 ^ 1 * 2 ^ 3) + 2 * 2 ^ 1
        // 2 ^ 4 + 2 ^ 2

        // 2^4 + 2^2

        //  1101 << 1
        // 11010 - 10

        // 13 - 10

        // 13 -> 26 - 16 = 10

        // 2^3 + 2^2 + 2^0
        //       2^3 + 2^1


        // Right Shift >>

        // 1101
        // 0110




        // 13 - tell me if the 2nd bit is set ?
        // 1101

        // 1 << 2
        // 100

        // 13 & (1 << 2)

        // 1101
        // 0100

        // if(13 & (1 << 2) == 0){
        //     no set
        // }
        // else{
        //     set
        // }

        // if(num % 2 == 0){
        //     even
        // }

        // num = 2^x + 2^y + 2^z

        // 1100 - 12
        // 0001

        // 0000

        // if(num & 1 == 0){
        //     even
        // }
        // else{
        //     odd
        // }

        



















        System.out.println();
    }
}
