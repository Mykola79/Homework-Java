package ifpracticing.src.scapractice;

import java.util.Scanner;

public class DmvRepresentative {public static void main(String[] args){
    /*You are DMV representative, and you need to ask customer their age. If they are 18 and older you will issue
     a driver licence to them, otherwise you will offer them to get a learners permit.*/

    Scanner scanner = new Scanner(System.in);

    System.out.println("What's your age?");
    int age= scanner.nextInt();

    if(age>=18){
        System.out.println("You are allowed to have driver licence");}
    else{System.out.println("You can have learner permit");}


}
}
