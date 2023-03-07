package objectorientedexercizes.src.objectoriented;

public class PhoneTester {
    public static void main(String[] args) {

        Phone phone=new Phone();
        //attributes
        phone.name="iPhone";
        phone.size=6.2;
        phone.color="Black";
        //behavior
        phone.talk();


        Phone phone2=new Phone();
        //attributes
        phone2.name="Samsung";
        phone2.size=6.5;
        phone2.color="White";
        //behavior
        phone2.write();

        Phone phone3=new Phone();
        //attributes
        phone3.name="Pixel";
        phone3.size=5.9;
        phone3.color="Grey";
        //behavior
        phone3.listen();


    }
}
