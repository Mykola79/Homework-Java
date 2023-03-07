package finalketword.src;

public class ConvertHelloo {/*Create an instance final method that will reverse a String and return that new String
Call method from the main method
**Expected Output:**
```
    olleh
```*/

    public static void main(String[] args) {


    final String reverse="hello";

        for (int i=reverse.length()-1; i>=0; i--){
            System.out.print(reverse.charAt(i));
        }


}}
