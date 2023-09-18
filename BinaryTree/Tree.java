import java.util.*;
 class BinaryTree {
     public BinaryTree(){
        
     }
    private static class Node { // create Node data structure
        Node left;
        Node right;
        int value;
       
        public Node(int value){
            this.value=value;
        }
    }
        private Node root; // Initialize the root Node
        // Insert elements
        public void populate(Scanner scanner) { // for Inserting the Root Node
            System.out.println("Enter the Root Node Value :  ");
            int value = scanner.nextInt();
            root = new Node(value);
            populate(scanner, root);
        }
        private  void populate(Scanner scanner, Node node) {     // For Inserting the Next node
          
            System.out.println("Do you Want to enter left of " + node.value);
            boolean left = scanner.nextBoolean();
            if (left) { // Condition for Creating Left Node of root Node;
                System.out.println("Enter The value of the left of this Node : " + node.value);
                int value = scanner.nextInt();
                node.left = new Node(value);
                populate(scanner, node.left); // Call again the Inserting function for Left Adding
            }
            System.out.println("Do youn Want to enter the Right of  " + node.value); // Choice for adding Right node
            boolean right = scanner.nextBoolean();
            if (right) {
                System.out.println("Enter the value of the Right of this Node : " + node.value);
                int value = scanner.nextInt();
                node.right = new Node(value);
                populate(scanner, node.right); // Call again for inserting function for Right Adding;
            }
        }
        public void display(){
            display(root, " ");
        }
      private void  display(Node node , String indent){
        if(node==null){
            return;
        }
        System.out.println(indent+ node.value);
     display(node.left , indent + "\t");
     display(node.right , indent + "\t");
      }



      // PrettyDisplay();//
       public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if (node == null) {
      return;
    }

    prettyDisplay(node.right, level + 1);

    if (level != 0) {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|------->" + node.value);
    } else {
      System.out.println(node.value);
    }
    prettyDisplay(node.left, level + 1);
  }





      // Travesrsal preOrder//
    public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }


  // traversal inOrder//
      public void inOrder(){
     inOrder(root);
      }
      private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value +" ");
        inOrder(node.right);
      }
      public void poostOrder(){

      }


      // Traversal postOredr//
      public void postOrder(){
        postOrder(root);
      }
     private void  postOrder(Node node ){
        if(node == null ){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value+ " ");
      }


    }


public class Tree{
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree trees = new BinaryTree();
        trees.populate(scanner);
        scanner.close();
         trees.display();
         System.out.println();
         trees.prettyDisplay();
         System.out.println();
         trees.inOrder();
         System.out.println();
         trees.postOrder();
         System.out.println();
         trees.inOrder();
    }
}

