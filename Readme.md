### 1. Lambda Expression
   * Interface implementation is not required
   * Lambda expression is an anonymous funftion(no name)
   * Lambda expression not have `name` , `modifier` and `return` type
  
  Concrete method to lambda expression
  
  Example 1: 
  
        public void m1(){
         System.out.println("Hello");
        }
   Remove name , modifier and return type  
        ~~public~~ ~~void~~ ~~m1~~(){  
            System.out.println("Hello");  
        }
     
        () -> { System.out.println("Hello"); }
        OR 
        () -> System.out.println("Hello"); 
   Example 2: 
     
           public void add (int a, int b){
             System.out.println(a+b);
           }
   Remove name , modifier and return  
    ~~public~~ ~~void~~ ~~add~~ (int a, int b){  
        System.out.println(a+b);  
    }
        
           (int a, int b) -> { System.out.println(a+b); } 
   **Type Inference** : Type can be ignored for method arguments if the compiler can guss it automatically.   
        ``` 
                (a,b)  -> System.out.println(a+b); 
        ```  
   Example 3: 
         
       public int  getLength (String s){
                 return s.length();
        }
   Remove name , modifier and return  
        ~~public~~ ~~int~~  ~~getLength~~ (String s){  
                         return s.length();  
                }
            
              (String s) -> {return s.length(); }
              OR
              (String s) -> return s.length();
              OR
              (String s) -> s.length();
              OR
              s -> s.length();
   Note :  
   * Curly braces are optional if the body contains only one statement
   * Type is not mandatory for method arguments if the compiler can guss it automatically(Type inference)
   * Parenthesis are optional if only one argument is present.
    
### 2. Functional Interface
``@FunctionalInterface``
1. It should contain exactly on abstract method(SAM - Single abstract method)
2. It can contain any number of default methods and static methods.
3. It acts as a type of lambda expression <br/>
``` Eg: Interface i = () -> System.out.println('Hello');```
4. It can be used to invoke lambda expression.

### Lambda expressions with Collection
 #### Collection 
    1. List 
        When order of insertion preserved
        Duplicates are allowed.
        ArrayList, LinkedList , Vector -> Stack
    2. Set
        When order doen't matter
        Duplicates are not allowded
        HashSet,TreeSet(sorting)
     3. Map
        Represent group of object as key value pairs.
  Comparator interface & Compare method <br/>
   * To define custom sorting
           
          public int compare(Object obj1, Object obj2) 
        - Return -ve if obj1 comes before obj2
        - Return +ve if obj1 comes after obj2
        - Return 0 if obj1 and obj2 are equal
     
     Sorting
     ```
     Collections.sort(list) - Default sort(ascending/albhabetical order) will be applied
     Collections.sort(list,Comparator) - Customised Sorting
     
     ```
     TreeSet - Sorted set
     
     ```
     TreesSet<Integer> t = new TreeSet<Integer>(); // Default sorting
     TreesSet<Integer> t = new TreeSet<Integer>(Comparator c) // Customised sorting;
     ```
     
     TreeMap - Sorting will be based on the Key
     
     ```
     TreeMap<Interger,String> tm = new TreeMap<Integer,String>(); //Default Sorting
     TreeMap<Interger,String> tm = new TreeMap<Integer,String>(); //Customised Sorting
     ```
     Anonymous inner class - Inner class without name
     ```
     Example 
     Runnable r= new Runnable(){
        public void run(){
        -------
     }
     }
     ```
    Note : 
    1.Anonymous inner class  class can be replaced by a lambda expression if the inner class extends an interface which contain only one method(ie functional interface).
    2. Instance variable can't be decalre inside lambda expression
    3. Lambda expression is not to replace annonymous inner class.    
     
   #### Default methods inside interface
   Till java 1.7 all methods interface can have only `abstract` methods and `public static final` variables.        
   Java 1.8 allows concrete methods inside interface.  
    Concrete methods declared inside interface is known as `default methods`.  
    
    Example
   
    Interface intf {
      default void m1(){
        SYSO('Hello');
      }
    }
    
 Note: 
 * Default  methods are available in implementation class by default.
 * Default methods can be over ride in implementation class 
 * If a class implement 2 interface with same default method compile time issue will occur.
  To resolve this issue override method in the implementation class and specify the interface in it. As below
  ````
  class Sample implements Left,Righyt{
   Public void m1(){
    Left.super.m1();
   }
    p.sv.m(String args[] ){
      Sample s = new Sample();
      s.m1();
    }
 }
 
````
   #### Static methods inside interface
 * Java 1.8 onwards static methods can de define inside interface - To define general utility methods.
  * Interface's static method can call **only** with interface name. Static method won't be available in implementation class by default.
     `Inerf.m1();` .
  * Overriding is not applicable for interface static method.
  * main() method can be declare inside interface. _So interface compile and run._
  
  #### Predefined functional interfaces - Predicates
  