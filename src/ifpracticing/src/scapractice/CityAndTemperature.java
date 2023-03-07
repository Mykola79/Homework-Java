package ifpracticing.src.scapractice;

import java.util.Scanner;

public class CityAndTemperature {public static void main(String[] args){
    /*Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit
     into Celsius and print “The temperature is the city  is ”
     */

    Scanner scanner=new Scanner(System.in);

    System.out.println("Input your city");
    String city= scanner.next();

    System.out.println("What is the temperature in your city?");
    int temperature= scanner.nextInt();

    System.out.println("The temperature is "+(35-32)*5/9+" Celsius in "+city);

}}
