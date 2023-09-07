import java.util.ArrayList;

// Print all subsequences of a string
// i/p : String str = "ravi";
// o/p : "", "r", "a", "v", "i", "ra", "rv", "ri", "ai", "av", "vi", "rav", "rai", "rvi", "avi", "ravi"

public class RecursionPrintAllSubseq {
    static void  subseq(String p , String up){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
         subseq(p+ch , up.substring(1));
         subseq(p , up.substring(1));
    }
    static ArrayList<String> subseqList(String p , String up){
        if(up.length()==0){
             ArrayList<String> list = new ArrayList<>();
             list.add(p);
            return list;
        }
        char ch = up.charAt(0);
         ArrayList<String> left=subseqList(p+ch , up.substring(1));
        ArrayList<String> right =  subseqList(p , up.substring(1));
        left.addAll(right);
        return left;
    }
    static  int  subseqCount(String p , String up , int count){
        if(up.length()==0){
            return count;
        }
        char ch = up.charAt(0);
          subseqCount(p+ch , up.substring(1) , count+1);
         subseqCount(p , up.substring(1) , count+1);
         return count;
    }
public static void main(String[] args) {
    subseq(" " , "ravi" );
ArrayList<String> res=subseqList(" " , "abc");
System.out.println(res);
int result = subseqCount(" ", "ravi" , 0);
System.out.println(result);
}  
}
