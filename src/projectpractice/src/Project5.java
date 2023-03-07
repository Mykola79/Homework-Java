package projectpractice.src;

public class Project5 {
    public static void main(String[] args) {
        /*5)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers
         for that array.
         */

        int numbers[][]={{1, 2, 3},
                                    {4, 5, 6}};

        int sum=0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++)
            {if (numbers[i][j]%2==0 && numbers[i][j]%2!=0);sum=sum+numbers[i][j];}}

        System.out.println(sum);




    }
}
