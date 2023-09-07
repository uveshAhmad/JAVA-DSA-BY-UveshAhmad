import java.util.Scanner;
public class RecuirsionPower {
    // I/P  = 16
    // O/P = true
    // 2 4 6 8  16 32 64 128 256 
    static Boolean funct(int num){
        if(num==0){
            return true;
        }
     if (num%2==0){
        return false;
     }
        funct(num/2);
        return false;
    }
    public static void main(String[] args) {
 System.out.println("Enter your Value here");
 Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
 boolean n = funct(num);
 System.out.println(n);
 sc.close();
}
}