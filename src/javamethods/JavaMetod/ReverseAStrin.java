package javamethods.JavaMetod;

import java.util.Scanner;

public class ReverseAStrin {public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    //write your code below. Write a for loop that will print out the reverse of the string.

    for (int i = s.length()-1; i >=0 ; i--) {
        System.out.println(s.charAt(i));}

    }
}
