 public class customQueue {
    protected int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;

    public customQueue() { // if not size is not given then vo default size 10 ho jayega ;
        this(DEFAULT_SIZE);

    }

    public customQueue(int size) { // default size ke liye;
        this.arr = new int[size];
    }

    // Insert Operation OPERATION
    public void insert(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is Full!!");

        }
      
        arr[end] = item;
           end++;
    }

    //Removed Operation  OPERATION
    public int remove() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty!");
        }
          int removed =  arr[0];
      for(int i=1; i<end; i++){
       arr[i-1]=arr[i];
        
      }
      end--;
      return removed;
           
 

    }

    // isFull method
    private boolean isFull() {
        if (end == arr.length - 1) {
            return true;
        }
        return false;
    }

    // isEmpty Method
    private boolean isEmpty() {
        if (end == 0) {
            return true;
        }
        return false;
    }

    // front Method;
    public int front() throws Exception{
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return arr[0];
    }

    // Print Queue;
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + "->");
        }
        System.out.print("END");
        System.out.println();
    }

}
