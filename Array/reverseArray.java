package Array;
public class reverseArray {
 public static void main(String[] args) {
    

        int arr[] = {8,5,7,10,20,11,4};
        int n = arr.length;
        int i = 0;
        int j = n -1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
           // j--;   condition not written in Rotated Array 
        }

        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + ",");
        }
    }
    }