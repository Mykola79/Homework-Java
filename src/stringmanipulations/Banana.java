package stringmanipulations;

import java.util.Scanner;

public class Banana {
    public static void main(String[] args) {
        /*Using Scanner class input string value.

Print out the following: "The first 3 letters of \_\_\_ is ___"

```
For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".*/

        Scanner scanner=new Scanner(System.in);

        System.out.println();
        String input=scanner.next();



        System.out.println(input.substring(0,3));
    }

}
