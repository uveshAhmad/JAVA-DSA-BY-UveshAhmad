import java.util.HashMap;
public class HasingPracticeHashMap{
    public static void main(String[] args) {
        String str = "uvesh ahmad khan";
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i=0 ; i<str.length(); i++){
            char single =  str.charAt(i);

            if( single==' '){
                continue;
            }
            if(map.get(single)== null ){
                map.put(single  , 1);
            }
            else{
             int prevcount = map.get(single) ;
             map.put(single, prevcount+1);
            }
        }
     System.out.println(map);
    }

}
