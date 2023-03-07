package statickeyword.src;

public class PrograminIsAmazin {
    /*Create two methods:
The first method should be a non-static method that will print out the following message:
"Programming is amazing."
The second method should be a static method that will print out the following message:
"Java is awesome."
Execute both methods
**Expected Output:**
```
Programming is amazing.
``````
Java is awesome.*/

     void firstMethod(){
         System.out.println("Programming is amazing");}

    static void secondMethod(){System.out.println("Java is awesome");}

    public static void main(String[] args){


        PrograminIsAmazin pr=new PrograminIsAmazin();
        pr.firstMethod();


        secondMethod();
    }

}
