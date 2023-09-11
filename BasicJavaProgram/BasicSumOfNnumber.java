import java.util.Scanner;
public class BasicSumOfNnumber {
    // SUM OF N EVEN  NUMBER &&  ODD NUMBER//
    public static void main(String[] args) {
        System.out.println("Enetr Your range");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i =1, temp , sum=0;
     while (i<=a){
        if(i%2==0){
            temp=i;
            sum=sum+temp;
        }
        else{
            
        }
        i++;

     }
     System.out.println("The sum of n natural number is " + sum);
      sc.close();
    }
}
