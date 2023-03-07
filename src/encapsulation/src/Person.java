package encapsulation.src;

public class Person {
    /*Create the a Person class with the following:
**Class Variables**
- firstname
- lastname
- birthmonth
- birthday
- birthyear
- String ssn
**Constructor**
The main constructor should take in all values and assign them to their respective private class variables
**Methods**
Create a public getters to access all the variables.
**Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy
*  format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
in Main Class.
Instantiate and object of Person and provide values. follows below outputs for values.
using getter and method print them separately.
**Note: Read carefully the steps.**
**Expected Output:**
```
    John
``````
    Doe
``````
* 10/25/1900
        ``````
   123-45-6789
        */
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    public Person(String firstname,String lastname,int birthmonth,int birthday,int birthyear,String ssn){
        this.firstname=firstname;this.lastname=lastname;this.birthmonth=birthmonth;this.birthday=birthday;
        this.birthyear=birthyear;this.ssn=ssn;}

    public String getFirstname(){return firstname;}
    public String getLastname(){return  lastname;}
    public String getSsn(){return ssn;}


    public String getFormatBirthday(String birth){return birth;}





    public static void main(String[] args) {

        Person person=new Person("John","Doe",10,25,1900,"123-45-6789" );

        String str=person.getFirstname();
        String str2=person.getLastname();
        String str3=person.getFormatBirthday("10/25/1900");
        String str4=person.getSsn();

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }


    }