package javamethods.JavaMetod;

public class CreateName {
    /*Create a method name as newLine that should have print statement inside the method body as "newLine method
     implementation"

1. Create a method name as displayLine that should have print statement inside the method body as
 "displayLine method implementation"
3. Call both methods
**Expected Output:**
```
newLine method implementation
displayLine method implementation
```*/

    String newLine(){return "newLine method implementation";}
    String displayLine(){return "displayLine method implementation";}

    public static void main(String[] args) {

        CreateName line1=new CreateName();

        System.out.println(line1.newLine());


        //CreateName line2=new CreateName();

        System.out.println(line1.displayLine());
    }
}
