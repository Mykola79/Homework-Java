package encapsulation.src;

public class Encapsulation3 {
    /*Create Class EncapsulationDemo
create two variable as shown below.
private String empName=John;
private int empAge=30;
Create only getters methods for each variable.
Print the values of each variable as shown below.
**Expected Output:**```
Employee Name: John
``````
Employee Age: 30
```*/
    private String empName="John";
    private int empAge=30;

    public String getEmpName(){return empName;}

    public int getEmpAge(){return empAge;}


    public static void main(String[] args) {

        Encapsulation3 en3=new Encapsulation3();

        String str= en3.getEmpName();
        System.out.println(str);

        int number=en3.getEmpAge();
        System.out.println(number);
    }


}
