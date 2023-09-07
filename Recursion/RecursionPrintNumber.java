//Print it 
// 5
// 3
// 1
// 2
//4
public class RecursionPrintNumber {
    static void printIT( int n){
        if(n>5){
            return;
        }
        printIT(n+2);
  System.out.println(n);
    }
    public static void main(String[] args) {
        printIT(1);
    }
}
