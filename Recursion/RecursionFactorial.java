import java.util.Scanner;
public class RecursionFactorial {
    static int fact(int x) {
        if (x == 0)
            return 1;
        int problem = x * fact(x - 1);
        return problem;
    }
    public static void main(String[] args) {
        System.out.println("Enter Youe Value ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = fact(n);
        System.out.println(result);
        sc.close();
    }
}