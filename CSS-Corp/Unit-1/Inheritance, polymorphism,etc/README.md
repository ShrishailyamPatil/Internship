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

      ``` java 
        public class Student{
             int id;
             String name;

          Student(int id,String name){
             this.id = id;
             this.name = name;
          }
          void display(){System.out.println(id+" "+name);}

          public static void main(String args[]){
            Student s1 = new Student(112,"Rahul");    
            s2.display();
         }
         }
      ```
      
    - **Constructor Overloading**

        Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.
        
        ``` java
        
        public class Student5{  
          int id;  
          String name;  
          int age; 

          //creating two arg constructor  
          Student5(int i,String n){  
            id = i;  
            name = n;  
          }  
          //creating three arg constructor  
          Student5(int i,String n,int a){  
            id = i;  
            name = n;  
            age=a;  
          }  
          void display(){
            System.out.println(id+" "+name+" "+age);
          }  

          public static void main(String args[]){  
            Student5 s1 = new Student5(111,"Karan");  
            Student5 s2 = new Student5(222,"Aryan",25);  
            s1.display();  
            s2.display();  
        }  
        }     
        
        ```
       
## Inheritance

  Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
    
   - Relationship in inheritance 
    
        - **is-a relation(Parent-Child)**
              
             This inheritance can contain parent class , super class, child class . And used for code reusability and method orveriding for achiving runtime polymorphism.
              
             - Types of Inheritance
               
                  ![](https://static.javatpoint.com/images/core/typesofinheritance.jpg)
                  ![](https://static.javatpoint.com/images/core/multiple.jpg)
                  
                  Multi- inheritance is not supported by java
                  
                  1. Example of Multilevel Inheritance
                  
                  ``` java
                   class Animal{  
                    void eat(){
                     System.out.println("eating...");
                     }  
                    }  
                   class Dog extends Animal{  
                    void bark(){
                     System.out.println("barking...");
                     }  
                    }  
                   class BabyDog extends Dog{  
                    void weep(){
                     System.out.println("weeping...");
                     }  
                    }  
                   class TestInheritance2{  
                    public static void main(String args[]){  
                      BabyDog d=new BabyDog();  
                      d.weep();  
                      d.bark();  
                      d.eat();  
                    }}  
                    
                  ```
                  2. Example of Hierarchical Inheritance 

                  ``` java
                   class Animal{  
                    void eat(){
                     System.out.println("eating...");
                     }  
                   }  
                   class Dog extends Animal{  
                    void bark(){
                     System.out.println("barking...");
                     }  
                   }  
                   class Cat extends Animal{  
                    void meow(){
                     System.out.println("meowing...");
                     }  
                   }  
                   class TestInheritance3{  
                    public static void main(String args[]){  
                     Cat c=new Cat();  
                     c.meow();  
                     c.eat();  
                   
                   }} 
                  ```
       
        - **has-a relation(Aggregation)**
       
          If a class have an entity reference, it is known as Aggregation.Aggregation is used mailny for Code Reusability.
          
             - Example

             ``` java
              
                public class Address {  
                  String city,state,country;  

                  public Address(String city, String state, String country) {  
                      this.city = city;  
                      this.state = state;  
                      this.country = country;  
                  }  

                }  

                public class Emp {  
                  int id;  
                  String name;  
                  Address address;  

                  public Emp(int id, String name,Address address) {  
                      this.id = id;  
                      this.name = name;  
                      this.address=address;  
                  }  

                  void display(){  
                    System.out.println(id+" "+name);  
                    System.out.println(address.city+" "+address.state+" "+address.country);  
                  }  

                  public static void main(String[] args) {  
                    Address addre = new Address("Hol","AP","india");  

                    Emp e1 = new Emp(230,"Gian",addre);  


                    e1.display();  


                }  
                }  

             ```
             
           - When use Aggregation?
              
             1.  Code reuse is also best achieved by aggregation when there is no is-a relationship.
             2.  Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.
        
        
## Polymorphism

   -  **Complie time polymorphism (Over Loading)**
  
        - Happens in same class.
        - If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
        - Method overloading increases the readability of the program.
        - Method overloading can be achived either by changing number of arguments or changing the data type

        1. Example (by changing number of arguments)

            ``` java
            class Adder{  
              static int add(int a,int b){
                return a+b;
                }  
              static int add(int a,int b,int c){
                return a+b+c;
                }  
            }  
            class TestOverloading1{  
              public static void main(String[] args){  
                System.out.println(Adder.add(1,2));  
                System.out.println(Adder.add(1,2,3));  
            }} 
            ```
        2. Example ( by changing the data types)

            ``` java
            class Adder{  
              static int add(int a, int b){
                return a+b;
                }  
              static double add(double a, String b){
                return a+b;
                }  
              }  
            class TestOverloading2{  
                public static void main(String[] args){  
                  System.out.println(Adder.add(1,2));  
                  System.out.println(Adder.add(42.3,Hello));  
              }}
            ```


        
   -  **Runtime Dispatch (Overrinding)**
  
        -  Happens in parent class and subclass.
        -  If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
        -  Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.

        Rules for Java Method Overriding
        - The method must have the same name as in the parent class.
        - The method must have the same parameter as in the parent class.
        - There must be an IS-A relationship (inheritance).

        Example
         ``` java
            class Vehicle{  
    
              void run(){
                System.out.println("Vehicle is running");
                }  
            }  

            class Bike extends Vehicle{  
              //defining the same method as in the parent class  
              void run(){
                System.out.println("Bike is running safely");
                }  

              public static void main(String args[]){  
                Bike obj = new Bike(); 
                obj.run();
              }  
            } 
            //OUTPUT: Bike is running safely
         ```



   - **Super Keyword**

        - The super keyword in Java is a reference variable which is used to refer immediate parent class object.
        - super can be used to refer immediate parent class instance variable.
        - super can be used to invoke immediate parent class method.
        - super() can be used to invoke immediate parent class constructor.
    
      Example
      
        ``` java 
          class Animal{  
            String color="white"; 
            void eat(){
              System.out.println("eating...");
              }
          }  
          class Dog extends Animal{  
            String color="black"; 
            void eat(){
              System.out.println("eating bread...");
            } 
            void about(){  
              super.eat();  
              System.out.println(super.color); 
              }
            }
              
          class TestSuper{  
            public static void main(String args[]){  
              Dog d=new Dog();  
              d.about();
              }} 
              
              
           /* OUTPUT:
            white
            eating...*/
             

        ```
        

## Encapsulation 

   - Encapsulation in Java is a process of wrapping code and data together into a single unit, to achive data hiding.
   - The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class.We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.
   - The four access modifiers are private, default, protected, public.
   - Can use setters and getters for achiving encapsulation
    
   Example
   ``` java
    public class Person {
      private String name; // private = restricted access

      // Getter
      public String getName() {
        return name;
      }

      // Setter
      public void setName(String newName) {
        this.name = newName;
      }
    }
    public class Main {
      public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error 
      }
    }
   ```
   
## Abstraction

  - Abstraction is a process of hiding the implementation details and showing only functionality to the user.
  - Abstraction can be achived by either Abstract class (0 to 100%) or Interface (100%)

      - Abstract class
          - A class which is declared as abstract is known as an abstract class.
          - An abstract class must be declared with an abstract keyword.
          - It can have abstract and non-abstract methods.
          - It cannot be instantiated.
          - It can have constructors and static methods also.
          - It can have final methods which will force the subclass not to change the body of the method.

          Example 
          ``` java 
          abstract class Bike{  
            abstract void run();  
          }  
          class Honda extends Bike{  
            void run(){
              System.out.println("running safely");
              }  
            public static void main(String args[]){  
             Bike obj = new Honda();  
             obj.run();  
            }  
          } 
          //OUTPUT: running safely
          
          ```
      - **Interface**

           - An interface in Java is a blueprint of a class. 
           - It has static constants and abstract methods.
           - By interface, we can support the functionality of multiple inheritance.
           - It can be used to achieve loose coupling.

           Example
           ``` java
           interface Drawable{  
              void draw();  
            }  
            
            
            class Rectangle implements Drawable{  
              public void draw(){
                System.out.println("drawing rectangle");
                  }  
            }  
            class Circle implements Drawable{  
              public void draw(){
                System.out.println("drawing circle");
                }  
            }  
            
             
            class TestInterface1{  
              public static void main(String args[]){  
                Drawable d=new Circle();
                d.draw();  
            }}  
           ```
    
    
## Operators 
  - **Arithmetic Operators**
  
    +,-,*,/,%,++,--
    Example
      ``` java
      public class Main {  public static void main(String[] args) {  
        int x = 5; 
        int y = 2; 
        System.out.println(x % y); 
        }}

      //Output:1•
      ```
  - **Relational Operators**
  
    ==, !=, >, <, >=, <=
    Example
      ``` java
      public class Main {  public static void main(String[] args) { 
        int x = 5;  
        int y = 3; 
        System.out.println(x != y); 
        }}
      //Output:true 
      ```
    
  - **Bitwise Operators**

    &, |, ^, ~, <<, >>, >>>
    Example
      ``` java
      public class BitwiseAndExample   {   
        public static void main(String[] args)   {  
        int x = 9, 
        y = 8;  
        System.out.println("x & y = " + (x & y)); 
        }  }

      //Output: x & y = 8
      ```
  - **Logical Operators**
  
    &&, ||, !
    Example
      ``` java
      public class Main {  public static void main(String[] args) { 
        int x = 5;  
        System.out.println(!(x > 3 && x < 10));  
        }
        }

      //Output:false 
      ```
 - **Assignment Operators**

   =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
   Example
    ``` java
    public class Main {  public static void main(String[] args) {  
      int x = 5;   
      x &= 3;   
      System.out.println(x); 
      }}
    //Output:1
    ```
## INSTANCEOF OPERATOR

  Example
   ``` java
      class Simple{   public static void main(String args[]){ 
        Simple s=new Simple(); 
        System.out.println(s instanceof Simple);//true
        }  }
      // Output:true
   ```
