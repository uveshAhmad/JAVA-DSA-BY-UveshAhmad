package Array;
// IP = {  { 1,5}  , { 7,3}  , { 3,5} }
//  Process = { (1+5=6)  ,  (7+3=10)  , (3+5=8)}
//OP =  10 ;    Maximum Account Balance 
public class accountBalance {
    static int acBal(int arr[][]) {
        int comp = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + (arr[row][col] + arr[row][col + 1]);
                if (sum > comp) {
                    comp = sum;
                }
            }
        }
        return comp;
    }
    public static void main(String[] args) {
        int arr[][] = {
                             { 1, 5 }, 
                             { 7, 3 },
                             { 3, 5 }
                             
                             };
        System.out.println(acBal(arr));
    }
}