package accessmodifiers.src;

public class NameAndCity{
    /*In main class please declare the variables using different access modifiers that will hold value for:
- name
- city
- name of the school
- batch number
Create a method to display details in following format:
My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
Assign values to the variables and execute method display
**Expected Output:**
My name is John and I live in Miami. I study at Syntax in batch 9
*/
    String display(String name, String city, String nameOfTheSchool, String batchNumber){
        return "My name is "+name+" and I live in "+city+". I study at "+nameOfTheSchool+" in batch "+batchNumber;}


    public static void main(String[] args) {

        NameAndCity nac=new NameAndCity();


        System.out.println(nac.display("John","Miami","Syntax","9"));
    }

    }




