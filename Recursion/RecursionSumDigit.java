//Sum of digits 
public class RecursionSumDigit {
    static int sum =0;
static int sumDigit(int n ){
    if(n==0){
   return sum;
    }
      sum = sum + n%10;
     sumDigit(n/10);
     return sum;
}
    public static void main(String[] args) {
        int result =  sumDigit(123);
        System.out.println(result);

        
    }
}
