package javamethods.JavaMetod;

public class AddMultSub {
    /*Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods

1. for the addition method add two numbers to make 30
2. for multiplication multiply two numbers to make 30
3. for Subtraction subtract two numbers to equal 20
**Expected Output:**
```
Addition 30
```
Multiplication 30
```
Subtraction 20*/

    static void add(int a, int b){System.out.println("Addition "+(a+b));}
    static void mult(int a, int b){System.out.println("Multiplication "+(a*b));}
    static void sub(int a, int b){System.out.println("Subtraction "+(a-b));}

    public static void main(String[] args) {

        add(20,10);
        mult(3,10);
        sub(30,10);

    }


}