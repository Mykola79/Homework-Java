package encapsulation.src;

public class Encapsulation2 {
    /*Create Class EncapsulationDemo that will have 2 variables empName and empAge;
    Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
**Expected Output:**```

    Employee Name: Mario
    Employee Age: 32*/

    private String empName;
    private int empAge;

    public String getEmpName(){return empName;}
    public void setEmpName(String empName){this.empName=empName;}


    public int getEmpAge(){return empAge;}
    public void setEmpAge(int empAge){this.empAge=empAge;}


    public static void main(String[] args) {

        Encapsulation2 en2=new Encapsulation2();
        en2.setEmpName("Mario");
        String str= en2.getEmpName();
        System.out.println(str);

        en2.setEmpAge(32);
        int number=en2.getEmpAge();
        System.out.println(number);
    }

}
