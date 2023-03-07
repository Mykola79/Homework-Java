package ifpracticing.src.ifprictice;

import java.util.Scanner;

public class LargestNumberFour {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Please enter 3 distinct numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        if (num1>num2 && num2>num3){System.out.println("The largest number is "+num1);}

        else if (num3>num2 && num2>num1) {System.out.println("The largest number is "+num3);}
        else  {System.out.println("The largest number is "+num2);}


        input.close();
    }
}
