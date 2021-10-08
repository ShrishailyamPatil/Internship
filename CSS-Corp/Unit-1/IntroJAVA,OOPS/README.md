# Java

   Java is a popular programming language, created in 1995.
It is owned by Oracle, and more than 3 billion devices run Java. Java was developed by James Gosling, who is known as the father of Java, in 1995.

  Java language was initially called Oak after an oak tree that stood outside Gosling's office. Later the project went by the name Green and was finally renamed Java, from Java coffee, a type of coffee from Indonesia.

## Multiple Editions
- Java Card for smartcards.

- Java Platform, Micro Edition (Java ME) — targeting environments with limited resources.

- Java Platform, Standard Edition (Java SE) — targeting workstation environments.

- Java Platform, Enterprise Edition (Java EE) — targeting large distributed enterprise or
Internet environments.

## Features of Java


| **Simple** | **Object-Oriented** | **Portable** | **Distributed** |
| :---: | :---: | :---: | :---: |
| **Platform independent** | **Secured** | **Robust** | **Dynamic** | 
| **Architecture neutral** | **Interpreted** | **High Performance** | **Multithreaded** | 

## JDK, JRE, JVM 
  - **JDK** :  Java Development Kit
  - **JRE** : Java Runtime Enviroment
  - **JVM** : Java Virtual Machine
  
  
  ![](https://static.javatpoint.com/images/jdk2.png)
  
## Lifecycle of java program
- **Edit**
    - Programmers write the code.
- **Complie**
    - Compiler creates byte code(.class) from java program.
- **Load** 
    - Class loader stores byte code in memory and loads necessary data .
- **Execute** 
    - Interpreter translates byte code into machine language 
## Basic program

**Main.java**

```java
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}  
```

## OOPS Concept

- **Encapsulation** 
    - Encapsulation in Java is a process of wrapping code and data together into a single unit, to achive data hiding
- **Abstraction**
   - Abstraction is a process of hiding the implementation details and showing only functionality to the user.
- **Polymorphism**
   -  Complie time polymorphism (Over Loading)
        - Happens in same class
   -  Runtime Dispatch (Overrinding)
        -  Happens in parent class and subclass.
- **Inheritance**
   - Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.


## Access Modifiers

The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.

The four access modifiers are private, default, protected, public.


| Access Modifiers | Same Class | Same Package | Subclass outside package | Global(all project) |
| :---: | :---: | :---: | :---: | :---: |
| Private | YES | NO | NO | NO |
| Default | YES  | YES | NO | NO |
| protected | YES | YES | YES | NO |
| Public | YES | YES | YES | YES |


## Data Types

| Data Type | Size(bits)| Range | Default Value  |
| :---: | :---: | :---: | :---: |
| byte | 8 | -2<sup>7</sup> to -2<sup>7</sup> -1  | 0 | 
| short | 16  | -2<sup>15</sup> to -2<sup>15</sup> -1  | 0 | 
| int | 32 | -2<sup>31</sup> to -2<sup>31</sup> -1 | 0 | 
| long | 64 | -2<sup>63</sup> to -2<sup>63</sup> -1 | 0L | 
| float | 32 | -2<sup>31</sup> to -2<sup>31</sup> -1  | 0.0f | 
| double | 64 | -2<sup>63</sup> to -2<sup>63</sup> -1 | 0.0d | 
| char | 16 | 0 to -2<sup>16</sup> -1 | \u0000 |
| boolean | 1 | true or false | false | 

## Control Statement 
- **If-Else statement **


  ```java
  public class vote{
  
  public static void main (String args[]){
      int  x= 23;
      if (x >= 18 ){
         System.out.println("You are eligible for Vote")
      }
      else{
         System.out.println("Not Eligible for Vote")
      }
  }
  }
  ```
  
  In Same way we can make if-else statement in another if-else statement and that is called nested if- else.Also can use if-else-if ladder loop.
  
- **Switch Statement**


      The Java switch statement executes one statement from multiple conditions.
      
    ``` java
    public class SwitchExample {  
    public static void main(String[] args) {    
    int number=20;  
    //Switch expression  
    switch(number){  
    //Case statements  
    case 10: System.out.println("10");  
    break;  
    case 20: System.out.println("20");  
    break;  
    case 30: System.out.println("30");  
    break;  
    //Default case statement  
    default:System.out.println("Not in 10, 20 or 30");  
    }  
    }  
    } 
    ```

- **For loops**

   The Java for loop is used to iterate a part of the program given fix number of  times.
   ``` java
      public class NestedForExample {  
   public static void main(String[] args) {  

   for(int i=1;i<=3;i++){  

      for(int j=1;j<=3;j++){  
              System.out.println(i+" "+j);  
      }  
   } 
   }  
   }  
   ```

- **While and Do While loops**


   The Java while loop and do while is used to iterate a part of the program
   repeatedly until the specified Boolean condition is true.

   ``` java
   // While loop

   public class WhileExample {  
   public static void main(String[] args) {  
       int i=1;  
       while(i<=10){  
           System.out.println(i);  
       i++;  
       }  
   }  
   } 

   // Do While

   public class DoWhileExample {    
   public static void main(String[] args) {    
       int i=1;    
       do{    
           System.out.println(i);    
       i++;    
       }while(i<=10);    
   }    
   }  
   ```

- **Break ,Continue**

   When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.

   ``` java

   public class BreakExample {  
   public static void main(String[] args) {  
       for(int i=1;i<=10;i++){  
           if(i==5){  
               //breaking the loop  
               break;  
           }  
           System.out.println(i);  
       }  
   }  
   } 
   ```
      The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately.
      
   ``` java
   public class ContinueExample {  
   public static void main(String[] args) {    
       for(int i=1;i<=10;i++){  
           if(i==5){  
               //using continue statement  
               continue;//it will skip the rest statement  
           }  
           System.out.println(i);  
       }  
   }  
   } 
   ```

## Links


- [Javatpoint](https://www.javatpoint.com/java-tutorial).
- [W3School](https://www.w3schools.com/java/java_intro.asp).
