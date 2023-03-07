package javamethods.JavaMetod;

public class PrintNumbers {
    /*Create a method in which you will be printing numbers from 1 to 10

2. Call the method in the main method

**Expected Output:**
1
2
3
4
5
6
7
8
9
10
     */

     static void numbers(int i){
         if(i<=10) {
             System.out.println(i);
             numbers(i+1);}

     }

    public static void main(String[] args) {

         PrintNumbers.numbers(1);

    }
}


    /*public class Print {

    public static void printWithoutLoop(int n) {
        if (n <= 10) {
            System.out.println(n);
            printWithoutLoop(n + 1);
        }
    }

    public static void main(String[] args){
        Print.printWithoutLoop(1);*/