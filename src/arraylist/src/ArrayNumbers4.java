package arraylist.src;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayNumbers4 {
    public static void main(String[] args) {
        /*Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList
         all in 1 line
Numbers in:```
        4
`62
8
5
``4
```**Expected Output:**
4 62 8 5 4*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();

            numbers.add(number);}


            for (int numb : numbers) {

                System.out.print(numb+" ");}

    }
    }
