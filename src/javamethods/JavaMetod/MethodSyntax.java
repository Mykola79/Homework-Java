package javamethods.JavaMetod;

class MethodSyntax {
    /*Create one method as syntaxTechnologies and write the logic for that method in println statement
     as "Welcome to Syntax Technologies!"
2. Create another method as syntaxStudents and write the logic for that method in println statement
 as "Welcome Syntax Students!"
3. Call both methods
**Expected Output:**
```
Welcome to Syntax Technologies!
```
Welcome Syntax Students!*/

    String syntaxTechnologies(){return "Welcome to Syntax Technologies!";}

    String syntaxStudents(){return "Welcome Syntax Students!";}

    public static void main(String[] args) {

        MethodSyntax metodSyntax=new MethodSyntax();

        System.out.println(metodSyntax.syntaxTechnologies());
        System.out.println(metodSyntax.syntaxStudents());

    }
    }



