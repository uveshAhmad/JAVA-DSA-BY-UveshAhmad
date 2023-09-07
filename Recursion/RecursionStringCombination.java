import java.util.ArrayList;
public class RecursionStringCombination {
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
    public static void main(String[] args) {
         
    ArrayList<String> res=subseqList(" " , "ravi");
    System.out.println(res);
}
}