package exeptionshandlingg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 {

    /*Create a method that will not be handling exception and throwing it at caller.
In main method call method and handle the exception.
**Expected Output:**```
java.io.FileNotFoundException:  (No such file or directory)
```*/


    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);}
        }
    }




