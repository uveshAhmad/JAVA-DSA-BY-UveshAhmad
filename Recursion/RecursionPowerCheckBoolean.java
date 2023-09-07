public class RecursionPowerCheckBoolean {
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
        System.out.println(checkIT(256 , 4));
    }
}
