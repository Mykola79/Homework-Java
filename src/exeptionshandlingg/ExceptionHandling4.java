package exeptionshandlingg;

import java.util.Scanner;
class ExceptionHandling4{
    public static void checkTemperature(int temperature) {
        if (temperature < 32) {
            throw new RuntimeException("It is freezing");}
    }
    public static void main(String[] args) {
        /*Create a method that will do temperature check. Anytime user passes temperature that is below 32 method
         should throw an Exception saying "It is freezing"

   In Main method call the method and handle an Exception
**Expected Output:**
```java.lang.RuntimeException: It is freezing
```*/
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        try {
            checkTemperature(temperature);
        } catch (RuntimeException e) {
            System.out.println(e);}
            /*Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the temperature: ");
    int temperature = scanner.nextInt();

    try {
        checkTemperature(temperature);
        System.out.println("Temperature is OK.");
    } catch (RuntimeException e) {
        System.out.println("Temperature check failed: " + e.getMessage());*/
        }
    }

