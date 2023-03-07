package abstraction.src;

public abstract class Tea {
    /*Create a Super Class Tea that will have:
- instance variable teaType;
- constructor that will initialize
- unimplemented method addSugar(),
Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
In main class create an object of 2 Child classes and assign them to Parent reference type.
Execute method addSugar from both classes.
**Expected Output:**
```
For Lemon Tea we need 2 spoons of sugar
``````
For Chai Tea we need 1 spoon of sugar*/

    String teaType;
    Tea(String teaType){
        this.teaType=teaType;}

    abstract void addSugar();
}


    class LemonTea extends Tea {

        String teaType;

        LemonTea(String teaType) {

            super(teaType);
            this.teaType=teaType;
        }


                void addSugar() {System.out.println("For "+teaType+" Tea we need 2 spoons of sugar");
        }
    }

    class ChaiTea extends Tea{

        String teaType;

        ChaiTea(String teaType){
            super(teaType);
            this.teaType=teaType;
        }
        void addSugar(){System.out.println("For "+teaType+" Tea we need 1 spoon of sugar");
        }

        public static void main(String[] args) {

            Tea[] teas={new LemonTea("Lemon"),new ChaiTea("Chai")};

            for (int i=0; i< teas.length;i++){

                Tea tea=teas[i];

                tea.addSugar();
            }
        }

        }




