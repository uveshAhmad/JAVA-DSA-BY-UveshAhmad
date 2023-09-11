import java.io.IOException;
import java.util.Scanner;
public class BasicInputLena {
         public static void main (String[] args ) throws IOException {
         System.in.read();
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter your name ");
         String name = sc.nextLine();
         System.out.println("Your Name is" + name );
         System.out.println("Enter Your Age " );
         int age = sc.nextInt();
         System.out.println("Your age is " + age );

         sc.close();
        }
}

