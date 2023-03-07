package ifpracticing.src;

public class NestingItIsRainingHardExample {
    public static void main(String[] args) {
        int temperature = 35;
        boolean raining = false;
        boolean snowing=false;

        if(raining) {if(temperature>33){System.out.println("wear rain coat");}
                 else{
                System.out.println("wear fleece and rain coat");}}


                else if (snowing) {if (temperature>20){System.out.println("wear soft jacket");}
                else if (temperature>0){System.out.println("wear down jacket");}
                else {System.out.println("wear base layers");}}



            else {
                System.out.println("It is a nice weather");}
    }}





