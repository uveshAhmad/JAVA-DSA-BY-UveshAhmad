import java.util.LinkedList;
 
    class implementation{
        public implementation(){

        }
    LinkedList<Integer> list = new LinkedList<>();
      public void push(int data){
    list.addFirst(data);
    }
    public void  pop(){
        list.removeFirst();
    }
    public void peek(){
        
    }
    public void display(){
        System.out.println(list);
    }
}
public class StackUsingLL {
    public static void main(String[] args) {
        implementation list = new implementation();
        list.push(0);
        list.push(1);
        list.display();
        list.pop();
        list.display();


    }
}
    
