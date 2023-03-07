package superkeyword.src;

public class Parent3 {/*In Parent Class.
Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter of integer type called number.
include the logic to print the value of the number.
In Child class.
Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10". run the application.
**Expected Output:**
```
Parent Constructor without argument
```
```
Child Constructor without argument
```
```
10*/
    int number;
    Parent3(){}
    void print(){
        System.out.println("Parent Constructor without argument");
    }
    Parent3(int number){
        this.number=number;
    }
    void print1(){
        System.out.println(number);
    }
}
class Child3 extends Parent3{
    Child3(){}
    void print(){
        System.out.println("Child Constructor without argument");
    }
    int number;
    Child3(int number){
        super(number);
        this.number=number;
    }
    void print2(){
        System.out.println(number);
    }




    public static void main(String[] args) {

        Parent3 parent3=new Parent3();
        parent3.print();

        Child3 ch=new Child3();
        ch.print();

        Child3 ch2=new Child3(10);
        ch2.print1();
    }

    }
