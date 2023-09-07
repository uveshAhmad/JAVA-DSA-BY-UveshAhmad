public class RecursionStringSubSeqCount {
    static  int  subseqCount(String p , String up , int count){
        if(up.length()==0){
            return count;
        }
        char ch = up.charAt(0);
          int left =subseqCount(p+ch , up.substring(1) , count+1);
         int right = subseqCount(p , up.substring(1) , count+1);
         return left+right;
    }
    public static void main(String[] args) {
 
    int result = subseqCount(" ", "ravi" , 0);
    System.out.println(result);
    
}
}