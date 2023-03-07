package arraylist.src;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
    /*Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array print remained values one by one in one line

                **Expected Output:**```
yo yolo
*/

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");

        arrayList.remove(4);
        arrayList.remove(2);
        arrayList.remove(0);

        for (String str : arrayList) {
            System.out.print(str+" ");

        }
    }
}