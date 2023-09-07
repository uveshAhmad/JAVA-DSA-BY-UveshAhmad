import java.util.Scanner;

public class ResursionDay1_prb3 {
    // 1 to n print number simple.
    //   5 4 3 2 1 
    //  1 2 3 4 5 
    static void funct( int x){
        if(x==0)
        return ;
        System.out.println(x);
        funct(x-1);
      //  System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println("Enter Your  range value ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        funct(a);
        sc.close();

        
    }
}
