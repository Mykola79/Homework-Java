package sethash.src;

import java.util.HashSet;

public class HashSet2 {/*Create a Set and below values to it.
[third, first, second]
Print HashSet and then remove all the elements from Hashset and print it again.
**Expected Output:**```
[third, first, second]
[]
```*/

    public static void main(String[] args) {


        HashSet<String> word = new HashSet<>();

        word.add("third");
        word.add("first");
        word.add("second");

        System.out.println(word);

        word.clear();
        System.out.println(word);

    }
}