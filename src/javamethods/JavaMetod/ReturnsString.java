package javamethods.JavaMetod;

class ReturnsString {
    /*Write a method header on line two with the following specs:

    Returns:
```
    a String
``` Name:
```spaceOut
```Parameters:
a String
```
Then complete the method by programming the following behavior

Insert spaces after every character in the String s, then return the new string.

See below examples (note the space at the end as well).
            ```Examples:
```spaceOut("hello") ==> "h e l l o "
    spaceOut("technology") ==> "t e c h n o l o g y "*/

    String spaceOut(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i)+" "+" ";
        }
        return result;
    }

    public static void main(String[] args) {

        ReturnsString reStr =new ReturnsString();

        System.out.println(reStr.spaceOut("hello"));



    }

}
























