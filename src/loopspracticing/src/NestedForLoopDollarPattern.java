package loopspracticing.src;

public class NestedForLoopDollarPattern {
    public static void main(String[] args) {


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++){
                if (i == 0 || i == 4 - 1) {System.out.print("$");}

            else {if (j == 0 || j == 4 - 1) {System.out.print("$");}

            else {System.out.print(" ");}}}

            System.out.println();}
    }
}