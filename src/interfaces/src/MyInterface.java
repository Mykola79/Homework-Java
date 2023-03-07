package interfaces.src;

interface MyInterface {
    /*Create an Interface with name as MyInterface
Create two undefined methods method1 and method2
Inherit the MyInterface to Main Class.
Execute both methods
**Expected Output:**```
    implementation of method1
`````
    implementation of method2*/
String banner="implementation of method1"; //by default static and final


    void m1();                              //by default abstract
    void m2();

}

class Child implements MyInterface{

    @Override
    public void m1() {
        System.out.println(banner);}

    @Override
    public void m2() {
        System.out.println("implementation of method2");
    }


    public static void main(String[] args) {

        Child main = new Child();
        main.m1();
        main.m2();
    }

    }

