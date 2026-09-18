public class Inheritance {
    public static void main(String[] args) {
        // Employee e = new Employee();


        TechDept t = new TechDept();

        t.markAttendance();
    }
}

class Employee{
    // private String name;
    int empId;

    // Employee(String name, int empId){
    //     System.out.println("Employee Created");
    //     this.name = name;
    //     this.empId = empId;
    // }

    void markAttendance(){
        System.out.println("Attendance marked in Employee");
    }
}


class TechDept extends Employee{
    String Project;

    // TechDept(String name, int empId){
        // parent class constructor
        // super(name, empId);

        // super.name = name;
    //     super.empId = empId;
    //     System.out.println("Techdept Employee Created");
    // }


    // super.markAttendance();

    @Override
    void markAttendance(){
        System.out.println("Attendance marked in Tech Dept");
    }
}

// class HRDept{
//     String name;
//     String group; // europe, us
// }

// class FinanceDept{
//    String name;
//     String dept; // salary-distribution, // project-related-transactions
// }

// class abcd extends HRDept, FinanceDept {

//     super.name 

// }


// Single inheritance 
//TechDept <- Employee


// Multi-level inheritance 
// development <- techdept <- employee

// hierarchical inheritance
// Single parent multiple child class


// multiple inheritance 
// multiple parent, single child
// class Child extends A, B {

// }
// This is not supported in Java due to confusion, ambiguity, diamond problem
// This is implemented using Interfaces



