 

public class finalINT {
    public static void main(String[] args) {
        int a =5;
        a=6;
        System.out.println(a);

        Integer b= 50;
        b=60;
        System.out.println(b);

        final int c = 500;
      
       // c=600;      This shows  an error            //  uvesh Ahmad khan
        System.out.println(c);

         // Good Practice is that Capital words  
          final int DEMO = 10;
          System.out.println(DEMO);

          final int UVESH = 74;
          System.out.println(UVESH);
    }
}
