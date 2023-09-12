package Inheritance;

public class Box {   // parent class 
       int L;                     //  private int L   " likhte hi koi bhi child class ise access nhi kar sakti hai ";
                                  // private wale members ko keval usi file me access kar sakte hai OK;

    int B;
    int H;
    // public final  class Box {                    final lagate hi ye extends me use nahi hogi 
                                                             //   ham ise prevent kar lenege 
    //     int L;                      
    //                                 
   
    //    int B;
    //    int H;

     public Box( int l , int b , int h ){    // 3 argument wala yaha se access hoga main me ;
        this.L=l;
        this.B=b;
        this.H=h;
    }
   public  Box( Box  old ){                  // 1 argument wala yaha se access hoga main me ;
        this.L=old.L;
        this.B=old.B;
        this.H=old.H;


    }
  public   Box(int l , int b ){     // two argument wala yaha se call hoga main class me ;
        this.L=l;
        this.B=b;
    }
    public Box(){
        this.L=5;
        this.B=10;
        this.H=15;
    }

    static void greeting(){                      // static method override nahi kar sakte hai ;
        System.out.println("He I am In box  clas  Greeting!!!!");
    }
    public   int  getL(int L ){        // method banaya hai constructor nahi ;
        return L;
    }

}
