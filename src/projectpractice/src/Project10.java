package projectpractice.src;

public class Project10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second-largest number in the array?

        int numbers[]={2, 5, 7, 4, 3, 8};


        int highest= Integer.MIN_VALUE;
        int secondHighest=Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>highest){
                secondHighest=highest;
                highest=numbers[i];}

            else if(numbers[i]>secondHighest && numbers[i]!=highest) secondHighest=numbers[i];}

        System.out.println(secondHighest);


                
            }

        }




