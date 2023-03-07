package arraylist.src;

import java.util.ArrayList;

public class HoldingArraysList {
    public static void main(String[] args) {


    /*Create an array list that will hold String Objects
Find out weather array list is empty or not.
Add String value "Syntax" to it
Find out weather array list is empty or not.
**Expected Output:**
```
true
false*/

    ArrayList<String>names=new ArrayList<>();

    //names.add("");
       // System.out.println(names);
        //names.isEmpty();

        System.out.println(names.isEmpty());

        names.add("Syntax");

        System.out.println(names.isEmpty());

    }
}
