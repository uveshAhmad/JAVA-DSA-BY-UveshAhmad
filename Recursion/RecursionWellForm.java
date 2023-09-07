import java.util.ArrayList;
public class RecursionWellForm {
    static ArrayList<String> wellform(int number  ){
        ArrayList<String> result = new ArrayList<>();
        helper(result , " " , 0 ,0 , number );
        
        return result;
        }
    static void helper(ArrayList<String> result , String currentBracket , int open , int close , int max){
      // Base case
      if(currentBracket.length()== max*2){
        result.add(currentBracket);
        return;
      }

      // Condition 1
 if( open<max){
          helper(result , currentBracket+"(" ,open+1 ,  close , max);
      // Condition 2    
 }
    if(  close<open){
          helper(result ,  currentBracket +")" , open , close+1 , max);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> ans = wellform(3);
        System.out.println(ans);
    }   
}
