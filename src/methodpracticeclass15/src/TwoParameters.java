package methodpracticeclass15.src;

public class TwoParameters {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    int largerNumber(int num1, int num2){

        if(num1>num2){return num1;}
        else{ return num2;}}

    public static void main(String[] args) {

    TwoParameters twoParameters=new TwoParameters();

        System.out.println(twoParameters.largerNumber(2,3));
    }


}