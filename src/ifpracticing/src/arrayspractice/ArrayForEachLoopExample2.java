package ifpracticing.src.arrayspractice;

public class ArrayForEachLoopExample2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        //for (int i = 0; i <= 4; i++)
        //{System.out.println(a[i]);
        //}

        for (int i:a)
        {
            System.out.println(i);}
    }

}