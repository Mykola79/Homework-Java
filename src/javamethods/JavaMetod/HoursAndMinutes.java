package javamethods.JavaMetod;

public class HoursAndMinutes {
    /*Step1: Create a method that will accept with 2 parameters of integer type
Step2: Write the logic in that method in println statement to print hours and minutes
Step3: Call the method
**Expected Output:**
```
11:30*/



   public static void clock(int a,int b){
        System.out.println(a+":"+b);

    }

    public static void main(String[] args) {

        //HoursAndMinutes clocks=new HoursAndMinutes();

        clock(11,30);



    }
}
