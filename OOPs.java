public class OOPs {
    public static void main(String[] args) {
        

//         {
//             String name = "Janhvi";
//             int empId = 136775;
//             String project = "Assurant";
//             String company = "Coforge";
//             String position = "GET";
//         }


        // String "Janhvi"

// {
//     String name2 = "Priyanshu";
//     int empId2 = 136775;
//     String project2 = "Adecco";
//     String company2 = "Coforge";
//     String position2 = "GET";
// }
    
// {
//     String name2 = "Janhvi";
//     int empId2 = 136775;
//     String project2 = "Assurant";
//     String company2 = "Coforge";
//     String position2 = "GET";
// }


        // int x = 5;

        int x; // Declare a variable x of type INT
        x = 5; // Store an integer value in x

        Employee emp; // Declare a variable emp of type Employee
        emp = new Employee(); // Store an Employee object in emp


        // emp -> It takes memory space in Stack, and stores memory address of actual Employee object 
        // employee object is created in Heap memory

        Employee emp2 = new Employee(); // 2000

        // System.out.println(emp.name + emp.empId + emp.project + emp.company + emp.position);

        // emp.name = "Priyanshu";
        // emp.empId = 136893;
        // emp.project = "Adecco";
        // emp.company = "Coforge";
        // emp.position = "GET";

        // emp2.name = "Janhvi";
        // emp2.empId = 136775;
        // emp2.project = "Assurant";
        // emp2.company = "Coforge";
        // emp2.position = "GET";

        // emp.markAttendance();
        // emp2.markAttendance();

        emp.print();


        // System.out.println(emp.name + " " + emp.empId + " " + emp.project + " " + emp.company + " " + emp.position);
        // System.out.println(emp2.name + " " + emp2.empId + " " + emp2.project + " " + emp2.company + " " + emp2.position);

        // emp2 -> OBJECT 

        // emp2 = new Employee(); // 3000


        // lknklk kj nkbjkk



        Employee e = new Employee(); //3000

        Employee e2 = e; // 3000

        e2.name = "Rahul";

        System.out.println(e.name);





    }
}


class Employee{
    // State, Data, Fields
    String name;
    int empId;
    String project;
    String company;
    String position;

    // Behaviour, Method
    void markAttendance(){

        int x = 5;
        System.out.println("Attendance marked for " + name);
    }

    void print(){
        System.out.println(name + " " + empId + " " + project + " " + company + " " + position);
    }
}