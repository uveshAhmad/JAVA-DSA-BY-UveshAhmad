public class customStack {
    protected int[] arr;
    private static final int DEFALT_SIZE = 10;
    private int ptr = -1;

    public customStack() { // if not size is not given then vo default size become 10 ;
        this(DEFALT_SIZE);
    }

    public customStack(int size) { // for parametrize  size;
        this.arr = new int[size];
    } 

    // PUSH OPERATION
    public void push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is Full!!");

        }
        ptr++;
        arr[ptr] = item;
    }

    // POP OPERATION
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty!");
        }
        int removed = arr[ptr];
        ptr--;
        return removed;

    }

    // isFull method
    private boolean isFull() {
        if (ptr == arr.length - 1) {
            return true;
        }
        return false;
    }

    // isempty Method
    private boolean isEmpty() {
        if (ptr == -1) {
            return true;
        }
        return false;
    }
    // Print Stack 
    public void display(){
        for(int i =0; i<ptr; i++){
            System.out.print(arr[i]+"->");
        }
    }
}