package ifpracticing.src.ifprictice;

public class TemperatureCheck {public static void main(String[] args){
    /*Create a Java program and name it Temperature Check. Create variable to store temperature. Your program should
     check if temperature is below 32 then it should print “Water will freeze with temperature ”, otherwise “Water will
      NOT freeze with temperature ”.
     */
    int temperature=40;

    if(temperature<32){
        System.out.println("Water will freeze with "+temperature);}
    else {
        System.out.println("Water will not freeze with "+temperature);}


}
}
