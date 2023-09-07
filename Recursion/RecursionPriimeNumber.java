public class RecursionPriimeNumber {

    static  boolean Prime(int n , int i){
        if(n%i==0)
        return false;
            if(i==n-1)
        return true;
        return Prime(n , i+1);

        
    }
    public static void main(String[] args) {
     boolean result = Prime(91 , 2);
     System.out.println(result);
    }
}
