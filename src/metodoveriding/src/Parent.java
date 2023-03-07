package metodoveriding.src;

public class Parent {
    /*In Parent Class create a method with name method() that will print  "Parent method"

Override method() in Child class that will print "Child method"

In Main Class create objects of child and parent class and call its method.
**Expected Output:**
```
    Parent method
    Child method*/

    void method() {
        System.out.println("Parent method");
    }
}
    class Child extends Parent{

        void method(){
            System.out.println("Child method");
        }

        public static void main(String[] args) {

            Parent parent=new Parent();
                    parent.method();

                    Child ch=new Child();
                    ch.method();
        }
    }

