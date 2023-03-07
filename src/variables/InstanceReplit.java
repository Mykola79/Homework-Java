package variables;

public class InstanceReplit {
    /*Declare the **instance** variables to hold:

- integer values
- String values
- double values
- boolean values
- float values
Access instance variables and then print them all without assigning any values to them.
Print variables one by one the same sequence that you declare them.
**Expected Output:**
```
0
```
null
```
0.0
```
false
```
0.0*/
    int values1;
    String values2;
    double values3;
    boolean values4;
    float values5;

    public static void main(String[] args) {

        InstanceReplit variables=new InstanceReplit();

        variables.values1=0;
        variables.values2=null;
        variables.values3=0.0;
        variables.values4=false;
        variables.values5=0.0f;


        System.out.println(variables.values1);
        System.out.println(variables.values2);
        System.out.println(variables.values3);
        System.out.println(variables.values4);
        System.out.println(variables.values5);


    }

}
