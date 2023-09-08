package Array;

 

// IP : {5  ,  7  , 7 , 7  , 7 , 8 , 8  , 10}      Target 7;
// OP : (1 , 4);     Indexes of  7
public class rangrOFTargetElement {
    static int Right(int [] arr , int target){
        int start = arr[0];
        int end = arr.length-1;
    while(start<end){

     if( arr[start]==target){
        return  start;
     }
     start++;
     }
    }
    static int Left(int[] arr , int target){
        int start = arr[0];
        int end = arr.length-1;
        while(start<end){
            if( arr[start]==target){
                return  start;
            }
           end--;
       }

       if()
       return  new int  {Left , Right};
   }
     
    public static void main(String[] args) {
        int[] arr = {5  ,  7  , 7 , 7  , 7 , 8 , 8  , 10} ;
         
      int arrAns[]  = (rangeOfTarget(arr, 7));
      System.out.println(arrAns[0]);
      System.out.println(arrAns[1]);
        }
