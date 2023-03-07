package loopspracticing.src;

import java.util.Scanner;

public class PositiveInteger {
    public static void main(String[] args) {

        //Write a program that prompts the user to input a positive integer. It should then print the multiplication
        // table of that number.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter positive number");
        int number=scanner.nextInt();

        System.out.println("Multiplication table of "+number);

        for(int i=1; i<=10; i++){System.out.println(number+" * " +i+ " = "+(number*i));}


    }
}
