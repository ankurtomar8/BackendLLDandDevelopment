package Milestone1;

public class Item implements Comparable<Item> {

     private   String Id;
    private String name;
    private int quantity;
    private double price;

    private  static  int idCounter = 0;


    public Item(String id, String name, double price, int quantity) {
        this.Id = "Id-" +idCounter;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public int compareTo(Item other) {
       // one object : this object : retun -1
        // another object : passed in arg : return 1
        // equal : return 0

        // algo : asc of price
        if(this.price > other.getPrice()){
            return  1;
        } else if(this.price < other.getPrice()){
            return  -1;
        }
        return 0;
    }
}
 // sort: ItemObject.compareTo(OtherItem)