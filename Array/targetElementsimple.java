package Array;
// Vimp. Concept new int ;
// Find target Element  and Give their indexces
import java.util.Arrays;

public class targetElementsimple {

    static  void Target3 (int[][] arr , int target ){
        for(int row =0; row<arr.length; row++){  
            for(int col=0 ; col<arr[row].length ; col++){
                if(arr[row][col]==target){
                    System.out.println(  "Indexes " + row + "   "  +  col);
                     System.out.println(arr[row][col]);
                }
            }
        }

    }

    static Boolean Targert1(int[][] arr , int target){
        for(int row =0; row<arr.length; row++){  
            for(int col=0 ; col<arr[row].length ; col++){
                if(arr[row][col]==target){
                    return   true;
                }
            }
        }
        return false;

    }
    static int[] target(int arr[][] , int target){
        for(int row =0; row<arr.length; row++){  
            for(int col=0 ; col<arr[row].length ; col++){
                if(arr[row][col]==target){
                    return  new  int [] {row , col} ;
                    
                }
            }
        }
       return new int[] {-1 , -1};
    }
public static void main(String[] args) {
    int [] [] arr = {
        {1,2,3,},
        {2,3,4,5,},
        {1},
        {9,8}
    };
    int[] result = target(arr, 8);
    System.out.println(Arrays.toString(result));
     System.out.println(Targert1(arr, 16)) ;
     Target3(arr, 4);
} 
}