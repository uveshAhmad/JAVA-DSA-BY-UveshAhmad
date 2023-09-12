public class ObjectBasic2{
     public static void main(String[] args) {
        MyDetails Uvesh= new MyDetails();
        System.out.println( Uvesh.ID);
        System.out.println( Uvesh.Name);
        System.out.println( Uvesh.Address);
        System.out.println( Uvesh.Age);
     }
}
class MyDetails{
    int ID;
    String Name;
    String Address;
    int Age;

    MyDetails(){
        this.ID=22768;
        this.Name="Uvesh Ahmad Khan";
        this.Address="Aryanagar Muradnagar ghaziabad";
        this.Age= 22;
    }
}