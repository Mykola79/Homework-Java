package mapshash.src;

import java.util.HashMap;
import java.util.Map;

public class Fruits3 {
        /*# HashMap, Methods, reusability, Logic
        Create a Method in Main class using below specification.
Method Name: display.
Return Type: Void
Parameters : Map<String,Integer>
Logic:
First the method will check the given map is empty or not.
If the map is not empty print pairs of key and value using loops
If map is empty simply print "map is empty"
**NOW IN MAIN METHOD**
Create HashMap of String keys and Integer values
add values as below
map.put("mango", 10);
map.put("apple", 30);
map.put("orange", 20);
call above method with these arguments.
then clear the map.
and call above method again.*/

    public static void display(Map<String, Integer> map) {
        if (map.isEmpty()) {
            System.out.println("map is empty");
        } else {
            for (Map.Entry<String, Integer> entrySet : map.entrySet()) {
                System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
            }
        }
    }

    public static void main(String[] args) {

        Map<String,Integer>map=new HashMap<>();

        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);

        display(map);
        map.clear();
        display(map);

    }


}