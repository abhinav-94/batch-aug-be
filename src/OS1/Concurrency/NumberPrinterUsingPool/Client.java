package OS1.Concurrency.NumberPrinterUsingPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        //ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorServiceCached = Executors.newCachedThreadPool();

        for(int i = 1; i<=50; i++){
            if (i == 10){
                System.out.println("Waiting");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i); // Create a task
           // executorService.execute(numberPrinter); // Execute the task by passing it to the executor service's execute method
            executorServiceCached.execute(numberPrinter); // Execute the task by passing it to the executor service's execute method
        }

        //without shutdown() the program will not terminate
        //executorService.shutdown();  
        executorServiceCached.shutdown();
    }
}
