### 1. Lambda Expression
   * Interface implementation is not required
   * Lambda expression is an anonymous funftion(no name)
   * Lambda expression does not have `name` , `modifier` and `return` type
  
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
 
1. It should contain exactly on abstract method(SAM - Single abstract method)
2. It can contain any number of default methods and static methods.
3. It acts as a type of lambda expression <br/>
``` Eg: Interface i = () -> System.out.println('Hello');```
4. It can be used to invoke lambda expression.
5. Examples Comparable, Runnable, Callable, ActionListener etc
6. An interface can be marked as functional interface using ``@FunctionalInterface``
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
  
  #### Predefined functional interfaces 
   
   Examples: Predicates , Function, Consumer, Supplier
   #### Predefined functional interfaces 
      
   Examples: Predicates, Function, Consumer, Supplier etc
      
       java.util.function  
   **1. Predicates**  
   *  Predicate is a functional interface which execute a condition and returns a **boolean** value
   * Package java.util.function 
   * Contains only one abstract method `test`  
   
                    Interface Predicate<T> {
                       boolean test(T t);
                     }
   Example
   ````
   (Integer i)  -> {
        if(i > 10) 
          return true;
        else 
          return false;
   };

   OR 

   i -> (i> 10) ? true : false;
  ````
   Usage
   ````
   Predicate<Integer> p = i -> i>10;
   
   System.out.println(p.test(100)); // true
   System.out.println(p.test(2)); // false
  ````

Predicate<Collection> p = c -> c.isEmpty();  
p.test(new ArrayList());

 **Predicate Joining**
 * p1.add(p2) - Joining the condition of two predicates
 * p1.or(p2) - Check of at least one predicate match
 
  * p1.negate() - Check the negative condition of p1.  
  * isEqual
  ````
   Predicate<String> p = Predicate.isEqual("Java");
   p.test("Java");
 ````
  **2. Function** 
  
     Interface Function<T,R> { // T - input parameter , R - return type
      R apply(T t);
      }
      
      Example
      Function<String,Integer> f = s-> s.length();
   * Can accept 2 arguments input and return type.
   * `apply` is the method
   * Can return any type.
   
