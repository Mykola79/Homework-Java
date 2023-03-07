package thiskeyword;

public class ShoppingStore {
    /**
     * In ShoppingStore class:**
     * Create variables as below.
     * - item,
     * - price,
     * - quantity
     * Create a constructor to initialize instance variables.
     * Create a method with name itemTotalPrice.
     * write a logic to calculate the total values of items in stock. and print the result.
     * return the total value.
     * *In Main Class.**
     * Create two Object of ShoppingStore and pass the parameters to Constructor.
     * then using each object call the method itemTotalPrice.
     * Store the returned value of each object.
     * Calculate sum of both object and print the result.
     * Output:
     * ```
     * Blanket Total Value 99.98
     * ``````
     * Mattress Total Value 439.18
     * ``````
     * You purchased 539.16 Today
     * ``````
     * Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation,
     * Mathematic Operations, method return types.
     */
    String item;
    String totalValue;
    double price;
    String item2;
    String total2;
    double price2;

    ShoppingStore(String item, String totalValue, double price) {
        this.item = item;
        this.totalValue = totalValue;
        this.price = price;}

    String itemTotalPrice(){return item+" "+totalValue+" "+price;}


    public static void main(String[] args) {
        ShoppingStore sh=new ShoppingStore("Blanket", "Total Value", 99.98);
        System.out.println(sh.itemTotalPrice());

        ShoppingStore sh2=new ShoppingStore("Mattress", "Total Value", 439.18);
        System.out.println(sh2.itemTotalPrice());

        System.out.println("You purchased  "+(99.98+439.18)+" Today");

    }
}
