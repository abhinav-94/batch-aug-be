package OS1.Concurrency.AdderSubSynchronizedMethod;

//import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{

    Count count;

    public Subtractor(Count count1){
        this.count = count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <=10; i++){
            count.incrementValue(-i);
            System.out.println("Count in subtractor = " +count.getValue() + " in : "+Thread.currentThread().getName());
        }

    }
}
