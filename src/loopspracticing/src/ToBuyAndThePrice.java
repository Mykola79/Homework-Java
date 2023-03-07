package loopspracticing.src;

import java.util.Scanner;

public class ToBuyAndThePrice {
    public static void main(String[] args) {
/* Write a program to ask a user to enter item they want to buy and the price of that item. Every time user enters
 money accumulate the amount and tell the user how much is left to pay off. If user give more money program should
  return a change. Whenever a user done with payments program should say "Thank you for shopping!"
 */
        double total=0;
        for (int i = 0; i < 3; i++) {

        }
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter item and price");
        String name=scanner.next();
        double price=scanner.nextDouble();
        total=total+price;
        System.out.println("total amount "+total);

        System.out.println("pay for item");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>price) {
            double change = amountPaid = price;
            System.out.println("your change " + change);
        } else if (amountPaid<price) {
            System.out.println();

        }
    }



    }

