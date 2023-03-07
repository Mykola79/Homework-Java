package objectorientedexercizes.src.objectoriented;

public class DogReplit88 {
    /*In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().

    Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

    The output of the program should be as following:

     Husky can bark

     Husky can run
```
 Husky can play
```
Bulldog can bark
```
Bulldog can run
```
Bulldog can play
```
Labrador can bark
```
Labrador can run
```
Labrador can play*/
    //attributes
    String breed;
    String name;
    String color;
    //behavior
    void bark(){
        System.out.println("Husky can bark");
        System.out.println("Bulldog can bark");
        System.out.println("Labrador can bark");
    }
    void run(){
        System.out.println("Husky can run");
        System.out.println("Bulldog can run");
        System.out.println("Labrador can run");
    }
    void play(){
        System.out.println("Husky can play");
        System.out.println("Bulldog can play");
        System.out.println("Labrador can play");
    }



    public static void main(String[] args) {

        DogReplit88 dog1=new DogReplit88();

        //attributes
        dog1.breed="Husky";
        dog1.name="Rex";
        dog1.color="White";
        //behavior
        dog1.bark();

        DogReplit88 dog2=new DogReplit88();
        //attributes
        dog2.breed="Bulldog";
        dog2.name="Romeo";
        dog2.color="Black";
        //behavior
        dog2.run();

        DogReplit88 dog3=new DogReplit88();
        //attributes
        dog3.breed="Labrador";
        dog3.name="Tommy";
        dog3.color="Brown";
        //behavior
        dog3.play();

    }

}