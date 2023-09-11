import java.util.Scanner;

public class BasicPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Your Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =2;
        while(i<n){
            if(n%i==0){
                System.out.println("The number is not prime for " + i);
            }
             else{
                System.out.println("The Number is Prime for  " + i);
             }
            i++;

            }
          
          sc.close();
        }

    }

