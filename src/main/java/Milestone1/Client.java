package Milestone1;

import Milestone2.Inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1","Laptop",54.5,5,5));
        items.add(new Clothing("C1","T-shirt",44.64,4,"M"));
        items.add(new Book("B1","Java Pro",24.5,3,"John Doe"));
        System.out.println("Item List :  ");
        for (Item item : items){
            System.out.println(item.getName() + "  :  "+item.getPrice());
        }

        // sort this list
        // Custom classess don't have anything sorting order

        System.out.println("--------------------------------------------------------------");
        Collections.sort(items);
        for (Item item : items){
            System.out.println(item.getName() + "  :  "+item.getPrice());
        }

        System.out.println("--------------------------------------------------------------");



        System.out.println("Electronics Inventory");
        Inventory<Electronics> electronicsInventory = new Inventory<>();
        electronicsInventory.add(new Electronics("E1", "Laptop",999.99 ,  5 , 24));
        electronicsInventory.add(new Electronics("E2", "Laptop",999.99 ,  5 , 24));
        electronicsInventory.add(new Electronics("E3", "Mobile",999.99, 5, 24));

        System.out.println("Items List from the Inventory : ");
        for (Item item : electronicsInventory.getAllItems()){
            System.out.println(item.getName() + "  :  "+item.getPrice());
        }

    }
}
