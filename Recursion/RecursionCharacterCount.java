import java.util.HashMap;
public class RecursionCharacterCount{
    public static void main(String[] args) {
         HashMap<Character, Integer> map  = new HashMap<>();
        String str = "Uvesh Ahmad";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch ==' '){
                continue;
            }
            if(map.get(ch)==null){
                map.put( ch , 1);
            }
            else{
                  int prevchar    =  map.get(ch);      
                  map.put(ch , prevchar+1)     ;    
            }
    }
    System.out.println(map);

}
}