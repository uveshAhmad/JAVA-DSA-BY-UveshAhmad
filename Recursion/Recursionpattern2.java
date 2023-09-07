public class Recursionpattern2 {

   /*  abcdefghi
         jklmnop
          qrstu
           vwx
              y       */
   
    static char k = 97;
    static void printspace(int space){
        if(space==0){
            return;
        }
        System.out.print(" ");
        printspace(space-1);
    } 
static void printstar( int col){
    if(col ==0){
        return;
    }
    System.out.print(k);
    k++;
    printstar(col-1);
    }
    static void printpattern(int row , int col){
        if(row==0){
            return;
        }
        printspace(col);
        printstar(2*row-1);
        System.out.println();
        printpattern(row-1 , col+1);
    }
    public static void main(String[] args) {
printpattern(5 , 0);
    }
}
