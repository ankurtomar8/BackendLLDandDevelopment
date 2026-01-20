package SOLID_Example.BirdV4;

public abstract class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private int age;
    private int numberOfLegs;
    private String type;

    public void swim(){}
    public void eat(){
        System.out.println("Bird : " + name + "is eating!");
    }

    public abstract  void makeSound();

}
