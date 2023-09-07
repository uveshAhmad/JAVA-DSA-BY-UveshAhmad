
//  --------*********1st Method********---------

// public class numberOfDigit {
//  static int countDigit(int number , int i){
//     if(number%10==0){
//         return i;
//     }
//    return  countDigit(number/10 , i+1);
// }
//     public static void main(String[] args) {
//         int result = countDigit(125 , 0);
//         System.out.println(result);
//  }
//      ------- *************2nd Method*******----------
  public class RecursionNumberOfDigit {
    static int sum =0;
 static int countDigit(int number ){
    if(number%10==0){
        return sum;
    }
    sum= sum+1;
   return  countDigit(number/10 );
    
}
    public static void main(String[] args) {
        int result = countDigit(125 );
        System.out.println(result);
    }
}