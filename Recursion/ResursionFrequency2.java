 import java.util.HashMap;

 // I/P   :   "ram sharma"
 // O/P :     {a=3, r=2, s=1, h=1, m=2}
public class ResursionFrequency2{
    public static void main(String[] args) {
        String str = "ram sharma";
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            // get one character at a time
            char singleChar = str.charAt(i);
            // check if that character is space than continue
            if(singleChar == ' ') {
                continue;
            }
            // check if that character is available in map
            if(map.get(singleChar) == null) {
                // if not available than put that character as a key
                // and 1 as a value : {'r' = 1}
                map.put(singleChar, 1);
            }
            else {
                // get previous count of that character
                int prevCount = map.get(singleChar);
                map.put(singleChar, prevCount + 1);
            }
        }
        System.out.println(map);

    }
}