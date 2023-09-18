public class CLL {
    public CLL(){
        head=null;
        tail=null;
        size=0;
    }
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    } 
   private Node head;
   private Node tail;
   private int size;

// Inserting an Node after tail;
  public void insert(int data){
    Node newNode= new Node(data);
    if(head==null){
        head=tail =newNode;
        return;
    }
    tail.next=newNode;
    newNode.next=head;
    tail=newNode;
  }

  // deleting a Particular Value Node 
  public void  delete(int value ){
   
  }

// Displaying the Linked List
public void display(){
    Node temp =head;
    if(head!=null){
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
         
    }
    System.out.print("HEAD");
}


public static void main(String[] args) {
    CLL List = new CLL();
    List.insert(0);
    List.insert(1);
    List.insert(3);
    List.insert(4);
    List.display();
   
}
}
