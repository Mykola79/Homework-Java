package mapshash.src;

import java.util.HashMap;
import java.util.Map;

public class Fruits2 {
    public static void main(String[] args) {
        /*Create HashMap
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
map.put("mango", 40);
map.put("mango", 40);
Using iterator retrieve all keys and values if the format below:
**Expected Output:**
```
Key = orange and value = 20
Key = apple and value = 30
Key = mango and value = 40
```*/

        Map<String,Integer>fruits=new HashMap<>();

        fruits.put("mango", 10);
        fruits.put("apple", 30);
        fruits.put("orange", 20);
        fruits.put("mango", 40);
        fruits.put("mango", 40);

        var entrySet=fruits.entrySet().iterator();

        while(entrySet.hasNext()){
            var entry=entrySet.next();
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }

    }
}
