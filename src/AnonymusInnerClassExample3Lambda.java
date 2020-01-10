

  public class AnonymusInnerClassExample3Lambda {
      int x= 223; // instance variable of x

      public  void m2(){

          Sample s= () -> {
              int x= 332; // local variable of s
              System.out.println(">>>>>>>>>>>>>>>> "+this.x); // this refers outer class object
          };
          s.m1();
      }
      public static void main(String[] args) {
          AnonymusInnerClassExample3Lambda a3 = new AnonymusInnerClassExample3Lambda();
          a3.m2();
      }
  }
