package stringmanipulations;

public class StringManipulationBoolean {
    public static void main(String[] args) {
        /*Create a String named s1 = "hello"  check weather string is empty or not

Create a String named s2 = ""  check weather string is empty or not

**Expected Output:**

```
false
```
true*/
        //String name =new String();
        String s1="hello";
        String s2="";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        System.out.println("******************");

        String s3="hello";
        String s4="";


        boolean newS3=s3.isEmpty();
        boolean newS4=s4.isEmpty();

        System.out.println(newS3);
        System.out.println(newS4);


    }
}
