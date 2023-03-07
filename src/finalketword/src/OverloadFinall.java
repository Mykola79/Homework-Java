package finalketword.src;

public class OverloadFinall {
    /*Overload 2 final instance methods:
Call them in main method
**Expected Output:**```
    Final method with boolean parameter
    Final method with String parameter
```*/

    final void m1(boolean c){
        System.out.println("Final method with boolean parameter");}
    final void m1(String a){
        System.out.println("Final method with String parameter");
    }

    public static void main(String[] args) {

        OverloadFinall ov =new OverloadFinall();
        ov.m1(true);
        ov.m1("a");

    }
}
