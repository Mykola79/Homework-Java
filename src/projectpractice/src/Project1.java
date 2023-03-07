package projectpractice.src;

import java.util.Arrays;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {

        /*1)Using Scanner create an array of integer values. After the array is created, calculate the sum of all
         stored elements in that array.
         */


        Scanner scanner = new Scanner(System.in);


        System.out.println("Create an array of integer values");
        int numbers[]=new int[5];

        int sum=0;
        for(int i=0; i<5; i++)
        {numbers[i]=scanner.nextInt();
            sum=sum+numbers[i];}


        System.out.println(Arrays.toString(numbers));

        System.out.println(sum);

        }
    }
