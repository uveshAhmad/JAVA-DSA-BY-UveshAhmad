import java.util.HashMap;
public class RecursionStringCharCount {
    static HashMap<Character , Integer> counting( String str ){
        HashMap<Character , Integer> map = new HashMap<>();
        if(str.length()==0){
            return map;
        }
            char ch=str.charAt(0);
            if(ch ==' '){
                HashMap<Character  , Integer> empt = new HashMap<>();
                empt.put(ch ,0);
                return empt;
            }
            if(map.get(ch)==null){
                map.put( ch , 1);
            }
            else{
                  int prevchar    =  map.get(ch);      
                  map.put(ch , prevchar+1) ;
            }
             counting(str.substring(1));
        }
    public static void main(String[] args) {
        HashMap<Character , Integer> result= new HashMap<>();
         result = counting("Uvesh Ahmad");
    System.out.println(result);
}
}