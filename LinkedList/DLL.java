public class DLL {
    public DLL() {
        size = 0;
    }


    // Initializing;
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {         // condition for check Null pointer exception;.
            head.prev = newNode;
        }
        head = newNode;

    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        Node last = head;

        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (last.next != null) {
            last = last.next;
        }
        newNode.prev = last;
        last.next = newNode;
        newNode.next = null;

    }



    // Insert after a particular Node Value.
    public void insertAtindex(int data, int after) {
        Node p = find(after);
        if (p == null) {
            System.out.println("Node Does Not Exist");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if (newNode.next != null) {      // agar last Node hui to uska next to Null Pointer exception dega to
            newNode.next.prev = newNode;
        }

    }


    
    // Find The Node
    public Node find(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }




    // Print LinkedList
    public void display() {
        Node tempStart;
        Node tempLast;
        tempStart = head;
        tempLast = null;

        while (tempStart != null) {
            System.out.print(tempStart.data + "->");
            tempLast = tempStart;
            tempStart = tempStart.next;
        }

        // Print in reverse Order

        // System.out.println();
        // System.out.println("Print In Reverse Order");
        // // Print in reverse Order
        // while (tempLast != null) {
        //     System.out.print(tempLast.data + "->");

        //     tempLast = tempLast.prev;
        // }

    }

    public static void main(String[] args) {
        DLL List = new DLL();
        List.insertAtFirst(0);
        List.insertAtFirst(1);
        List.insertAtFirst(2);
        List.insertAtFirst(3);
        // List.display();
        List.insertAtLast(99);
        // List.display();
        List.insertAtindex(1000, 3);
        List.display();
    }
}