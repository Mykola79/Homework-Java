package variables;

public class StatVariebl {
    /*Declare a static variable **number** that will hold an integer value:
Access **number** from the main method and assign value to it.
Create an Object of the class, access **number** in a nonstatic way and assign value of 200.
Print out **number** using class name and using instance/object
**Expected Output:**
```
200
200
*/

    static int number(int value){return value;}

    public static void main(String[] args) {


        System.out.println(number(200));
        System.out.println(StatVariebl.number(200));  //static


        StatVariebl stat=new StatVariebl();                 //object


        System.out.println(stat.number(200));






    }


}
