package ifpracticing.src.arrayspractice;

public class ArrayExample2 {
    public static void main(String[] args) {


        // we don't know how many numbers
        int a[]={100, 200, 300, 400, 500};

        int sum=0;
        for (int i:a)
        {System.out.println(i);sum=sum+i;}//or
            //i++; //i or sum goes to print
            System.out.println(sum);
            
        }
    }

