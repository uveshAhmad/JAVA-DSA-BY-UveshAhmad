// Count Zero in a Digit Using Recursion
// i/p : 10340101
// o/p : 3
public class RecursionCountZeros {
    static int zeroCount(int num , int count){
        if(num==0){
            return count;
        }
    if(num%10==0){
        count= count+1;
    }
        return zeroCount( num/10 , count);
    }
    public static void main(String[] args) {
       int result =  zeroCount(103401001 , 0);
       System.out.println(result);
    }
}
