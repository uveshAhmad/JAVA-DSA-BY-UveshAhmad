 

public class checkClass {
    public static void main(String[] args) {
         Check1   bata = new  Check1();    // maine alag Wrapper class me bhi Check1 class call karke dekhi waha bhi yahi kaam kar rahi hai yo ;
                                                              // But packageUvesh ke andar kaam nahi kar rahi hai yue class ; 
         System.out.println(bata.st);
         }
    }
 
class Check1{
    public static void main(String[] args) {
        System.out.println("Me yaha bhi hu ");
    }
    String st ;
    public Check1(  ){
        String st = "Done";
        System.out.println(st);
         
}
}