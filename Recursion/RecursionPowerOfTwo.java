import java.util.Scanner;
public class RecursionPowerOfTwo {
 static int uvesh(int x ){
    if(x==0)
    return 1;
     int res = 2 * uvesh(x-1);
     return res;
 }
    // 2 ki power n vala program
    public static void main(String[] args) {
        System.out.println("Enter the value of power of 2 ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result =   uvesh(n);
        System.out.println(result);
        sc.close();
}
}