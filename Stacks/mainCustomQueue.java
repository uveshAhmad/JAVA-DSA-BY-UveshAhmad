public class mainCustomQueue {
    public static void main(String[] args)  throws StackException {
        customQueue que = new customQueue(6);
        que.insert(2);
        que.insert(0);
        que.insert(5);
        que.display();
        que.remove();
        que.display();
    }
}
