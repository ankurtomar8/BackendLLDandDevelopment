package Generics.Example;

import java.util.List;

public class AnimalUtility {
    public static void printAnimalsNames(List<Animal> animalList){
        for (Animal animal: animalList){
            System.out.println(animal.getName());
        }
    }

    public static <T extends Animal> T printAnimalsNames2(List<Dog> animalList){
        for (Animal animal: animalList){
            System.out.println(animal.getName());
        }
        return (T) animalList.get(0);
    }

}
