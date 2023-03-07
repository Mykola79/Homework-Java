package mapshash.src;

import java.util.HashMap;
import java.util.Map;

public class Location4 {
    public static void main(String[] args) {
        /*Create a HashMap of String.
Add below pair to it .
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"
Print all the values in upper case using entrySet
**Expected Output:**
```
265
22180
PATRICK ST
UNITED STATE
VIENNA
```*/
        Map<String,String>location=new HashMap<>();

        location.put("Street" , "Patrick ST");
        location.put("Suite" , "265");
        location.put("City" , "Vienna");
        location.put("Zip" , "22180");
        location.put("Country" , "United State");

        var entry=location.entrySet();
        for(var entr:entry){
            System.out.println(entr.getValue().toUpperCase());
        }



    }
}
