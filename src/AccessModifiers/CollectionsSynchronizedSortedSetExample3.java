package AccessModifiers;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
public class CollectionsSynchronizedSortedSetExample3 {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        SortedSet<Integer> set = new TreeSet<>();
        SortedSet<Integer> theSet = Collections.synchronizedSortedSet(set);
        final ExecutorService e = Executors.newFixedThreadPool(1000);
        for (int i = 1; i <= 1000; i++) {
            e.execute(() -> {
                int n = atomicInteger.incrementAndGet();
                try {
                    theSet.add(n);
                } catch (Exception e1) {
                    System.out.println(e1 + " " + n);
                }
            });
        }
        e.shutdown();
        e.awaitTermination(1000, TimeUnit.SECONDS);
        System.out.println(theSet.size());//should be 1000
    }
}