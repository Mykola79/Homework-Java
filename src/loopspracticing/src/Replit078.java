package loopspracticing.src;

import java.util.Scanner;

public class Replit078 {
    public static void main(String[] args) {
        /*Create an int array of integers with a size of 5 and input values with Scanner.

Don't print prompt questions for a user.

Using loop print out each element of the array that should look like the output below

**Example:**

Input:

1

2

3

4

5

```
Output:
```

```
10
```

```
20
```

```
30
```

```
40
```

```
50*/

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        int values[]= new int[5];



        for(int i=0; i< values.length; i++) values[i]=scanner.nextInt();
        //System.out.println(values.length*10);




        for(int i=values.length+10; i>50; i++){
            System.out.println(values[i]);}

    }
}
