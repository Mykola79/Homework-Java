package statickeyword.src;

public class MixTrin {
    /*Create a static method with the following specification
Return Type: String Method Name: mixString
Parameters:
- a String called s1 - a String called s2
Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.
  See example below for an example.
NOTE: s1 and s2 should be of equal lengths:
```
    s1 ==> "12345"      s2 ==> "abcde"
            ``````
    mixString(s1,s2) ==> "1a2b3c4d5e"*/

    //test case below (don't change):

    static String mixString(String s1, String s2) {

        String result = "";
        int i;
        for (i = 0; i < s1.length() && i < s2.length(); i++) {
            result = result + s1.charAt(i);
            result = result + s2.charAt(i);
        }
        if (i < s1.length()) {
            result = result + s1.substring(i);
        } else if (i < s2.length()) {
            result = result + s2.substring(i);
            return result;
        }
        return result;
    }


    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);

    }

}


