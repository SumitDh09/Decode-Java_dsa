package Queue;

import java.util.*;


public class First {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        //add or push operation in a queue
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.add(6);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.size());
        System.out.println(que.isEmpty());



    }

}
