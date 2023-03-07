package twodarrays;

public class SumOfEvenRowsAdColumns {
    public static void main(String[] args) {
        /*Write a program that sums all numbers that are on even index and on even row.

**Expected Output:**

```
-4*/
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}};

int sum=0;
        for(int i=0; i< a.length; i++){for(int j=0; j<a.length; j++){if(a[i][j]%2==0 && a[j][i]%2==0)sum=sum+a[i][j];}

            System.out.print("");}
            System.out.println(sum);
    }
}
