package encapsulation.src;

public class EncapsulationDemo {
    /*Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
**Expected Output:**```

    Employee Name: John

    Employee Age: 30*/

    private int empAge;
    private String empName;

    public int getEmpAge(){return empAge;}
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }



    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    public static void main(String[] args) {

        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();

        encapsulationDemo.setEmpAge(30);
        int i=encapsulationDemo.getEmpAge();
        System.out.println("Employee Age: "+i);



        encapsulationDemo.setEmpName("John");
        String s= encapsulationDemo.getEmpName();
        System.out.println("Employee Name: "+s);

    }
}