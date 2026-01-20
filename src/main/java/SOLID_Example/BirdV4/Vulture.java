package SOLID_Example.BirdV4;

public class Vulture extends Bird implements Flyable{

    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
        System.out.println("Flying High");
    }
}
