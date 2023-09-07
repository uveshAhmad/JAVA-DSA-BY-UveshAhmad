//  Adjacent Stars
// i/p : str = "abbabaab"
// o/p : "ab*baba*ab"
public class RecursionStringAdjStar {
static String adjacent(String str ){
   int len =  str.length();
if(str.length()==1){
    return ""+str.charAt(len-1);
} 
      if(str.charAt(0)==str.charAt(1)){
 
        return str.charAt(0)+ "*"+ adjacent(str.substring(1));
      }
else{

      return str.charAt(0)+adjacent(str.substring(1));
}
}
    public static void main(String[] args) {
        String result = adjacent("abbabaab");
        System.out.println(result);
    }
}
