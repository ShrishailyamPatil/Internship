# Java Date and Time 

  - The **java.time**, **java.util**, **java.sql** and **java.text** packages contains classes for representing date and time. Following classes are important for dealing with date in Java.
  - Java has introduced a new Date and Time API since Java 8.
  -  The java.time package contains Java 8 Date and Time classes

  ## LocalDate Class
  - Java LocalDate class is an immutable class that represents Date with a default format of **yyyy-mm-dd**.
  - It inherits Object class and implements the ChronoLocalDate interface
    
    Example 
    ``` java
    import java.time.LocalDate; 
    public class LocalDateExample1 {    
      public static void main(String[] args) {   
          LocalDate date = LocalDate.now();      
          LocalDate yesterday = date.minusDays(1); 
          LocalDate tomorrow = yesterday.plusDays(2);
          System.out.println("Today date: "+date);   
          System.out.println("Yesterday date: "+yesterday);  
          System.out.println("Tomorrow date: "+tomorrow); 
      }    }
      
     /* OUTPUT
        Today date: 2021-10-09
        Yesterday date: 2021-10-08
        Tomorrow date: 2021-10-10*/
    ```
    
   ## LocalTime Class
   - Java LocalTime class is an immutable class that represents time with a default format of **hour-minute-second**.
   - It inherits Object class and implements the Comparable interface.
    
      Example 
      ``` java
      import java.time.LocalTime;
      public class LocalTimeExample1 { 
        public static void main(String[] args) { 
            LocalTime time = LocalTime.now(); 
            System.out.println(time);  
        }  }

      //Output:13:59:10.420

      ```

# Java Regular Expression
- A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern.
-  They can be used to search, edit, or manipulate text and data.
-  Java provides the java.util.regex package for pattern matching with regular expressions.

  ## Java Regex
  - The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
  - Java Regex API provides 1 interface and 3 classes in **java.util.regex package**.
  - java.util.regex classes and interface are
      - MatchResult interface
      - Matcher class
      - Pattern class
      - PatternSyntaxException class
    
    ### Matcher class
    | Method | Description |
    | --- | --- |
    | boolean matches() | test whether the regular expression matches the pattern. |
  	| boolean find() | finds the next expression that matches the pattern. |
    | boolean find(int start) |	finds the next expression that matches the pattern from the given start number. |
  	| String group() |	returns the matched subsequence. |
	  | int start() |	returns the starting index of the matched subsequence. |
	  | int end() |	returns the ending index of the matched subsequence. |
	  | int groupCount() |	returns the total number of the matched subsequence. |
    
    ### Pattern class
    | Method | Description |
    | --- | --- |
    | static Pattern compile(String regex) |	compiles the given regex and returns the instance of the Pattern. |
    |Matcher matcher(CharSequence input) |	creates a matcher that matches the given input with the pattern. |
    | static boolean matches(String regex, CharSequence input) |	It works as the combination of compile and matcher methods. It compiles the regular expression and matches the given input with the pattern. |
    | String[] split(CharSequence input) |	splits the given input string around matches of given pattern. |
    |	String pattern() |	returns the regex pattern. |
    
    ### Regex Character Classes
    | Character class | Description |
    | --- | --- |
    | [abc] | a, b, or c (simple class)
    |	[^abc] |	Any character except a, b, or c (negation) |
    |	[a-zA-Z] |	a through z or A through Z, inclusive (range) |
    |	[a-d[m-p]] |	a through d, or m through p: [a-dm-p] (union) |
    |	[a-z&&[def]] |	d, e, or f (intersection) |
    |	[a-z&&[^bc]] |	a through z, except for b and c: [ad-z] (subtraction) |
    |	[a-z&&[^m-p]] |	a through z, and not m through p: [a-lq-z] (subtraction) |

    ### Regex Quantifiers
    | Regex | Description |
    | --- | --- |
    | X? |	X occurs once or not at all |
    | X+ |	X occurs once or more times |
    | X* |	X occurs zero or more times |
    | X{n} |	X occurs n times only |
    | X{n,}	| X occurs n or more times |
    | X{y,z}	| X occurs at least y times but less than z times |
    
    ### Regex Metacharacters
    | Regex | Description |
    | --- | --- |
    | . |	Any character (may or may not match terminator) |
    | \d |	Any digits, short of [0-9] |
    | \D |  Any non-digit, short for [^0-9] |
    | \s |  Any whitespace character, short for [\t\n\x0B\f\r] |
    | \S |  Any non-whitespace character, short for [^\s] |
    | \w |  Any word character, short for [a-zA-Z_0-9] |
    | \W |	Any non-word character, short for [^\w] |
    | \b |  A word boundary |
    | \B |  A non word boundary |
    
    ### Example
    ``` java
    import java.util.regex.Pattern; 
    import java.util.Scanner; 
    import java.util.regex.Matcher;  
    public class RegexExample8{  
      public static void main(String[] args){  
        Scanner sc=new Scanner(System.in);   
        while (true) {        
          System.out.println("Enter regex pattern:");   
          Pattern pattern = Pattern.compile(sc.nextLine());  
          System.out.println("Enter text:");     
          Matcher matcher = pattern.matcher(sc.nextLine()); 
          boolean found = false;             
          while (matcher.find()) {             
            System.out.println("I found the text "+matcher.group()+" starting at index "+ matcher.start()+" and ending at index "+matcher.end());         
            found = true;          
          }              
        if(!found){     
         System.out.println("No match found.");   
        }          
        }    
    }    } 
    
    /* OUTPUT:
    Enter regex pattern: java
    Enter text: this is java, do you know java
    I found the text java starting at index 8 and ending at index 12
    I found the text java starting at index 26 and ending at index 30
    */
    ```
