package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class UsingFunctions {
    public static void main(String[] args) {

        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        System.out.println(que);

//        Helper queue
        Queue<Integer> helper = new LinkedList<>();
        while (que.size()>0){
            System.out.print(que.peek() + " , ");
            helper.add(que.remove());
        }
        while (helper.size()>0){
            que.add(helper.remove());
        }

    }
}
