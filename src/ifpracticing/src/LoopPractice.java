package ifpracticing.src;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your country");
        String country = scanner.nextLine();

        switch (country){

            case "Italy":
                System.out.println("Italian");
            case "Russian":
                System.out.println("Russian");
            case "Germany":
                System.out.println("German");
        }
    }
}
