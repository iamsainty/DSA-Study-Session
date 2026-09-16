public class StaticAndFinal {

    public static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {

        int ans = sum(2, 3);

        // Coforge - 4KB
        // 50000 Employees - 50000 * 4KB = 200MB

        Employee.company = "NIIT";

        // Employee e1 = new Employee("Priyanshu", 136893, "Adecco", "GET", "Noida");
        // e1.print();

        // Employee e2 = new Employee("Janhvi", 136775, "Assurant", "GET", "Noida");
        // e2.print();

        Employee.company = "Coforge";





        // final int x;
        // x = 6;

        // x = 7;

    }
}

// StaticAndFinal.Main(); --- JVM Runs this

class Employee {
    String name;
    final int empId;
    String project;
    static String company;
    String position;
    static String location;


    static{

    }


    Employee(String name, int empId, String project, String position, String location) {
        this.name = name;
        this.empId = empId;
        this.project = project;
        this.position = position;
        this.location = location;
    }

    void print() {
        System.out.println("Name: " + name + " EmpId: " + empId + " Project: " + project + " Company: " + company
                + " Position: " + position + " Location: " + location);
    }

    void display(){

    }
}


// Math m = new Math();
// m.min(a, b);

// Math.min()
// Math.max()
// Math.sqrt()
