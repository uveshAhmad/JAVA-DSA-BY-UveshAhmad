import java.util.Scanner;

public class BasicCaseLetter {
    public static void main(String[] args) {
        System.out.println("Enter Your letter Here");
        Scanner sc = new Scanner(System.in);
        char character = sc.nextChar();
        if(a<=character<=z){
            System.out.println("The chacarter is in Lower Case");
        }
        else if( A<=character<=Z){
            System.out.println("The number is in Upper case");
        }
        else if(0 <=character<= 9){
            System.out.println("The Character is a type if number");
        }
       else{
        System.out.println("The character is a special case");
       }
        }



        sc.close();
    }
