 

public class RecursionPrint1toNandNto1 {
    static void PrintIT(int n){
if(n==0){
    return;
}
System.out.println(n);
PrintIT(n-1);
System.out.println(n);
    }
    public static void main(String[] args) {
        PrintIT(5);
    }
}
