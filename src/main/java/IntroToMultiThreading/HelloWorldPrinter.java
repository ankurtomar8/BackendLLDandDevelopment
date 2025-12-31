package IntroToMultiThreading;

public class HelloWorldPrinter  implements  Runnable{
    public void print(){
        System.out.println("Hi Welcome to HelloWorldPrinter " + Thread.currentThread().getName());
    }

    @Override
    public void run() {

        print();
    }
}
