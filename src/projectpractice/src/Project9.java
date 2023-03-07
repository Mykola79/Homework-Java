package projectpractice.src;

public class Project9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?

        int numbers[]={3, 5, 2, 1, 3};


        int max=numbers[0];
        int min=numbers[0];
        for (int i=0; i< numbers.length; i++) {

            if(numbers[i]>max)max=numbers[i];

            else if(numbers[i]<min)min=numbers[i];}


        System.out.println(max);
        System.out.println(min);
    }
}
