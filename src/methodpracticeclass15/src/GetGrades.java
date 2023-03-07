package methodpracticeclass15.src;

public class GetGrades {
    /*6)Create  class Student that will have a method getGrade. Your method should accept the score of a student
     and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F*/

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    /** Method getGrade assigns grades based on grading scheme */
    public static void main (String[] args){

        GetGrades getgrades=new GetGrades();
    }

}
