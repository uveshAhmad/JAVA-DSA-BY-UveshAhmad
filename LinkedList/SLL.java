public class SLL {
  // Intitializing the Size of Linked Llist
  public SLL() {
    this.size = 0;

  }

  // Creating A node;
  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;

    }

    public Node(int value, Node next) {
      this.value = value;
      this.next = next;

    }
  }

  // Initializing the pointers ;

  private Node head;
  private Node tail;
  private int size;

  // Insert Element At First;
  public void inserAtFirst(int val) {
    Node newNode = new Node(val);
    if (tail == null) {
      head = newNode;
      tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
    size++;
  }

  // Delete Element At First;
  public int deleteAtFirst() {
    int value = head.value;
    if (head == null) {
      head = tail;
    }
    head = head.next;
    size--;
    System.out.println("Removed Value is " + value);
    return value;

  }

  // Insert Element At Last;
  public void insertAtLast(int val) {
    Node newNode = new Node(val);
    if (tail == null) {
      head = newNode;
      tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
    size++;
  }

  // Delete Element At last;
  public void deleteAtLast() {
    if (size < 1) {
      deleteAtFirst();
      return;
    }

    Node secondlast = get(size - 2);
    int value = tail.value;
    tail = secondlast;
    tail.next = null;
    size--;
    System.out.println("Removed Value is " + value);

  }

  // Insert At the Particular Position
  public void insertAtPosition(int value, int index) {
    if (index == 0) {
      inserAtFirst(value);
    }
    if (index == size) {
      insertAtLast(value);
    }
    Node temp = head;
    for (int i = 1; i < index; i++) {
      temp = temp.next;

    }
    Node newNode = new Node(value, temp.next);
    temp.next = newNode;
    size++;
  }

  // Printing the LinkedList;
  public void display() {
    Node tempNode;
    tempNode = head;
    while (tempNode != null) {
      System.out.print(tempNode.value + "->");
      tempNode = tempNode.next;
    }
    System.out.print("END");
    System.out.println();
  }

  // Get Node to given Index only;
  public Node get(int index) {
    Node newNode = head;
    for (int i = 0; i < index; i++) {

      newNode = newNode.next;
    }
    return newNode;

  }

  // Find the Node at given Value 0(n);

  public Node find(int value) {
    Node node = head;
    while (node != null) {
      if (node.value == value) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public static void main(String[] args) {

    SLL List = new SLL();
    List.inserAtFirst(0);
    List.inserAtFirst(1);
    List.inserAtFirst(2);
    List.inserAtFirst(3);
    List.inserAtFirst(4);
    // LastPosition;
    List.insertAtLast(5);
    List.insertAtLast(6);
    List.insertAtLast(7);
    // At Index
    List.insertAtPosition(100, 5);
    // Zero se Indexing Hogi oK;
    List.display();
    // DealeteAtFirst Element;
    List.deleteAtFirst();

    List.display();
    List.deleteAtLast();
    List.display();

  }

}