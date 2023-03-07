package methodpracticing.src;

public class MethodParametersLesson2 {
    public static void main(String[] args) {

        int num1 = 14;
        int num2 = 7;

        int answer;

        int answer2;

        int answer3;

        int answer4;

        boolean answer5;




        answer =multiplyNumbers(num1);
        System.out.println(answer);

        answer2 = addNumbers(+num1, num2);
        System.out.println(answer2);

        answer3=divNumbers(num1, num2);
        System.out.println(answer3);

        answer4=subtractionNumbers(num1,num2);
        System.out.println(answer4);

        answer5=equalNumbers(num1, num2);
        System.out.println(answer5);


    }


    public static
    int multiplyNumbers (int a) {int ans = a * 7; return ans;}


    public static
    int addNumbers (int x, int y) { int ans =x+y;   return ans;}

    public static
    int divNumbers (int x, int y) {int ans =x/y;   return ans;}

    public static
    int subtractionNumbers (int x, int y) {int ans =x-y;  return ans;}

    public static
    boolean equalNumbers (int r, int t){if(r==t) return true; else return false;}





}