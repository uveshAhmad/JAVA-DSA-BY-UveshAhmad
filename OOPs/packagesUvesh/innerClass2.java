package packagesUvesh;
 class  Test{
    static String Name;
 
     public Test(String Name ){
        Test.Name = Name;
           // this.ST na likh kar Static me this.Class_Name likhte hai 
     }
    }
 
public class innerClass2 {
    public static void main(String[] args) {
        Test  obj = new  Test("Uvesh Ahmd Khan");  
        Test obj2 = new Test ("Rahul Saini ");
        System.out.println(obj.Name);
        System.out.println(obj2.Name);                       // both of these print Rahul;
        
}
}