package metodoverloading.src;

public class PriveMet {
    /*Overload private instance method m1
Call each method from the main method.
Expected Output:```
    private m1 method
    private m1 method with int parameter*/

    private static String m1(String a,String b, String c){return a+" "+b+" "+c;}
    private static void m1(int a,int b, int c,int d,int e, int f){
        System.out.println("private m1 method with int parameter");}

    public static void main(String[] args) {
        System.out.println(PriveMet.m1("private", "m1", "method"));

        PriveMet.m1(1,2,3,4,5,6);

        }
    }


