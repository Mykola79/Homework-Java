package mapshash.src;

import java.util.LinkedHashMap;

public class Locations {
    public static void main(String[] args) {/*Create A Map that will preserve an order of entry objects
Add below pairs :
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all values of from the map
**Expected Output:**
```
Patrick ST
265
Vienna
22180
United State*/

        LinkedHashMap location=new LinkedHashMap<>();

        location.put("Street","Patrick ST");
        location.put("Suite","265");
        location.put("City","Vienna");
        location.put("Zip","22180");
        location.put("Country","United States");

        for (Object str: location.values()) {
            System.out.println(str);

        }
    }
}