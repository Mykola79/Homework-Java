package constructor.src;

public class SyntaxTechnologies {
    /***1. Complete the SyntaxTechnologies class:**
     Include the following class variables:
     * schoolName(String)
     * batch(int)
     * year(int)
     * lastDayOfClass(String)
     Write two constructors:
     * non-argument constructor
     * parameterized constructor
     Create method to display values of instance variables.
     **2. In Main Class:**
     Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
     **Expected Output:**
     ```null 0 0 null
     ``````
     Syntax 6 2020 07/30/2020*/
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies() {System.out.println("null 0 0 null");
    }
    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }


    public static void main(String[] args) {

        SyntaxTechnologies synt=new SyntaxTechnologies();
        SyntaxTechnologies synt2=new SyntaxTechnologies("Syntax", 6, 2020, "07/30/2020");

    }
}