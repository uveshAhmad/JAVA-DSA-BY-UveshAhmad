import    java.util.Scanner;

public class BasicAge {
    public static void main(String[] args) {
         
        System.out.println("Enter Your Age");
         Scanner container = new Scanner(System.in);
         int age = container.nextInt();
        
        if(age>=18){
            System.out.println("Eligblie for DL");
        }
       else{
        System.out.println("Not elegible for DL");
       }
       container.close();
    }
 
}
