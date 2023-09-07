import java.util.Scanner;
// Fibonacci Series
// nth term  Fabonacci Series
//      0        1      1      2      3      5      8      13 
public class RecursionFibonachhiie {
    static int funct(int x){
  if(x==0)
  return 0;
  if(x==1)
  return 1;
  int result  = funct(x-1)+funct(x-2);
  return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter Your Nuber Here ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result= funct(n);
        System.out.println(result); 
        sc.close();
        
    }
}
