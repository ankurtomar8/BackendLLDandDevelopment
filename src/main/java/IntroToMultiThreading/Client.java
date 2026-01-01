package IntroToMultiThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        // runnable
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(helloWorldPrinter);
        t.start();

//        for (int i = 0; i <=100 ; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }

        // we don't want to create new thread for every task

        ExecutorService executorService  = Executors.newFixedThreadPool(10);
        for (int i = 1; i <=100 ; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            executorService.execute(numberPrinter);
            thread.start();
        }
        }

}
