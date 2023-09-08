package Array;
public class binarySearchFrequency {
     
    public static void main(String[] args) {
        int [] arr = { 2,3,3,4,5,5,6,6,6,7};
        int start = arr[0];
        int end = arr.length-1;
        int target = 6;
        int count=0;
        int x=0;
        while(start<end){
            int mid = (start+end)/2;
            if(target>mid){
                start= mid+1;

            }
            else if(start>end){
                if(target<mid){
                    end=mid-1;
                }
            }
            else  if(mid==target&& x!=mid){
                count++;
                x=mid;
            }
            if(mid==-1){
                return;
            }

        }
        System.out.println(count);
    }
    

}



