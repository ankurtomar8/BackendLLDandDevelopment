package SOLID_Example.BirdV4;

public class Peacock extends Bird implements Flyable{

    @Override
    public void makeSound() {
        System.out.println("Peacock is flying");
    }

    @Override
    public void fly() {
        System.out.println("EWEWEWEEWEWEW");
    }
}
