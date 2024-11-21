package OS1.Concurrency.AdderSubSynchronizedMethod;

public class Count {
    public int value = 0;

    int getValue(){
        return this.value;
    }


    //we can use it on the shared item/variable
    //synchronized keyword is used to lock the critical section of code.

    public synchronized void incrementValue(int offset){
        this.value += offset;
    }
}
