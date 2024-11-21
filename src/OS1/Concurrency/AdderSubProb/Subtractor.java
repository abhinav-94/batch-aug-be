package OS1.Concurrency.AdderSubProb;

public class Subtractor implements Runnable{

    Count count;

    public Subtractor(Count count1){
        count = count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <=30; i++){
            count.value -= i;
            System.out.println("Count in substractor = " +count.value + " in : "+Thread.currentThread().getName());
        }

    }
}
