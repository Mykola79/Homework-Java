package exeptionshandlingg;

public class ExceptionsHandling2 {
    public static void main(String[] args) {
        /*Create a program that will handle exception to match below output:
Expected Output:```
java.lang.ArrayIndexOutOfBoundsException: 4
	at Main.main(Main.java:5)
```*/


        //try {
      int[] a = {1};
      try{System.out.println(a[4]);
    } catch (ArrayIndexOutOfBoundsException e){

      e.printStackTrace();
        }
        System.out.println("java.lang.ArrayIndexOutOfBoundsException");
           }
}






