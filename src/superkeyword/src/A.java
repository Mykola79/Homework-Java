package superkeyword.src;

public class A {
    /*1. Create three classes (A, B, C)
Write two constructors:
* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"
ake C extend B
and B extend A
From your Main class create an object of the C class.
**Expected Output:**
```
    I
``````
    am
``````
a tester*/
void print(){
    System.out.println("I");
}

}
class B extends A{

    @Override
    void print() {
        System.out.println("am");
    }
}
class C extends B{

    @Override
    void print() {
        System.out.println("a tester");
    }

    public static void main(String[] args) {

        A a=new A();
        a.print();

        B b=new B();
        b.print();

        C c=new C();
        c.print();
    }

    }

