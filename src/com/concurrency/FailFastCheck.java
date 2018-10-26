package com.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastCheck {

    static Map<Integer ,String> hm = new HashMap<>();
    // All classes from Collection package have a tendency to retain their state when being traversed by a iterator
    // We cannot modify a collection whilst iterating over it
    // If we want to modify, we can only use it.remove();
    public static void main(String ar[]) {

        hm.put(1,"mansa");
        System.out.print(hm.put(2,"mansa2"));
//        WorkerThread workerThread = new WorkerThread();
//        Thread thread1 = new Thread(workerThread);

        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            System.out.print(it.next().getValue());
            it.remove();
            //hm.put(3,"string") this line of code will throw a concurrent modification exception
        }
        System.out.println("\nhh   "+hm);
        //thread1.start();


    }

}

class WorkerThread implements Runnable {

    @Override
    public void run() {

    }
}
