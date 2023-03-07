package finalketword.src;

public class FindAverage {
    /*Create final method avgElements that will average all the elements in an integer array (passed to the method
     as a parameter) and return the average.
**Expected Output:**```
4.8
```*/
    public static void main(String[] args) {
        final int[] a = {2, 7, 3, 8, 4};

        System.out.println(avgElements(a)); //should print 4.8
    }

    public static double avgElements(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        return (double) sum / array.length;
    }

}