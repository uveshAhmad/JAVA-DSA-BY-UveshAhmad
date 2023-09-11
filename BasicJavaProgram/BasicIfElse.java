import java.util.Scanner;
// Positive Number Or negative number Checks
public class BasicIfElse {
    public static void main(String[] args) {
        System.out.println("enter Your value here ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
     if(a<0){
        System.out.println("The number is negative");
     }
     else{
        System.out.println("The number" + a +  "is positive");
     }
        sc.close();
    }
    
}
