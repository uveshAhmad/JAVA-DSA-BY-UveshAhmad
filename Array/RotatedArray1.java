package Array;

import java.util.Arrays;

// IP :   = {8,5,7,10,20,11,4};
// OP : = { 4 ,8 ,5,7,10,20,11,4}
public class RotatedArray1 {
    static  void  Rotated1(int[] arr ){
   int start = 0;
   int end = arr.length-1;
    int temp;
    for(int i=0; i<arr.length-1; i++ ){
        temp=arr[start];
        arr[start]= arr[end];
        arr[end] = temp;
        start++;
    }
         System.out.print(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {8,5,7,10,20,11,4};
        Rotated1(arr);
    }
}
