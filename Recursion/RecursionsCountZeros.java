 
public class RecursionsCountZeros{
static int count =0;
static int zeroCount(int number ){
   if(number==0){
    return count;
   }
   if(number%10==0){
    count = count+1;
   }
    zeroCount(number/10);
    return count;
    }
    public static void main(String[] args) {
        int result = zeroCount(2000205 );
        System.out.println(result);
    }
}