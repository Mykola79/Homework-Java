package ifpracticing.src.LogicalOperatorsTask;

import java.util.Scanner;

public class WeekdayWeekend {public static void main(String[] args){
    /* Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is
     a weekday”, any day from 6-7 → output “It is a weekend”, any other day → output “Invalid day” (edited)
     */

    //int day=1;
    /*if(day==1) System.out.println("weekday");
    else if(day==2) System.out.println("weekday");
    else if(day==3) System.out.println("weekday");
    else if(day==4) System.out.println("weekday");
    else if(day==5) System.out.println("weekday");
    else if(day==6) System.out.println("weekend");
    else if(day==7) System.out.println("weekend");
    else if(day>=8) System.out.println("invalid");*/

    Scanner scanner=new Scanner(System.in);

    System.out.println("Enter a day");
    int day=scanner.nextInt();

    if(day>=1 && day<=5) {System.out.println("It is a weekday");}
        else if (day==6 || day==7) {System.out.println("It is a weekend");}

    else{
        System.out.println("Invalid day");}







}
}
