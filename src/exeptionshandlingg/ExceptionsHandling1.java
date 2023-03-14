package exeptionshandlingg;

public class ExceptionsHandling1 {
        public static void main(String[] args) {
        /*Complete the code, handle possible exception
**Expected Output:** ```
/ by zero
```*/


            int a=10, b=0;

            try{
                int result = a / b;
                System.out.println(result);
            }
            catch (ArithmeticException ae){
                System.out.println(ae);
            }


            /*int x = 10;
            int y = 0;
// Apply try-catch block to handle runtime exception.
            try {
                int z = x/y; // runtime exception.
                System.out.println(z);
            } catch(ArithmeticException ae) {
                System.out.println("A number cannot be divided by zero");*/



        }
    }


