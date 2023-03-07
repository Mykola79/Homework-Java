package ifpracticing.src;

import java.util.Scanner;

public class PositivevsNegative {public static void main(String[] args) {
//int x=1;

//while(x<5){x++;
    //System.out.print(x);}


    //for (int i = 1; i < 5; i++) {
    //System.out.println(i);

    //int y=0;
    //for(int i=0; i<10; ++i){y+=1;}
    //System.out.println(y);

    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter name of the instructor");
    String name=scanner.nextLine();

    switch (name) {

        case   "Asghar":
            System.out.println("Will take care of java Assigment");
            break;
        case "Moazzam":
            System.out.println("Will take care of SDLC Assigment");
            break;
        case "Weqas":
            System.out.println("Will take care of Selenium");
            break;
        case "Asel":
            System.out.println("Will take care of every Assigment");
            break;

        default:
            System.out.println(" Invalid instructor selected");
    }


}

}

