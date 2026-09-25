public class Interfaces {
    public static void main(String[] args) {
        // C obj = new C();

        // obj.test();

        // Payment p = new UPI();

        // p.pay();

        // C obj = new C();

        // Animal a = new Human();

        // a.swim();
    }
}

// Limitation of class

// class A{
// void test(){
// System.out.println("Hello");
// }
// }

// class B{
// void test(){
// System.out.println("Hello world");
// }
// }

// class C extends A, B{

// }

// Animal
// Dog, Cat

// class ClassName

interface Payment {
    void pay(); // public

    // void printReciept(){
    // System.out.println();
    // }

    int x = 50; // static public final
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment with UPI");
    }
}

class Card implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment with Card");
    }
}

interface A {
    void test();
}

interface B {
    void test();
}

class C implements A, B {
    @Override
    public void test() {
        // A.super.test();
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Runnable {
    void run();
}

abstract class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }
}

// IS-A
// CAN

class Dog extends Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog is runing");
    }
}

class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }

}

class Human extends Animal implements Swimmable, Runnable {
    @Override
    public void run() {
        System.out.println("Human is running");
    }

    @Override
    public void swim() {
        System.out.println("Human can swim");
    }
}

// UPI, Card
