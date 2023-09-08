package Array;

 

public class PrintingArray {
    public static void main(String[] args) {
        int [] [] arr = {
            {1,2,3,},
            {2,3,4,5,},
            {1},
            {9,8}
        };
        for(int row =0; row<arr.length; row++){      // for Loop;
            for(int col=0 ; col<arr[row].length ; col++){
                System.out.println(arr[row][col]); 
            }
            System.out.println();
        }
    
    }
        }
 