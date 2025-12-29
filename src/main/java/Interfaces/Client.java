package Interfaces;

public class Client {
    public static void main(String[] args){

        ArrayStack arrayStack = new ArrayStack();

        // interface type can refer to the object
        // of any class which has implement the interface

        Stack stack = new ArrayStack();
        stack.push(10);

        stack = new LinkedListStack();
        stack.push(20);

        stack = new QueueStack();
        stack.push(30);

    InterfaceUitlity.InterfaceUtilityHelper(stack);


    }
}
