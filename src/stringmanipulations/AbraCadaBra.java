package stringmanipulations;

public class AbraCadaBra {
    public static void main(String[] args) {
        /*String “abracadabra alakazam”;
- Print out the position of the first occurrence of "c".
- Print out the position of the first occurrence of " ".
- Print out the position of the first occurrence of the variable target1.
- Print out the position of the first occurrence of the variable target2.

**Expected Output:**
4
11
6
-1*/
        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";


        int newStr=str.indexOf("c");
        System.out.println(newStr);

        newStr=str.indexOf(" ");
        System.out.println(newStr);


        newStr=str.indexOf("dab");
        System.out.println(newStr);


        newStr=str.indexOf("ABRA");
        System.out.println(newStr);
    }
}
