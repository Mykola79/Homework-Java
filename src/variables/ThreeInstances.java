package variables;

public class ThreeInstances {
    /*declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
**Expected Output:**
```
10
10.23
a
100
100.23
s*/
    int num1;
    double num2;
    char character1;


    public static void main(String[] args) {

        ThreeInstances student1=new ThreeInstances();

        student1.num1=10;
        student1.num2=10.23;
        student1.character1='a';

        System.out.println(student1.num1);
        System.out.println(student1.num2);
        System.out.println(student1.character1);

        ThreeInstances student2=new ThreeInstances();

        student2.num1=100;
        student2.num2=100.23;
        student2.character1='s';

        System.out.println(student2.num1);
        System.out.println(student2.num2);
        System.out.println(student2.character1);




    }


}
