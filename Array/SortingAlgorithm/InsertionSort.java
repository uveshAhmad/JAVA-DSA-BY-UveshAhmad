 
import java.util.Arrays;

public class InsertionSort {
    static void InsertionSort(int[] arr){
    int last=arr.length;
   for(int i=0; i<arr.length-1; i++){
    int maxVal= getMaxE(arr);
    arr[last-i-1]=maxVal;
   }

   static  int getMaxE(int[] arr){
        int comp;
        comp =arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(comp<arr[i]){
                comp=arr[i];
            }
        }
        return comp; 
    }
    
}
        public static void main(String[] args) {
            int[] arr = {3,1,5,4,2};
            InsertionSort(arr);
            System.out.println(Arrays.toString(arr));
    }
}
    