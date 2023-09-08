package Array;

public class TargetWithBinary2 {
    static int BSearch(int arr[]  , int target){
        int start = arr[0];
        int end = arr.length-1;
        // loop
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){     // cond. for Left
                start = mid +1;
            }
            else if (target >arr[mid]){   // cond. for Right
                end= mid-1;
            }
            else{                  // cond.  for Target
         return mid;
            }
      
        }
       return -1;  
    }
    public static void main(String[] args) {
        int arr[] = { 15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
         System.out.println(BSearch(arr, 9));  
    }
}
