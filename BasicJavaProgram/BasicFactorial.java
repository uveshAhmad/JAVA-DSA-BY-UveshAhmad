import java.util.Scanner;

public class BasicFactorial {
    // Factorial programe
    public static void main(String[] args) {
        System.out.println("Enter the value of number ");
        Scanner count = new Scanner(System.in);
        int n = count.nextInt();
        int i, sum = 1;
        for (i = n; i >= 1; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
        count.close();

    }

}
