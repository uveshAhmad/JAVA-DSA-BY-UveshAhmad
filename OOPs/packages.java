public class packages {
    public static void main(String[] args) {
        A obj = new A("Random Name ");
         System.out.println(obj);  // kya print karega ye important hai ; == hash value shoe karega  exmp : -  A@4617c264
        }
    }
 
 class A{
    int n ;
    String name ;
    public A(String Name ){
       this.name=Name;
    }
 }