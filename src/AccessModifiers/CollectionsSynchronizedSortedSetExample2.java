package AccessModifiers;

import java.util.*;
public class CollectionsSynchronizedSortedSetExample2 {
    public static void main(String[] args) {
        SortedSet<Integer> set = Collections.synchronizedSortedSet(new TreeSet<>());
        set.add(101);
        set.add(104);
        set.add(103);
        set.add(102);
        set.add(105);
        System.out.println("Set after Synchronized sorted set-");
        //Using iterator must be synchronized manually
        synchronized (set) {
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()) {
                Integer num = iterator.next();
                System.out.println(num);
            }
        }
    }
}