package twodarrays;

public class TwoDArray4Sum {
    public static void main(String[] args) {
        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int numbers[][] = {{1, 2, 3 },
                            {4, 5, 6},
                            {7, 8, 9}};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum=sum+ numbers[i][j];
            System.out.print(numbers[i][j]+" ");}

        System.out.println();}

        System.out.println(sum);

        System.out.println("****************************");

        sum=0;
        for(int num[]: numbers){for(int num2: num){sum=sum+num2;
            System.out.print(num2+" ");}

        System.out.println();}

        System.out.println(sum);

    }}
