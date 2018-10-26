package com.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {
    // Concurrent collections provide a fail safe iterator. It means we can iterate and modify the collection simultaneously
    // This is done in ConcurrentMap by creating key level locks
    // In copy on write lists, a copy is created whenever modification is needed

    static CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
    static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

    public static void main (String [] ar) {

        System.out.println(map.put(1,2));
        System.out.println(map.put(3,4));

        System.out.println(map.putIfAbsent(5,6));
        System.out.println(map.putIfAbsent(1,5));

    }
}
