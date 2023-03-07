package projectpractice.src;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        /*2)Using Scanner create an array of countries. When an array is created, retrieve all values from it and
        while retrieving those values print capital for each country. (use 2 different loops).*/

        Scanner scanner = new Scanner(System.in);


        String countries[] = new String[3];
        String capitals[] = new String[3];


        for (int i = 0; i <3; i++) {
            System.out.println("Enter a country name");
            countries[i] = scanner.nextLine();
            System.out.println("Enter its capital");
            capitals[i] = scanner.nextLine();
        }


        //System.out.println(Arrays.toString(countries));


        /*String capitals[] = new String[3];
        System.out.println("Print capital for each");


            for (String capital: capitals) {
                capitals = scanner.nextLine();}

                //System.out.println(Arrays.toString(capitals));*/


    }}





