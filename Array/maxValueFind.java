package Array;
public class maxValueFind {
    static void maximum(int[][] arr ){
         int ans = arr[0][0];
         for(int row =0; row<arr.length; row++) {
            for(int col=0 ; col<arr[row].length ; col++){
          if(arr[row][col]>ans){
            ans = arr[row][col];
         
          }
        }
    }
    System.out.println(ans);
    
}


    public static void main(String[] args) {
          int [] [] arr = {
            {1,2,3,},
            {2,3,4,5,},
            {1},
            {9,8}
        };
        maximum(arr);
        }
    }