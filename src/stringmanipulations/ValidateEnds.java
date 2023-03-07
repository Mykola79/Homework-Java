package stringmanipulations;

public class ValidateEnds {
    public static void main(String[] args) {

        /*Validate if the string ends with "u" prints the boolean value accordingly.

Validate if the string ends with "world" prints the boolean value accordingly.

Validate if the string ends with "are" prints the boolean value accordingly.

Validate if the string ends with "you" prints the boolean value accordingly.*/

        //starts the code from here
        String s1="hello how are you";
        boolean newS1=s1.endsWith("u");

        System.out.println(newS1);


        newS1 = s1.endsWith("world");
        System.out.println(newS1);


        newS1=s1.endsWith("are");
        System.out.println(newS1);

        newS1=s1.endsWith("you");
        System.out.println(newS1);

    }
}
