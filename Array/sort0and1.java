package Array;
public class sort0and1 {
    static void sort01(int[] arr){
        int count=0;
       for(int i=0; i<arr.length ; i++){
     if(arr[i]==0){
       System.out.print(arr[i]);
     }
     if(arr[i]!=0){
       count++;
     }
       }
       for(int i=0; i<=count; i++){
           System.out.print(1);
       }
   }
   public static void main(String[] args) {
       int arr[] = {0,0,1,1,1,1,0,0,1,0,0,1};
       sort01(arr);
   }
}