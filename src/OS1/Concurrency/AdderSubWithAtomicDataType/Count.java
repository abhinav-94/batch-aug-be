package OS1.Concurrency.AdderSubWithAtomicDataType;

import java.util.concurrent.atomic.AtomicInteger;
//import java.util.concurrent.atomic.AtomicLongArray;

public class Count {
//    int value = 0; //earlier we were working with normal datatype
    AtomicInteger value = new AtomicInteger(0);
}
