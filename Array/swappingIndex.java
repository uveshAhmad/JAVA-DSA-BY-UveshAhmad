package Array;
import java.util.Arrays;
public class swappingIndex {
static void swap(int [] arr , int index1 , int index2){
    int temp;
    temp= arr[index1];
    arr[index1]=arr[index2];
    arr[index2]=temp;
    System.out.println(Arrays.toString(arr));
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,};
      swap(arr, 1, 3);
        }
    }
