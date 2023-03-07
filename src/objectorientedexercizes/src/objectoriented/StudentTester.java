package objectorientedexercizes.src.objectoriented;

public class StudentTester {
    public static void main(String[] args) {

        Student student1= new Student();

        student1.name="Martin";
        student1.race="Chinese";
        student1.age=25;
        student1.height=5.8;
        student1.hair="Black";
        student1.attitude=true;
        student1.eat();


        Student student2=new Student();

        student2.name="Chan";
        student2.race="Black";
        student2.hair="Black";
        student2.height=6.0;

        student2.speak();


    }
}
