import java.util.Scanner;

public class BasicOneTwoTen {
    public static void main(String[] args) {
        System.out.println("Enter your range to print natural Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
     while(i<=n){
        System.out.println(i);
        i++;
     }
     
        sc.close();
    }
    
}
