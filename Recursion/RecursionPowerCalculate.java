// Power Calculate Using Recursion
// i/p : 3, 6
// o/p : whatever 3 raise to the power 6 is
public class RecursionPowerCalculate {
    static int powerCalc(int num , int pow){
if(pow==0){
    return 1;
}
 return num*powerCalc(num , pow-1);

    }
    public static void main(String[] args) {
        int result = powerCalc(10 , 3);
        System.out.println(result);
    }
}
