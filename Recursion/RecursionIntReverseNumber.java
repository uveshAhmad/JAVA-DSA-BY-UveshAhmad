//     124 ======> 421
public class RecursionIntReverseNumber {
  static  int rev =0;
    static int reverseIT(int x ){
     if(x==0){
        return 0;
     }
     else{
   rev=rev*10+x%10;
        reverseIT(x/10);
        return rev;
     }
    }
    public static void main(String[] args) {
        int result = reverseIT(124);
        System.out.println(result);
    }
}
