package SOLID_Example.BirdV4;

public class Sparrow extends Bird implements Flyable{
   LowFlying lowFlying;

   Sparrow(){
       lowFlying = new LowFlying();
   }

    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {

    }
}
