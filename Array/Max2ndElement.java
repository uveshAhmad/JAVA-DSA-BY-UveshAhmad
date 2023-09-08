package Array;
public class Max2ndElement{
   // TC : O(n)
    static void approach_2(int arr[], int n) {
        int max = -1;
        int secondMax = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if(arr[i] != max) {
                if(arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        System.out.println("Second Max : " + secondMax);
    }

    public static void main(String[] args) {
        int arr[] = {2,1,5,7,1,12,8};
        int n = arr.length;
        approach_2(arr, n);
    }
  }
