package Array;
// IP : { 2,3,4,9,5,11,13}
// Span : [(Max=13) -(Min=2) = 11]
public class spanOfArray {
    static int span(int [] arr){
        return (Max(arr)-Min(arr));
    }
        static int Max(int [] arr){
     int comp = arr[0];
     for(int i=0 ; i<arr.length ; i++){
        if(comp<arr[i]){
            comp=arr[i];
        }
     }
      return comp;
        }
        static int Min(int [] arr){
            int comp = arr[0];
            for(int i=0 ; i<arr.length ; i++){
               if(comp>arr[i]){
                   comp=arr[i];
               }
        }
        return comp;
    }
    public static void main(String[] args) {
        int arr [] =  { 2,3,4,9,5,11,13};
      System.out.println(span(arr));   
    }
}
