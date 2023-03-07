package objectorientedexercizes.src;

public class DogTester {
    public static void main(String[] args) {



    Dog dog1=new Dog();


    //Create a Dog Class and create 3 different objects of it:
    // Husky, Bulldog, Labrador  with specific  attributes and behaviors.


    //attributes
    dog1.breed="Husky";
    dog1.color="White";
    dog1.size="Middle";
    //behaviors
    dog1.bark();

    Dog dog2=new Dog();

    //attributes
        dog2.breed="Buldog";
        dog2.color="Black";
        dog2.size="Middle";
        //behavior
        dog2.eat();

        Dog dog3=new Dog();
        //attributes
        dog3.breed="Labrador";
        dog3.color="Brown";
        dog3.size="big";

        dog3.sleep();




    }}