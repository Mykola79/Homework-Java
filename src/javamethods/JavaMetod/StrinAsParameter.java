package javamethods.JavaMetod;

public class StrinAsParameter {
    /*Create a method that will accept a String as a parameter and return new String all in upper case
Call method
**Expected Output:**
```
   TEST*/
    static void names(String name){
        System.out.println(name.toUpperCase());
    }

    public static void main(String[] args) {

        names("test");
    }
}
