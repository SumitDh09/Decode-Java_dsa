package Stack;

import java.util.Stack;

public class CopyStackIntoAnotherStack {
//     Copy stack into another stack in same order
    public static void main(String[] args) {

        Stack<Integer> st_Original = new Stack<>();
//        System.out.println(st_Original.isEmpty());
        st_Original.push(10);
        st_Original.push(20);
        st_Original.push(30);
        st_Original.push(40);
        st_Original.push(50);
        System.out.println("Value of Original stack :" +st_Original);

        Stack<Integer> st_temp = new Stack<>();
        while (!st_Original.isEmpty()) {
            st_temp.push(st_Original.pop());
        }
        System.out.println("Value of Temp stack :" +st_temp);

        Stack<Integer> st_Final = new Stack<>();
        while (!st_temp.isEmpty()) {
            st_Final.push(st_temp.pop());
        }
        System.out.println("Value of Final stack :" +st_Final);
        /* TC --> O(N) + O(N) + O(N) = O(N)
           SC--> O(N) + O(N)=O(N)        */


    }
}
