package ifpracticing.src;

import java.util.Scanner;

public class Diploma {public static void main(String[] args){
/*Write a program to store a boolean value of whether user has diploma or not. If user has a diploma, you should say
 congratulations, otherwise program should suggest to get a degree. Then if user has a degree program should check
  a gpa score. If gpa score is higher or equals to 3.5 → output should say “You are eligible for scholarship”,
   otherwise → “You should have studied harder” .
 */
    Scanner scanner=new Scanner(System.in);
    //boolean diploma=true;
    //boolean program=false;
    //double gpa = 3.6;

    System.out.println("Do you have Diploma?");
    String Diploma = scanner.nextLine();

    if(Diploma.equals("Yes"))System.out.println("Congrats");
        else {System.out.println("Get Degree");

        System.out.println("Do you have a program?");
        String program=scanner.nextLine();

        if(program=="Yes")System.out.println("Check gpa");

        System.out.println("What is your gpa");
        double gpa=scanner.nextDouble();

    if (gpa>=3.5) System.out.println("You are eligible for scholarship");

    else System.out.println("You should have studied hard");}

        scanner.close();


}}