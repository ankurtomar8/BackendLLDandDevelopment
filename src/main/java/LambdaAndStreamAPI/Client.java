package LambdaAndStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // Method 1
        Runnable someTask = new SomeTask();
        Thread t = new Thread(someTask);
        t.start();

        // Method 2: We can use Lambda expression
        // we know in the functional Interface Runnable
        // There is only one method to be implemented
        Runnable anotherTask = () -> {
            System.out.println(" Hey I am doing another task");
        };
        Thread t1 = new Thread(anotherTask);

        List<Integer> list1 = new ArrayList<>();
        list1.add(13);
        list1.add(16);
        list1.add(5);
        list1.add(17);
        list1.add(36);
        list1.add(18);

        // my sorting rules are
        // even number should come first, odd later
        // we know we need to right to comparator for this

        Comparator<Integer> comparator = (o1, o2) -> {
            if(o1 % 2 == 0 ) return -1;
            else if(o2 % 2 == 0) return 1;
            return 0;
        };
        Collections.sort(list1,comparator);
        System.out.println(list1);
    }
}
