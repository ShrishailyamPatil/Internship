
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declare variables
		System.out.println("\nArithmetic Operators:");
	    int a = 12, b = 5;

	    // addition operator
	    System.out.println("a + b = " + (a + b));

	    // subtraction operator
	    System.out.println("a - b = " + (a - b));

	    // multiplication operator
	    System.out.println("a * b = " + (a * b));

	    // division operator
	    System.out.println("a / b = " + (a / b));

	    // modulo operator
	    System.out.println("a % b = " + (a % b));
	    
	    System.out.println("\nAssignment Operators:");
	    int var;

	    // assign value using =
	    var = a;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += a;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= a;
	    System.out.println("var using *=: " + var);
	    
	    
	    System.out.println("\nRelational Operators:");
	    // create variables
	    int c = 7, d = 11;

	    // value of c and d
	    System.out.println("c is " + c + " and d is " + d);

	    // == operator
	    System.out.println(c == d);  // false

	    // != operator
	    System.out.println(c != d);  // true

	    // > operator
	    System.out.println(c > d);  // false

	    // < operator
	    System.out.println(c < d);  // true

	    // >= operator
	    System.out.println(c >= d);  // false

	    // <= operator
	    System.out.println(c <= d);  // true
	    
	    
	    System.out.println("\nLogical Operators:"); 

	    // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false 

	    System.out.println("\nUnary Operators:"); 
	    // declare variables
	    int e = 12, f = 12;
	    int result1, result2;

	    // original value
	    System.out.println("Value of e: " + e);

	    // increment operator
	    result1 = ++e;
	    System.out.println("After increment: " + result1);

	    System.out.println("Value of f: " + f);

	    // decrement operator
	    result2 = --f;
	    System.out.println("After decrement: " + result2);
	    
	    
	    System.out.println("\ninstanceof Operator:");
	    String str = "Programiz";
	    boolean result;

	    // checks if str is an instance of
	    // the String class
	    result = str instanceof String;
	    System.out.println("Is str an object of String? " + result);
	    
	    System.out.println("\nTernary Operator:");
	    int februaryDays = 29;
	    String res;

	    // ternary operator
	    res = (februaryDays == 28) ? "Not a leap year" : "Leap year";
	    System.out.println(res);
	}

}
