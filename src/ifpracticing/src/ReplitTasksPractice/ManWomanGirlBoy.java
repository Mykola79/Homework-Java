package ifpracticing.src.ReplitTasksPractice;

import java.util.Scanner;

public class ManWomanGirlBoy {
    public static void main(String[] args) {
        /*Ask the user to enter his/her gender "Please enter your gender: M or F" then their age "Please enter your age"

You have 2 conditions:

If age is above 25, and if a user entered F then the output should be "Woman" otherwise it should say "Man"

If age is below 25, and check if a user entered F then the output should be "Girl" otherwise it should say "Boy"

**Example Output:**

```
Please enter your gender: M or F
```

```
Please enter your age
```

```
Man
```

**Example Output:**

```
Please enter your gender: M or F
```

```
Please enter your age
```

```
Boy
```

**Example Output:**

```
Please enter your gender: M or F
```

```
Please enter your age
```

```
Woman
```

**Example Output:**

```
Please enter your gender: M or F
```

```
Please enter your age
```

```
Girl
```*/

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        char gender=scanner.next().charAt(0);

        System.out.println("Please enter your age");
        int age=scanner.nextInt();

        if (age>25) {if(gender=='F')System.out.println("Woman");
        else System.out.println("Man");}


        if (age<25) {if (gender=='F')System.out.println("Girl");
        else System.out.println("Boy");}

        scanner.close();

    }
}
