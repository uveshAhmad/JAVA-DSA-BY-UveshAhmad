
public class RecursionPrint1ToN{
    static void PrintIT(int n ){
   if(n==0){
    return;
   }
   else{
    PrintIT(n-1);
    System.out.println(n);
   }
    }


    public static void main(String[] args) {
        PrintIT(5);
    }
    
}
