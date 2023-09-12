package Inheritance;

public class BoxWeights extends Box {
    double weights;
   
  public   BoxWeights( int l , int b , int h  , int weight){       
    super( l ,  b ,  h);     // arguments jabke liye jab iski saari (3+1) priprty follow karni padti hai ;
                                   // use to initialize the value present in parent class;  OK 
                                   // or calling the parent class constuctror 
                                   // jo member parent class ke private declair hue hai vo access nahi kar sakte hai child class me oK
        this.weights=5;
    }
    public BoxWeights(Box other , int weight){
        super(other);
        // this.weights= other.weight;              weight ko chod kar sab access kar lega 
                                                                     // Same piche bhi aisa hin kara tha ok 
                                                                     // jiska solution details me hi kara tha  
    }
    public BoxWeights( ){
        super();
        this.weights=25;
    }
     //@Override     // override nahi kar sakte kyoki ye static declair hai Box class me 
     static void greeting(){                      // static method override nahi kar sakte hai ;
         System.out.println("He I am In boxWeight  clas  Greeting!!!!");
     }
}
