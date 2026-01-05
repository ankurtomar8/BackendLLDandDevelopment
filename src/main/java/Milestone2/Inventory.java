package Milestone2;

import Milestone1.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory <T extends Item> {
    HashMap<String, T> items ;

    public Inventory(HashMap<String, T> items) {
        this.items = items;
    }

    public Inventory() {
        items = new HashMap<>();
    }

    public void add(T item){
        items.put(item.getId(),item);
    }
    public void remove(T item){
        items.remove(item.getId());
    }

    public void remove(String ItemId){
        items.remove(ItemId);
    }

    public T get(String itemId){
        return items.get(itemId);
    }

    // convert the value of hashmap in to list
    public List<Item> getAllItems(){
        return  new ArrayList<>(items.values());
    }

}

//
// Electronics Inventory
// we want to mention the type of items during the inventory creation