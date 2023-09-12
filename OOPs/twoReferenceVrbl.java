public class twoReferenceVrbl {
    public static void main(String[] args) {
        Student one = new Student();
        Student two = one ;

        one.Name="Ashab Ahmad";   // update one that willvbe change in Two
        System.out.println(two.Name);

    }
}
 class Student{
    String Name = "Uvesh Ahmad";
 }