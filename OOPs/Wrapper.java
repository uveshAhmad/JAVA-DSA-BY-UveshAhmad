public class Wrapper {
    public static void main(String[] args) {
        Integer num = 45;  // treated as a Object (pehle int hota to ye stack me jaata ab ye heap memmory me jayega)
        System.out.println(num.byteValue()); 

 Check1 checking = new Check1();
 System.out.println(checking.st);

    }
}
