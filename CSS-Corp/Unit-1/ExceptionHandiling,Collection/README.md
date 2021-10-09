# Exception Handling
  - An exception is an abnormal condition that arises in a code sequence at run time.
  - When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally.
  - Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
  - The core advantage of exception handling is to maintain the normal flow of the application. 
  
  ## Types of Exception
   - Checked Exception

      The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.
      
   - Unchecked Exception   
      - Error

        Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.


      - Runtime Exception

           The classes that directly inherit Unchecked Exception except Error are known as RuntimeException.For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime. 
   
   ## Hierarchy of Java Exception classes
   
   ![](https://static.javatpoint.com/core/images/hierarchy-of-exception-handling.png)
   
   
   ## Exception Keywords
   
   - **try**:
      - Program statements that you want to monitor for exceptions are contained within a try block.
      - If an exception occurs within the try block, it is thrown.
   - **catch**:
      - Your code can catch this exception (using catch) and handle it in some rational manner.
   - **throw**:
      - To manually throw an exception, use the keyword throw.
   - **throws**:
      - To manually throw an exception, use the keyword throw.
   - **finally**:
      - Any code that absolutely must be executed after a try block completes is put in a finally block
   
   ## Exception caught process
   
   - When the Java run-time system detects exception or error, it constructs a new exception object and 
then throws this exception. 
   - This causes the execution of code to stop, because once 
an exception has been thrown, it must be caught by an 
exception handler and dealt with immediately. 
   - The exception is caught by the 
default handler provided by the Java run-time system. 
   - Any exception that is not caught by your program will 
ultimately be processed by the default handler. 
   - The default handler displays a string describing the 
exception, prints a stack trace from the point at which the 
exception occurred, and terminates the program or find the catch bolck in program.
   - If  catch is present it check the exception and follow the code in catch .
   - After it goes through finally flows and run it.

  ## Examples 
  - Multiple Catch Block:

  ``` java
  class TryCatch {
    public static void main(String args[]) {
    try {
      int a = args.length;
      System.out.println("a = " + a);
      int b = 42 / a;
      int c[] = { 1 };
      c[42] = 99;
    }
    catch (ArithmeticException e) {
      System.out.println("Divide by 0: " + e);
    } 
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array index oob: " + e);
    }
    finally{
      System.out.println("After try/catch blocks.");
    }}
  }
  ```
  
  - Nested try Statement 
  ``` java
  class TryCatch {
    public static void main(String args[]) {
    try {
      int a = args.length;
      int b = 42 / a;
      System.out.println("a = " + a);
      try { // nested try block
        if (a == 1)
           a = a / (a - a); // division by zero
        if (a == 2) {
          int c[] = { 1 };
          c[42] = 99; //outofbound
        }
      } 
      catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index out-of-bounds: " + e);
      }
    } 
    catch (ArithmeticException e) {
       System.out.println("Divide by 0: " + e);
    }
    }
    }
  ```
  - Throw 
  ``` java
  class TryCatch {
    static void demoproc() {
      try {
         throw new NullPointerException("demo");
      } 
      catch (NullPointerException e) {
         System.out.println("Caught inside demoproc.");
         throw e; // rethrow the exception
      }
      }
    public static void main(String args[]) {
      try {
          demoproc();
      } 
      catch (NullPointerException e) {
          System.out.println("Recaught: " + e);
      }
    }
    }
  //Caught inside demoproc.
  //Recaught: java.lang.NullPointerException: demo

  ```
      
  - Throws 
  ``` java
   class TryCatch {
      static void throwOne() throws IllegalAccessException{
          System.out.println("Inside throwOne.");
          throw new IllegalAccessException("demo");
      }
      public static void main(String args[]) {
        try {
            ThrowOne();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
        }
      }

   //inside throwOne
   //caught java.lang.IllegalAccessException: demo

  ```
      
 ## Difference throw and throws
 
  | throw | throws |
  | :---: | :---: |
  |  used to throw an exception explicitly. |  used to declare an exception possible during its execution. |
  | throw keyword is followed by an instance of Throwable class or one of its sub-classes. | throws keyword is followed by one or more Exception class names separated by commas. |
  | throw keyword is declared inside a method body. | throws keyword is used with method signature(method declaration). |
  | We cannot throw multiple exceptions using throw. | We can declare multiple exceptions(separated by commas) using throws keyword. |
 
 ## Custom Exception
 
 If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to customize the exception according to user need.
 
 ``` java
 class InvalidAgeException extends Exception {
  InvalidAgeException(String s) {
     super(s);
  }
  }
  class TryCatch {
    static void validate(int age) throws InvalidAgeException {
      if (age < 18)
        throw new InvalidAgeException("not valid");
      else
        System.out.println("welcome to vote");
      }
    public static void main(String args[]) {
      try {
          validate(13);
      } catch (Exception m) {
          System.out.println("Exception occured: " + m);
      }
          System.out.println("rest of the code...");
      }
  }
  //Exception occured: InvalidAgeException: not valid
  //rest of the code..
 ```

  
