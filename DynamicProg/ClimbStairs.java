public class ClimbStairs {
    // simple recursion

     static int countWays(int stairs){
        if(stairs==0){
            return 1;

        }
        if(stairs==1){
            return 1;
         
        }
            int res = countWays(stairs-1)+countWays(stairs-2);
            return res;

     }

    //  // Memoisation
    //  static int countWaysMemo(int stairs){
    //     if(stairs==0){
    //         return 1;

    //     }
    //     if(stairs==1){
    //         return 1;
         
    //     }
    //     int cahche[] = new int[stairs+1];
    //     if(stairs)
    //         int res = countWays(stairs-1)+countWays(stairs-2);
    //         return res;

     
     // Tabulation
     static int countWaystabulation(int stairs){
       
 int cache[] = new int[stairs+1];
     cache[0]=1;
     cache[1]=1;
      for(int i=2; i<=stairs;i++){
        cache[i]= cache[i-1]+cache[i-2];
      }
    return cache[stairs];
     }

    public static void main(String[] args) {
         int stairs=5;
        int res= countWays(stairs);
        System.out.println(res+" Through Simple recursion");
      res = countWaystabulation(stairs);
      System.out.println(res+" Through Tabulation");

    }

}