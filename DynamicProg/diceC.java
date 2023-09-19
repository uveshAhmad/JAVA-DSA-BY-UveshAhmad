// Dice count without DP;

public class diceC{
    
    
    
//     static int countwaysDP(int current_value , int end_value){
//         for(int dice = 1; dice <= 6; dice++) {
//             int current = current_value + dice;
            
            
//             return current;
//         }
// }


     static int countWays(int current_val , int end_val){
        if(current_val==end_val){
            return 1;

        }
        if(current_val>end_val){
            return 0;

        }
        int count=0;
        for(int dice=1; dice<=6; dice++){
            count= count+countWays(current_val +dice, end_val);

        }
        return count;
     }

     static int tabulation(int start , int end){

        int cache[]= new int[end+1];
        cache[end]=1;
        for(int i= end-1; i>=0; i--){
           int count =0;
        for(int dice =1; dice<=6&& dice+1<cache.length; dice++){
            count+=cache[dice+1];


        }
           cache[i]=count;

        }
        return cache[start];

     }
    public static void main(String[] args) {
        int current_val=0;
        int current_value=0;
        int end_value =10;
        int end_val = 10;
        int start = 0;
        int end = 5;
      int res =  countWays( current_val ,  end_val);
      System.out.println(res);
    //  res= countwaysDP(current_value, end_value);
     System.out.println(res);
      res = tabulation(start, end);
      System.out.println(res);


    }
}