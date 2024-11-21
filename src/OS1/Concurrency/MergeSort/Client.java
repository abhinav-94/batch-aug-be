package OS1.Concurrency.MergeSort;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {

        ExecutorService executorService = Executors.newCachedThreadPool(); //An ExecutorService is created using a cached thread pool.
        //This pool creates new threads as needed but will reuse previously constructed threads when they are available.
        //This is suitable for applications that frequently create and destroy threads.

        List<Integer> list = Arrays.asList(7,1,4,2,6,8,5);
        MergeSorter mergeSorter = new MergeSorter(list, executorService);
        //List<Integer> sortedArrayList = mergeSorter.call();
        Future<List<Integer>> sortedArrayList = executorService.submit(mergeSorter);   //<T> Future<T> submit(Callable<T> task);
        //The mergeSorter task is submitted to the executorService for execution. The submit method returns a Future object that
        // represents the result of the asynchronous computation.

        System.out.println("Sorted Array List is " + sortedArrayList.get());
        System.out.println("After completing sorting");

        executorService.shutdown();
    }
}
