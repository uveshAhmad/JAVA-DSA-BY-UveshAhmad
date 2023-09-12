public class Number {
    
    int  sum(int a , int b ){
        return a+b;
    }
    int sum(int a , int b , int c){
        return a+b+c;

    }
    void sum(){
        System.out.println("Me kuch nahi deta hu");
    }
    double sum(double a , double b){
        return a+b;
    }

    public static void main(String[] args) {
        Number  obj = new Number();
     obj.sum();
        int result =obj.sum(2,3);
        System.out.println(result);
       int result2 =  obj.sum(1,2,3);
       System.out.println(result2);
      //  obj.sum(1);
    }
}
