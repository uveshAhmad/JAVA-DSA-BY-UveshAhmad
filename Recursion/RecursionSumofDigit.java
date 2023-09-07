public class RecursionSumofDigit {
    static int sum(int digit , int count , int result){
        if(digit==0)
        return result;
        count=digit%10;
        result = result +count;
        digit=digit/10;
      return  sum(digit , count , result);
    }
    public static void main(String[] args) {
       int result = sum(12345 , 0 , 0);
     System.out.println(result);

    }
}
