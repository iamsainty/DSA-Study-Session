public class Constructor {
    public static void main(String[] args) {
        

        Employee e = new Employee("Priyanshu", 136893, "Adecco");
        // e.print("Janhvi", 136775);

        Employee e2 = new Employee();

        e2.print();

        // e.name 




    }
}

class Employee {
    String name;
    int empId;
    String project;

    // Employee(){
    //      definition
    //     System.out.println("Object created");
    // }

    // Employee(){
    //     this("Unknown");
    // }

    // Employee(String name){
    //     this(name, 0);
    // }

    // Employee(String name, int empId){
    //     this(name, empId, "Unassigned");
    // }

    // Employee(String name, int empId, String project){
    //     this.name = name;
    //     this.empId = empId;
    //     this.project = project;
    // }


    Employee(){
        this("Unknown", 0, "Unassigned");
    }

    Employee(String name){
        this(name, 0, "Unassigned");
    }

    Employee(String name, int empId){
        this(name, empId, "Unassigned");
    }

    Employee(String name, int empId, String project){
        this.name = name;
        this.empId = empId;
        this.project = project;
    }

    void print(){
        System.out.println("Name " + this.name + " EmpId " + this.empId + " Project " + this.project);
    }
}
