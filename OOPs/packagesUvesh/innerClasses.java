package packagesUvesh;
public   class innerClasses{
  static class  Test{
    String ST;
    int Number;
     public Test(String Name ){
        this. ST = Name;
     }
}
public static void main(String[] args) {
    Test  obj = new  Test("Uvesh Ahmd Khan");     
             // class ke andar class  ho to andar wali class ko main me access nahi kar sakte error aati hai ;
                                                     // agar me andar wali class ko static bana du to ye arror chali jaati hai  kyoki andar wali class ko static karne par use object par depend nahi hona padega 

}
}