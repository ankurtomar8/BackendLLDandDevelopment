package AbstractClassess;

public abstract class Bird {
    private String name;
    private int noOfWings;

    public void eat(){
        System.out.println("Bird is eating");
    }

    public abstract void fly();
    public  abstract void makeSound();

}

// 1. You can't create object of bird class (Abstract class)
//2 Abstract classes can also have abstract methods -
//            a - which required no definitions
//            b - It Enforces child classes to have definitions
