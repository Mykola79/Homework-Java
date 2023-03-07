package variables;

public class StudInfo {
    /*Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
**Expected Output:**
```
I am a student of batch 9 studying at Syntax in the year of 2021

*/
    String studentInfo(int year, String school, int batchNumber ){
        return "I am a student of batch "+batchNumber+" studying at "+school+" in the year of "+year;}

    public static void main(String[] args){

        StudInfo studinfo=new StudInfo();

        System.out.println(studinfo.studentInfo(2001,"Syntax",9));
    }
}

