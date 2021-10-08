# OOPS

## Object and Classes

  -  **Object** 

      An entity that has state and behavior is known as an object.A class is a template or blueprint from which objects are created. So, an object is the instance (result) of a class.
      - State: represents the data (value) of an object.
      - Behavior: represents the behavior (functionality) of an object. 
 - **Methods**

      A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation.
      ![Syntax of Method](https://static.javatpoint.com/core/images/method-in-java.png)
      
      ``` java      
      import java.util.Scanner;  
      public class EvenOdd  
      {  
      public static void main (String args[])  
      {  
      //creating Scanner class object     
      Scanner scan=new Scanner(System.in);  
      System.out.print("Enter the number: ");  
      int num=scan.nextInt();  
      
      //method calling  
      findEvenOdd(num);  
      }  
      
      //user defined method  
      public static void findEvenOdd(int num){         
      if(num%2==0)   
      System.out.println(num+" is even");   
      else   
      System.out.println(num+" is odd");  
      }  
      }
     ```
     
 - **Constructors**

     Constructoris a special type of method which is used to initialize the object.At the time of calling constructor, memory for the object is allocated in the memoryEvery time an object is created using the new() keyword, at least one constructor is called.It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
    - Rule of Constructors :
        - Constructor name must be the same as its class name.
        - A Constructor must have no explicit return type.
        - A Java constructor cannot be abstract, static, final, and synchronized .  

    

