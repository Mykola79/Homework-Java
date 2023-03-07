package stringmanipulations;

public class StringManipulationConvert {
    public static void main(String[] args) {
      /*Create String str1= syntax technologies and convert into SYNTAX TECHNOLOGIES

Create String str2=  SYNTAX TECHNOLOGIES and convert into syntax technologies

**Expected Output:**

```
SYNTAX TECHNOLOGIES
```

```
syntax technologies*/

        String str1="syntax technologies";
        String newStr1=str1.toUpperCase();

        System.out.println(newStr1);

        System.out.println("***************************");

        String str2="SYNTAX TECHNOLOGIES";
        String newStr2=str2.toLowerCase();

        System.out.println(newStr2);


    }
}
