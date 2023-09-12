package Inheritance;

public class BoxPrice extends BoxWeights {
    int price;
    public BoxPrice(){
        super();
        this.price=45;
    }


  //  public BoxPrice(BoxPrice other ){
  //      super();
  //      this.price=-1;
  //  }


    public BoxPrice(BoxWeights other ){
        super();
        this.price=-2;
    }
    

    public BoxPrice(Box other){
        super();
        this.price=-7;
    }

    public BoxPrice( int lambai){
        super();
                this.price=-110;
    }

    public BoxPrice(int lambai , int chodai , int uchai , int weight , int price ){
super(lambai , chodai , uchai , weight );
this.price=987654321;
    }
 

    }
 