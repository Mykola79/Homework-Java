package arraylist.src;

import java.util.LinkedList;

public class linkeddListt {
    public static void main(String[] args) {
        /*Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.
Print Linked List
**Expected Output**
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]*/

        LinkedList<Integer>linkedList=new LinkedList<>();

        for(int i=50;i<100;i++) {
            linkedList.add(i);}


        linkedList.removeIf(n->n%3!=0);

            System.out.print(linkedList);

    }
}
