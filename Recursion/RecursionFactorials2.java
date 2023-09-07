public class RecursionFactorials2 {
    static void fact(int num , int result){
        if(num==1){
            System.out.println(result);
            return;
        }
    fact(num-1 , num*result);
    }
    public static void main(String[] args) {
         fact(5,1);
    }
    
}
