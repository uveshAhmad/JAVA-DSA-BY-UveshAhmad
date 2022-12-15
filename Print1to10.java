package Recursion;

public class Print1to10 {
    static void func(int num){
        if(num>=10){
      return;
        }
        System.out.println(num);
        num = num+1;
        func(num);
    }
    public static void main(String[] args) {
        func(1);
    }
}
