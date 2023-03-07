package twodarrays;

public class TwoDArray3Grocery {
    public static void main(String[] args) {
/*Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets. Retrieve all values from that array using 2
 different loops
 */
        String grocery[][]={{"V", "V1","V2"},
                            {"F", "F1", "F2"},
                            {"D", "D1", "D2"},
                            {"S", "S1", "S2"}};

        for(String name[]: grocery){for(String name2: name){
            System.out.print(name2+" ");}
            System.out.println();
        }

        System.out.println("****************************");

        for(int i=0; i< grocery.length; i++){for (int j=0; j< grocery[i].length; j++){
            System.out.print(grocery[i][j]+" ");}

            System.out.println();}



    }}
