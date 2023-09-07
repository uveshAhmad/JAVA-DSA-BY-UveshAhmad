import java.util.Scanner;
public class RecursionPalindrome {

    static int palindrome(int number ){
         
        int sum=0;
//@SuppressWarnings("all")
        if(number==0)
        return sum;
        int res=  number%10;
        sum = (sum*10)+res;
        number = number/10;
        return palindrome(sum );
    }
    public static void main(String[] args) {
        System.out.println("Enter your value here");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int copy = num;
       int result =  palindrome(num);
       if(result==copy){
        System.out.println("The Number is palindrome");
       }
    else{
        System.out.println("the number is not palindrome");
    }
        sc.close();
    }
}

