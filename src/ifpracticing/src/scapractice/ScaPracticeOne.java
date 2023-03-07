package ifpracticing.src.scapractice;

import java.util.Scanner;

public class ScaPracticeOne {
    public static void main(String[] args) {
        /*Create a Java program that will ask if user has a credit card or not. If you user does not have a credit card
         then offer them. If they do have one ask what is balance on the card? If balance of the card is larger than
          1000, tell them to pay off immediately, otherwise you can tell them that they can spend more.
         */

        Scanner scanner=new Scanner(System.in);



        System.out.println("Do you have a credit card?");
        String card = scanner.nextLine();


        if(card.equals("No")){System.out.println("Do you need a credit card?");}

        else{System.out.println("What is the balance");}
            int num = scanner.nextInt();

        if (num>1000) {System.out.println("Pay off immediately");}
        else {System.out.println("They can spend more");}

        System.out.println("You have a credit card: "+card);
        System.out.println("The balance is: "+num);

        scanner.close();


        }}

