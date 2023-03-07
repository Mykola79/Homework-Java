package stringmanipulations;

public class AddString {
    public static void main(String[] args) {
        /*Create a String given="Hello Syntax friends".

                Using String methods from given String create new String "Welcome Syntax family"

                **Expected Output:**

        Welcome Syntax family*/

        String given="Hello Syntax friends";

        System.out.println(given.replace(given,"Welcome Syntax family"));
    }
}
