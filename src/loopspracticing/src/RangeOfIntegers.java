package loopspracticing.src;

import java.util.Scanner;

public class RangeOfIntegers {
    public static void main(String[] args) {
        /*Write a program that reads a range of integers (start and end point), provided by a user and then from that
         range prints the sum of the even and odd integers.
         */
        Scanner scanner=new Scanner(System.in);


        System.out.println("Enter two numbers");

        int start=scanner.nextInt();
        int end=scanner.nextInt();

        System.out.println("start "+start+" and end "+end );

        for (int i = start; i <=end ; i++) {if(i%2==0){System.out.println("Even number "+i);}
            else{
            System.out.println("Odd numbers "+i);}
    }

        System.out.println("*********************");

        int evenSum=0;
                int oddSum=0;

        for (int i = start; i <=end ; i++) {if(i%2==0){evenSum+=i;}
            else{oddSum=oddSum+=i;}

        }

        System.out.println("Sum of even numbers "+evenSum);
        //System.out.println(("Sum of odd numbers "+oddSum);
}}
