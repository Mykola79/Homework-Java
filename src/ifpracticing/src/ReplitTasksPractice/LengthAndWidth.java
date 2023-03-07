package ifpracticing.src.ReplitTasksPractice;

import java.util.Scanner;

public class LengthAndWidth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Write a program to take values of length and width from the user.

Based on value define whether the shape is a square or rectangle.

Examples:

```
Please enter the length 18
Please enter the width 16
The shape of your object is rectangle
```

```
Please enter the length 16
Please enter the width 16
The shape of your object is square
```*/
        System.out.println("Please enter the length");
        int length = scanner.nextInt();
        System.out.println("Please enter the width");
        int width = scanner.nextInt();

        if((length==18)&&(width==16)) System.out.println("The shape of your object is rectangle");

        if((length==16)&&(width==16)) System.out.println("The shape of your object is square");

    }
}
