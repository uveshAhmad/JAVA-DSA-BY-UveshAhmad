import java.util.ArrayList;
public class StackByArrayList{
static  class Stack{
    static ArrayList<Integer> list = new ArrayList<>();

    public static Boolean IsEmpty(){                            // First Operation isEmpty to check the stack is Empty or not ;
          if(list.size()==0){
          return true;
        }              
        return false;             // meaning is that if size is Zero than it return the True;
                                                                    // ( Ha ya na btana hai isliye Boolean return Type )
    }


    public  static void  push(int data){                       // For PUSH operation   (koi cheecj return nahi karni  hai only add karna hai is liye return type only Vopid hai  )
         list.add(data);
    }


   public static  int pop(){                                     // For POP Operation      (data ko nikalkar return bhi karna hai is liye return type intiger hai  )
        if(IsEmpty()){ // corner Case bhi add karna padega kyoki Agar empty stack me hamne POP kara to return  -1 Dikhana hai ;
            return -1;
        }
        int top = list.get(list.size()-1);
         list.remove( list.size()-1);
         return top;
    }


 public static int peak(){                                        // For Peak Operation  ( data ko  shoe karna hai keval remove nahi karnas hai is liye int return type hai )
    if(IsEmpty()){ // corner Case bhi add karna padega kyoki Agar empty stack me hamne POP kara to return  -1 Dikhana hai ;
        return -1;
    }                     
    return list.get(list.size()-1);
    
 }

}


public static void main(String[] args) {
    Stack s = new Stack();
    s.push(0);
    s.push(1);
    s.push(2);
    s.push(3);

    while(!s.IsEmpty()){
        System.out.println(s.peak());
        s.pop();
    }
    System.out.println(s.peak());     // -1 return karega kyoki khaali ho gya hai stack
}
}
