 
public class RecursionProductOfDigit {
    static int productDigit(int number){
  if(number==0){
    return 1;
  }
   return number%10 * productDigit(number/10);
    }
    public static void main(String[] args) {
       int  result  =productDigit(245);
       System.out.println(result);

        
    }
    
}
