package Array;

import java.util.Scanner;
 
public class takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
         for(int i  =0; i<5 ; i++){
             arr[i]=sc.nextInt();
         }
        
        sc.close();
    }
}
