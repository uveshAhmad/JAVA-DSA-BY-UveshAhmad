package Array;
// { 2 ,3, 5 , 9 , 14 , 16 , 18 } Target : 10
// Output : 9;


public class FloorOfNumber {
 
    static int Floor(int arr[] , int target){
// initialize;
int start = arr[0];
int end = arr.length-1;
// loop
while(start<=end){
    int mid = (start+end)/2;
    if(target> arr[arr.length-1]){
        return -1;
    }
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

return end;   // Yahi h bas condition Ceiling ki varna sab same h
}
    public static void main(String[] args) {
        int arr [] = { 2 ,3, 5 , 9 , 14 , 16 , 18 };
        System.out.println(arr[Floor(arr, 10)]);  
    }
}
