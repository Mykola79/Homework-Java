package arraylist.src;

import java.util.ArrayList;

public class ArrayNumbers2 {
    public static void main(String[] args) {
        /*Create an arrayList of type Integer.
add below values.
111
111
111
999
999
999
Print all the values of List 1 by 1:
**Expected Output:**
```
        111
        111
        111
        999
        999
        999*/

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for(int nums:numbers){
            System.out.println(nums);}
    }
}
