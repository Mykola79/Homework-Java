package stringmanipulations;

public class BuilderDemo {
    public static void main(String[] args) {
        /*Instantiate and StringBuffer class

Append Value "Hello" to it

Append value "World" to it.

Print in UPPERCASE.

**Expected Output:**

```
HELLO WORLD*/


        StringBuilder str =new StringBuilder("Hello".toUpperCase());
        String newStr="World";
        System.out.println(str.append(" "+newStr.toUpperCase()));






    }
}
