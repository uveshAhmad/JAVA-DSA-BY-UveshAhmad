 
public class BasicReverseANumber {
static void reverseMe(int number){
if(number==0){
   return;
}
System.out.print(number%10);
 reverseMe(number/10);
}
 public static void main(String[] args) {
   reverseMe(245);
}
}

