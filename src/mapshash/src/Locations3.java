package mapshash.src;

import java.util.LinkedHashMap;
import java.util.Map;

public class Locations3 {
    public static void main(String[] args) {
        /*Create a Map that will preserve an order of entry objects
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values using iterator
**Expected output:**
```
Patrick ST
265
Vienna
22180
United States*/

        Map<String,String> location=new LinkedHashMap<>();

        location.put("Street" , "Patrick ST");
        location.put("Suite" , "265");
        location.put("City" , "Vienna");
        location.put("Zip" , "22180");
        location.put("Country" , "United State");

        var entry=location.entrySet();
        for (var ent:entry
             ) {
            System.out.println(ent.getValue());

        }


    }
}
