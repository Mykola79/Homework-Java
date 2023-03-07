package ifpracticing.src.ReplitTasksPractice;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        /*Write a program to take the month number from a user.

Provide month name to the corresponding month number

If a user provides any number that is out of month range, the program should display "Invalid"

IMPORTANT: use Scanner Class

**Example Output:**

```
Please enter month number 1
January
```

**Example Output:**

```
Please enter month number 33
Invalid
```*/
        System.out.println("Provide a number");
        int num=scanner.nextInt();

        if (num==1) System.out.println("January");
        else if(num==2) System.out.println("February");
        else if(num==3) System.out.println("March");
        else System.out.println("Invalid");

        scanner.close();

    }
}
