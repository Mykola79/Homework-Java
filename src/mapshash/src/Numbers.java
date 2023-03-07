package mapshash.src;

import java.util.HashMap;
import java.util.Map;

public class Numbers {
    public static void main(String[] args) {
        /*Create a Hash Map of String pairs
add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using entry set print key and values pairs using loop
Remove below from Map
"ONE"
"FOUR"
Using entry set print key and values pairs using loop
**Expected Output:**
```
HashMap Before Remove :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Remove :
FIVE : EEE
TWO : BBB
THREE : CCC
```*/
        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");


        System.out.println("HashMap Before Remove :");
        var entrySet = map.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());}

        System.out.println("------------------");
        System.out.println("HashMap After Remove :");


            map.remove("ONE");
            map.remove("FOUR");

            for (Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());


            }

        }
    }