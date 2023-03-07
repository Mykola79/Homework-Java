package arraylist.src;

import java.util.LinkedList;

public class LinkedList7 {
    /*Create Linked List that will store Integer Objects
Add the values below:
111
222
333
444
555
666
Create a logic to calculate sum of the all the values in list.
Print the result of sum.
**Expected Output:**
```
Result of sum is 2331
*/
    public static void main(String[] args) {


        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        nums.add(666);

        int sum=0;
        for (int n:nums){sum=sum+n ;}

        System.out.println("Result of sum is "+sum);

    }
}