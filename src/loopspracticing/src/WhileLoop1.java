package loopspracticing.src;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

      /*int counter;
                Scanner inputDevice = new Scanner(System.in);
                System.out.print("Please enter loop counter value >> ");
                counter = inputDevice.nextInt();
                System.out.println("Before Loop");
                while (counter < 5)
                {
                    System.out.println("Inside Loop- Counter= "+ counter);
                    counter++;
                }*/

        System.out.println("Please enter loop counter value >> ");
        int counter= scanner.nextInt();

        while(counter<5){System.out.println("Inside loop- Counter= "+counter);counter++;}

            }
}
