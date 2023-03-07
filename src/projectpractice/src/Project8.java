package projectpractice.src;

public class Project8 {
    public static void main(String[] args) {
        //8)Write a Java Program to print the first 10 numbers of Fibonacci series.

        int a=0;
        int b=1;
        int c;

        for (int i=0; i<10; i++){c=a+b;
            System.out.println(c);

            a=b;
            b=c;}


    }
}
