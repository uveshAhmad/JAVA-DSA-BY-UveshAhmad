 import java.util.ArrayList;
 /*
  I/P    :  "ravi"
 O/P   :   [, r, a, ra, v, rv, av, rav, i, ri, ai, rai, vi, rvi, avi, ravi]

  */
public class RecursionPermutation {
    static ArrayList<String> subseq(String str) {
        if(str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        char currentChar = str.charAt(0);
        String remainingString = str.substring(1);
        ArrayList<String> temp = subseq(remainingString);
        ArrayList<String> result = new ArrayList<>();
        for(String s : temp) {
            result.add(s);
            result.add(currentChar + s);
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> res = subseq("ravi");
        System.out.println(res);
    }
}