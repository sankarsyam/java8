### 1. Lambda Expression
         Interface implementation is not required
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
    Note : Anonymous inner class  class can be replaced by a lambda expression if the inner class extends an interface which contain only one method(ie functional interface).
     
     