package sethash.src;

import java.util.HashSet;
import java.util.Iterator;

public class HassSet1 {
    public static void main(String[] args) {


    /*Create the HashSet with list of Integers add the below numbers for the list

111
111
111
999
999
999
Print elements one by one.

**Expected Output**```
            999
            111*/
        HashSet<Integer> integers = new HashSet<>();

        integers.add(111);
        integers.add(111);
        integers.add(111);
        integers.add(999);
        integers.add(999);
        integers.add(999);

        Iterator<Integer> iterator= integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}