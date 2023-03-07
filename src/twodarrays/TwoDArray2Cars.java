package twodarrays;

public class TwoDArray2Cars {
    public static void main(String[] args) {
        /* Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array using
         2 different loops
         */

String cars [][]={{"A", "A1", "A2"},
        {"G", "G1", "G2"},
        {"K", "K1", "K2"},
        {"I", "I1", "I2"}};

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {

            System.out.print(cars[i][j]+" ");}

            System.out.println();}

        System.out.println("**************************");


        for (String name[]: cars) {for (String name1: name) {System.out.print(name1+" ");}

        System.out.println();







        }


        }}



