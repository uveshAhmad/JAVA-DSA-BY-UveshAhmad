import java.util.HashMap;
public class RecursionFrequencyCount {
      //   Frequency count 
     // input  ;  text = " ram sharma" 
     // output ; { r =2    , a=3 ;  s = 1 ;    etc}
     
    public static void main(String[] args) {
        String str = "ram sharma";
        HashMap<Character , Integer> map = new HashMap<>();
        for ( int i =0 ; i<str.length() ; i++ ){
         // get character at atime
            char singleChar = str.charAt(i);
        // check if that a space than skip this 
            if(singleChar== ' ' ){
                continue;
                // check character avaliable in the map
            }
            if(map.get(singleChar) == null){
              // if no elemnent in the map than put 1 
                map.put(singleChar , 1);
            }
            else{
                // get previous count of that character
                int prevCount = map.get(singleChar);
                map.put(singleChar , prevCount+1);
            }
            }
            System.out.println(map);
    }
}