package thiskeyword;

public class CarObjects {
    /***In carObject class:**
     Create instance variables as below.
     - model
    - price,
     - quantity
     Create a constructor that will initialize instance variables.
     Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print
     the result.
     run the application in Main Class
     **Expected Output:**
     ```
    Toyota 2019 Stock Value 2500000.0
    BMW 2019 Stock Value 652980.0
            ``````
    Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematic Operations.*/
    String model;
    int year;
    String quantity;
    double price;

    CarObjects(String model, int year,String quantity, double price){

        this.model=model;
        this.year=year;
        this.quantity=quantity;
        this.price=price;}

        void carStockValue(){System.out.println(model+" "+year+" "+quantity+" "+price);
    }

    public static void main(String[] args) {

        CarObjects car=new CarObjects("Toyota", 2019, "Stock Value", 2500000.0);
        car.carStockValue();

        CarObjects car2=new CarObjects("BMW", 2019, "Stock Value", 652980.0);
        car2.carStockValue();
    }
}
