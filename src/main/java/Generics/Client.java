package Generics;

public class Client {
    public static void main(String[] args) {
        Pair p  = new Pair();
        p.setFirst("Ankur");
        p.setSecond(26);

        // Ambiguity   was supposed to take Int but took String no type safety
        p.setSecond("Tomar");

        GenericPair<String,Double> genericPair = new GenericPair<>();

        genericPair.setFirst("Ankit");
        genericPair.setSecond(26.0); // not allowed  any other data type

   /// create new pair of data type
        GenericPair<String,String> genericPair2 = new GenericPair<>();

        genericPair2.setFirst("Ankur Tomar");
        genericPair2.setSecond("Ankit Tomar");

    }
}
