package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class OthbasedIndexing {
    static Queue<Integer> que;
    static Queue<Integer> newQue;
    static void removeEven(){
        newQue = new LinkedList<>();
        while (!que.isEmpty()){
            que.remove();
            if (!que.isEmpty()){
                newQue.add(que.remove());
            }
        }
        que = newQue;

    }


    public static void main(String[] args) {
        que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);

        System.out.println(que);
        removeEven();
        System.out.println(que);


    }
}
