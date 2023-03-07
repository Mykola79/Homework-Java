package ifpracticing.src.LogicalOperatorsTask;

import java.util.Scanner;

public class LargestNumber {public static void main(String[] args ){
    /*Write a program to find largest of three double values using if-else..if and logical operators provided by a user
     (numbers must be distinct)
     */

    Scanner scanner=new Scanner(System.in);

    System.out.println("Find the largest value");
    double value= scanner.nextDouble();
    double value1=scanner.nextDouble();
    double value2= scanner.nextDouble();

    //if(value>value1 && value1>value2) System.out.println(value+" is largest");
   // else if(value2>value1 && value1>value) System.out.println(value2+" is largest");

    if(value>value1 && value>value2) System.out.println(value+" is largest");
    else if(value1>value && value1>value2) System.out.println(value1+" is largest");
    else if(value2>value && value2>value1)System.out.println(value2+" is largest");

}
}
