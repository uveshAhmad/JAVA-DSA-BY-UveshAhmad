package Array;
// Array Sorted in Accending Order
public class TargetWithBinary {
    static int bsearch(int[] arr , int target ){ 
  // initialize;
        int start = arr[0];
        int end = arr.length-1;
        // loop
        while(start<=end){
            int mid = (start+end)/2;
            if(target<arr[mid]){     // cond. for Left
                end = mid -1;
            }
            else if (target >arr[mid]){   // cond. for Right
                start= mid+1;
            }
            else{                  // cond.  for Target
         return mid;
            }
      
        }
       return -1;  
    }

    public static void main(String[] args) {
        int arr[]= { 2,4,6,9,11,12,14,20,36,48};
        int target = 20;
        System.out.println(bsearch(arr , target)); 

    }
}
