package javamethods.JavaMetod;


public class MOneMethod {
    /*1. create method and name as m1. Inside your method body add print statement as "m1 method implementation"

2. create another method and name as m2. Inside your method body add print statement as "m2 method implementation"

3. Call these two methods in the main method

**Expected Output:**

```
m1 method implementation
```

```
m2 method implementation*/

    String m1(){return "m1 method implementation";}

    String m2(){return "m2 method implementation";}

    public static void main(String[] args) {

        MOneMethod met1=new MOneMethod();

        System.out.println(met1.m1());
        System.out.println(met1.m2());

    }



}
