package Array;
// array in Range 
public class targetElement {
    static Boolean check(int[] arr ,int target  , int start , int end  ){
  if(arr.length==0){
    return false;
  }
  for(int i=start; i<=end; i++){
    if(arr[i]==target){
        return true;
    }
  }
  return false;
    }
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3,4 ,5 ,6};
        System.out.println(  check(arr ,1  , 1 ,  5  ));
    }
}


