package IntroToMultiThreading;

public class NumberPrinter  implements  Runnable{

    private int noToPrint;

    public NumberPrinter(int noToPrint){
        this.noToPrint  =  noToPrint;
    }

    public  void print(){
        System.out.println("Printing the number: "+ noToPrint+" in Thread"+
                Thread.currentThread().getName());
    }
    @Override
    public void run() {
        // Needs to print a particular number
        // From where we will get the number
        print();

    }
}
