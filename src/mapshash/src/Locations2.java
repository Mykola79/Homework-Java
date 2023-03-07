package mapshash.src;

import java.util.HashMap;

public class Locations2 {
    public static void main(String[] args) {
        /*Create a Map in which you do not need to preserve the order of the entries
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Find how many entries are inside the map
Remove all entries from the Map
Find the Map size again
**Expected Output:**
``
        5
        0
```*/
        HashMap locations=new HashMap<>();

        locations.put("Street" , "Patrick ST");
        locations.put("Suite" , "265");
        locations.put("City" , "Vienna");
        locations.put("Zip" , "22180");
        locations.put("Country" , "United State");

        locations.size();
        System.out.println(locations.size());

        locations.clear();
        System.out.println(locations.size());




    }
}
