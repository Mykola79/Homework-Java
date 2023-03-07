package ifpracticing.src;

public class Celsius {public static void main(String[] args){float Fahrenheit, Celsius;
    /*Create a Java program that will ask user to input city and temperature. Your program should convert Fahrenheit
     into Celsius, and print “The temperature in the city  is ”
     */
    String city="Brooklyn";
    Fahrenheit = 45;
    Celsius = ((Fahrenheit-32)*5)/9;
    System.out.println("The temperature in "+city+" is "+Celsius);
}}

