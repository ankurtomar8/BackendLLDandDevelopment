package MultiThreadMergeSort;



import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrayToSort = List.of(8, 1, 2, 9, 6, 3, 7, 5);
        Sorter sorter = new Sorter(arrayToSort);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> sortedArrayFuture = executorService.submit(sorter);
        List<Integer> sortedArray = sortedArrayFuture.get();

        System.out.println(sortedArray);

    }
}
