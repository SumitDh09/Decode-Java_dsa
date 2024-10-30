package Stack;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {


        Stack<Integer> st_Original = new Stack<>();
//        System.out.println(st_Original.isEmpty());
        st_Original.push(1);
        st_Original.push(5);
        st_Original.push(10);
        st_Original.push(20);
//        while(!st_Original.isEmpty()){
//            System.out.println(st_Original);
//            break;
//        }
        System.out.println(st_Original);


    }
}
