package superkeyword.src;

public class Parent2 {/*In parent class
Create a non argument constructor and write a logic to print "This is Parent constructor"
Create a Child Class that will be subClass of the Parent class.
Create a constructor without parameter and call parent class constructor explicitly
In Main Class.
Create and object of Child class and run the application.
**Expected Output:**
```
    This is Parent constructor
```*/
    String something;
    Parent2(){
        this.something=something;
    }
    void print(){
        System.out.println(something);
    }
}
class Child2 extends Parent2{
    String something;
    Child2(){
        super.something=something;
        this.something=something;}
    void print(){
        System.out.println("This is Parent constructor");
    }}

class Main{
    public static void main(String[] args) {

        Child2 ch=new Child2();

        ch.print();
    }

    }
