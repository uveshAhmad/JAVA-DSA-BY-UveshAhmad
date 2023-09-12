package Inheritance;
public class main {
    public static void main(String[] args) {
        Box obj = new Box(2 , 2, 2);
        System.out.println(obj.L);
        Box obj2 = new Box (5 , 5, 5);
        System.out.println(obj2.L);
        Box obj3 = new Box(obj2);        // obj wale constructor  se access hoga ye wala ok
        System.out.println(obj3.L);

        BoxWeights obj4 = new BoxWeights( 2 , 3, 4, 5 );
        System.out.println(obj4.L    + " " + obj4.B  + " " + obj4.H + " "  + obj4.weights);
        //System.out.println(obj2.weight);  // cant access parent class cant acces the property of child class
                                                             // only child class access the property of parent class


            Box box5 = new BoxWeights(1, 2, 3, 4);
            System.out.println(box5.L);
         //   System.out.println(box5.weight);                weight ko access nhi kar sakte hai kyoki 
          //                                                                    member Box (ne determine kare hai ) na ki object(Boxweights) se;
           //                                                                   parents class child class ko refrence kar raha hai bas Example is PTM wala
           //              me uvesh ka papa hu (Parents ne refrence diya hai bas )










           BoxPrice obj01 = new BoxPrice( 50 );
           System.out.println(obj01.price);
           System.out.println(obj01.weights);
           BoxPrice obj02 = new BoxPrice(obj01);
           System.out.println(obj02.price);

           System.out.println(" ");
           BoxPrice obj03 = new BoxPrice(  1001 , 1002  ,  10003 , 560 , 45 );
           System.out.println(obj03.price +" " +  obj03.weights + " " + obj03.B + " " + obj03.L);

              Box baksa = new BoxWeights();
              baksa.greeting();                // ye box class vala body show karega ;
                                                        // static object par depend nahi karta vo  parent class me hi jayega ;
                                                        //    "He I am In boxWeight  clas  Greeting!!!!"  isi vajha se  hame ye na mike ye mil raha hai 
                                                        // "He I am In box  clas  Greeting!!!!"

           
             BoxWeights baksa2 = new BoxWeights();
              baksa2.greeting();           // "He I am In boxWeight  clas  Greeting!!!!" ab ye print hoga ; jab boxWeight class me method hhoga 
              //   "He I am In box  clas  Greeting!!!!"     ab ye print jab hoga jab BoxWeight class me ho hi na method jab ye parent class vala print kar dega 

         
    }
}
