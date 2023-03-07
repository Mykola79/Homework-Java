package accessmodifiers;

public class MysteryMethod {
    /*Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element
     based on whether it's even or odd.
If the number is even, divide it by 2.  If it's odd, multiply it by 10.
**Expected Output:**
```
10 1 30 2 50*/
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50
    }


    static void mystery(int[] array)	{

        for(int i=0; i<array.length; i++) {
            // checking if the number is even
            if(array[i] % 2 == 0) {
                // if even we should divide it by 2
                array[i] /= 2;
            }
            // else then number is odd
            else {
                // if odd we should multiply by 10
                array[i] *= 10;
            }
        }
    }
}





