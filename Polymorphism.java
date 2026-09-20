public class Polymorphism {
    public static void main(String[] args) {
        // Dog d = new Dog();

        // d.speak();

        // DataType variableName = Value of Same DataType



        Animal d = new Dog();
        Animal c = new Cat();

        d.speak();
        c.speak();

        // Dog e = new Animal(); -- cannot convert from Animal to Dog
        // During compile time we check if Right side object IS-A left side reference like ( Dod IS-A Animal) but (Animal IS_NOT a Dog)
        // And we check methods in the left side class implementation like Animal has Speak or not
        // During run time, the method call happens for Right Side object 

        // Payment p;

        // if(userSelected == "BANK"){
        //     p = new Bank();
        // }
        // else if(userSelected == "UPI"){
        //     p = new UPI();
        // }
        // else if(userSelected == SuperCoin){
        //     p = new SuperCoins();
        // }

        // p.pay();
        
    }
}

class Math{
    
    
    float sum(int a, int b){
        return a + b;
    }
    
    float sum(float a, int b){
        return a + b;
    }
    
    float sum(int a, float b){
        return a + b;
    }
    
    float sum(float a, float b){
        return a + b;
    }
}



class Animal{
    
    void speak(){
        System.out.println("Animal Speaks");
    }
}

class Dog extends Animal{
    
    void speak(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    
}


// Math.sum(1, 2);
// Math.sum(1, 2.5);
// Math.sum(1.5, 2);
// Math.sum(1.5, 2.5);

// int + int
// int + float
// float + int
// float + float

// Math.sum(Math.sum(4, 5), 6)


// Polymorphism
// Poly - Many
// Morphism - Forms 

// Compile time polymorphism - Overloading
// Either number of parameters differ
// Either data type of atleast one parameter should be different


// Run time polymorphism - Override



// UPI, Card, Bank Transfer


class Payment{
    void pay(){
        System.out.println("Get payment");
    }
}

class UPI extends Payment{
    void pay(){
        // Select UPI app
        // Enter UPI PIN
    }
}

class Card extends Payment{
    void pay(){
        // Enter card number
        // Security CVV
        // Enter OTP
    }
}

class Bank extends Payment{
    void pay(){
        // Enter account details
        // Enter OTP 
    }
}

class SuperCoins extends Payment{
    void pay(){

    }
}