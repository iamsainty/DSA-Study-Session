public class Conditional {
    public static void main(String[] args) {

        // CONDITIONAL STATEMENTS

        // Used when program has to take a decision.

        // if

        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        }

        // if condition is false, block will not execute

        if (age < 18) {
            System.out.println("Not Eligible");
        }

        // if - else

        int marks = 45;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // else if ladder

        int num = 0;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // nested if

        // one if inside another if

        String username = "admin";
        String password = "1234";

        if (username.equals("admin")) {

            if (password.equals("1234")) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Wrong Password");
            }

        } else {
            System.out.println("Invalid Username");
        }

        // switch

        // Better than multiple else-if when checking one variable

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");

        }

        // break -> exits switch
        // default -> executes if no case matches

        // ternary operator

        // condition ? true : false

        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println(max);

        String result = (marks >= 40) ? "Pass" : "Fail";

        System.out.println(result);

        // Example

        int number = 15;

        String ans = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(ans);

    }
}
