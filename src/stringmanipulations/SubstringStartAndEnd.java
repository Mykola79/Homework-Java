package stringmanipulations;

public class SubstringStartAndEnd {
    public static void main(String[] args) {
        /*Create a String given="I love Java classes at Syntax"
- Retrieve 2 Strings using substring method from given String and print them

**Expected Output:**

```
classes at Syntax
```

```
I love Java*/
        String str = "I love Java classes at Syntax";

        String newStr=str.substring(12,29);
        System.out.println(newStr);

        newStr=str.substring(0,11);
        System.out.println(newStr);
    }
}
