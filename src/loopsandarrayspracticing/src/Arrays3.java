package loopsandarrayspracticing.src;

public class Arrays3 {
    public static void main(String[] args) {

        int a[] = {12, 15, 11, 13, 9, 25};
        int a1[] = {12, 15, 11, 13, 9, 25};

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == a1[i] % 5) {sum+=i*i;}}


            System.out.println(sum);
        }
    }



