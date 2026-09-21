public class Abstraction {
    public static void main(String[] args) {
        Payment p = new UPI();
        // Payment card = new Card();

        // p.pay();
        // card.pay();

        // Payment p1 = new Payment();
        // p1.pay();

        p.printReciept();
    }
}


abstract class Payment{
    abstract void pay();

    Payment(){

    }

    int n;

    final void printReciept(){
        System.out.println("Payment completed");
    }
}

class UPI extends Payment {
    void pay(){
        System.out.println("UPI Payment");
    }

    // void printReciept(){

    // }
}

class Card extends Payment {
    void pay(){
        System.out.println("Card Payment");
    }
}



// Abstraction
// It is a design concept, it refers that only the necessary details should be visible
// Necessary Behaviour should be visible, internal implementation should be hidden

// 1. Abstract class and methods
// 2. Interfaces

