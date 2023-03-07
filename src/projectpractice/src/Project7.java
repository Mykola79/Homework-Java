package projectpractice.src;

public class Project7 {
    public static void main(String[] args) {

        //7)Write a java program to check whether a given number is prime or not?

        int given=11;
        boolean isPrime=true;

        if(given>1) {for(int i=2; i<given; i++){if(given%2==0){isPrime=false; break;}}}

        else{isPrime=false;}

        System.out.println("Given number "+given+" is true? "+isPrime);



    }
}
