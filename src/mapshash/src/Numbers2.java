package mapshash.src;

import java.util.HashMap;
import java.util.Map;

public class Numbers2 {
    public static void main(String[] args) {
        /*Create Hash Map.
        add the follow values
map.put("ONE","AAA");
map.put("TWO","BBB");
map.put("THREE","CCC");
map.put("FOUR","DDD");
map.put("FIVE","EEE");
Using EntrySet print the key and values pairs using iterator only
replace with below key THREE--> ASEL and key FIVE-->SUMAIR
Using EntrySet print the key and values pairs using iterator only
OUTPUT
```
HashMap Before Replace :
FIVE : EEE
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : CCC
------------------
HashMap After Replace :
FIVE : SUMAIR
ONE : AAA
FOUR : DDD
TWO : BBB
THREE : ASEL*/
        Map<String, String> map = new HashMap<>();

        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        var iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        map.replace("THREE", "ASEL");
        map.replace("FIVE", "SUMAIR");
        System.out.println("----------------------");

        var iterator1 = map.entrySet().iterator();
        while (iterator1.hasNext()) {
            var entry = iterator1.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}




