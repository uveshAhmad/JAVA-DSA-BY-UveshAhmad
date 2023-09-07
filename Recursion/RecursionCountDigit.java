public class RecursionCountDigit {
    static void count( int num  , int cont){
        
        if(num==0){
            System.out.println(cont);
        
        
            return ;}
            count(num/10  , cont+1);
        }
    
    
    public static void main(String[] args) {
        count(78543 , 0);
        
    }
}