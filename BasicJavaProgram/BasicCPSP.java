import java.util.Scanner;
public class BasicCPSP {
    public static void main(String[] args) {
        
        System.out.println("Enter the cost price");
        Scanner cont = new Scanner(System.in);
        int cp = cont.nextInt();
        System.out.println("Enter the selling price");
          int sp = cont.nextInt();

        if(cp<sp){
            System.out.println("Profit ");
        }
     else{
        System.out.println("Loss");
     }
     cont.close();
    }
}
