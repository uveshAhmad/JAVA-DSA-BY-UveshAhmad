//   [11111, 2111, 1211, 311, 1121, 221, 131, 41, 1112, 212, 122, 32, 113, 23, 14, 5]  Sum==5;
import java.util.ArrayList;
public class DiceCount {
    static ArrayList<String> countWays(int source, int target) {
        if(source == target) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(source > target) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        // int count =0;
        for(int dice = 1; dice <= 6; dice++) {
            int current = source + dice;
            ArrayList<String> list = countWays(current, target);
            for(String str : list) {
                result.add(str + dice);
                // count=count+1;
            }
        }
        return result;
        // return count;
    }
    public static void main(String[] args) {
        ArrayList<String> res = countWays(0, 5);
        System.out.println(res);
    }
}
