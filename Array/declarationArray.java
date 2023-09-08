package Array;

import java.util.Arrays;

public class declarationArray {
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4,5};
        for(int i : arr){  // Inhanced For Loop
            System.out.println(arr[i]);
        }
        // arrays to Strings Method For 1D
        System.out.println(Arrays.toString(arr));
    }
}
