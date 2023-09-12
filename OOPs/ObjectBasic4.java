import javax.print.attribute.standard.PrinterMakeAndModel;

public class ObjectBasic4 {
    public static void main(String[] args) {
        MyDetails Uvesh = new MyDetails( 410839 , "Muhammad Uvesh" , "Bilal Masjid" , 23);
        Uvesh.greeting();
    
    MyDetails Rahul = new MyDetails(   );
    Rahul.greeting();
    }
    }

class MyDetails{
    int ID= 22768;
    String Name = "Uvesh Ahmad khan";
    String Address = "Aryanagar Muradnagar  Ghaziabad";
    int Age = 22;

    MyDetails( MyDetails other){
        this.ID=1234;
        this.Name = "Rahul saini";
        this.Address= "Barka Muradanagar";
        this.Age= 17;
      
    }

    MyDetails(int pehchan , String naam , String pata , int umr){
        this.ID=pehchan;
        this.Name = naam;
        this.Address = pata;
        this.Age=  umr;
    }
    void  greeting(){
        System.out.println(this.ID);
        System.out.println(this.Name);
        System.out.println(this.Address);
        System.out.println(this.Age);

}
}