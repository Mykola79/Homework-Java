package metodoveriding.src;

public class Animal {
    /*Create a class Animal in which define instance variable type, constructor that will initialize instance
     variables and 2 methods eat and sleep.
Create a subclass Cat in which override method sleep
Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
for 2 kitten - eats snack
for 3 kitten - eats everything
In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available
 methods:
**Expected Output:**
```
Cat eats
Cat sleeps a lot
kitten1 eats milk
kitten1 sleeps a lot
kitten2 eats snacks
kitten2 sleeps a lot
kitten3 eats everything
kitten3 sleeps a lot*/
    String food;

    Animal(String food){
        this.food=food;}

        void eat(){}
        void sleep(){}
}


class Cat extends Animal{

String food;
    Cat(String food) {
        super(food);
    }
void eat(){
    System.out.println("Cat eats");
}
    void sleep(){
        System.out.println("Cat sleeps a lot");
    }
    }



    class Kitten1 extends Cat{

    Kitten1(String food) {
            super(food);
        }

        @Override
        void eat() {
            System.out.println("kitten1 eats milk");
        }

        @Override
        void sleep() {
            System.out.println("kitten1 sleeps a lot");
        }
    }




    class Kitten2 extends Cat{
        Kitten2(String food) {
            super(food);
        }

        @Override
        void eat() {
            System.out.println("kitten2 eats snacks");

        }

        @Override
        void sleep() {
            System.out.println("kitten2 sleeps a lot");
        }
    }

    class Kitten3 extends Cat{
    Kitten3(String food) {
        super(food);
    }

    @Override
    void eat() {
        System.out.println("kitten3 eats everything");
    }

        @Override
        void sleep() {
            System.out.println("kitten3 sleeps a lot");
        }

        public static void main(String[] args) {




       //Cat[] animals={new Kitten1("f"),new Kitten2("f"),new Kitten3("f")};

       //for (Cat cats: animals){
           Cat cat=new Cat("f");
           cat.eat();
           cat.sleep();

           Kitten1 kit = new Kitten1("f");
           kit.eat();
           kit.sleep();

           Kitten2 kit2=new Kitten2("f");
           kit2.eat();
           kit2.sleep();

           Kitten3 kit3=new Kitten3("f");
           kit3.eat();
           kit3.sleep();







       }


    }



