package metodoverloading.src;

public class MetOverStati {
    /*Overload static method and then execute both overloaded methods.
**Expected Output:**```
    static method without parameter
    static method with int parameter*/

    static String m1(){return "static method without parameter";}
    static void m1(int a,int b,int c,int d,int e){
        System.out.println("static method with int parameter");

    }

    public static void main(String[] args) {
        System.out.println(MetOverStati.m1());

        MetOverStati.m1(1,2,3,4,5);

    }
}
