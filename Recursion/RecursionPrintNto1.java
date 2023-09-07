 
public class  RecursionPrintNto1{
    static void PrintIT(int n ){
    if(n==0){
        return;
    }
    else{
        System.out.println(n);
        PrintIT(n-1);
    }
    }

public static void main(String[] args) {
    PrintIT(5);
}
}