import java.util.Scanner;

public class BasicLeapYear {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the Year name");
        Scanner cont = new Scanner(System.in);
        int year = cont.nextInt();
        if(year%4==0 ||year%400==0){
            System.out.println("Year is leap Year");

        }
        else{
            System.out.println("Year is not leap year");
        }
        cont.close();
        
    }
}
