package Generics.Example;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Kitoo"));
        animals.add(new Animal("kikoo"));
        // can also pass dog list as well
        animals.add(new Dog("Golden","GR"));

        // List<Dog> animals2 = animals;  shwoing error cannot be converted

        List<Dog> animals2 =  new ArrayList<>();
        animals2.add(new Dog("Xapi","GR"));
        animals2.add(new Dog("New","Bolded"));

        AnimalUtility.printAnimalsNames2(animals2);


    }
}
