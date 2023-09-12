package AcessControl;

public class main {
    public static void main(String[] args) {
        
        A obj = new A(23 , "Uvesh Ahmad Khan");
        // 1 . Access the data members
        // 2. modify the data member
      // int result = obj.num();           ye private tha ham ise access nahi kar sakte lekin ek function banakar access kar sajte hai ok;

      int result = obj.num();
      System.out.println(result);              // ab ye print ho jayega ok;

    }
}
