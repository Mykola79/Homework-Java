package ifpracticing.src.ifprictice;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        /*Write a program to find the largest number among three distinct numbers using nested if condition

Please use Scanner class to take input from users

**Expected Output:**

```
Please enter 3 distinct numbers 4 5  and 14
```

```
The largest number is 14

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the largest number");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        //num1=15;
       // num2=5;
        //num3=21;
       // num4=30;

        if (num1>num2)
            if (num1>num3)
                if(num1>num4)
                System.out.println(num1);

        if(num2>num1)
            if(num2>num3)
                if(num2>num4)
                System.out.println(num2);

        if(num3>num1)
            if(num3>num2)
                if (num3>num4)
                System.out.println(num3);

        if(num4>num1)
        if(num4>num2)
            if (num4>num3)
            System.out.println(num4);





     }
}
