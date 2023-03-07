package loopspracticing.src;

public class WhileLoop {
    public static void main(String[] args) {

        int a=1;
        int b=1;
        int counter=0;

        while(counter<3){a=a+b;b=a-b; counter++;}

        System.out.println("a is "+a+" and b is "+b);

    }
}
