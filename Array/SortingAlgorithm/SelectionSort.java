import java.util.Arrays;
public class SelectionSort {

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int mAx=getMax(arr);
            swap(arr, arr.length-i-1, mAx-1);
        }
    }

static int getMax(int[] arr){
    int comp =arr[0];
    for(int i=0; i<arr.length-1; i++){
        if(comp<arr[i]){
            comp=arr[i];
        }
 
}
return comp;
}

static void swap(int[] arr , int first , int second ){
    int temp = arr[first];
    arr[first]= arr[second];
    arr[second]=temp;
}
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