**Function Chaining**
   * fi.**addThen**(f2) - To join two function. f2 will be applied to the result of f1.
   * f1.**compose**(f2) - f1 will be applied to the result of f2
   * **identity** - Returns a function that always its input argument.
   
  **3. Consumer** 
  * contains method **accept** 
  * Consume one parameter and not return anything(void)
  
         Consumer<String> c = s-> System.out.println(s);
         c.accept("Syam");
  
  **andThen** - For consumer chaining
        c1.addThen(c2).addThen(c3)
        
  **4. Supplier** 
   * contains only one method **get** and S**upplier<R>** return **R**.
   * Supplier not take any input
        
        --
  **BiPredicate** 
   * Predicate that can accept two input values
   
  **BiFunction** 
   * Function that can accept two input values
   
  **BiConsumer** 
   * Consumer that can accept two input values
   
   
  
  
  #### Primitive type functional interfaces 
  
  ##### Autoboxing 
  Automatic type conversion from primitive to wrapper object by compailer.
  Integer i =10 , is invalid til 1.4. After autoboxing is introduced in java.
  ##### Autounboxing
  Integer I = new Integer(10);
  
  int x = I , compailer converts Integer object to primitive int.
  ##### Generic - Type parameter
  Parameter should be Object type
  
  ArrayList<int> al = new ArrayList<int> , is not allowed. 
  
  ##### Need of primitive type functional interface 
 is need to perform autoboxing and auto unboxing if a primitive type is passed to a predicate and which affected performance.
 Step 1: Generic can only accept Object so primitive need to convert to Object with Predicate. Step 2: Object need to convert to primitive to use it.
 
 So primitive type functional interface should be used when input type and return type are primitive, to improve performance.
 
 ##### 1. IntPredicate 
    public boolean test(int i);
  
  Example IntPredicate p = i ->  i%2;
  
  ##### 2. LongPredicate - always take long value as argument
  ##### 3. DoublePredicate 
  
  #### Primitive function
  ##### 1.IntFunction<R> 
  - Takes only int  as input argument and return type is Integer.
  
        IntFunction <Integer> f = i -> i*i;
     Input is in and return type is Integer.
   
     Here only input type is primitive
  
  ##### 2.ToIntFunction 
   - Input type can be anything but always return int.
  applyAsInt is the method. 
  
         ToIntFunction<String> f = s -> s.length();
         syso(f.applyAsInt("Syam");
  ##### 3. IntToDoubleFunction 
  - input is int and return type is double. 
   - Method is applayAsDouble
  
         InToDoubleFunction f = i -> Math.sqrt(i);
          f.applayAsDouble(3);
  ##### 4. LongFunction<R>
   apply  
   Input type is always int
   R is the return type
  ##### 5. DoubleFunction<R>
   apply  
   Input type is always double
  ##### 6.InToLongFunction
   applyAsLong
  ##### 7. IntToDoubleFunction
  applyAsDouble
  ##### 8.LongToIntFunction
  applyAsInt
  ##### 9.DoubleToIntFunction
   applyAsInt
  ##### 10.DoubleToLongFunction
  applyAsLong
  ##### 11.ToIntBiFunction<T,U>
   applyAsInt(T t,U u) , where T and U are input arguments.
  ##### 12.ToLongBiFunction<T,U>
  ##### 13.ToDoubleBiFunction<T,U>
  
  #### Primitive Versions for Consumer
  1. IntConsumer , if input in int
  2. LongConsumer ,if input in long
  3. DoubleConsumer , if input in double
  4 .ObjIntConsumer - which takes two arguments Object and int
  
    ObjIntConsumer<T> {
      public void accept(T t, int i);
    }
    
   5. ObjLongConsumer
   6. ObjDoubleConsumer
  #### Primitive Versions for Supplier
  1. IntSupplier - getAsInt
  2. LongSupplier - getAsLong
  3. DoubleSupplier - getAsDouble
  4. BooleanSupplier - getAsBoolean
  
  ### UnaryOperator and its Primitive Versions
  
  **Function with same input and return type**.
                
                Interface UnaryOperator<T> {
                  public T appl(T t);
                }
   
  Example,
           `
            UnaryOperator<Integer> uo = i -> i*i; 
            uo.apply(10);
            `
           
  1.**IntUnaryOperator**  - applyAsInt
  
  2.**LongUnaryOperator** - applyAsLong
  
  3.**DoubleUnaryOperator** - applyAsDouble
  
  ### BinaryOperator
  
  **If two inputs and return type of a BiFunction are same , BinaryOperator is used.**
  
 ` 
 Interface BinaryOperator<T> {
    public T apply(T t1, T t2);
   }`
 
 ##### Primitives of BinaryOperator
 
 1. IntBinaryOperator - applyAsInt
 2. LongBinaryOperator - applyAsLong
 3. DoubleBinaryOperator - applyAsDouble
 
 ### Double Colon :: Operator
 ##### 1. Method Reference by :: operator
 
 Below example m1() refers m2() . Also m2 is used as implementation for m1.
 
  - Both methods arguments and types should be matched. 
  - Different way of implementing interface other than lambda expression.
  - method reference is an alternative for lambda expression.
 
  ```
    Interface Inf
    {
       public void m1();
    }
    class Test {

     public static void m2()
     {
        System.out.println("Method Reference");
     }

      public static void main(String args[]){
         Inf in = Test::m2;
         in.m1();

      }
   }
 ```
 
##### 2. Constructor Reference by :: operator

 
  ### Streams

java.io.streams - Deals with data for file operations

java.util.Streams - Used to process objects from the collection.

##### Streams::Filter and Map

l is an `ArrayList<Integer> `, then to make a new list with even numbers from l

`ArrayList<Integer> l1 = l.stream().filter(i-> i%2==0).collect(Collector.toList());`

Map
`List<Integer> l2 = l.stream().map(i -> i*2).collect(Collectors.toList());`

##### Streams - Methods

**collect** - To collect items from a stream

**count** - To count items in a stream

**sorted** 

sorted()- Default sort

sorted(Comparator) - Custom sort

**Min and Max** -

Can only apply to sorted stream

**forEach** 

Example

 l.stram().forEach(s -> System.out.println(s));
 
 l.stream().forEach(System.out::println);
 
 **toArray()** - To copy elements present in the stream to an Array
 
 Example , Integer[] array = l.stream().toArray(Integer[]:: new);
 
 **StreamOf**  - To deals with group of values or arrays.
 
 Example 
 
 for group of values,
  
        Stream<Integer> s = Stream.of(9,99,999,9999,9999;
             s.forEach(System.out::println);
 For arrays
 
         Double[] d = { 100,101,102,103};
         Stream<Double> s = Stream.of(d);
         s.forEach(Syatem.out::println);
         
   ### Date and Time API
   
  