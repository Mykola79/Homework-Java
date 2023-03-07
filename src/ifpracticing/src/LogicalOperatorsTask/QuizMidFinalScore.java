package ifpracticing.src.LogicalOperatorsTask;

import java.util.Scanner;

public class QuizMidFinalScore {public static void main(String[] args){
    /*Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F*/

    Scanner scanner=new Scanner(System.in);

    System.out.println("What is your score");
    int score=scanner.nextInt();

    if(score>=90) System.out.println("Grade is A");
    else if(score>=80 && score<90) System.out.println("Grade is B");
    else if(score>=70 && score<80) System.out.println("Grade is C");
    else if (score>=60 && score<70)System.out.println("grade is D");
    else System.out.println("grade is F");


    scanner.close();
}
}
