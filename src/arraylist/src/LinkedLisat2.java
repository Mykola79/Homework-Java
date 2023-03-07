package arraylist.src;

import java.util.LinkedList;

public class LinkedLisat2 {
    public static void main(String[] args) {
        /*Create Linked List that will store first 10 numbers of fibonacci series
Print number from Linked List 1 by 1 all in 1 line
**Expected Output:**```
        0 1 1 2 3 5 8 13 21 34 */

        LinkedList<Integer> nums = new LinkedList<>();
        int prev = 0;
        int curr = 1;

        nums.add(prev);
        nums.add(curr);

        for (int i = 2; i < 10; i++) {
            int next = prev + curr;
            nums.add(next);
            prev = curr;
            curr = next;}

            for (int a : nums) {
                System.out.print(a+" ");
            }
        }
    }
