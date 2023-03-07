package ifpracticing.src.scapractice;

import java.util.Scanner;

public class ConditionalStatementPlusScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("In:");
        int num = scanner.nextInt();

        if(num>0){System.out.println(num+" is positive");}
        //if(num1<0){System.out.println(num1+" is negative");}


        System.out.print("In:");
        int num1=scanner.nextInt();

        if(num1<0){System.out.println(num1+" is negative");}


        System.out.print("In:");
        int num3=scanner.nextInt();

        if(num3==0){System.out.println("Entered number is equals to "+num3);}

    }}
