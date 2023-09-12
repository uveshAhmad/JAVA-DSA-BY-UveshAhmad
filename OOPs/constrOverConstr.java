public class constrOverConstr {
    public static void main(String[] args) {
        Details Ashab = new Details();
        Ashab.display();
    }
}
class Details{
    int ID;
    String name;

    Details(){
         this( 331066 , "Asahab Ahmad");    // Constructor Call The Constructor 
    }
    Details(int id , String Naam){
        this.ID=id;
        this.name=Naam;
    }
    void display(){
        System.out.println(this.ID);
        System.out.println(this.name);
    }
}