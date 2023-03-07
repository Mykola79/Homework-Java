package accessmodifiers.src;

public class MaxValuee {
    /*Create the maxValue method that will accept int array and return the maximum value in the array.
Method should be visible every class in any package!
**Expected Output:**```
            22*/
    public static String maxValue (int[] array) {

            int maxValu = array[0];
            for(int i = 1;i<array.length;i++){
                if(array[i]==maxValu){
                }
                else if(array[i]>maxValu){
                    maxValu = array[i];
                }
            }

            return String.valueOf(maxValu);

        }

    public static void main(String[] args) {
        int[] array = {5,12,-3,7,3,22};
        System.out.println(maxValue(array)); //should print 22
    }


}
