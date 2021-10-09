# Array
- An array is a container object that holds a fixed number of values of single type.
- The length of an array is established when the array is created.
- After creation, its length is fixed.

## One Dimensional array
``` java
class Testarray{  
public static void main(String args[]){  
int arr[]={1,2,3,4,5};  
//printing array using for-each loop  
for(int i:arr){  
System.out.println(i); } 
}} 
/*Output:
    1
    2
    3
    4
    5*/
```
## Multi Dimensional array
``` java
class Testarray{  
public static void main(String args[]){

//declaring and initializing 2D array  
int arr[][]={{1,2,3},{2,4,5},{4,4,5}};  

//printing 2D array  
for(int i=0;i<3;i++){  
 for(int j=0;j<3;j++){  
   System.out.print(arr[i][j]+" ");  
 }  
 System.out.println();  
}  
}}  
/*Output:
    1 2 3
    2 4 5
    4 4 5*/
```
## Copying Arrays
``` java
class Testarray{  
  public static void main(String args[]){  
    int arr[]={1,2,3,4,5};
    int hold[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    // copy all of the myArray array to the hold
    // array, starting with the 0th index
    System.arraycopy(arr, 0, hold, 0,
    arr.length);
    for(int i:arr){
      System.out.print(arr);}
```
# Collection
- The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.
- Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

## Hierarch of Collection Framework

![](https://static.javatpoint.com/images/java-collection-hierarchy.png)

## Set
- An unordered collection
- No duplicates are permitted.

``` java
import java.util.*;
public class GFG {
  public static void main(String[] args)
    {   Set<String> hash_Set = new HashSet<String>();        
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks"); // doesnt add 
        hash_Set.add("Example");
        hash_Set.add("Set");
 
        System.out.println(hash_Set);
    }
}
//Output: [Set, Example, Geeks, For]
```
## Map 
- A Map object describes mappings from keys to values.
- Duplicate keys are not allowed.
- One-to-many mappings from keys to values is notpermitted.
- The contents of the Map interface can be viewed and manipulated as collections.
- **entrySet** – Returns a Set of all the key-value pairs.
- **keySet** – Returns a Set of all the keys in the map.
- **values** – Returns a Collection of all values in the map.
``` java
import java.util.*;
public class mapExample{
  public staic void main (String args[]){
    Map map = new HashMap();
    map.put("Name","Doom");
    map.put("Gun","Shotgun");
    map.put("Ammo",new Integer(30));
    //overwrites
    map.put("Ammo",new Integer(5));
    
    Set st = map.keySet();
    
    Collection collection = map.values();
    Set st1 = map.entrySet();
    System.out.println(st +"\n"+ collection + "\n" + st1);    
  }
}
```

## Queue
- Queue interface orders the element in FIFO(First In First Out) manner.
- In FIFO, first element is removed first and last element is removed at last.

#### PriorityQueue class
- The PriorityQueue class provides the facility of using queue.
- But it does not orders the elements in FIFO manner. 
- It inherits AbstractQueue class.

Example
``` java
import java.util.*;  
class testQueue{  
  public static void main(String args[]){  
    PriorityQueue<Integer> queue=new PriorityQueue<integer>();  
    
    queue.add(10);  
    queue.add(20);  
    queue.add(30);  
    queue.add(40);  
    queue.add(50);  
    
    System.out.println("head:"+queue.element());  
    System.out.println("head:"+queue.peek());  
    System.out.println("iterating the queue elements:"); 
    
    Iterator itr=queue.iterator();  
    while(itr.hasNext()){  
      System.out.println(itr.next());  
    }  
    queue.remove();  
    queue.poll();  // Remove the element
    System.out.println("after removing two elements:");  
    Iterator<String> itr2=queue.iterator();  
    while(itr2.hasNext()){  
    System.out.println(itr2.next());  
    }  
  }  
} 
/* Output: head:10
           head:10
           iterating the queue elements:
           10
           20
           30
           40
           50
           after removing two elements:
           30
           40
           50*/
```


## Iterators
- Iteration is the process of retrieving every elementin a collection.
- The basic Iterator interface allows you to scan forward through any collection.

``` java
Iterator itr=list.iterator();  
      while(itr.hasNext()){  
         System.out.println(itr.next());  
    }  

```

## ArrayList
- An ordered collection.
- duplicates are permitted.


``` java
  import java.util.*;  
  class TestJavaCollection1{  
    public static void main(String args[]){  
      ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist 
      
      list.add(10); 
      list.add(20);  
      list.add(30);  
      list.add(40); 
      
      //Traversing list through Iterator  
      Iterator itr=list.iterator();  
      while(itr.hasNext()){  
         System.out.println(itr.next());  
    }  
  }  
  }  
  /*OUTPUT
    10
    20
    30
    40
```
# Comparable
- Java Comparable interface is used to order the objects of a user-defined class.
- This interface is found in java.lang package.
- Contains only one method named **compareTo(Object)**.
- It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
## compareTo(Object obj) method 
**public int compareTo(Object obj)**:
- positive integer, if the current object is greater than the specified object.
- negative integer, if the current object is less than the specified object.
- zero, if the current object is equal to the specified object.

**public void sort(List list)**:
- It is used to sort the elements of List. List elements must be of the Comparable type.

Example :
``` java
import java.util.*;
class Student implements Comparable<Student>{  
  int rollno;  
  String name;  
  int age;  
  Student(int rollno,String name,int age){  
    this.rollno=rollno;  
    this.name=name;  
    this.age=age;  
  }  
  
  public int compareTo(Student st){  
    if(age==st.age)  
     return 0;  
    else if(age>st.age)  
     return 1;  
    else  
     return -1;  
  }  
}  

  
public class TestSort1{  
  public static void main(String args[]){  
    ArrayList<Student> al=new ArrayList<Student>();  
    al.add(new Student(101,"Vijay",23));  
    al.add(new Student(106,"Ajay",27));  
    al.add(new Student(105,"Jai",21));  

    Collections.sort(al);  
    for(Student st:al){  
     System.out.println(st.rollno+" "+st.name+" "+st.age);  
    }  
  }  
  } 
  
/* OUTPUT
  105 Jai 21
  101 Vijay 23
  106 Ajay 27*/
```

# Comparator interface

- Java Comparator interface is used to order the objects of a user-defined class.
- This interface is found in java.util package 
- Contains 2 methods **compare(Object obj1,Object obj2)** and **equals(Object element)**.
- It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member.
 
| Method | Description |
| --- | --- |
| public int compare(Object obj1, Object obj2) |	It compares the first object with the second object. |
| public boolean equals(Object obj) |	It is used to compare the current object with the specified object. |

Example
``` java
import java.util.*;
import java.lang.*;
import java.io.*;
  
class Student
{
    int rollno;
    String name, address;
  
    // Constructor
    public Student(int rollno, String name,
                               String address)
    {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
  
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                           " " + this.address;
    }
}
  
class Sortbyroll implements Comparator<Student>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}
  

class Main
{
    public static void main (String[] args)
    {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));
  
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
  
        Collections.sort(ar, new Sortbyroll());
  
        System.out.println("\nSorted by rollno");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}
/*Output :

Unsorted
111 bbbb london
131 aaaa nyc
121 cccc jaipur

Sorted by rollno
111 bbbb london
121 cccc jaipur
131 aaaa nyc*/

```
