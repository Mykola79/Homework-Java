package ifpracticing.src;

public class IfElseIfPractice{public static void main(String[] args){
    int grade=91;

    if(grade<50){
        System.out.println("Then it's fail");}
    else if (grade>50&&grade<60) {
        System.out.println("Then the "+grade+" is D");}
    else if(grade>60&&grade<70){
        System.out.println("Then the "+grade+" is C");}
    else if (grade>70&&grade<80) {
        System.out.println("Then "+grade+" is B");}
    else if (grade>80&&grade<90) {
        System.out.println("Then "+grade+" is A");}
    else if (grade>90&&grade<100) {
        System.out.println("Then "+grade+" is A+");}
    else{
        System.out.println("Invalid");

    }

}}
