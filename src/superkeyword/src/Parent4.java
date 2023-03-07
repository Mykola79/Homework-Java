package superkeyword.src;

public class Parent4 {/*Create a Parent class
create  instance method  m1 saying "m1 method in parent class"
Create a Child class that will be a derived class from Parent
Create same instance method m1 saying "m1 method in child class"
Create another method m2 in child class and inside that method call method m1 from child class and method m1 from
 parents class
in Main class.
Create and object of child class and call m2 method
**Expected Output:**
```
    m1 method in child class
``````
    m1 method in parent class*/

    void m1(){
        System.out.println("m1 method in parent class");
    }
}
class Child4 extends Parent4{

    @Override
    void m1() {
        System.out.println("m1 method in child class");
    }
    void m2(){m1();
        super.m1();
    }

    public static void main(String[] args) {

        Child4 ch=new Child4();
        ch.m2();
    }

    }
