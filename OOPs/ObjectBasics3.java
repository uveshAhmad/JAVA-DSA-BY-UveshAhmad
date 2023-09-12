public class ObjectBasics3 {
    public static void main(String[] args) {
        MyDetails Uvesh = new MyDetails();
        Uvesh.greeting();

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
    void  greeting(){
        System.out.println(this.ID);
        System.out.println(this.Name);
        System.out.println(this.Address);
        System.out.println(this.Age);

     }
}