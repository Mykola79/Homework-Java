package variables;

public class CapitalAndPopulation {
    /*Declare 3 instance variables to hold:

- name of the country
- capital
- population size

Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
**Expected Output:**
```
    The capital of USA is Washington DC and population is 330000000
     The capital of Kazakhstan is Astana and population is 18500000
```*/

    String display(String nameOfTheCountry, String capital,int size){

        return "The capital of "+nameOfTheCountry+" is "+capital+" and population is "+size;}


    public static void main(String[] args){

        CapitalAndPopulation geography=new CapitalAndPopulation();

        System.out.println(geography.display("USA","Washington DC",330000000));


        CapitalAndPopulation geography2=new CapitalAndPopulation();

        System.out.println(geography2.display("Kazakhstan","Astana",18500000 ));


        /*String country;
    String capital;
    int size;

    public static void main(String[] args) {

        CapitalAndPopulation cap=new CapitalAndPopulation();

        cap.country="USA";
        cap.capital="Washington DC";
        cap.size=330000000;

        System.out.println("The capital of "+cap.country+" is "+cap.capital+" and population is "+cap.size);*/



    }



    }

