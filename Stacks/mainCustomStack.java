public class mainCustomStack {
    public static void main(String[] args) throws StackException {
        customStack stack = new customStack();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.display();
        System.out.println();
        stack.pop();
          stack.pop();
    stack.display();


    }
}