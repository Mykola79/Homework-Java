package stringmanipulations;

import java.util.Scanner;

public class HoldingNames {
    public static void main(String[] args) {
/*create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
Input Example:
John
Jane
Jimmy
Mike
Emily
Expected Output:
**Joh**
**Jan**
**Jim**
**Mik**
**Emi**
*/
        Scanner scanner = new Scanner(System.in);

        String names[]=new String[5];



        for(int i=0; i<names.length; i++){
            names[i]=scanner.nextLine();}


        for(int i=0; i<names.length; i++){
            System.out.println("**"+names[i].substring(0,3)+"**");
        }
    }
}


