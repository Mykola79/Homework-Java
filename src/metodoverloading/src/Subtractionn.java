package metodoverloading.src;

public class Subtractionn {  /*Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output```
        40 (should come from subtracting 4 numbers)
            30 (should come from subtracting 3 numbers)
            ``````
            20 (should come from subtracting 2 numbers)*/

    void subtraction(int a, int b, int c, int d){
        System.out.println((a-b-c-d)+" (should come from subtracting 4 numbers)");}
    void subtraction(int a, int b, int c){
        System.out.println((a-b-c)+" (should come from subtracting 3 numbers)");}
    void subtraction(int a, int b){
        System.out.println((a-b)+" (should come from subtracting 2 numbers)");}


    public static void main(String[] args) {

        Subtractionn sub =new Subtractionn();
        sub.subtraction(70,10,10,10);
        sub.subtraction(50,10,10);
        sub.subtraction(30,10);
    }

    }
