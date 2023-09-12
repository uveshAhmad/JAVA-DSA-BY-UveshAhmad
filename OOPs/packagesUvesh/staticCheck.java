package packagesUvesh;
public class staticCheck {
    public static void main(String[] args) {
        checkStatic obj =new checkStatic(25);
        checkStatic obj2 = new checkStatic(30);
      System.out.println(obj.var);
      System.out.println(obj2.var);

    }
}

class checkStatic{
   static int var ;
     checkStatic(int value){
        checkStatic.var = value;
    }
}
 