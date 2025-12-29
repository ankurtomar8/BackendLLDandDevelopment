package Interfaces;

public class ArrayStack implements Stack{
    @Override
    public void push(int x) {
        System.out.println("Data is pushed from  ArrayStack ");
    }

    @Override
    public void pop() {
        System.out.println("Data is pop from  ArrayStack ");
    }

    @Override
    public int top() {
        System.out.println("Data is top from  ArrayStack ");
        return 0;
    }
}
