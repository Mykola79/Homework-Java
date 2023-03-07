package metodoverloading.src;

public class MakeLogicss {
    /*Overload instance method display by having different types of parameters
Inside each method write the logic(void) to print value of the parameter
Call all methods inside your main method
**Expected Output:**```
            100
            ``````
    Syntax Technologies
``````100.09*/
    void metOverlod(int a, int b, int c, int d){
        System.out.println(a+b+c+d);}
    void metOverlod (String a, String b){
        System.out.println(a+" "+b);}
    void metOverlod (double a, double b){
        System.out.println(a+b);}

    public static void main(String[] args) {

        MakeLogicss mac=new MakeLogicss();

        mac.metOverlod(25,25,25,25);
        mac.metOverlod("Syntax","Technologies");
        mac.metOverlod(50.045, 50.045);

    }
}

