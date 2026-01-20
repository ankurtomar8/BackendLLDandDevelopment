package SOLID_Example.BirdV4;

import java.util.List;

public class Client {
    public static void doSomething(List<Flyable> birds){
        for(Flyable bird : birds){
            bird.fly();
        }
    }

    public static void main(String[] args) {
        Bird b = new Pigeon();
        Pegion b1 = new Pigeon();
        Flyable f = new Pegion();
    }

}
