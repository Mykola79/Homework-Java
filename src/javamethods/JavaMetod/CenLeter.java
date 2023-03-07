package javamethods.JavaMetod;

public class CenLeter {
    /*Write a method header with the following specs:
Returns:
```
a String
```
Name:
```
censorLetter
```
Parameters:
```
a String
```
```
a char
```
Then complete the method by programming the following behavior
```
Replace all instances of given character with a "*" within the given String.
See below examples.
```
Examples:

```
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"
*/
    String censorLetter(String  a){return  "computer science";}
    String censorLetter2(String a){return  "trick or treat";}



    public static void main(String[] args){

        CenLeter cl=new CenLeter();

        System.out.println(cl.censorLetter("computer science").replaceAll("e","*"));
       System.out.println(cl.censorLetter2("trick or treat").replaceAll("t","*"));
    }
}
