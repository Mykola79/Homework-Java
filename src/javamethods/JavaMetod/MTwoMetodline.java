package javamethods.JavaMetod;

public class MTwoMetodline {
    /*1. Create method name it as newLine
2. Add print statement inside method body as "newLine method implementation"
3. Call newLine method three times
**Expected Output:**
```
newLine method implementation
``````
newLine method implementation
``````
newLine method implementation
```
String newLine;*/

    String newLine(){

        return "newLine method implementation";}

    public static void main(String[] args){
        MTwoMetodline MT=new MTwoMetodline();

        for (int i = 0; i < 3; i++) {
            System.out.println(MT.newLine());

        }

    }
}

