// import department.*;
// import department.subfolder.Test;

// import java.util.*;

class Encapsulation {
    public static void main(String[] args) {

        // HRDept hr = new HRDept("Hello");

        // Test test = new Test();

        // // Encapsulation

        // // 1 - Binding of data and methods
        // // 2 - Controlled access of data and methods

        // Employee e = new Employee();

        // // e.name = "Priyanshu";

        // // e.project = "Adecco";
        // // e.project = "Assurant";

        // // e.salary = 425000;
        // // e.salary = -1000;

        // // e.salary = 525000;

        // e.setSalary(100000);

        // e.getSalary();

        // BankAccount ba = new BankAccount();

        // ba.balance = 1000000;

        Employee e1 = new Employee(5);

        for(int i = 0; i < 5; i++){

            e1.getArr()[i] = 10;

            // System.out.println(e1.getArr()[i] + " ");
        }

        for(int i = 0; i < 5; i++){

            // e1.getArr()[i] = 10;

            System.out.println(e1.getArr()[i] + " ");
        }
        // System.out.println(e1.getList());

        // e1.getList().add(3);
        
        // e1.setName("hello");
        // System.out.println(e1.getList());

        // System.out.println(e1.getName() = "Janhvi");

        // e1.getName() = "Janhvi";

    }
}

// int[] arr = new int[9];


// int a = 5;

// int[] arr = new int[2];

// Stack -> arr = 1000 (memory address of arr itself is 100)
// Stack -> arr = 1000 (memory address of arr itself is 104)




// 2000, 2004, 2008

// Heap -> new array of size n -> 1000 -> {0, 0, 0, 0, 0}
// 1000, 1004, 1008




class Employee {
    private String name;
    private int empId;
    private String project;
    private String company;
    private String position;
    private String location;
    private int salary;

    private int[] arr;

    Employee(int n){
        arr = new int[n];
    }

    int[] getArr(){
        return arr.clone();
    }

    // List<Integer> getList(){
    //     return this.list;
    // }
    // void setName(String name){
    //     this.name = name;
    // }

    // getters and setters
    int getSalary() {
        return this.salary;
    }

    void setSalary(int salary) {
        if (salary >= 0) {
            this.salary = salary;

        }

        // if()
    }

    void appraisal(int increament) {

        setSalary(increament);
    }

    void print() {
        System.out.println(
                "Hello World, Name: " + name + " EmpId: " + empId + " Project: " + project + " Company: " + company
                        + " Position: " + position + " Location: " + location);
    }

}

class BankAccount {
    int balance;

    private void setBalance(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        // verify(amount);

        // verifyAccountDetail();

        setBalance(amount);
    }
}

// Coforge - HR Dept, Finance Dept

// Access Modifiers

// private - Only current class
// protected - Current Class + Extended class
// default - Current Class + Extended Class + Same Package
// public - Everywhere

// OOPS
// -Encapsulation
// -Inheritance
// -Polymorphism
// -Abstraction
