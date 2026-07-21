public class Pattern {

    public static void main(String[] args) {

        // *****
        // *****
        // *****
        // *****
        // *****

        // for(int i = 0; i < 5; i++){
        //     for(int j = 0; j < 5; j++){
        //         System.out.print('*');
        //     }
        //     System.out.println();
        // }

        // 4444444
        // 4333334
        // 4322234
        // 4321234

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
                int top = i;
                int bottom = 6 - i;

                int left = j;
                int right = 6 - j;

                int dist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print(4 - dist);
            }
            System.out.println();
        }
    }
}