package Array;
//   HINT : firstly count the Zero or one numbers and print them

public class zeroOneSorted {
    public static void main(String[] args) {
       
        int arr[] = {0,0,1,1,1,1,0,0,1,0,0,1};
        int count = 0;
        for(int e : arr) {
            if(e == 0) {
                count++;
            }
        }
        for(int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for(int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
    }
}

