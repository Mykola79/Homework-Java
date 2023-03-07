package inheritance.src;

public class Person {
    /*1. Create four classes (Person, Employee, Student, Retiree)
* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)
At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the
 output
     Create multilevel inheritance: Person --> Employee --> Student --> Retiree
From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
**Expected Output:**```
    Joe Smith 35 35000
    Adam Smith 15 10
    Frank Smith 15 tour*/
    String name;
    String lastName;
    int age;}



    class Employee extends Person {

        String name = "Joe";
        String lastName = "Smith";
        int age = 35;
        int salary = 35000;


        void print() {
            System.out.println(name + " " + lastName + " " + age + " " + salary);
        }
    }


class Student extends Employee {
    String name = "Adam";
    String lastName = "Smith";
    int age = 15;
    int grade = 10;

    void print() {
        System.out.println(name + " " + lastName + " " + age + " " + grade);
    }

}
class Retiree extends Student {
    String name = "Frank";
    String lastName = "Smith";
    int age = 15;
    String seniorActivity = "tour";


    void print() {
        System.out.println(name + " " + lastName + " " + age + " " + seniorActivity);
    }
}

class Info {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.print();

        Student student = new Student();
        student.print();

        Retiree retiree = new Retiree();
        retiree.print();


    }

}