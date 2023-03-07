package javamethods.JavaMetod;

public class Methods1 {
    /*1) Create a method that will accept an array as parameters and will return a sum of all elements from that
     array. Method should be visibly only within same package and accessible by the creating an instance of the class.
     */
    int acceptingArray(int array[]) {

        int sum = 0;
        for (int number : array) {
            sum = sum + number;}

        return sum;

    }

    public static void main(String[] args) {

        int number []={1,2,3,4,5};
        
        Methods1 metho=new Methods1();

        System.out.println(metho.acceptingArray(number));

    }
}

