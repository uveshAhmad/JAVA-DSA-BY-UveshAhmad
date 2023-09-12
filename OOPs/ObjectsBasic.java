public class ObjectsBasic{
    public static void main(String[] args) {
    
    
        Students Uvesh = new Students( 1 , "Muhammad Uvesh Ahmad" , 43.5f);
        Uvesh.Marks = 37.7f;
        Uvesh.Name = "Uvesh Ahmad Khan";
        Uvesh.roll = 44;
        System.out.println(Uvesh.roll);
        System.out.println(Uvesh.Name);
        System.out.println(Uvesh.Marks);
        
        
          System.out.println("Next Student Details ");

        // anothe Method of constructer Students() 
        Students Ashab = new Students(  1 , "Ashaab Ahmad " , 46.5f);
        System.out.println(Ashab.Marks);
        System.out.println(Ashab.Name);
        System.out.println(Ashab.roll);
        
             
        System.out.println("Next One student Details      ");
        System.out.println();

        Students Rahul = new Students( 4 , "Rahul Chutiya" , 67.5f);
        System.out.println(Rahul.Marks);
        System.out.println(Rahul.roll);
        System.out.println(Rahul.Name);


               Uvesh.greeting();

               Address  ad = new Address();
               System.out.println(ad.st);
               Uvesh.ChangeName("Kallu ka Sakir ");
            System.out.println(Uvesh.Name);
    }
}
    class Students{
        int roll ;
        String Name;     // Stringis as a  class
       
        float Marks;
        
        Students(int roll , String Name , float Marks){             // Constructor Function;  Use this keyword here   
        this.roll = roll;
        Name = "Muhammad Uvesh Ahmad";
        Marks = 65.7f;
        }
        void greeting(){
            System.out.println("My Name is " + Name );
            System.out.println("My Name is " + this.Name );
        }
        void ChangeName( String newName){
            Name = newName;
        }
    }

    class  Address{
        String st = "Aryanagar Muradnagar Ghaziabad";
       
    }
