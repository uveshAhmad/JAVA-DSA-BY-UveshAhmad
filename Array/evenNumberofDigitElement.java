package Array;
// IP = { 12  , 345  , 2 , 6 , 7896}
// Op = 2;
import java.lang.Math;
public class evenNumberofDigitElement{
    static int evenElementCount( int arr[]){
        int count=0;
        for(int i=0 ; i<arr.length; i++){
     int  result =(int)(Math.log10(arr[i])+1);   // Vimp syntax is (int) ok
   if(result%2==0){
  count++;
   }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] array =  {12  , 345  , 2 , 6 , 7896};
       int result =  evenElementCount(array);
       System.out.println(result);
    }

}