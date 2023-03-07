package inheritance.src;

public class Method2 {
    /*In Method Class:**

    Complete static sum2D method by writing an accumulator algorithm that will calculate the sum of all the element in the 2D array passed as a parameter.

    You know how to do this.

    You know how to do an accumulator algorithm with a 1-D array.  Now it's "loop through all the elements of the 2-D array" instead of "loop through all the elements of the 1-D array".  You know how to loop through a 2-D array.  You got this.

            **In Main Class:**

    Create relation between Main class and Method by making Main class as a subclass of the Method Class

            Use Array:

    int[][] a = {

            { 1, 2, 3 },

            { 4, 5, 6 },

            { 7, 8, 9 }

    };

    and execute sum2D method

**Expected Output:**

            ```
            45*/


        public int getSum(int[][] a) {

            int sum = 0;
            int rows = a.length;
            for (int i = 0; i < rows; i++) {
                int columns = a[i].length;
                for (int j = 0; j < columns; j++) {
                    sum = sum + a[i][j];
                }
            }
            return sum;
        }}
        class Main {
            public static void main(String[] args) {

                Method2 met=new Method2();
                int[][] a = {
                        { 1, 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9 }};
                System.out.println(met.getSum(a));
            }
        }

