package loopspracticing.src;

import java.util.Scanner;

public class Replit076Wrong {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String [] arr = new String[7];
        System.out.println("Enter the days of the week");
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<7;i++) {
            String input = sc.next();
            arr[i]=input;
        }
        for(int j =0;j<arr.length;j++) {
            System.out.println(arr[j]+" ");
        }
    }
    }

