package Interfaces;

public class QueueStack implements Stack {
    @Override
    public void push(int x) {
        System.out.println("Data is pushed from  QueueStack ");
    }

    @Override
    public void pop() {
        System.out.println("Data is pop from QueueStack ");
    }

    @Override
    public int top() {
        System.out.println("Data is top from  QueueStack ");
        return 0;
    }
}
