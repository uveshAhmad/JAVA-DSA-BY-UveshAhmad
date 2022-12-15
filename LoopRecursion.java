package Recursion;

public class LoopRecursion {
    static void Fun(int num){
        if(num<10){
        System.out.println("Uvesh Ahmad Khan");
        Fun(num+1);
    }
}
    public static void main(String[] args) {
        Fun(1);
    }
}
