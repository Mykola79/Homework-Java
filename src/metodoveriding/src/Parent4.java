package metodoveriding.src;

public class Parent4 {
    /*Parent class create 4 methods with different level of access modifiers. In each method print
     "I am parent public/protected/default/private method".
Override methods in child class
In Main Class create object of the child class and see which methods are available
**Expected Output:**
```
I am a child public method
``````
I am a child protected method
``````
I am a child default method*/
    void hello(){
        System.out.println("I private method");
    }
}
class Child4 extends Parent4{

    public void hello(){
        System.out.println("I am a child public method");}
    }
class Child5 extends Parent4{
    protected void hello(){
        System.out.println("I am a child protected method");}

}

class Child6 extends Parent4{
     void hello(){
        System.out.println("I am a child default method");}

    public static void main(String[] args) {

         Parent4 []children={new Child4(), new Child5(), new Child6()};

         for(Parent4 par: children){
             par.hello();
         }
    }}