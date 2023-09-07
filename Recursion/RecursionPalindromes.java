// Check if Number is Palindrome Number Using Recursion
// i/p : 12345
// o/p : false
public class RecursionPalindromes {
    static int  checkIT(int num , int check ){
        if(num==0){
            return check;
        }
check = check*10+num%10;
 return checkIT(num/10 , check);
    }
    public static void main(String[] args) {
        int num=123;
        int result = checkIT(num , 0);
        
         if(result==num){
            System.out.println("True");
         }
          else{
            System.out.println("false");
          }
         }
    }
