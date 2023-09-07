// Dice Target Sum combination
/*
 IP : {1,2,3,4,5,6}  Target = 4
 OP : {1111 , 112 , 121 , 22 , 31 , 13   , 211 , }
LC - 39

 */
public class RecursionTargetSumCombination {
    static void DiceSum(String p , int target){
    if(target==0){
        System.out.println(p);
        return;
        
    }
    for(int i =1 ; (i<=6 && i<=target); i++){
        DiceSum(p+i , target-i);
    }
    }
    public static void main(String[] args) {
        DiceSum("" , 4);
    }
}
