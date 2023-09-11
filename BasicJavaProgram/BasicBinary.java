import java.util.Scanner;

public class BasicBinary {
         public static void main (String[] args ) {
         System.out.println("Enter tha decimal value ");
         Scanner cont = new Scanner(System.in);
         int   i  ,  result1 , result2 , temp ,t;
         int n = cont.nextInt();
         for (i=0;  i<=n; i++){
          result1 =  n%2;
          result2 = n/2;
          temp = result2;
          t = temp%2;
         
         System.out.println(t);
         }
         cont.close();
        }
}
