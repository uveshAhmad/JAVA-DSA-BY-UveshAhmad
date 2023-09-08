package Array;
public class rotatedArrayByONE {
    public static void main(String[] args) {
        
        // approach No. 1
        int arr[] = {8,5,7,10,20,11,4};
        int n = arr.length;
        int i = 0;
        int j = n -1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        
        }

        for(int k = 0; k < n; k++) {
            System.out.print(arr[k] + ",");
        }
    }
    }
