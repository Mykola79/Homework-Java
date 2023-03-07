package sethash.src;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetNames {
    public static void main(String[] args) {

    /*Create a Set collection in which you want to preserve an order of inserted String Objects.
Add the below values
- null
- Sohil
- Diego
- Alijon
- Asel
- Sumair
Print values 1 by 1 using loop and Iterator
```
        null
    Sohil
            Diego
    Alijon
            Asel
    Sumair
null
    Sohil
            Diego
    Alijon
            Asel
    Sumair*/
        Set<String> names=new LinkedHashSet<>();

        names.add(null);
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");

        for (String str:names) {
            System.out.println(str);}

        Iterator<String>itr= names.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());}
    }
}
