package Interfaces;

public class LinkedListStack implements Stack{
    @Override
    public void push(int x) {
        System.out.println("Data is pushed from  LinkedListStack ");
    }

    @Override
    public void pop() {
        System.out.println("Data is Pop from  LinkedListStack ");
    }

    @Override
    public int top() {
        System.out.println("Data is top from  LinkedListStack ");
        return 0;
    }
}
