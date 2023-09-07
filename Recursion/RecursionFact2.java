 

public class RecursionFact2 {
 static int  Facto(int n ){
   if(n==1){
    return 1;
   }
     return n*Facto(n-1);
      
    }
    public static void main(String[] args) {
      int result =  Facto(5);
      System.out.println(result);
    }
    
}
