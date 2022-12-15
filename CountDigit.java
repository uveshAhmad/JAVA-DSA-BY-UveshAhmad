package Recursion;

public class CountDigit {

    static void countDigit(int num , int count) {
        if(num==0){
            System.out.println(count);
            return ;
        }
        num = num / 10;
        countDigit(num , count+1);
        }
    public static void main(String[] args) {
        countDigit(786786 , 0);
    }
}