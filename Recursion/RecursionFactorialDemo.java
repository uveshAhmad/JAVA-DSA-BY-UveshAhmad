public class RecursionFactorialDemo {

    static void factorial( int num  , int result ){
     factorial( num-1 , num*result);
        }
    
    public static void main(String[] args) {
        factorial( 5 , 1);
        
    }
}