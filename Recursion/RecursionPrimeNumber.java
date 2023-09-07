// Prime Number Using Recursion
public class RecursionPrimeNumber {
    static Boolean check(int num , int div){
if(div==num){
    return true;
}
if(num%div==0){
    return false;
}
check(num , div+1);
 return true;
    }
    public static void main(String[] args) {
        System.out.println(check(29 , 2));
    }
}
