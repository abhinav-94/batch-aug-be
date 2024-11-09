package OS1.Concurrency.AdderSubWithMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1 = new Thread(adder);
        System.out.println("value after adder count " + count.value);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        // t1.join();
        // t2.join();
        System.out.println("Final value for count " + count.value);
    }
}
