import java.util.Arrays;
public class BubbleSort{
      
        static void SortBubble(int [] arr ){
            
     for(int i=0; i<arr.length-1; i++) {  
       boolean  optimize=false;                   // case for optimize output;
       for(int j=1 ; j<arr.length-i; j++){

       if(arr[j]<arr[j-1]){
                swap(arr , j , j-1);
                optimize=true;
       }
               
             }
             if(optimize=false){
                break;
             }
        }
    }
             static void swap(int[] arr , int first , int second ){
                int temp = arr[first];
                arr[first]= arr[second];
                arr[second]=temp;
            }
        public static void main(String[] args) {
            int[] arr = {3,1,5,4,2};
            SortBubble(arr);
            System.out.println(Arrays.toString(arr));
    }
}
