package methodpracticeclass15.src;

public class EvenOrOdd {

    //2) Create a method that will take a number and prints whether the number is even or odd.

    boolean isEven(int num){
        if(num%2==0){return true;}
        else{return false;}
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd=new EvenOrOdd();

        boolean isEven=evenOrOdd.isEven(50);

        System.out.println(isEven);


    }
}
