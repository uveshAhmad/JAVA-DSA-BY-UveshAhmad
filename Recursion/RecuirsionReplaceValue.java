    /*

 Replace all Pi values with 3.14
i/p : str = "2*pi+3*pi=5*pi"
o/p : str = "2*3.14+3*3.14=5*3.14"

     */
public class RecuirsionReplaceValue {
      static String replacer(String str){
    if(str.length()==0){
    return "";
}
  if(str.charAt(0)=='p' && str.charAt(1)=='i'){
return "3.14"+replacer(str.substring(2));
  }
  else{
    return str.charAt(0)+replacer(str.substring(1));
  }
    }
 
    public static void main(String[] args) {
       
     String result =replacer("2*pi+3*pi=5*pi");
        System.out.println(result);
    }
}
