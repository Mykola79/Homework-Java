package abstraction.src;

public abstract class Parent {
    /*Create a Parent Class that will have two overloaded abstract methods m1
Make Main class as concrete subclass to Parent Class
In main method call the methods.
**Expected Output:**```
    m1 without parameters
    m1 method with parameter*/

    abstract void m1();

    abstract void m1(String a);


}
    class Main extends Parent {


                @Override
                void m1() {System.out.println("m1 without parameters");}

                @Override
                void m1(String a) {System.out.println("m1 method with parameter");

        }

        public static void main(String[] args) {

            Parent[] child = {new Main()};

            for (Parent p : child) {

                p.m1();
                p.m1("a");
            }

        }}










