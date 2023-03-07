package variables;

public class Object {
    /*Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
**Expected Output
3
*/
     static int countInstances=0;

    public static void main(String[] args) {

        Object object =new Object();
        object.countInstances();

        Object object2=new Object();
        object2.countInstances();

        Object object3=new Object();
        object3.countInstances();

        System.out.println(countInstances);}
    static void countInstances(){ countInstances++;}

    }



