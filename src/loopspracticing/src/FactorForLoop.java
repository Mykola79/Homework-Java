package loopspracticing.src;

import java.util.Scanner;

public class FactorForLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter positive integer: ");
        int number = scanner.nextInt();

        int factor =1;

        for(int i=1; i<=number; i++){factor*=i;}

        System.out.println("Factorial "+factor);

    }
}
