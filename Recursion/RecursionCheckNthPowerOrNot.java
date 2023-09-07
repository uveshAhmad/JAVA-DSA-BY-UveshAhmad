// Check if a number is power of 2
// i/p : 16
// o/p : true
// 2,4,8,16,32,64,128,256,512,1024....
public class RecursionCheckNthPowerOrNot {
    static Boolean checkIT(int num , int check){
        if(num==check){
            return true;
        }
        if(num%check!=0){
            return false;
        }
        if(num%check==0){
            return checkIT(num/check , check); 
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkIT(256 , 2));
    }
}
