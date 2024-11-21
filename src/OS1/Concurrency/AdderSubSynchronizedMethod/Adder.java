package OS1.Concurrency.AdderSubSynchronizedMethod;

//import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    Count count;
    //Lock lock;

    //public Adder(Count count1, Lock lock)
    public Adder(Count count1){
        this.count = count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++){
            //lock.lock();      //locks the thread Critical Section. and blocks other threads to get into critical section
            count.incrementValue(i);
            System.out.println("Count in adder = " +count.getValue() + " in : "+Thread.currentThread().getName());
            //lock.unlock()     // unlocks the thread critical section

        }
    }
}
